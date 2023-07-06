package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class BewerbungsFileGer {

	public static void loadBewerbungGer() {

		File file = new File("plugins//ServerSystem//Language//Ger//Bewerbung.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.options().header("Hier kannst du den /bewerbung einstellen");
		config.isString(
				"#" + "Den Farbcode bitte mit § und nicht mit & da sonst edr Farbcode falsch wieder gegeben wird");
		config.addDefault("Bewerbungsnachricht1", "§aTest");
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

	public static void reloadBewerbungGer() {

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