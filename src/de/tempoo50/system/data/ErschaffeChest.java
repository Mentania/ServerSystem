package de.tempoo50.system.data;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.mysql.SQLManagerChest;

public class ErschaffeChest {

	public static boolean canGetChest(Player player) {

		File perm = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

		long end;
		if (player.hasPermission((String) per.get("Chest.Admin"))) {
			return true;
		}
		if (DataChest.useMySQL) {

			end = ServerSystem.chests.get(player).getTime() + DataChest.chestCooldown * 1000L;

		} else {
			end = FileManagerChest.getFile().getLong("Users." + player.getUniqueId().toString() + ".Time")
					+ DataChest.chestCooldown * 1000L;
		}

		if (System.currentTimeMillis() >= end) {

			return true;

		} else

			return false;

	}

	public static Long getRemindingTime(Player player) {

		if (DataChest.useMySQL) {

			return (ServerSystem.chests.get(player).getTime() + DataChest.chestCooldown * 1000L);

		} else

			return (FileManagerChest.getFile().getLong("Users." + player.getUniqueId().toString() + ".Time")
					+ DataChest.chestCooldown * 1000L);

	}

	public static void setWaitingTime(Player player) {

		if (DataChest.useMySQL) {

			SQLManagerChest.updateData(player, System.currentTimeMillis());

		} else {

			FileManagerChest.getFile().setValue("Users." + player.getUniqueId().toString() + ".Time",
					System.currentTimeMillis());
			FileManagerChest.getFile().save();

		}

	}

}
