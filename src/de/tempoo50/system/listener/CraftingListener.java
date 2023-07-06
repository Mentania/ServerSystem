package de.tempoo50.system.listener;

import java.io.File;

import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

public class CraftingListener implements Listener {

	@EventHandler
	public void onCraft(CraftItemEvent event) {

		File perm = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

		Player player = (Player) event.getWhoClicked();

		if (event.getRecipe().getResult().getType() == Material.SPAWNER) {
			if (!(player.hasPermission((String) per.get("Rezept.Spawner")))) {
				event.setCancelled(true);
			}
		}

		if (event.getRecipe().getResult().getType() == Material.BEDROCK) {
			if (!(player.hasPermission((String) per.get("Rezept.Bedrock")))) {
				event.setCancelled(true);
			}
		}

		if (event.getRecipe().getResult().getType() == Material.END_PORTAL_FRAME) {
			if (!(player.hasPermission((String) per.get("Rezept.EndPortal")))) {
				event.setCancelled(true);
			}
		}

		if (event.getRecipe().getResult().getType() == Material.DRAGON_EGG) {
			if (!(player.hasPermission((String) per.get("Rezept.Drachenei")))) {
				event.setCancelled(true);
			}
		}

	}

}
