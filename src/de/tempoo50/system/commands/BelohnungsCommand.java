package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;

public class BelohnungsCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Belohnung"))) {
				if (args.length == 0) {
					if (!ServerSystem.behlohnungsManager.getAllowBehlonung(player)) {
						player.sendMessage(MessagesUtil.BELOHNUNGN);
						long current = System.currentTimeMillis();
						long release = ServerSystem.behlohnungsManager.getTime(player);
						long millis = release - current;
						player.sendMessage(
								MessagesUtil.PREFIX + ServerSystem.behlohnungsManager.getRemainingTime(millis));
						return true;
					}
					player.sendMessage(MessagesUtil.BELOHNUNGY);
					ServerSystem.behlohnungsManager.setBehlonung(player);

					return true;
				}
				player.sendMessage(MessagesUtil.PREFIX + "§b/belohnung");
				return true;
			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;
	}

}