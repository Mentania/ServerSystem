package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class SunCommand implements CommandExecutor {

	File perm = new File("plugins//ServerSystem//Permission.yml");
	YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (player.hasPermission((String) per.get("Time.Sun"))) {
				player.getLocation().getWorld().setStorm(false);
				Bukkit.broadcastMessage(MessagesUtil.SUN);
			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;
	}

}
