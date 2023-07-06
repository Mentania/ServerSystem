package de.tempoo50.system.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;
import de.tempoo50.system.utils.WarpManager;

public class WarpCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			WarpManager manager = new WarpManager();

			if (args.length == 0) {
				if (manager.getWarps() == null) {
					player.sendMessage(MessagesUtil.WARPNO);
				}

				String out = "";
				for (String s : manager.getWarps()) {
					out = out + "?7, ?e" + s;
				}

				out = out.trim();

				player.sendMessage("?bWarps: " + out);

			}

			if (args.length == 1) {

				if (!manager.exist(args[0])) {
					player.sendMessage(MessagesUtil.WARPE);
				}else {

				player.teleport(manager.getLocation(args[0]));
				player.sendMessage(MessagesUtil.WARP + args[0]);
			
				}
				
			}

		}

		return false;
	}

}