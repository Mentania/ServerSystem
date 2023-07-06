package de.tempoo50.system.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import de.tempoo50.system.data.DataKit;
import de.tempoo50.system.data.FileManagaerKit;
import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.mysql.SQLManagerKit;

public class KitListener implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		if (DataKit.useMySQL) {
			String uuid = e.getPlayer().getUniqueId().toString();
			if (SQLManagerKit.inKit(uuid)) {
				ServerSystem.kits.put(e.getPlayer(), SQLManagerKit.getData(uuid));
			} else {
				SQLManagerKit.addToKit(uuid, 0);
				ServerSystem.kits.put(e.getPlayer(), SQLManagerKit.getData(uuid));
				ServerSystem.log("§6" + e.getPlayer().getName() + " §awurde zur Datenbank hinzugefügt!");
			}
		} else {
			if (!FileManagaerKit.getFile().valueExist("Users." + e.getPlayer().getUniqueId().toString() + ".Time")) {
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
		FileManagaerKit.relaodFile();
		FileManagaerKit.getFile().setValue("Users." + p.getUniqueId().toString() + ".Time", 0);
		FileManagaerKit.getFile().save();
		ServerSystem.log("§6" + p.getName() + " §awurde zur Config hinzugeü§gt!");
	}

}
