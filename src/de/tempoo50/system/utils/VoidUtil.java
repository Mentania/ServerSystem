package de.tempoo50.system.utils;

import org.bukkit.generator.ChunkGenerator;

public class VoidUtil {
	
	public static ChunkGenerator getDefaultChunkGenerator(String worldname) {
		
		return new VoidWorldGenerator();
		
	}

}
