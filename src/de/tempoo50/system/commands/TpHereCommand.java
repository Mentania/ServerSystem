package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class TpHereCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Tp.Tphere"))) {
				if (args.length == 1) {
					String Name = args[0];
					if (Bukkit.getPlayer(Name) != null) {
						Player target = (Player) Bukkit.getPlayer(Name);
						target.teleport(player);
						target.sendMessage(MessagesUtil.PREFIX + player.getName() + MessagesUtil.TPHERE);
						return true;
					} else {
						player.sendMessage(MessagesUtil.NOPLAYER + args[0]);
					}
				} else {
					player.sendMessage(MessagesUtil.PREFIX + "§cBitte verwende §b/tphere <Spieler>");
					return false;
				}
			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;
	}

}