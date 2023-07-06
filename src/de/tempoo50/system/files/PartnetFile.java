package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.configuration.file.YamlConfiguration;

public class PartnetFile {

	public static void loadPartner() {

		File file = new File("plugins//ServerSystem//Partner//Partner.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		List<String> partner1lore = new ArrayList<>();
		partner1lore.add((String) config.get("Partner1.Lore1"));
		partner1lore.add((String) config.get("Partner1.Lore2"));
		partner1lore.add((String) config.get("Partner1.Lore3"));
		partner1lore.add((String) config.get("Partner1.Lore4"));

		List<String> partner2lore = new ArrayList<>();
		partner2lore.add((String) config.get("Partner2.Lore1"));
		partner2lore.add((String) config.get("Partner2.Lore2"));
		partner2lore.add((String) config.get("Partner2.Lore3"));
		partner2lore.add((String) config.get("Partner2.Lore4"));

		List<String> partner3lore = new ArrayList<>();
		partner3lore.add((String) config.get("Partner3.Lore1"));
		partner3lore.add((String) config.get("Partner3.Lore2"));
		partner3lore.add((String) config.get("Partner3.Lore3"));
		partner3lore.add((String) config.get("Partner3.Lore4"));

		List<String> partner4lore = new ArrayList<>();
		partner4lore.add((String) config.get("Partner4.Lore1"));
		partner4lore.add((String) config.get("Partner4.Lore2"));
		partner4lore.add((String) config.get("Partner4.Lore3"));
		partner4lore.add((String) config.get("Partner4.Lore4"));

		config.addDefault("Partner1.DisplayName1", "");
		config.addDefault("Partner1.Lore1", "");
		config.addDefault("Partner1.Lore2", "");
		config.addDefault("Partner1.Lore3", "");
		config.addDefault("Partner1.Lore4", "");
		config.set("Partner1.Lore", partner1lore);

		config.addDefault("Partner2.DisplayName2", "");
		config.addDefault("Partner2.Lore1", "");
		config.addDefault("Partner2.Lore2", "");
		config.addDefault("Partner2.Lore3", "");
		config.addDefault("Partner2.Lore4", "");
		config.set("Partner2.Lore", partner2lore);

		config.addDefault("Partner3.DisplayName3", "");
		config.addDefault("Partner3.Lore1", "");
		config.addDefault("Partner3.Lore2", "");
		config.addDefault("Partner3.Lore3", "");
		config.addDefault("Partner3.Lore4", "");
		config.set("Partner3.Lore", partner3lore);

		config.addDefault("Partner4.DisplayName4", "");
		config.addDefault("Partner4.Lore1", "");
		config.addDefault("Partner4.Lore2", "");
		config.addDefault("Partner4.Lore3", "");
		config.addDefault("Partner4.Lore4", "");
		config.set("Partner4.Lore", partner4lore);

		config.options().copyDefaults(true);
		try {
			config.save(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
