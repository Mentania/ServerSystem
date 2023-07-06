package de.tempoo50.system.utils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.OfflinePlayer;

import de.tempoo50.system.mysql.MySQLPlayer;

public class SelectTableUtil {
	
	public double getTimeDay(OfflinePlayer arg0) {
		
		try {

			PreparedStatement s = MySQLPlayer.con.prepareStatement("SELECT days FROM playerTable WHERE UUID = ?");
			s.setString(1, arg0.getUniqueId().toString());
			ResultSet rs = s.executeQuery();
		
			while(rs.next()) {
			
				return rs.getInt("days");
	
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		
		return -1;
	}
	
	public double getTimeHour(OfflinePlayer arg0) {
		
		try {

			PreparedStatement s = MySQLPlayer.con.prepareStatement("SELECT hours FROM playerTable WHERE UUID = ?");
			s.setString(1, arg0.getUniqueId().toString());
			ResultSet rs = s.executeQuery();
		
			while(rs.next()) {
			
				return rs.getInt("hours");
			}

		} catch (SQLException e) {
				
			e.printStackTrace();

		}

			
		return -1;
	}
	
	public double getTimeMinutes(OfflinePlayer arg0) {
		
		try {

			PreparedStatement s = MySQLPlayer.con.prepareStatement("SELECT minutes FROM playerTable WHERE UUID = ?");
			s.setString(1, arg0.getUniqueId().toString());
			ResultSet rs = s.executeQuery();
		
			while(rs.next()) {
		
				return rs.getInt("minutes");
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		
		return -1;
	}

}
