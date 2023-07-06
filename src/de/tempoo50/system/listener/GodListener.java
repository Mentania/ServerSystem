package de.tempoo50.system.listener;

import java.util.ArrayList;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;

import de.tempoo50.system.main.ServerSystem;

public class GodListener implements Listener {

	private ServerSystem plugin;
	private ArrayList<String> godModePlayers;

	public GodListener(ServerSystem plugin) {
		this.plugin = plugin;
		godModePlayers = new ArrayList<>();
	}

	@EventHandler
	public void onFoodLevelChange(FoodLevelChangeEvent event) {
		if (godModePlayers.contains(event.getEntity().getName())) {
			event.setCancelled(true);
		}
	}

	@EventHandler
	public void onDmgEvent(EntityDamageEvent e) {
		if (godModePlayers.contains(e.getEntity().getName())) {
			e.setCancelled(true);
		}
	}

	public ArrayList<String> getGodModePlayers() {
		return godModePlayers;
	}

}
