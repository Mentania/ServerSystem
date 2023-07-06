package de.tempoo50.system.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import de.tempoo50.system.utils.ClanStats;

public class ClanDeath implements Listener {
	@EventHandler
	public void onPlayerDeaths(PlayerDeathEvent e) {
		Player gestorben = e.getEntity();
		ClanStats.addDeath(gestorben);
		try {
			Player killer = gestorben.getKiller();
			ClanStats.addKill(killer);
		} catch (Exception k) {
		}
	}
}
