package de.tempoo50.system.utils;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.data.FileManagerPerks;

public class PerkManager {
	
	public void setPerkFall(Player player) {
		
		for(String comand : YamlConfiguration.loadConfiguration(FileManagerPerks.getConfigFile()).getStringList("perkcommandfallschaden")) {
			
			comand = comand.replace("target", player.getName());
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), comand);
			
		}
		
	}
	
	public void setPerkNacht(Player player) {
		
		for(String comand : YamlConfiguration.loadConfiguration(FileManagerPerks.getConfigFile()).getStringList("perkcommandnachtsicht")) {
			
			comand = comand.replace("target", player.getName());
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), comand);
			
		}
		
	}
	
	public void  setPerkXP(Player player) {
		
		for(String comand : YamlConfiguration.loadConfiguration(FileManagerPerks.getConfigFile()).getStringList("perkcommandxp")) {
			
			comand =comand.replace("target", player.getName());
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), comand);
			
		}
		
	}
	
	public void setPerkAbbau(Player player) {
		
		for(String comand : YamlConfiguration.loadConfiguration(FileManagerPerks.getConfigFile()).getStringList("perkcommandabbau")) {
			
			comand = comand.replace("target", player.getName());
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), comand);
			
		}
		
	}
	
	public void setPerkFeuer(Player player) {
		
		for(String comand : YamlConfiguration.loadConfiguration(FileManagerPerks.getConfigFile()).getStringList("perkcommandfeuer")) {
			
			comand = comand.replace("target", player.getName());
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), comand);
			
		}
		
	}
	
	public void setPerkLaufen(Player player) {
		
		for(String comand : YamlConfiguration.loadConfiguration(FileManagerPerks.getConfigFile()).getStringList("perkcommandlaufen")) {
			
			comand = comand.replace("target", player.getName());
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), comand);
			
		}
		
	}
	
	public void setPerkErtrinken(Player player) {
		
		for(String comand : YamlConfiguration.loadConfiguration(FileManagerPerks.getConfigFile()).getStringList("perkcommandertrinken")) {
			
			comand = comand.replace("target", player.getName());
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), comand);
			
		}
		
	}
	
	public void setPerkTod(Player player) {
		
		for(String comand : YamlConfiguration.loadConfiguration(FileManagerPerks.getConfigFile()).getStringList("perkcommandtod")) {
			
			comand = comand.replace("target", player.getName());
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), comand);
			
		}
		
	}
	
	public void setPerkHunger(Player player) {
		
		for(String comand : YamlConfiguration.loadConfiguration(FileManagerPerks.getConfigFile()).getStringList("perkcommandhunger")) {
			
			comand = comand.replace("target", player.getName());
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), comand);
			
		}
		
	}
	
	public void setPerkJagt(Player player) {
		
		for(String command : YamlConfiguration.loadConfiguration(FileManagerPerks.getConfigFile()).getStringList("perkcommandjagt")) {
			
			command = command.replace("target", player.getName());
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
			
		}
		
	}

}
