package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class SpawnFileGer {

	public static void loadSpawnGer() {

		File file = new File("plugins//ServerSystem//Language//Ger//Spawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.addDefault("Message.Join", "Diese Nachricht kannst du in der Spawn.yml bearbeiten");
		config.addDefault("Message.Quit", "Diese Nachricht kannst du in der Spawn.yml bearbeiten");
		config.isString("#");
		config.addDefault("Permission.SetSpawn", "sys.setspawn");
		config.addDefault("Permission.Spawn", "sys.spawn");
		config.addDefault("Permission.Inv", "sys.keep");
		config.addDefault("Permission.Admin", "sys.gm");
		config.isString("#");

		config.options().copyDefaults(true);
		try {
			config.save(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void reloadSpawnGer() {

		File file = new File("plugins//ServerSystem//Spawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.get("Message.Join");
		config.get("Message.Quit");
		config.get("Permission.SetSpawn");
		config.get("Permission.Spawn");
		config.get("Permission.Inv");

	}

}
