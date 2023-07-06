package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.listener.GodListener;
import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;

public class GodCommand implements CommandExecutor {

	private ServerSystem plugin;

	public GodCommand(ServerSystem plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Gamemode.GM4"))) {
				if (args.length == 0) {
					GodListener godListener = plugin.getGodListener();
					if (!godListener.getGodModePlayers().contains(player.getName())) {
						godListener.getGodModePlayers().add(player.getName());
						player.sendMessage(MessagesUtil.GM4Y);
					} else {
						godListener.getGodModePlayers().remove(player.getName());
						player.sendMessage(MessagesUtil.GM4N);
					}
				}
			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}
		return false;
	}

}
