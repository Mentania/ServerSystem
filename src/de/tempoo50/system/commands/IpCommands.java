package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class IpCommands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;

			File file = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(file);

			if (player.hasPermission((String) per.get("Ip.Player"))) {
				if (args.length == 1) {
					Player target = Bukkit.getPlayer(args[0]);

					player.sendMessage(MessagesUtil.PREFIX + target.getName() + MessagesUtil.IP
							+ target.getAddress().getAddress().getHostAddress());
				}
			} else

				player.sendMessage(MessagesUtil.NOPERM);

		}
		return false;
	}

}
