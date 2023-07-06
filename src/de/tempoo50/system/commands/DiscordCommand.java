package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;
import net.md_5.bungee.api.ChatColor;

public class DiscordCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			File file = new File("plugins//ServerSystem//ServerLinks.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

			if (player.hasPermission((String) per.get("Links.Discord:"))) {
				if (args.length == 0) {

					String msg = (String) config.get("ServerLinks.Discord:");
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));

				} else
					player.sendMessage("�cBitte benutze �b/discord�c!");

			} else
				player.sendMessage(MessagesUtil.NOPERM);

		}

		return false;
	}

}
