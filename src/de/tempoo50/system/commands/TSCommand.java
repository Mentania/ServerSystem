package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;
import net.md_5.bungee.api.ChatColor;

public class TSCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		File perm = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (player.hasPermission((String) per.get("Links.Ts:"))) {
				if (args.length == 0) {

					File file = new File("plugins//ServerSystem//ServerLinks.yml");
					YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

					String msg = (String) config.get("ServerLinks.TS:");
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));

				} else
					player.sendMessage("�cBitte benutze �b/ts�c!");

			} else
				player.sendMessage(MessagesUtil.NOPERM);

		}

		return false;
	}

}