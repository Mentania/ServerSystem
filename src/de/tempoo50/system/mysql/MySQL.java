package de.tempoo50.system.mysql;

import de.tempoo50.system.data.DataEco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {

	public static Connection con;

	public static void connect() {

		if (!isConnected()) {

			try {

				con = DriverManager.getConnection("jdbc:mysql://" + DataEco.MySQLHost + ":" + DataEco.MySQLPort + "/" + DataEco.MySQLDatabase + "?autoReconnect=true", DataEco.MySQLUser, DataEco.MySQLPassword);
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

			con.prepareStatement("CREATE TABLE IF NOT EXISTS coinTable (UUID VARCHAR(100), coins INT(16))")
					.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

}