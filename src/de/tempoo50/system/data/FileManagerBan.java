package de.tempoo50.system.data;

import de.tempoo50.system.api.FileWriter;

public class FileManagerBan {
	
	public static FileWriter file = new FileWriter("plugins//ServerSystem//BanSystem", "MySQLBan.yml");
	
	public static FileWriter getFile() {
		
		return file;
		
	}
	
	public static void loadFile() {
		
		if(!file.exist()) {
		
			file.setValue("MySQL.Use", false);
			file.setValue("MySQL.Host", "");
			file.setValue("MySQL.Port", 3306);
			file.setValue("MySQL.Database", "");
			file.setValue("MySQL.User", "");
			file.setValue("MySQL.Passwort", "");
			
			file.save();
			
		}
		
	}
	
	public static void readFile() {
		
		DataBan.useMySQL = file.getBoolean("MySQL.Use");
		DataBan.MySQLHost = file.getString("MySQL.Host");
		DataBan.MySQLPort = file.getInt("MySQL.Port");
		DataBan.MySQLDatabase = file.getString("MySQL.Database");
		DataBan.MySQLUser = file.getString("MySQL.User");
		DataBan.MySQLPasswort = file.getString("MySQL.Passwort");
		
	}

}
