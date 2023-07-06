package de.tempoo50.system.listener;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class AnvilListener implements Listener {

	File perm = new File("plugins//ServerSystem//Permission.yml");
	YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

	@EventHandler
	public void onAnvil(PrepareAnvilEvent event) {
		HumanEntity player = event.getView().getPlayer();
		if (player.hasPermission((String) per.get("Color.Anvil")))
			if (event.getResult() != null && event.getResult().hasItemMeta()
					&& event.getInventory().getRenameText() != "") {
				ItemStack result = event.getResult();
				ItemMeta resultMeta = result.getItemMeta();
				String nameColored = ChatColor.translateAlternateColorCodes('&', event.getInventory().getRenameText());
				resultMeta.setDisplayName(nameColored);
				result.setItemMeta(resultMeta);
			}

	}

}
