package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class CraftCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player) sender;

		File perm = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

		if (player.hasPermission((String) per.get("Craft"))) {
			if (args.length == 0) {

				player.openWorkbench(null, true);

			}
		} else
			player.sendMessage(MessagesUtil.NOPERM);

		return false;
	}

}
