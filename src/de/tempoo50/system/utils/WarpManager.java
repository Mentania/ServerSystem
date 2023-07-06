package de.tempoo50.system.utils;

import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import de.tempoo50.system.api.FileWriter;

public class WarpManager {

	private FileWriter fw;

	public WarpManager() {

		fw = new FileWriter("plugins//ServerSystem//Warps//", "warps.yml");

	}

	public void addWarp(Location loc, String name) {

		fw.setValue(name + ".world", loc.getWorld().getName());
		fw.setValue(name + ".x", loc.getX());
		fw.setValue(name + ".y", loc.getY());
		fw.setValue(name + ".z", loc.getZ());
		fw.setValue(name + ".yaw", loc.getYaw());
		fw.setValue(name + ".pitch", loc.getPitch());

		fw.save();

	}

	public boolean exist(String name) {
		return fw.getString(name) != null;
	}

	public Set<String> getWarps() {
		return fw.getKeys(false);
	}

	public Location getLocation(String name) {
		return new Location(Bukkit.getWorld(fw.getString(name + ".world")), fw.getDouble(name + ".x"),
				fw.getDouble(name + ".y"), fw.getDouble(name + ".z"), (float) fw.getDouble(name + ".yaw"),
				(float) fw.getDouble(name + ".pitch"));
	}

	public void delWarp(String name) {

		fw.setValue(name, null);

		fw.save();
	}

}
