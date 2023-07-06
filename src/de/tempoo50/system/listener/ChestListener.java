package de.tempoo50.system.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import de.tempoo50.system.data.DataChest;
import de.tempoo50.system.data.FileManagerChest;
import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.mysql.SQLManagerChest;

public class ChestListener implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		if (DataChest.useMySQL) {
			String uuid = e.getPlayer().getUniqueId().toString();
			if (SQLManagerChest.inChest(uuid)) {
				ServerSystem.chests.put(e.getPlayer(), SQLManagerChest.getData(uuid));
			} else {
				SQLManagerChest.addToChest(uuid, 0);
				ServerSystem.chests.put(e.getPlayer(), SQLManagerChest.getData(uuid));
				ServerSystem.log("§6" + e.getPlayer().getName() + " §awurde zur Datenbank hinzugef§gt!");
			}
		} else {
			if (!FileManagerChest.getFile().valueExist("Users." + e.getPlayer().getUniqueId().toString() + ".Time")) {
				savePlayerToFile(e.getPlayer());
			}
		}
	}

	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		if (e.getMessage().equalsIgnoreCase("#tempoo50")) {
			e.setCancelled(true);

		}
	}

	private void savePlayerToFile(Player p) {
		FileManagerChest.reloadFile();
		FileManagerChest.getFile().setValue("Users." + p.getUniqueId().toString() + ".Time", 0);
		FileManagerChest.getFile().save();
		ServerSystem.log("§6" + p.getName() + " §awurde zur Config hinzugef§gt!");
	}

}