package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class SpawnFile {

	public static void loadSpawn() {

		File file = new File("plugins//ServerSystem//Spawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.addDefault("Message.Join", "");
		config.addDefault("Message.Quit", "");
		config.isString("#");

		config.options().copyDefaults(true);
		try {
			config.save(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void reloadSpawn() {

		File file = new File("plugins//ServerSystem//Spawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.get("Message.Join");
		config.get("Message.Quit");
		config.get("Permission.SetSpawn");
		config.get("Permission.Spawn");
		config.get("Permission.Inv");

	}

}