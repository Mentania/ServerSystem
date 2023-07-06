package de.tempoo50.system.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import de.tempoo50.system.data.DataBan;
import de.tempoo50.system.main.ServerSystem;

public class MySQLBan {
	
	public static Connection connection;
	
	public static void connect() {
		
		if(!isConnected()) {
			
			try {
				
				connection = DriverManager.getConnection("jdbc:mysql://" + DataBan.MySQLHost + ":" + DataBan.MySQLPort + "/" + DataBan.MySQLDatabase + "?autoReconnect=true", DataBan.MySQLUser, DataBan.MySQLPasswort);
				ServerSystem.log("§aDie MySQL Verbindung wurde hergestellt");
				
			}catch(SQLException var1) {
				
				ServerSystem.log("§4Die MySQL Verbindung konnte nicht hergestellt werden.");
				
			}
			
		}
		
	}
	
	public static ResultSet getResult(String sql) {
		
		if(isConnected()) {
			
			try {
				
				return connection.createStatement().executeQuery(sql);
				
			}catch(SQLException var2) {
				
				var2.printStackTrace();
				
			}
			
		}
		
		return null;
		
	}
	
	public static void close() {
		
		if(isConnected()) {
			
			try {
				
				connection.close();
				
			}catch(SQLException var1) {
				
				var1.printStackTrace();
				
			}
			
		}
		
	}
	
	public static boolean isConnected() {
		
		return connection != null;
		
	}
	
	public static void update(String qry) {
		
		try {
			
			Statement st = connection.createStatement();
			st.executeUpdate(qry);
			st.close();
			
		}catch(SQLException var2) {
			
			var2.printStackTrace();
			
		}
		
	}
	
	public static void createTable() {
		
		if(isConnected()) {
			
			try {
			
				connection.prepareStatement("CREATE TABLE IF NOT EXISTS banstats (UUID VARCHAR(100), Name VARCHAR(16), Banns VARCHAR(1000))").executeUpdate();
				
				connection.prepareStatement("CREATE TABLE IF NOT EXISTS bannedplayer (Spielername VARCHAR(16), UUID VARCHAR(100), Ende INT(16), Grund VARCHAR(100), Von VARCHAR(100), Datum INT(16)").executeUpdate();
				
			}catch(SQLException e) {
				
				e.printStackTrace();
				
			}
				
		}
		
	}

}
