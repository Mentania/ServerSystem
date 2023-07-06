package de.tempoo50.system.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PartnerListener implements Listener {

	@EventHandler
	public void Inventory(InventoryClickEvent event) {
		Player p = (Player) event.getWhoClicked();

		if (event.getView().getTitle().equalsIgnoreCase("§e§lPartnerSystem")) {
			event.setCancelled(true);
			event.getView().close();

		}
	}
}
