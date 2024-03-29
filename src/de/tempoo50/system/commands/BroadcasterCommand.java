package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class BroadcasterCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Broadcast"))) {

				StringBuilder text = new StringBuilder();
				for (int i = 0; i < args.length; i++) {
					text.append(args[i]).append(" ");
				}

				Bukkit.broadcastMessage(
						MessagesUtil.PREFIX + ChatColor.translateAlternateColorCodes('&', text.toString()));

			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;
	}

}
