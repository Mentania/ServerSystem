package de.tempoo50.system.data;

import java.util.ArrayList;

import de.tempoo50.system.api.FileWriter;
import de.tempoo50.system.main.ServerSystem;

public class FileManager {

	private static FileWriter file = new FileWriter(ServerSystem.getInctance().getDataFolder().getPath(), "Kopf.yml");

	public static FileWriter getFile() {
		return file;
	}

	public static void loadFile() {
		if (!file.exist()) {
			file.setValue("KopfCooldown", 1209600);
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
		Data.kopfCooldown = file.getInt("KopfCooldown");
		Data.useMySQL = file.getBoolean("MySQL.use");
		Data.MySQLHost = file.getString("MySQL.Host");
		Data.MySQLPort = file.getInt("MySQL.Port");
		Data.MySQLDatabase = file.getString("MySQL.Database");
		Data.MySQLUser = file.getString("MySQL.User");
		Data.MySQLPassword = file.getString("MySQL.Password");
	}

	public static void relaodFile() {
		file = new FileWriter(ServerSystem.getInctance().getDataFolder().getPath(), "Kopf.yml");
		readFile();
	}

	private static void setValue(final String valuePath, final String value) {
		if (!file.valueExist(valuePath)) {
			file.setValue(valuePath, value);
		}
	}

}