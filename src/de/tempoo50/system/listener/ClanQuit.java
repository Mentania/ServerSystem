package de.tempoo50.system.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import de.tempoo50.system.utils.*;

public class ClanQuit implements Listener {
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		if (!(ClanPlayer.getClan(p) == null)) {
			Clanfunktionen.msgisoffline(p, ClanPlayer.getClan(p));
		}
	}
}
