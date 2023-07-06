package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;

public class TpaCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File file = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

			if (player.hasPermission((String) config.get("Tp.Tpa"))) {
				if (args.length == 1) {

					try {
						Player target = Bukkit.getPlayer(args[0]);

						ServerSystem.tpa.put(target, player);

						target.sendMessage(MessagesUtil.TPA1 + player.getName() + MessagesUtil.TPA2);
						player.sendMessage(MessagesUtil.TPA3 + target.getName() + MessagesUtil.TPA4);

					} catch (Exception ex) {
						player.sendMessage(MessagesUtil.NOPLAYER + args[0]);
					}

				} else
					player.sendMessage(MessagesUtil.PREFIX + "?b/tpa ?6<Spieler>");
			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;
	}

}