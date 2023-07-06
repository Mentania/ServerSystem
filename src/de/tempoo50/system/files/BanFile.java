package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class BanFile {
	
	public static void loadFile() {
		
		File file = new File("plugins//ServerSystem//BannSystem//Messages.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		config.options().header("Hier kannst du die Bannahrichten einstellen");
		config.addDefault("getbans","&aDer Spieler &ePLAYER &ahat &eBANS &abans!");
		config.addDefault("rembans", "&aDu hast den Spieler &ePLAYER &aaus dem Banverlauf gelöscht");
		config.addDefault("kickall", "&a&lAlle Spieler wurden vom Netwek gekickt \n Grund &eGRUND");
		config.addDefault("kicktarget", "&a&lDu wurdest vom Netwerk gekickt \n wegen GRUND");
		config.addDefault("kick", "&aDu hast den Spieler &ePLAYER &afür &eGRUND &agekickt");
		config.addDefault("dontkick", "&aDer Spieler &ePLAYER &awollte dich kicken");
		config.addDefault("unban", "&aDer Spieler PLAYER hat den Spieler UNBAN entbannt");
		config.addDefault("noBan", "&cDer Spieler ist nicht gebannt");
		config.addDefault("nobanPlayer", "&cEs sind zurzeit keine Spieler gebannt");
		config.addDefault("selbstban", "&aDu kannst dich nicht selber bannen!");
		config.addDefault("check.banlist", "&7&m------&r&a&lBanListe&r&7&m------");
		config.addDefault("check.bannedPlayer", "&a&lPLAYER");
		config.addDefault("mute.nomute", "&eDer Spieler ist nicht gemutet");
		config.addDefault("mute.unmute", "&aDer Spieler &ePLAYER &ahat den Spieler &eUNMUTE &aentmutet");
		config.addDefault("use.check", "&cBenutze &b/checkban <list/Spieler>");
		config.addDefault("use.einheit", "&aBenutze &b/einheit");
		config.addDefault("use.tempban", "&cBenutze &b/tempban <Spieler> <Dauer> <Einheiter> <Grund>");
		config.addDefault("use.rembans", "&cBenutze &b/rembans <Spieler> <Zahl>");
		config.addDefault("fehler.tempban.einheit", "&cDiese Einheit exestiert nicht!");
		config.addDefault("fehler.tempban.zahl", "&c<Dauer> muss eine Zahl sein!");
		config.addDefault("mute.1", "&8Du hast den Spieler &ePLAYER &8gemutet");
		config.addDefault("mute.2", "&8Grund: GRUND");
		config.addDefault("mute.3", "&8Bis: DATUM");
		config.addDefault("mute.4", "&8Bis: &6&lPermanent");
		config.addDefault("ban.perma", "&aDu wurdest vom Netzwerk gebannt!\n &a Grund&7: \n \n GRUND \n \n &aVon&7: &e BANNER \n &aAblauf&7: &ePERMANENT \n &aEntbannungsantrag&7: &eDeine.webseite.de");
		config.addDefault("ban.temp", "&aDu wurdest vom Netzwerk gebannt!\n &a Grund&7: \n \n GRUND \n \n &aVon&7: &e BANNER \n &aAblauf&7: &eDATUM &aUhr \n &aEntbannungsantrag&7: &eDeine.webseite.de");
		config.addDefault("ban.1", "&aDu hast den Spieler &ePLAYER &agebannt");
		config.addDefault("ban.2", "&aGrund: &eGRUND");
		config.addDefault("ban.3", "&aBis: &eDATUM");
		config.addDefault("ban.4", "&aFür: &4Permanent");
		
		config.options().copyDefaults(true);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
