package de.tempoo50.system.utils;

import org.bukkit.OfflinePlayer;

import de.tempoo50.system.files.Clandata;

public class ClanStats {

	public static void addKill(OfflinePlayer p) {
		String clan = ClanPlayer.getClan(p);
		try {
			int newkills = Clandata.Clan.getInt("Clan." + clan + ".kills") + 1;
			Clandata.Clan.set("Clan." + clan + ".kills", newkills);
		} catch (Exception k) {
			int newkills = 1;
			Clandata.Clan.set("Clan." + clan + ".kills", newkills);
		}
		Clandata.saveClanFile();
	}

	public static void addDeath(OfflinePlayer p) {
		String clan = ClanPlayer.getClan(p);
		try {
			int newdeaths = Clandata.Clan.getInt("Clan." + clan + ".deaths") + 1;
			Clandata.Clan.set("Clan." + clan + ".deaths", newdeaths);
		} catch (Exception k) {
			int newdeaths = 1;
			Clandata.Clan.set("Clan." + clan + ".kills", newdeaths);
		}
		Clandata.saveClanFile();
	}

	public static int getkills(String clan) {
		try {
			return Clandata.Clan.getInt("Clan." + clan + ".kills");
		} catch (Exception k) {
			return 0;
		}
	}

	public static int getdeaths(String clan) {
		try {
			return Clandata.Clan.getInt("Clan." + clan + ".deaths");
		} catch (Exception k) {
			return 0;
		}
	}
}
