package de.tempoo50.system.utils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.mysql.MySQLPlayer;

public class PlayerTimer {
	
	private ServerSystem plugin;

	public PlayerTimer(ServerSystem plugin) {
		this.plugin = plugin;
	}
	
	public void startTimer() {
		
		try {
			
			Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {

				PreparedStatement st = MySQLPlayer.con.prepareStatement("UPDATE playerTable SET days = ?, hours = ?, minutes = ? WHERE UUID = ?");
				
				@Override
				public void run() {

					for (Player arg0 : Bukkit.getOnlinePlayers()) {
						
						try {
							
							PreparedStatement s = MySQLPlayer.con.prepareStatement("SELECT days, hours, minutes FROM playerTable WHERE UUID = ?");
							s.setString(1, arg0.getUniqueId().toString());
							ResultSet rs = s.executeQuery();
							
							while(rs.next()) {
								
							int days = rs.getInt("days");
							int hours = rs.getInt("hours");
							int minutes = rs.getInt("minutes");
							
							try {
								
								minutes++;
								
								st.setDouble(1, days);
								st.setDouble(2, hours);
								st.setDouble(3, minutes);
								st.setString(4, arg0.getUniqueId().toString());
								st.executeUpdate();
							
							} catch (SQLException e1) {
								
								e1.printStackTrace();
							
							}
							


							if (minutes == 60) {
								
								
								
								try {
									
									hours++;
									
									st.setDouble(1, days);
									st.setDouble(2, hours);
									st.setDouble(3, 0);
									st.executeUpdate();
								} catch (SQLException e1) {
									
									e1.printStackTrace();
								}
								

							}

							if (hours == 24) {
								
								
								
								try {
									
									days++;
									
									st.setDouble(1, days);
									st.setDouble(2, 0);
									st.setDouble(3, 0);
									st.executeUpdate();
								} catch (SQLException e1) {
									
									e1.printStackTrace();
								}
							
							}
							
							

							}
						} catch (SQLException e) {
							
							e.printStackTrace();
						}

					}

				}
			}, 20 * 60, 20 * 60);
		
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		

	}

}
