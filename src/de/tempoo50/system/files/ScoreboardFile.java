package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class ScoreboardFile {

	public static void loadFile() {

		File file = new File("plugins//ServerSystem//Scoreboard.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.addDefault("Scoreboard.Header", "moin");
		config.addDefault("Scoreboard.Server", "Test");

		config.options().copyDefaults(true);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
