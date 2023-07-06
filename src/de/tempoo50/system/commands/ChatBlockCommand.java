package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.listener.ChatBlockListener;
import de.tempoo50.system.utils.MessagesUtil;

public class ChatBlockCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Chat.Block"))) {
				if (args.length == 0) {
					if (ChatBlockListener.chatblock == true) {
						Bukkit.broadcastMessage(MessagesUtil.CHATBLOCKY + player.getName());
						ChatBlockListener.chatblock = false;
					} else {
						Bukkit.broadcastMessage(player.getName() + MessagesUtil.CHATBLOCKN);
						ChatBlockListener.chatblock = true;
					}
				}
			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;
	}

}
