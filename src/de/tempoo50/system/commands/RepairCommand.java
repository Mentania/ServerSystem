package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class RepairCommand implements CommandExecutor {

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Repair"))) {
				
				if (args.length == 0) {

					if (player.getItemInHand().getType() != Material.AIR) {
							
						player.getItemInHand().setDurability((short) 0);
						player.sendMessage(MessagesUtil.REPAIR);
							
					}else
							
						player.sendMessage(MessagesUtil.REPAIRNO);

				}
				
				return true;
				
			} else

				player.sendMessage(MessagesUtil.NOPERM);

		}
		return false;
	}

}
