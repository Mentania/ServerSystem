package de.tempoo50.system.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import de.tempoo50.system.utils.MessagesUtil;

public class OpferCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(sender instanceof Player) {
			
			Player player = (Player) sender;
			
			if(player.hasPermission("test")) {
				
				if(args.length == 0) {
					
					player.sendMessage("/opfer <spieler>");
					
				}else if(args.length == 1 ) {
					
					Player target = Bukkit.getPlayer(args[0]);
					
					if(target == player) {
						
						player.sendMessage("Du bist echt ein Opfer wenn dich selber Opfern möchtest");
						
					}else if(target != null) {
						
						target.setCanPickupItems(false);
						target.setGlowing(true);
						target.setFoodLevel(0);
						target.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 3600, 3600));
						
					}else
						
						player.sendMessage(MessagesUtil.NOPLAYER + args[0]);
					
				}else
					
					player.sendMessage("/opfer <spieler>");
				
			}else
				
				player.sendMessage(MessagesUtil.NOPERM);
			
		}
		
		return false;
	}

}
