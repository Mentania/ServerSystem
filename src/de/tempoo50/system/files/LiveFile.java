package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class LiveFile {

	public static void loadFile() {

		File file = new File("plugins//ServerSystem//Live.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.addDefault("Live.Player1", "Streamer1");
		config.addDefault("Live.Player2", "Streamer2");
		config.addDefault("Live.Player3", "Streamer3");
		config.addDefault("Live.Player4", "Streamer4");
		config.addDefault("Live.Player5", "Streamer5");
		config.addDefault("Live.Player6", "Streamer6");
		config.addDefault("Live.Player7", "Streamer7");
		config.addDefault("Live.Player8", "Streamer8");
		config.addDefault("Live.Player9", "Streamer9");
		config.addDefault("Live.Player10", "Streamer10");

		config.addDefault("Live.Message1", "Kanal1");
		config.addDefault("Live.Message2", "Kanal2");
		config.addDefault("Live.Message3", "Kanal3");
		config.addDefault("Live.Message4", "Kanal4");
		config.addDefault("Live.Message5", "Kanal5");
		config.addDefault("Live.Message6", "Kanal6");
		config.addDefault("Live.Message7", "Kanal7");
		config.addDefault("Live.Message8", "Kanal8");
		config.addDefault("Live.Message9", "Kanal9");
		config.addDefault("Live.Message10", "Kanal10");

		config.options().copyDefaults(true);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
