package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class GmAdventureCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Gamemode.GM*"))) {
				if (args.length == 0) {

					player.setGameMode(GameMode.ADVENTURE);

					player.sendMessage(MessagesUtil.GM2);

				} else if (player.hasPermission((String) per.get("Gamemode.GM*"))) {
					if (args.length == 1) {
						Player target = Bukkit.getPlayer(args[0]);
						if (target != null) {

							target.setGameMode(GameMode.ADVENTURE);
							target.sendMessage(MessagesUtil.GMO2);
							player.sendMessage(MessagesUtil.PREFIX + target.getName() + MessagesUtil.GMOO2);
						} else
							player.sendMessage(MessagesUtil.NOPLAYER + args[0]);

					}
				} else
					player.sendMessage(MessagesUtil.NOPERM);

			} else if (player.hasPermission((String) per.get("Gamemode.GM2"))) {
				if (args.length == 0) {

					player.setGameMode(GameMode.ADVENTURE);

					player.sendMessage(MessagesUtil.GM2);

				} else if (player.hasPermission((String) per.get("Gamemode.GM.Other2"))) {
					if (args.length == 1) {
						Player target = Bukkit.getPlayer(args[0]);
						if (target != null) {

							target.setGameMode(GameMode.ADVENTURE);
							target.sendMessage(MessagesUtil.GMO2);
							player.sendMessage(MessagesUtil.PREFIX + target.getName() + MessagesUtil.GMOO2);
						} else
							player.sendMessage(MessagesUtil.NOPLAYER + args[0]);
					}
				} else
					player.sendMessage(MessagesUtil.NOPERM);

			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;
	}

}
