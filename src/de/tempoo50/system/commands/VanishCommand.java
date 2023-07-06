package de.tempoo50.system.commands;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class VanishCommand implements CommandExecutor {

	public static List<Player> vanished = new ArrayList<>();

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player))
			return true;

		Player player = (Player) sender;

		File perm = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

		if (!player.hasPermission((String) per.get("Vanish.Player")))
			return true;

		if (args.length == 0) {
			if (vanished.contains(player)) {
				vanished.remove(player);
				player.sendMessage(MessagesUtil.VANISHN);
				for (Player all : Bukkit.getOnlinePlayers()) {
					all.showPlayer(player);
				}
			} else {
				vanished.add(player);
				player.sendMessage(MessagesUtil.VANISHY);
				for (Player all : Bukkit.getOnlinePlayers()) {

					if (!all.hasPermission((String) per.get("Vanish.See"))) {
						all.hidePlayer(player);
					}
				}
			}
		} else if (!player.hasPermission((String) per.get("Vanish.Other")))
			return true;

		if (args.length == 1) {
			Player target = Bukkit.getPlayer(args[0]);
			if (target != null) {

				if (vanished.contains(target)) {
					vanished.remove(target);
					target.sendMessage(MessagesUtil.VANISHN);
					player.sendMessage(MessagesUtil.PREFIX + target.getName() + MessagesUtil.VANISHON);
					for (Player all : Bukkit.getOnlinePlayers()) {
						all.showPlayer(target);
					}
				} else {
					vanished.add(target);
					target.sendMessage(MessagesUtil.VANISHY);
					player.sendMessage(MessagesUtil.PREFIX + target.getName() + MessagesUtil.VANISHOY);
					for (Player all : Bukkit.getOnlinePlayers()) {

						if (!all.hasPermission((String) per.get("Vanish.See"))) {
							all.hidePlayer(player);
						}
					}
				}

			} else
				player.sendMessage(MessagesUtil.NOPLAYER + args[0]);

		}

		return false;
	}

}
