package de.tempoo50.system.commands;

import de.tempoo50.system.utils.MessagesUtil;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.tempoo50.system.main.ServerSystem;

public class MsgCommand implements CommandExecutor {

	String message = "";

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		Player player = (Player) sender;
		if (args.length >= 2) {
			Player target = Bukkit.getPlayer(args[0]);

			if (target != null) {

				if (!target.getName().equals(player.getName())) {

					for (int i = 1; i < args.length; i++) {
						message = message + args[i] + " ";
					}
					
					if(MsgToggleCommand.msg.contains(target)) {
						
						player.sendMessage(MessagesUtil.MSGNO);
						
					}else {

						player.sendMessage(MessagesUtil.MSGP1 + target.getName() + MessagesUtil.MSGP2 + message);
						target.sendMessage(MessagesUtil.MSGT1 + player.getName() + MessagesUtil.MSGT2 + message);
						
						message = "";

						ServerSystem.chat.put(target, player);
						ServerSystem.chat.put(player, target);
						
					}
						
				} else {
					player.sendMessage(MessagesUtil.MSGS);
				}

			} else {
				player.sendMessage(MessagesUtil.NOPLAYER + args[0]);
			}
		} else {
			player.sendMessage(MessagesUtil.PREFIX + "§cBenutze §b/msg <SPIELER> [Nachricht]");
		}

		return false;
	}

}
