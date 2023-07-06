package de.tempoo50.system.utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;

import net.md_5.bungee.api.ChatColor;

public class Hologram {

	public static List<Hologram> holos = new ArrayList<Hologram>();

	private ArmorStand hologram;
	private String text;
	private Location location;

	public ArmorStand getHologram() {
		return hologram;
	}

	public String getText() {
		return text;
	}

	public Location getLocation() {
		return location;
	}

	public Hologram(Location location, String text) {
		this.location = location;
		this.text = text;
	}

	public void create() {
		hologram = location.subtract(0, 1, 0).getWorld().spawn(location, ArmorStand.class);
		hologram.setCustomName(ChatColor.translateAlternateColorCodes('&', text));
		hologram.setCustomNameVisible(true);
		hologram.setGravity(false);
		hologram.setVisible(false);

		holos.add(this);

	}

	public void remove() {
		hologram.remove();
		holos.remove(this);
	}

	public void teleport(Location location) {
		hologram.teleport(location);
	}

	public void cangeText(String text) {
		hologram.setCustomName(ChatColor.translateAlternateColorCodes('&', text));
	}

	public static Hologram getByLocation(Location location) {
		for (Hologram holo : Hologram.holos) {
			if (holo.getLocation().distance(location) <= 3) {
				return holo;
			}
		}
		return null;
	}

}
