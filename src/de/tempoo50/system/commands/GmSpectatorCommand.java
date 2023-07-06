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

public class GmSpectatorCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Gamemode.GM*"))) {
				if (args.length == 0) {

					player.setGameMode(GameMode.SPECTATOR);

					player.sendMessage(MessagesUtil.GM3);
				} else if (player.hasPermission((String) per.get("Gamemode.GM*"))) {
					if (args.length == 1) {
						Player target = Bukkit.getPlayer(args[0]);
						if (target != null) {

							target.setGameMode(GameMode.SPECTATOR);
							target.sendMessage(MessagesUtil.GMO3);
							player.sendMessage(MessagesUtil.PREFIX + target.getName() + MessagesUtil.GMOO3);
						} else
							player.sendMessage(MessagesUtil.NOPLAYER + args[0]);

					}
				} else
					player.sendMessage(MessagesUtil.NOPERM);

			} else if (player.hasPermission((String) per.get("Gamemode.GM3"))) {
				if (args.length == 0) {

					player.setGameMode(GameMode.SPECTATOR);

					player.sendMessage(MessagesUtil.GM3);

				} else if (player.hasPermission((String) per.get("Gamemode.GM.Other3"))) {
					if (args.length == 1) {
						Player target = Bukkit.getPlayer(args[0]);
						if (target != null) {

							target.setGameMode(GameMode.SPECTATOR);
							target.sendMessage(MessagesUtil.GMO3);
							player.sendMessage(MessagesUtil.PREFIX + target.getName() + MessagesUtil.GMOO3);
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
