package de.tempoo50.system.utils;

import org.bukkit.Location;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Pig;

public class SpawnUtil {

	public static void spawnPig(Location location) {

		Pig pig = (Pig) location.getWorld().spawnEntity(location, EntityType.PIG);
		pig.setCustomName("Quiek");
		pig.setCustomNameVisible(true);

	}

	public static void spawnCow(Location location) {

		Cow cow = (Cow) location.getWorld().spawnEntity(location, EntityType.COW);
		cow.setCustomName("Muh");
		cow.setCustomNameVisible(true);

	}

	public static void spawnChicken(Location location) {

		Chicken chicken = (Chicken) location.getWorld().spawnEntity(location, EntityType.CHICKEN);
		chicken.setCustomName("Hühnchen");
		chicken.setCustomNameVisible(true);

	}

}
