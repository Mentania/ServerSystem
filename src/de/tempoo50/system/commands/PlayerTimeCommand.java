package de.tempoo50.system.commands;

import java.io.File;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;

public class PlayerTimeCommand implements CommandExecutor {

	private ServerSystem plugin = ServerSystem.getPlugin();
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (args.length == 0) {

				int days = (int) plugin.select.getTimeDay(player);
				int hours = (int) plugin.select.getTimeHour(player);
				int minutes = (int) plugin.select.getTimeMinutes(player);
				
				player.sendMessage(MessagesUtil.PREFIX + "§aDeine Spielzeit beträgt §b" + days + " §eTage §b" + hours + " §eStunden §b" + minutes + " §eMinuten");
			
			} else if (player.hasPermission((String) per.get("PlayerTime.Online"))) {
				
				if (args.length == 1) {

					Player target = Bukkit.getPlayer(args[0]);

					if (target != null) {
						
						int days = (int) plugin.select.getTimeDay(target);
						int hours = (int) plugin.select.getTimeHour(target);
						int minutes = (int) plugin.select.getTimeMinutes(target);
						
						player.sendMessage(MessagesUtil.PREFIX + "§aDie Spielzeit von §b" + target.getName() + " §abeträgt: §b" + days + " §eTage §b" + hours + " §eStunden §b" + minutes + " §eMinuten");
					
					}else if(player.hasPermission((String) per.get("PlayerTime.Offline"))) {
					
						OfflinePlayer op = Bukkit.getOfflinePlayer(args[0]);
						
						if(ServerSystem.getPlugin().table.hasAccount(op)) {
							
							UUID uuid = op.getUniqueId();
							
							int daysn = (int) plugin.select.getTimeDay(op);
							int hoursn = (int) plugin.select.getTimeHour(op);
							int minutesn = (int) plugin.select.getTimeMinutes(op);
							
							player.sendMessage(MessagesUtil.PREFIX + "§aDie Spielzeit von §b" + op.getName() + " §abeträgt: §b" + daysn + " §eTage §b" + hoursn + " §eStunden §b" + minutesn + " §eMinuten");
							
						}else
							
							player.sendMessage(MessagesUtil.PREFIX + "Der Spieler war hier noch nie!");
						
					}else
						
						player.sendMessage(MessagesUtil.NOPLAYER + args[0]);

				}
				
			}
		}

		return false;
	}

}
