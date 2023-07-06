package de.tempoo50.system.commands;

import de.tempoo50.system.utils.MessagesUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.HomeManager;

public class DelHome implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player)
			;
		Player player = (Player) sender;

		HomeManager manager = new HomeManager(player.getUniqueId());

		if (args.length == 0) {
			player.sendMessage("/delhome <name>");
		}

		if (args.length == 1) {
			if (!manager.exist(args[0])) {
				player.sendMessage(MessagesUtil.HOMENE);
			}

			manager.delHome(args[0]);

			player.sendMessage(MessagesUtil.DELLHOME);

		}

		return false;
	}

}
