package de.tempoo50.system.utils;

import java.util.List;

import org.bukkit.OfflinePlayer;

import de.tempoo50.system.files.Clandata;

public class Invitemet {
	public static boolean PlayerJoin(OfflinePlayer p, String clan) {
		List<String> invites = ClanPlayer.getInvites(p);
		if (invites.contains(clan)) {
			int players = ClanManager.getAdmins(clan).size() + ClanManager.getMember(clan).size();
			if (players < ClanUtil.maxperclan()) {
				if (!(Clandata.Clan.getString("Clan." + clan) == null)) {
					ClanPlayer.setClan(p, clan);
					ClanPlayer.removeInvite(p, clan);
					Clanfunktionen.Playergejoint(p, clan);
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static void PlayerDeny(OfflinePlayer p, String clan) {
		List<String> invites = ClanPlayer.getInvites(p);
		if (invites.contains(clan)) {
			ClanPlayer.removeInvite(p, clan);
			Clanfunktionen.Einladungabgelehnt(p, clan);
		}
	}
}
