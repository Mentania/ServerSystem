package de.tempoo50.system.listener;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.tempoo50.system.utils.*;

public class ClanJoin implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if (!(ClanPlayer.getClan(p) == null)) {
			Clanfunktionen.msgisonline(p, ClanPlayer.getClan(p));
		}
		List<String> invites = ClanPlayer.getInvites(p);
		if (!invites.isEmpty()) {
			p.sendMessage(ClanUtil.prefix() + " " + ClanUtil.Clanseinladen());
			for (String clan : invites) {
				p.sendMessage("§e-§c§l " + clan);
			}
		}
	}
}
