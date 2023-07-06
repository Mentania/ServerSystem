package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class InvseeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (label.equalsIgnoreCase("invsee")) {

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (sender.hasPermission((String) per.get("Invsee"))) {
				if (args.length == 1) {

					if (sender instanceof Player) {
						String name = args[0];
						Player target = Bukkit.getPlayer(name);
						Player player = (Player) sender;

						player.openInventory(target.getInventory());

						return true;

					}
				} else {
					sender.sendMessage(MessagesUtil.PREFIX + "§aBitte nutze §b/invsee <Spieler>§a!");
				}
			} else
				sender.sendMessage(MessagesUtil.NOPERM);

		}

		return false;
	}

}
