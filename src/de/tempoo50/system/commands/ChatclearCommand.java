package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class ChatclearCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Chat.Clear"))) {
				if (args.length == 0) {

					for (int i = 0; i <= 150; i++)
						Bukkit.broadcastMessage(" ");
					Bukkit.broadcastMessage(MessagesUtil.CC + player.getName());

				} else
					player.sendMessage("§cBitte benutze §6/cc §c!");

			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;
	}

}
