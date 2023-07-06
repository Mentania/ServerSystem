package de.tempoo50.system.listener;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import de.tempoo50.system.main.ServerSystem;

public class PlayerListener implements Listener {

	private ServerSystem plugin;

	public PlayerListener(ServerSystem plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onQuit(PlayerQuitEvent e) {

		File perm = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

		Player p = e.getPlayer();
		if (plugin.needHelp.contains(p.getName())) {
			plugin.needHelp.remove(p.getName());
		}
		if (plugin.supportChat.containsKey(p.getName())) {
			plugin.supportChat.remove(p.getName());
		}
		if (plugin.supportChat.containsValue(p.getName())) {
			plugin.supportChat.remove(p.getName());
		}
		if (p.hasPermission((String) per.get("Support.Chat"))) {
			if (plugin.onlineSupporters.contains(p.getName())) {
				plugin.onlineSupporters.remove(p.getName());
			}

		}
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {

		File perm = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

		Player p = e.getPlayer();
		if (p.hasPermission((String) per.get("Support.Chat"))) {
			if (!plugin.onlineSupporters.contains(p.getName())) {
				plugin.onlineSupporters.add(p.getName());
			}

		}
	}
}
