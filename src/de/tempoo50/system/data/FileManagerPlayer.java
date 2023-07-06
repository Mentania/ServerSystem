package de.tempoo50.system.data;

import de.tempoo50.system.api.FileWriter;

public class FileManagerPlayer {

	private static FileWriter file = new FileWriter("plugins//ServerSystem", "MySQLPlayer.yml");

	public static FileWriter getFile() {

		return file;

	}

	public static void loadFile() {

		if (!file.exist()) {

			file.setValue("MySQL.Host", "");
			file.setValue("MySQL.Port", 3306);
			file.setValue("MySQL.Database", "");
			file.setValue("MySQL.User", "");
			file.setValue("MySQL.Password", "");

			file.save();

		}

	}

	public static void readFile() {

		DataPlayer.MySQLHost = file.getString("MySQL.Host");
		DataPlayer.MySQLPort = file.getInt("MySQL.Port");
		DataPlayer.MySQLDatabase = file.getString("MySQL.Database");
		DataPlayer.MySQLUser = file.getString("MySQL.User");
		DataPlayer.MySQLPassword = file.getString("MySQL.Password");

	}

}
