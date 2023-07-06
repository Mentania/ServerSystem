package de.tempoo50.system.utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.data.FileManagerBelohnung;
import de.tempoo50.system.main.ServerSystem;

public class BelohnungsManager {

	public void setBehlonung(Player player) {
		FileConfiguration config = YamlConfiguration.loadConfiguration(getRewardFile());
		long toSet = System.currentTimeMillis() + 86400000;
		config.set(player.getUniqueId() + ".millis", toSet);
		try {
			config.save(getRewardFile());
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String command : YamlConfiguration.loadConfiguration(FileManagerBelohnung.getConfigFile())
				.getStringList("behlonungsCommand")) {
			command = command.replace("player", player.getName());
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
		}

	}

	public boolean getAllowBehlonung(Player player) {
		long current = System.currentTimeMillis();
		long millis = +getTime(player);
		return current > millis;

	}

	public File getRewardFile() {
		return new File(ServerSystem.getInctance().getDataFolder(), "Belohnung//belohnungs.yml");
	}

	public long getTime(Player player) {
		FileConfiguration config = YamlConfiguration.loadConfiguration(getRewardFile());
		return config.getLong(player.getUniqueId() + ".millis");
	}

	public String getRemainingTime(long millis) {
		long seconds = millis / 1000;
		long minutes = 0;
		while (seconds > 60) {
			seconds -= 60;
			minutes++;
		}
		long hours = 0;
		while (minutes > 60) {
			minutes -= 60;
			hours++;
		}
		return "§e" + hours + " Stunde(n)" + minutes + " Minute(n)" + seconds + "Sekunde(n)";
	}

}
