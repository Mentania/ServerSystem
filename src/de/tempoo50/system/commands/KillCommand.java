package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class KillCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Kill"))) {
				if (args.length == 0) {

					player.setHealth(0);
					player.sendMessage(MessagesUtil.KILL);

				} else if (args.length == 1) {
					Player target = Bukkit.getPlayer(args[0]);
					if (target != null) {

						target.setHealth(0);
						target.sendMessage(MessagesUtil.KILL);
						player.sendMessage(MessagesUtil.KILLO);

					} else
						player.sendMessage(MessagesUtil.NOPLAYER + args[0]);

				} else
					player.sendMessage(MessagesUtil.PREFIX + "§cBitte benutze §b/kill <Spieler>§c!");

			} else
				player.sendMessage(MessagesUtil.NOPERM);

		}

		return false;
	}

}
