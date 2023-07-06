package de.tempoo50.system.data;

import java.util.ArrayList;

import de.tempoo50.system.api.FileWriter;

public class FileManagerChest {

	private static FileWriter file = new FileWriter("plugins//ServerSystem//Case", "Chest.yml");

	public static FileWriter getFile() {

		return file;

	}

	public static void loadFile() {

		if (!file.exist()) {

			file.setValue("ChestCooldown", 2419200);
			file.setValue("MySQL.use", false);
			file.setValue("MySQL.Host", "");
			file.setValue("MySQL.Port", 3306);
			file.setValue("MySQL.Database", "");
			file.setValue("MySQL.User", "");
			file.setValue("MySQL.Password", "");
			ArrayList<String> list = new ArrayList<>();
			file.setValue("Users", list);
			file.save();

		}

	}

	public static void readFile() {

		DataChest.chestCooldown = file.getInt("ChestCooldown");
		DataChest.useMySQL = file.getBoolean("MySQL.use");
		DataChest.MySQLHost = file.getString("MySQL.Host");
		DataChest.MySQLPort = file.getInt("MySQL.Port");
		DataChest.MySQLDatabase = file.getString("MySQL.Database");
		DataChest.MySQLUser = file.getString("MySQL.User");
		DataChest.MySQLPassword = file.getString("MySQL.Password");

	}

	public static void reloadFile() {

		file = new FileWriter("plugins//ServerSystem//Case", "Chest.yml");
		readFile();

	}

	private static void setValue(final String valuePath, final String value) {

		if (!file.valueExist(valuePath)) {

			file.setValue(valuePath, value);

		}

	}

}
