package de.tempoo50.system.utils;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class BanUtility {
	
	public static UUID getUUIDFromName(String name) {
		
		Player player = Bukkit.getPlayer(name);
		
		if(player != null) {
			
			return player.getUniqueId();
			
		}
		
		OfflinePlayer op = Bukkit.getOfflinePlayer(name);
		
		if(op != null) {
			
			return op.getUniqueId();
			
		}
		
		return null;
		
	}
	
	public static String millisToTimeString(long arg0) {
		
		long days = TimeUnit.MILLISECONDS.toDays(arg0);
		long hours = TimeUnit.SECONDS.toHours(arg0) - TimeUnit.MILLISECONDS.toDays(arg0) * 24L;
		long min = TimeUnit.SECONDS.toMinutes(arg0) - TimeUnit.MILLISECONDS.toHours(arg0) * 60L;
		long sec = TimeUnit.SECONDS.toSeconds(arg0) - TimeUnit.MILLISECONDS.toMinutes(arg0) * 60L;
		
		if(((long) days == 0) && ((long) hours == 0) && ((long) min == 0)) {
			
			if(sec != 1L) {
				
				return "" + sec + "Sekunden";
				
			}
			
			return "eine Sekunde";
			
		}
		
		if(((long) days == 0) &&  ((long) hours == 0)) {
			
			if(min != 1L) {
				
				return "" + hours + "Minuten";
				
			}
			
			return "eine Minute";
			
		}
		
		if((long) days == 0) {
			
			if(hours != 1L) {
				
				return "" + hours + "Stunden";
				
			}
			
			return "eine Stunde";
			
		}
		
		if(days != 1L) {
			
			return days + "Tage";
			
		}
		
		return "einen Tag";
		
	}

}
