package de.tempoo50.system.commands;

import de.tempoo50.system.utils.MessagesUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.HomeManager;

public class HomeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			HomeManager manager = new HomeManager(player.getUniqueId());

			if (args.length == 0) {
				if (manager.getHomes().size() == 0) {
					player.sendMessage(MessagesUtil.HOMENO);
				}

				String out = "";
				for (String s : manager.getHomes()) {
					out = out + "§7, §e" + s;
				}

				out = out.trim();

				player.sendMessage("Deine Homes: " + out);

			}

			if (args.length == 1) {

				if (!manager.exist(args[0])) {
					player.sendMessage(MessagesUtil.HOMENE);
				}else {

				player.teleport(manager.getLocation(args[0]));
				player.sendMessage(MessagesUtil.HOME);
				
				}
				
			}

		}

		return false;
	}

}