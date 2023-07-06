package de.tempoo50.system.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import org.bukkit.configuration.file.YamlConfiguration;

import de.tempoo50.system.main.ServerSystem;

public class WorldHandler {
	
	private final List<WorldManager> worldlist;
	private final File folder = new File(ServerSystem.getInctance().getDataFolder(), "worlds");
	
	public WorldHandler() {
			
		this.worldlist = new ArrayList<>();
		
		if(!folder.exists()) {
			
			folder.mkdir();
			
		}
		
		for (File file : folder.listFiles()) {
			
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
			WorldManager world = new WorldManager(UUID.fromString(config.getString("id")), config.getString("creator"), config.getString("name"), config.getString("type"), config.getString("date"), config.getBoolean("load"));
			worldlist.add(world);
			
			if(world.isLoaded()) {
				
				Bukkit.createWorld(new WorldCreator(world.getName()));
				
			}
			
		}
		
	}
	
	public void addWorld(String name, String creator, String type) {
		
		File file = new File(folder, name + ".yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		UUID uuid = UUID.randomUUID();
		
		String date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
		
		config.set("id", uuid.toString());
		config.set("creator", creator);
		config.set("name", name);
		config.set("type", type);
		config.set("date", date);
		config.set("load", Bukkit.getWorld(name) != null);
		
		try {
			
			config.save(file);
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		worldlist.add(new WorldManager(uuid, creator, name, type, name, Bukkit.getWorld(name) != null));
		
	}
	
	public void deleteWorld(WorldManager world) {
		
		String name = world.getName();
		
		if(world.isLoaded()) {
			
			Bukkit.unloadWorld(name, false);
			
		}
		
		File file = new File(folder, name + ".yml");
		file.delete();
		worldlist.remove(world);
		deleteFolder(new File(name));
		
	}
	
	public void saveWorld() throws IOException {
		
		for(WorldManager world : worldlist) {
			
			File file = new File(folder, world.getName() + ".yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
			config.set("load", world.isLoaded());
			config.save(file);
			
		}
		
	}
	
	public WorldManager getWorld(String name) {
		
		for(WorldManager world : worldlist) {
			
			if(world.getName().equalsIgnoreCase(name)) {
				
				return world;
				
			}
			
		}
		
		return null;
		
	}
	
	private boolean deleteFolder(File folder) {
		
		File[] files = folder.listFiles();
		
		if(files != null) {
			
			for(File file : files) {
				
				if(file.isDirectory()) {
					
					deleteFolder(file);
					
				}else
					
					file.delete();
				
			}
			
		}
		
		return folder.delete();
		
	}
	
	public List<WorldManager> getWorldList() {
		
		return worldlist;
		
	}

}
