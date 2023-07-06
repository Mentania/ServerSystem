package de.tempoo50.system.utils;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.mysql.MySQLBan;

public class BanManager {
	
	public static void unbanPlayer(CommandSender player, UUID uuid, String wen) {

		File messagesfile = new File("plugins//ServerSystem//BannSystem//Messages.yml");
		YamlConfiguration messages = YamlConfiguration.loadConfiguration(messagesfile);
		
		File file = new File("plugins//ServerSystem//BanSystem//gebannte Spieler//" + uuid + ".yml");
		File tempfile = new File("plugins//ServerSystem//temp gebannte Spieler//" + uuid + ".yml");
		
		if(file.exists()) {
			
			file.delete();
			
			Bukkit.getServer().getConsoleSender().sendMessage(MessagesUtil.PREFIX + "Der Spieler " + player.getName() + " hat den Spieler " + wen + " entbannt");
			
			for(Player all : Bukkit.getOnlinePlayers()) {
				
				if(all.hasPermission("sys.test")) {
					
					String msg = messages.getString("unban");
					msg = msg.replace("PLAYER", player.getName());
					msg = msg.replace("UNBAN", wen);
					
					all.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
					
				}
				
			}
			
		}else if(tempfile.exists()) {
			
			tempfile.delete();
			
			Bukkit.getServer().getConsoleSender().sendMessage(MessagesUtil.PREFIX + "Der Spieler " + player.getName() + " hat den Spieler " + wen + " entbannt");
			
			for(Player all : Bukkit.getOnlinePlayers()) {
				
				if(all.hasPermission("sys.test")) {
					
					String msg = messages.getString("unban");
					msg = msg.replace("PLAYER", player.getName());
					msg = msg.replace("UNBAN", wen);
					
					all.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
					
				}
				
			}
			
		}else {
			
			String msg = messages.getString("noBan");
			player.sendMessage(MessagesUtil.PREFIX + ChatColor.translateAlternateColorCodes('&', msg));
			
		}
		
	}
	
	public static String getBanner(UUID uuid) {
		
		File file = new File("plugins//ServerSystem//BanSystem//gebannte Spieler//" + uuid + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		File tempfile = new File("plugins//ServerSystem//temp gebannte Spieler//" + uuid + ".yml");
		FileConfiguration tempconfig = YamlConfiguration.loadConfiguration(tempfile);
		
		if(file.exists()) {
			
			return config.getString("Informationen.Von");
			
		}
		
		if(tempfile.exists()) {
			
			return tempconfig.getString("Informationen.Von");
			
		}
		
		return null;
		
	}
	
	public static String getTimeStamp(UUID uuid) {

		File tempfile = new File("plugins//ServerSystem//temp gebannte Spieler//" + uuid + ".yml");
		FileConfiguration tempconfig = YamlConfiguration.loadConfiguration(tempfile);
		
		if(tempfile.exists()) {
			
			return tempconfig.getString("Informationen.Datum");
			
		}
		
		return null;
		
	}
	
	public static String getReason(UUID uuid) {

		File file = new File("plugins//ServerSystem//BanSystem//gebannte Spieler//" + uuid + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		File tempfile = new File("plugins//ServerSystem//temp gebannte Spieler//" + uuid + ".yml");
		FileConfiguration tempconfig = YamlConfiguration.loadConfiguration(tempfile);
		
		if(file.exists()) {
			
			return config.getString("Informationen.Grund");
			
		}
		
		if(tempfile.exists()) {
			
			return tempconfig.getString("Informationen.Grund");
			
		}
		
		return null;
		
	}
	
	public static void banPlayer(UUID uuid, String playername, String reason, CommandSender sender) {

		File messagesfile = new File("plugins//ServerSystem//BannSystem//Messages.yml");
		YamlConfiguration messages = YamlConfiguration.loadConfiguration(messagesfile);
		
		File file = new File("plugins//ServerSystem//BanSystem//gebannte Spieler//" + uuid + ".yml");
		File tempfile = new File("plugins//ServerSystem//temp gebannte Spieler//" + uuid + ".yml");
		File ordner = new File("plugin//ServerSystem//BanSystem//");
		
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		tempfile.delete();
		
		if(!ordner.exists()) {
			
			ordner.mkdir();
			Bukkit.getServer().getConsoleSender().sendMessage(MessagesUtil.PREFIX + "Ordner \"plugins/ServerSystem/BanSystem/\" erstellt.");
			
		}
		
		if(!file.exists()) {
			
			try {
				
				file.createNewFile();
				
			}catch(IOException e) {
				
			}
			
		}
		
		config.set("Informationen.Von", sender.getName());
		config.set("Informationen.Grund", reason);
		config.set("Informationen.Name", playername);
		
		try {
			
			config.save(file);
			
		}catch(IOException e) {
			
		}
		
		Collection<? extends Player> players = Bukkit.getServer().getOnlinePlayers();
		
		for(Player player : players) {
			
			if(player.getUniqueId().equals(uuid)) {
				
				String msg = messages.getString("ban");
				msg = msg.replace("BANNER", config.getString("Informationen.Von"));
				msg = msg.replace("PLAYER", player.getName());
				msg = msg.replace("GRUND", config.getString("Informationen.Grund"));
				
				player.kickPlayer(ChatColor.translateAlternateColorCodes('&', MessagesUtil.PREFIX + msg));
				
			}
			
		}
		
	}
	
	public static void tempbanPlayer(UUID uuid, String playername, String reason, CommandSender sender, long time) {
		
		File messagesfile = new File("plugins//ServerSystem//BannSystem//Messages.yml");
		YamlConfiguration messages = YamlConfiguration.loadConfiguration(messagesfile);
		
		File file = new File("plugins//ServerSystem//BanSystem//gebannte Spieler//" + uuid + ".yml");
		File tempfile = new File("plugins//ServerSystem//temp gebannte Spieler//" + uuid + ".yml");
		File ordner = new File("plugin//ServerSystem//BanSystem//");
		FileConfiguration config = YamlConfiguration.loadConfiguration(tempfile);
		
		file.delete();
		
		if(!ordner.exists()) {
			
			ordner.mkdir();
			
		}
		
		if(!tempfile.exists()) {
			
			try {
				
				file.createNewFile();
				
			}catch(IOException ex) {
				
			}
			
		}
		
		long end = time * 1000;
		
		config.set("Informationen.Von", sender.getName());
		config.set("Informationen.Grund", reason);
		config.set("Informationen.Name", playername);
		config.set("Informationen.MilliSeconds", Long.valueOf(end + System.currentTimeMillis()));
		config.set("Informationen.Datum", new SimpleDateFormat("dd.MM.yyyy, HH:mm:ss").format(Long.valueOf(config.getLong("Informationen.MilliSeconds"))));
		
		try {
			
			config.save(tempfile);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		Collection<? extends Player> players = Bukkit.getServer().getOnlinePlayers();
		
		for(Player player : players) {
			
			if(player.getUniqueId().equals(uuid)) {
				
				String msg = messages.getString("tempban");
				msg = msg.replace("BANNER", config.getString("Informationen.Von"));
				msg = msg.replace("PLAYER", player.getName());
				msg = msg.replace("DATUM", config.getString("Informationen.Datum"));
				msg = msg.replace("GRUND", config.getString("Informationen.Grund"));
				player.kickPlayer(ChatColor.translateAlternateColorCodes('&', msg));
				
			}
			
		}
		
	}
	
	public static boolean isbanned(UUID uuid) {
		
		File file = new File("plugins//ServerSystem//BanSystem//gebannte Spieler//" + uuid + ".yml");
		File tempfile = new File("plugins//ServerSystem//temp gebannte Spieler//" + uuid + ".yml");
		File ordner = new File("plugin//ServerSystem//BanSystem//");
		
		if(!ordner.exists()) {
			
			ordner.mkdir();
			Bukkit.getConsoleSender().sendMessage("§a§lDer Ordner für das BanSystem wurde im ServerSystem Ordner erstellt");
			
			return false;
			
		}else if(!tempfile.exists()) {
			
			return false;
			
		}else if(!file.exists()) {
			
			return false;
			
		}else
			
			return true;
		
	}
	
	public static void mysqlban(String p, String reason, Long seconds, Player banner) {

		File messagesfile = new File("plugins//ServerSystem//BannSystem//Messages.yml");
		YamlConfiguration messages = YamlConfiguration.loadConfiguration(messagesfile);
		
		String von = banner.getName();
		OfflinePlayer target = Bukkit.getOfflinePlayer(p);
		String player = target.getName();
		UUID uuid = target.getUniqueId();
		long end = 0;
		
		if(isbannedmysql(p)) {
			
			unbanmysql(p);
			
		}
		
		if(seconds == -1) {
			
			end = -1;
			
		}else {
			
			long current = System.currentTimeMillis();
			long millis = seconds * 1000;
			end = current + millis;
			
		}
		
		String date;
		
		if(seconds == -1) {
			
			date = "Permanent!";
			
		}else {
			
			date = new SimpleDateFormat("dd.MM.yyyy, HH:mm:ss").format(end);
			
		}
		
		MySQLBan.update("INSERT INTO BannedPlayers (Spielername, UUID, Ende, Grund, Von, Datum) VALUES ('" + player + "','" + uuid + "','" + end + "','" + reason + "','" + von + "','" + date + "')");
		
		if(Bukkit.getPlayer(player) != null) {
			
			String msg = messages.getString("tempban");
			msg = msg.replace("GRUND", getReasonMySQL(uuid.toString()));
			msg = msg.replace("BANNER", getBannerMySQL(uuid));
			msg = msg.replace("DATUM", getDatumMySQL(uuid));
			
			Bukkit.getPlayer(player).kickPlayer(ChatColor.translateAlternateColorCodes('&', msg));
			
		}
		
	}
	
	public static void unbanmysql(String uuid) {
		
		MySQLBan.update("DELETE FROM BannedPlayers WHERE UUID='" + uuid + "'");
		
	}
	
	public static boolean isbannedmysql(String uuid) {
		
		ResultSet rs = MySQLBan.getResult("SELECT FROM BannedPlayers WHERE UUID='" + uuid + "'");
		
		try {
			
			return rs.next();
			
		}catch(SQLException ex) {
			
			ex.printStackTrace();
			
		}
		
		return false;
		
	}
	
	public static String getReasonMySQL(String allBanned) {
		
		ResultSet rs = MySQLBan.getResult("SELECT * FROM BannedPlayers WHERE UUID='" + allBanned + "'");
		
		try {
			
			while(rs.next()) {
				
				return rs.getString("Grund");
				
			}
			
		}catch(SQLException ex) {
			
			ex.printStackTrace();
			
		}
		
		return "";
		
	}
	
	public static String getBannerMySQL(UUID uuid) {
		
		ResultSet rs = MySQLBan.getResult("SELECT * FROM BannedPlayers WHERE UUID='" + uuid + "'");
		
		try {
			
			while(rs.next()) {
				
				return rs.getString("Von");
				
			}
			
		}catch(SQLException ex) {
			
			ex.printStackTrace();
			
		}
		
		return "";
		
	}
	
	public static Long getEndMySQL(UUID uuid) {
		
		ResultSet rs = MySQLBan.getResult("SELECT * FROM BannedPlayers WHERE UUID='" + uuid + "'");
		
		try {
			
			while(rs.next()) {
				
				return rs.getLong("Ende");
				
			}
			
		}catch(SQLException ex) {
			
			ex.printStackTrace();
			
		}
		
		return null;
		
	}
	
	public static String getDatumMySQL(UUID uuid) {
		
		ResultSet rs = MySQLBan.getResult("SELECT * FROM BannedPlayers WHERE UUID='" + uuid + "'");
		
		try {
			
			while(rs.next()) {
				
				return rs.getString("Datum");
				
			}
			
		}catch(SQLException ex) {
			
			ex.printStackTrace();
			
		}
		
		return null;
		
	}
	
	public static List<String> getBannedPlayersMySQL() {
		
		List<String> list = new ArrayList<>();
		
		ResultSet rs = MySQLBan.getResult("SELECT * FROM BannedPlayers");
		
		try {
			
			while(rs.next()) {
				
				list.add(rs.getString("Spielername"));
				
			}
			
		}catch(SQLException ex) {
			
			ex.printStackTrace();
			
		}
		
		return list;
		
	}
	
	public static String getRemainingTimeMySQL(Player player) {
		
		UUID uuid = player.getUniqueId();
		
		long current = System.currentTimeMillis();
		long end = getEndMySQL(uuid);
		long millis = end - current;
		
		long seconds = 0;
		long minutes = 0;
		long hours = 0;
		long days = 0;
		long weeks = 0;
		
		while(millis > 1000) {
			
			millis -= 1000;
			seconds++;
			
		}
		
		while(seconds > 60) {
			
			seconds -= 60;
			minutes++;
			
		}
		
		while(minutes > 60) {
			
			minutes -= 60;
			hours++;
			
		}
		
		while(hours > 24) {
			
			hours -= 24;
			days++;
			
		}
		
		while(days > 7) {
			
			days -= 7;
			weeks++;
			
		}
		
		return "§e" + weeks + "Woche(n)" + days + "Tag(e)" + hours + "Stunde(n)" + minutes + "Minute(n)" + seconds + "Sekunde(n)";
		
	}

}
