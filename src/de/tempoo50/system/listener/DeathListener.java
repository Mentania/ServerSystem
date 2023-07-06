package de.tempoo50.system.listener;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

	@EventHandler
	public void handlePlayerDeath(PlayerDeathEvent event) {

		File perm = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

		Player player = event.getEntity();
		event.setDeathMessage("");
		if (player.hasPermission((String) per.get("Spawn.Inv"))) {
			event.setKeepInventory(true);
			event.setKeepLevel(true);
		}

	}

}