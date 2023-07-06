package de.tempoo50.system.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import de.tempoo50.system.main.ServerSystem;

public class FileManagerPremium {

	public static File getConfigFile() {
		return new File(ServerSystem.getInctance().getDataFolder(), "Premium//config.yml");
	}

	public static void setDefault() {

		FileConfiguration config = YamlConfiguration.loadConfiguration(getConfigFile());
		config.options().copyDefaults(true);
		config.addDefault("prefix", "PremiumGeschenk");
		List<String> commands = new ArrayList<String>();
		commands.add("lp user target parent addtemp premium 14d");
		config.addDefault("premiumCommand", commands);
		try {
			config.save(getConfigFile());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}