package de.tempoo50.system.data;

import de.tempoo50.system.api.FileWriter;

public class FileManagerEco {

	private static FileWriter file = new FileWriter("plugins//ServerSystem", "MySQLEco.yml");

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

		DataEco.MySQLHost = file.getString("MySQL.Host");
		DataEco.MySQLPort = file.getInt("MySQL.Port");
		DataEco.MySQLDatabase = file.getString("MySQL.Database");
		DataEco.MySQLUser = file.getString("MySQL.User");
		DataEco.MySQLPassword = file.getString("MySQL.Password");

	}

}
