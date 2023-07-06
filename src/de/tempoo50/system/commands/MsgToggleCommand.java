package de.tempoo50.system.commands;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class MsgToggleCommand implements CommandExecutor {

	public static boolean toggle = true;
	public static ArrayList<Player> msg = new ArrayList<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			
			Player player = (Player) sender;
			
			if(args.length == 0) {
				
				if(toggle == true) {
					
					player.sendMessage(MessagesUtil.MSGTOF);
					msg.add(player);
					toggle = false;
					
				}else {
					
					player.sendMessage(MessagesUtil.MSGTOT);
					msg.remove(player);
					toggle = true;
					
				}
				
			}
			
		}
		
		return false;
	}

}
