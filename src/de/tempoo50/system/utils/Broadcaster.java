package de.tempoo50.system.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import de.tempoo50.system.main.ServerSystem;
import net.md_5.bungee.api.ChatColor;

public class Broadcaster {

	static File file = new File("plugins//ServerSystem//Broadcast.yml");
	static YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

	private final static String ROOT = "BroadcastMessages";
	public static boolean useBroadcaster = true;

	private ServerSystem plugin;

	public Broadcaster(ServerSystem plugin) {
		this.plugin = plugin;

		createDefaults();
	}

	public void startBroadcast() {
		if ((boolean) config.get("UseBroadcaster") == true) {
			Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {

				@Override
				public void run() {
					Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', pickMessage()));

				}
			}, 0, (int) config.get("MESSAGE_DELAY") * 20);
		}
	}

	private void createDefaults() {
		if (config.contains(ROOT))
			return;
		List<String> defaults = new ArrayList<>();
		for (int i = 0; i < 30; i++)
			defaults.add("&6Testnachricht Nr. " + i);
		useBroadcaster = config.getBoolean("UseBroadcaster");
		config.set("UseBroadcaster", false);
		config.set("MESSAGE_DELAY", 120);
		config.set(ROOT, defaults);

		try {
			config.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private String pickMessage() {
		List<String> messages = config.getStringList(ROOT);
		int random = new Random().nextInt(messages.size());
		return messages.get(random);
	}

	public static void reloadDefaults() {
		config.get("MESSAGE_DELAY");
		config.get(ROOT);
	}

}
