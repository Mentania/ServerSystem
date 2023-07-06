package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class TpCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Tp.Tp"))) {
				if (args.length == 1) {
					String Name = args[0];
					if (Bukkit.getPlayer(Name) != null) {
						Player target = (Player) Bukkit.getPlayer(Name);
						player.teleport(target);
						player.sendMessage(MessagesUtil.TP1 + target.getName() + MessagesUtil.TP2);
						return true;
					} else {
						player.sendMessage(MessagesUtil.NOPLAYER + args[0]);
					}
				} else {
					player.sendMessage(MessagesUtil.PREFIX + "§cBitte verwende §b/tp <Spieler>");
					return false;
				}
			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;
	}

}
