package de.tempoo50.system.commands;

import de.tempoo50.system.utils.MessagesUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.tempoo50.system.main.ServerSystem;

public class RCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			if (args.length >= 1) {
				if (ServerSystem.chat.containsKey(player)) {

					Player target = ServerSystem.chat.get(player);

					if (target != null) {

						String msg = "";

						for (int i = 0; i < args.length; i++) {
							msg += args[i] + " ";
						}

						msg = msg.trim();

						player.sendMessage(MessagesUtil.MSGP1 + target.getName() + MessagesUtil.MSGP2 + msg);
						target.sendMessage(MessagesUtil.MSGT1 + player.getName() + MessagesUtil.MSGT2 + msg);

					} else {
						player.sendMessage(MessagesUtil.NOPLAYER + target);
					}
				}
			}
		}

		return false;
	}

}
