package de.tempoo50.system.utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.data.FileManagerPremium;
import de.tempoo50.system.main.ServerSystem;

public class PremiumManager {

	public void setPremium(Player player, Player target) {

		FileConfiguration config = YamlConfiguration.loadConfiguration(getPremiumFile());

		long toSet = System.currentTimeMillis() + 2419200 * 1000L;

		config.set(player.getUniqueId() + ".millis", toSet);

		try {
			config.save(getPremiumFile());

		} catch (IOException e) {

			e.printStackTrace();
		}

		for (String command : YamlConfiguration.loadConfiguration(FileManagerPremium.getConfigFile())
				.getStringList("premiumCommand")) {

			command = command.replace("target", target.getName());
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);

		}

	}

	public boolean getAllowPremium(Player player) {

		long current = System.currentTimeMillis();
		long millis = +getTime(player);
		return current > millis;

	}

	public File getPremiumFile() {

		return new File(ServerSystem.getInctance().getDataFolder(), "Premium//premium.yml");
	}

	public long getTime(Player player) {

		FileConfiguration config = YamlConfiguration.loadConfiguration(getPremiumFile());
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
		long days = 0;
		while (hours > 24) {
			hours -= 24;
			days++;
		}
		return "§cDu musst noch " + "§b" + days + " Tag(e) " + hours + " Stunde(n) " + minutes + " Minute(n) "
				+ seconds + "Sekunde(n) §cwarten, bis du wieder Premium verschenken kannst";
	}

}