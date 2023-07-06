package de.tempoo50.system.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import de.tempoo50.system.data.DataPlayer;

public class MySQLPlayer {

	public static Connection con;

	public static void connect() {

		if (!isConnected()) {

			try {

				con = DriverManager.getConnection("jdbc:mysql://" + DataPlayer.MySQLHost + ":" + DataPlayer.MySQLPort + "/" + DataPlayer.MySQLDatabase + "?autoReconnect=true", DataPlayer.MySQLUser, DataPlayer.MySQLPassword);
				System.out.println("MySQL Verbunden!");

			} catch (SQLException e) {

				e.printStackTrace();

			}

		}

	}

	public static void disconnect() {

		if (isConnected()) {

			try {

				con.close();
				System.out.println("MySQL Verbindung getrennt!");

			} catch (SQLException e) {

				e.printStackTrace();

			}

		}

	}

	public static boolean isConnected() {

		return (con != null);

	}

	public static void createTable() {

		try {

			con.prepareStatement("CREATE TABLE IF NOT EXISTS playerTable (UUID VARCHAR(100), days INT(16), hours INT(16), minutes INT(16))").executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

}