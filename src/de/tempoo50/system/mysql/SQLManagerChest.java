package de.tempoo50.system.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.entity.Player;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.ChestPlayer;

public class SQLManagerChest {

	public static boolean inChest(String uuid) {

		String qry = "SELECT * FROM CHEST WHERE UUID=?";
		try {

			PreparedStatement stmt = MySQLChest.connection.prepareStatement(qry);
			stmt.setString(1, uuid);
			ResultSet rs = stmt.executeQuery();
			return rs.next();

		} catch (SQLException e) {

			return false;

		}

	}

	public static void addToChest(String uuid, long time) {

		if (!inChest(uuid)) {

			String qry = "INSERT INTO CHEST (UUID,TIME) VALUES (?,?)";
			try {

				PreparedStatement stmt = MySQLChest.connection.prepareStatement(qry);
				stmt.setString(1, uuid);
				stmt.setLong(2, time);
				stmt.execute();

			} catch (SQLException e) {

				e.printStackTrace();

			}

		}

	}

	public static ChestPlayer getData(String uuid) {

		String qry = "SELECT * FROM CHEST WHERE UUID=?";
		Long t = 0L;
		try {

			PreparedStatement stmt = MySQLChest.connection.prepareStatement(qry);
			stmt.setString(1, uuid);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {

				t = rs.getLong("Time");

			}

			return new ChestPlayer(uuid, t);

		} catch (SQLException e) {

			return null;

		}

	}

	public static void updateData(Player player, Long time) {

		setData(player.getUniqueId().toString(), time);
		ServerSystem.chests.put(player, new ChestPlayer(player.getUniqueId().toString(), time));

	}

	private static void setData(String uuid, long Time) {

		String qry = "UPDATE CHEST SET TIME=? WHERE UUID=?";
		try {

			PreparedStatement stmt = MySQLChest.connection.prepareStatement(qry);
			stmt.setLong(1, Time);
			stmt.setString(2, uuid);
			stmt.execute();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

}
