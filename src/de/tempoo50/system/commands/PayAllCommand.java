package de.tempoo50.system.commands;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;
import net.milkbowl.vault.economy.EconomyResponse.ResponseType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class PayAllCommand implements CommandExecutor {

	private ServerSystem plugin = ServerSystem.getPlugin();

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		File file = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		Player player = (Player) sender;

		if (player.hasPermission((String) config.get("Eco.PayAll"))) {

			if (args.length == 1) {

				Integer amount = Integer.valueOf(args[0]);

				for (Player all : Bukkit.getOnlinePlayers()) {

					if (plugin.econ.depositPlayer(all.getName(), amount).type == ResponseType.SUCCESS) {

						all.sendMessage(MessagesUtil.PREFIX + player.getName() + MessagesUtil.PAYALL1 + amount
								+ MessagesUtil.PAYALL2);

					}

				}

			} else {

				player.sendMessage(MessagesUtil.PREFIX + "Bitte verwende /payall <betrag>");
			}

		} else {

			player.sendMessage(MessagesUtil.NOPERM);

		}

		return false;

	}

}
