package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class TikTokCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if(player.hasPermission((String) per.get("Links.Tiktok"))) {
				
				if(args.length == 0) {
					
					File file = new File("plugins//ServerSystem//ServerLinks.yml");
					YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

					String msg = (String) config.get("ServerLinks.Tiktok");
					msg = msg.replace("/n", "\n");
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
					
				}else
					
					player.sendMessage("§cBitte benutze §b/tiktok§c!");
				
			}else
				
				player.sendMessage(MessagesUtil.NOPERM);
			
		}
		
		return false;
	}

}
