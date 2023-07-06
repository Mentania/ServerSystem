package de.tempoo50.system.utils;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.data.FileManagerJobs;

public class JobsManager {
	
	public void setJobHolzfäller(Player player) {
		
		for(String command : YamlConfiguration.loadConfiguration(FileManagerJobs.getConfigFile()).getStringList("jobscommandholz")) {
			
			command = command.replace("target", player.getName());
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
			
		}
		
	}
	
	public void setJobMinenarbeiter(Player player) {
		
		for(String command : YamlConfiguration.loadConfiguration(FileManagerJobs.getConfigFile()).getStringList("jobscommandmine")) {
			
			command = command.replace("target", player.getName());
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
			
		}
		
	}
	
	public void setJobBauarbeiter(Player player) {
		
		for(String command : YamlConfiguration.loadConfiguration(FileManagerJobs.getConfigFile()).getStringList("jobscommandbau")) {
			
			command = command.replace("target", player.getName());
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
			
		}
		
	}

}
