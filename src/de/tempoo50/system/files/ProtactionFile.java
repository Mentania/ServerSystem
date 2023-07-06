package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class ProtactionFile {

	public static void loadConfig() {

		File file = new File("plugins//ServerSystem//Protaction.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.addDefault("UseProtaction", false);
		config.addDefault("UseShoot", false);
		config.addDefault("UseElytra", false);
		config.addDefault("World", "world");

		config.options().copyDefaults(true);

		try {
			config.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
