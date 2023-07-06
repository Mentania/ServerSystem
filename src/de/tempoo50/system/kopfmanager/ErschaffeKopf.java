package de.tempoo50.system.kopfmanager;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.data.Data;
import de.tempoo50.system.data.FileManager;
import de.tempoo50.system.mysql.SQLManagerKopf;

public class ErschaffeKopf {

	public static boolean canGetSkull(Player player) {

		File perm = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

		long end;
		if (player.hasPermission((String) per.get("Kopf.Admin"))) {
			return true;
		}
		if (Data.useMySQL) {
			end = ServerSystem.players.get(player).getTime() + Data.kopfCooldown * 1000L;
		} else {
			end = FileManager.getFile().getLong("Users." + player.getUniqueId().toString() + ".Time")
					+ Data.kopfCooldown * 1000L;
		}

		if (System.currentTimeMillis() >= end) {
			return true;
		} else {
			return false;
		}
	}

	public static Long getRemindingTIme(Player player) {
		if (Data.useMySQL) {
			return (ServerSystem.players.get(player).getTime() + Data.kopfCooldown * 1000L);
		} else {
			return (FileManager.getFile().getLong("Users." + player.getUniqueId().toString() + ".Time")
					+ Data.kopfCooldown * 1000L);
		}
	}

	public static void setWatingTime(Player player) {
		if (Data.useMySQL) {
			SQLManagerKopf.updateData(player, System.currentTimeMillis());
		} else {
			FileManager.getFile().setValue("Users." + player.getUniqueId().toString() + ".Time",
					System.currentTimeMillis());
			FileManager.getFile().save();
		}
	}

}