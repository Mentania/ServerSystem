package de.tempoo50.system.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class ReportManager {

	public static void closeReport(CommandSender sender, UUID uuid, String wen) {

		File file = new File("plugins//ServerSystem//Report//Reports//" + uuid + ".yml");

		if (file.exists()) {
			file.delete();
		}
	}

	public static void reportPlayer(UUID uuid, String name, String grund, CommandSender sender) {

		File file = new File("plugins//ServerSystem//Report//Reports//" + uuid + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd:MM:yyy HH:mm:ss");

		config.addDefault(format.format(now) + ".Von", sender.getName());
		config.addDefault(format.format(now) + ".Grund", grund);
		config.addDefault(format.format(now) + ".Name", name);

		try {
			config.save(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static UUID getUUIDFromName(String name) {

		Player player = Bukkit.getPlayer(name);
		if (player != null) {
			return player.getUniqueId();
		}

		OfflinePlayer off = Bukkit.getOfflinePlayer(name);
		if (off != null) {
			return off.getUniqueId();
		}

		return null;

	}

}
