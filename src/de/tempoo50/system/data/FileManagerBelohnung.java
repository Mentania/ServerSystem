package de.tempoo50.system.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import de.tempoo50.system.main.ServerSystem;

public class FileManagerBelohnung {

	public static File getConfigFile() {
		return new File(ServerSystem.getInctance().getDataFolder(), "Belohnung//config.yml");
	}

	public static void setDefault() {

		FileConfiguration config = YamlConfiguration.loadConfiguration(getConfigFile());
		config.options().copyDefaults(true);
		config.addDefault("prefix", "TagesBehlonung");
		List<String> commands = new ArrayList<String>();
		commands.add("give player DIAMOND 10");
		commands.add("give player COOKED_BEEF 64");
		config.addDefault("behlonungsCommand", commands);
		try {
			config.save(getConfigFile());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}