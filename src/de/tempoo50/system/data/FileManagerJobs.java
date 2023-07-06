package de.tempoo50.system.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import de.tempoo50.system.main.ServerSystem;

public class FileManagerJobs {
	
	public static File getConfigFile() {
		
		return new File(ServerSystem.getInctance().getDataFolder(), "Jobs//config.yml");
		
	}
	
	public static void setDefault() {
		
		FileConfiguration config = YamlConfiguration.loadConfiguration(getConfigFile());
		
		config.options().copyDefaults(true);
		config.addDefault("prefix", "Jobgeschenk");
		
		List<String> commandholz = new ArrayList<String>();
		List<String> commandmine = new ArrayList<String>();
		List<String> commandbau = new ArrayList<String>();
		
		commandholz.add("lp user target permission set sys.holz");
		commandmine.add("lp user target permission set sys.mine");
		commandbau.add("lp user target permission set sys.bau");
		
		config.addDefault("jobscommandholz", commandholz);
		config.addDefault("jobscommandmine", commandmine);
		config.addDefault("jobscommandbau", commandbau);
		
		config.options().copyDefaults(true);
		
		try {
			
			config.save(getConfigFile());
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
