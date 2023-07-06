package de.tempoo50.system.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class RespawnListener implements Listener {

	@EventHandler
	public void handlePlayerrespawn(PlayerRespawnEvent event) {
		Player player = event.getPlayer();

		File file = new File("plugins//ServerSystem//Spawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		World world = Bukkit.getWorld(config.getString("Spawn.World"));
		double x = config.getDouble("Spawn.X");
		double y = config.getDouble("Spawn.Y");
		double z = config.getDouble("Spawn.Z");
		float yaw = (float) config.getDouble("Spawn.Yaw");
		float pitch = (float) config.getDouble("Spawn.Pitch");
		Location location = new Location(world, x, y, z, yaw, pitch);

		event.setRespawnLocation(location);

		player.teleport(location);

	}

}
