package de.tempoo50.system.utils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.OfflinePlayer;

import de.tempoo50.system.mysql.MySQLPlayer;

public class InsertTabeUtil {
	

	public boolean timer(OfflinePlayer arg0) {
		
		try {
			if(!hasAccount(arg0)) {
			
				PreparedStatement st = MySQLPlayer.con.prepareStatement("INSERT INTO playerTable(UUID, days, hours, minutes) VALUES (?,?,?,?);");
			
				st.setString(1, arg0.getUniqueId().toString());
				st.setDouble(2, 0);
				st.setDouble(3, 0);
				st.setDouble(4, 0);
				st.executeUpdate();
				return true;
			}else
				return true;
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		return false;
		
	}
	
	public boolean hasAccount(OfflinePlayer arg0) {
		
		try {
			
			PreparedStatement st = MySQLPlayer.con.prepareStatement("SELECT COUNT(*) FROM playerTable WHERE UUID = ?");
			st.setString(1, arg0.getUniqueId().toString());
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				
				int numberOfRows = rs.getInt(1);
				if (numberOfRows >= 1)
					return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
