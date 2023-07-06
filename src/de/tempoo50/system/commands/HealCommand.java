package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class HealCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Heal"))) {
				if (args.length == 0) {
					player.setHealth(20);
					player.setFoodLevel(20);
					player.sendMessage(MessagesUtil.HEALS);
				} else if (args.length == 1) {
					Player target = Bukkit.getPlayer(args[0]);
					if (target != null) {
						target.setHealth(20);
						target.setFoodLevel(20);
						target.sendMessage(MessagesUtil.HealO);
						player.sendMessage(MessagesUtil.PREFIX + target.getName() + MessagesUtil.HEALOO);
					} else
						player.sendMessage(MessagesUtil.NOPLAYER + args[0]);
				} else
					player.sendMessage(MessagesUtil.PREFIX + "§cBitte benutze §b/heal <Spieler>§c!");

			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;

	}

}
