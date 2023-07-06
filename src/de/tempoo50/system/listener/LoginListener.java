package de.tempoo50.system.listener;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;

import de.tempoo50.system.data.DataBan;
import de.tempoo50.system.utils.BanManager;

public class LoginListener implements Listener {
	
	public void onLogin(PlayerLoginEvent event) {
		
		Player player = event.getPlayer();
		
		if(DataBan.useMySQL == false) {

			File messagesfile = new File("plugins//ServerSystem//BannSystem//Messages.yml");
			YamlConfiguration messages = YamlConfiguration.loadConfiguration(messagesfile);
			
			File file = new File("plugins//ServerSystem//BanSystem//gebannte Spieler//" + player.getUniqueId() + ".yml");
			FileConfiguration config = YamlConfiguration.loadConfiguration(file);
			
			File tempfile = new File("plugins//ServerSystem//BanSystem//temp gebannte Spieler//" + player.getUniqueId() + ".yml");
			FileConfiguration tempconfig = YamlConfiguration.loadConfiguration(tempfile);
			
			if(file.exists()) {
				
				try {
					
					String msg = messages.getString("ban.perma");
					msg = msg.replace("BANNER", config.getString("Informationen.Von"));
					msg = msg.replace("GRUND", config.getString("Informationen.Grund"));
					event.disallow(Result.KICK_BANNED, ChatColor.translateAlternateColorCodes('&', msg));
					
				}catch(NullPointerException ex) {
					
				}
				
			}
			
			if(tempconfig.getLong("Informationen.Millisekunden") >= System.currentTimeMillis()) {
				
				try {
					
					String msg = messages.getString("ban.temp");
					msg = msg.replace("GRUND", tempconfig.getString("Informationen.Grund"));
					msg = msg.replace("BANNER", tempconfig.getString("Informationen.Von"));
					msg = msg.replace("DATUM", tempconfig.getString("Informationen.Datum"));
					
					event.disallow(Result.KICK_BANNED, ChatColor.translateAlternateColorCodes('&', msg));
					
				}catch(NullPointerException ex) {
					
					ex.printStackTrace();
					
				}
				
			}else
				
				tempfile.delete();
			
		}else if(DataBan.useMySQL == true) {

			File messagesfile = new File("plugins//ServerSystem//BannSystem//Messages.yml");
			YamlConfiguration messages = YamlConfiguration.loadConfiguration(messagesfile);
			
			if(BanManager.isbannedmysql(player.getUniqueId().toString())) {
				
				long current = System.currentTimeMillis();
				long end = BanManager.getEndMySQL(player.getUniqueId());
				
				if(current < end | end == -1) {
					
					String msg = messages.getString("ban.temp");
					msg = msg.replace("GRUND", BanManager.getReasonMySQL(player.getUniqueId().toString()));
					msg = msg.replace("BANNER", BanManager.getBannerMySQL(player.getUniqueId()));
					msg = msg.replace("DATUM", BanManager.getDatumMySQL(player.getUniqueId()));
					
					event.disallow(Result.KICK_BANNED, msg);
					
				}
				
			}
			
		}
		
	}

}
