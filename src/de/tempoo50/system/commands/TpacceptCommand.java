package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;

public class TpacceptCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File file = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

			if (player.hasPermission((String) config.get("Tp.Tpa"))) {
				if (args.length == 0) {

					Player target = ServerSystem.tpa.get(player);

					target.teleport(player.getLocation());

					target.sendMessage(MessagesUtil.TPAA);
					
					ServerSystem.tpa.remove(player);

				} else
					player.sendMessage(MessagesUtil.PREFIX + "?c/tpaccept");
			} else 
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;
	}

}