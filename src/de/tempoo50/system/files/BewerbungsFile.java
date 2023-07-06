package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class BewerbungsFile {

	public static void loadBewerbung() {

		File file = new File("plugins//ServerSystem//Bewerbung.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.options().header("Here can you set the /bewerbung Command!");
		config.isString("#" + "The Colorcode pls with § not with &");
		config.addDefault("Bewerbungsnachricht1", "Test");
		config.addDefault("Bewerbungsnachricht2", "Test");
		config.addDefault("Bewerbungsnachricht3", "Test");
		config.addDefault("Bewerbungsnachricht4", "Test");
		config.addDefault("Bewerbungsnachricht5", "Test");
		config.addDefault("Bewerbungsnachricht6", " ");

		config.options().copyDefaults(true);
		try {
			config.save(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void reloadBewerbung() {

		File file = new File("plugins//ServerSystem//Bewerbung.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.get("Bewerbungsnachricht1");
		config.get("Bewerbungsnachricht2");
		config.get("Bewerbungsnachricht3");
		config.get("Bewerbungsnachricht4");
		config.get("Bewerbungsnachricht5");
		config.get("Bewerbungsnachricht6");

	}

}
