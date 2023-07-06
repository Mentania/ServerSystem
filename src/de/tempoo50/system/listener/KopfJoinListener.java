package de.tempoo50.system.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.data.Data;
import de.tempoo50.system.data.FileManager;
import de.tempoo50.system.mysql.SQLManagerKopf;

public class KopfJoinListener implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		if (Data.useMySQL) {
			String uuid = e.getPlayer().getUniqueId().toString();
			if (SQLManagerKopf.inKopf(uuid)) {
				ServerSystem.players.put(e.getPlayer(), SQLManagerKopf.getData(uuid));
			} else {
				SQLManagerKopf.addToKopf(uuid, 0);
				ServerSystem.players.put(e.getPlayer(), SQLManagerKopf.getData(uuid));
				ServerSystem.log("§6" + e.getPlayer().getName() + " §awurde zur Datenbank hinzugefügt!");
			}
		} else {
			if (!FileManager.getFile().valueExist("Users." + e.getPlayer().getUniqueId().toString() + ".Time")) {
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
		FileManager.relaodFile();
		FileManager.getFile().setValue("Users." + p.getUniqueId().toString() + ".Time", 0);
		FileManager.getFile().save();
		ServerSystem.log("§6" + p.getName() + " §awurde zur Config hinzugefügt!");
	}

}