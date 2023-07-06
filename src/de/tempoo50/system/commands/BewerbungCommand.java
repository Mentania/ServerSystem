package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;
import net.md_5.bungee.api.ChatColor;

public class BewerbungCommand implements CommandExecutor {

	private ServerSystem plugin;

	public BewerbungCommand(ServerSystem plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (args.length == 0) {

				File file = new File("plugins//ServerSystem//Bewerbung.yml");
				YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

				String m = (String) config.get("Bewerbungsnachricht1");
				String ms = (String) config.get("Bewerbungsnachricht2");
				String msg = (String) config.get("Bewerbungsnachricht3");
				String mm = (String) config.get("Bewerbungsnachricht4");
				String mms = (String) config.get("Bewerbungsnachricht5");
				String mmsg = (String) config.get("Bewerbungsnachricht6");

				player.sendMessage(ChatColor.translateAlternateColorCodes('&', m));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', ms));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', mm));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', mms));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', mmsg));
				player.sendMessage(MessagesUtil.BEW);

			}
		}

		return false;
	}

}
