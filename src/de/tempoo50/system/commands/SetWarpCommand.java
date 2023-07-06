package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;
import de.tempoo50.system.utils.WarpManager;

public class SetWarpCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Warp.Set"))) {
				if (args.length == 0) {
					player.sendMessage(MessagesUtil.PREFIX + "§b/setwarp <Name>");
				}

				if (args.length == 1) {
					WarpManager manager = new WarpManager();

					if (manager.exist(args[0])) {

						player.sendMessage(MessagesUtil.SETWARPE);

					} else {

						manager.addWarp(player.getLocation(), args[0]);
						player.sendMessage(MessagesUtil.SETWARP);

					}

				}

			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;
	}

}