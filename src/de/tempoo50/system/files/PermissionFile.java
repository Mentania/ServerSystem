package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class PermissionFile {

	public static void loadPermission() {

		File file = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.addDefault("Blocker.1", "blocker.1");// fertig
		config.addDefault("Blocker.2", "blocker.2");// fertig
		config.addDefault("Blocker.3", "blocker.3");// fertig
		config.addDefault("Blocker.4", "blocker.4");// fertig
		config.addDefault("Blocker.5", "blocker.5");// fertig
		config.addDefault("Blocker.6", "blocker.6");// fertig
		config.addDefault("Blocker.7", "blocker.7");// fertig
		config.addDefault("Blocker.8", "blocker.8");// fertig
		config.addDefault("Blocker.9", "blocker.9");// fertig
		config.addDefault("Blocker.10", "blocker.10");// fertig
		config.addDefault("Blocker.11", "blocker.11");// fertig
		config.addDefault("Blocker.12", "blocker.12");// fertig
		config.addDefault("Blocker.13", "blocker.13");// fertig
		config.addDefault("Blocker.14", "blocker.14");// fertig
		config.addDefault("Blocker.15", "blocker.15");// fertig
		config.addDefault("Blocker.16", "blocker.16");// fertig
		config.addDefault("Blocker.17", "blocker.17");// fertig
		config.addDefault("Blocker.18", "blocker.18");// fertig
		config.addDefault("Blocker.19", "blocker.19");// fertig
		config.addDefault("Blocker.20", "blocker.20");// fertig
		config.addDefault("Blocker.21", "blocker.21");// fertig
		config.addDefault("Blocker.22", "blocker.22");// fertig
		config.addDefault("Blocker.23", "blocker.23");// fertig
		config.addDefault("Blocker.24", "blocker.24");// fertig
		config.addDefault("Blocker.25", "blocker.25");// fertig
		config.addDefault("Blocker.26", "blocker.26");// fertig
		config.addDefault("Blocker.27", "blocker.27");// fertig
		config.addDefault("Blocker.28", "blocker.28");// fertig
		config.addDefault("Blocker.29", "blocker.29");// fertig
		config.addDefault("Blocker.30", "blocker.30");// fertig
		config.addDefault("Chat.Team1", "tab.admin");// fertig
		config.addDefault("Chat.Team2", "tab.dev");// fertig
		config.addDefault("Chat.Team3", "tab.shulker");// fertig
		config.addDefault("Chat.Team4", "tab.elytren");// fertig
		config.addDefault("Chat.Team5", "tab.mbuilder");// fertig
		config.addDefault("Chat.Team6", "tab.builder");// fertig
		config.addDefault("Chat.Team7", "tab.mod");// fertig
		config.addDefault("Chat.Team8", "tab.sup");// fertig
		config.addDefault("Chat.Team9", "sys.Team9");// fertig
		config.addDefault("Chat.Team10", "sys.Team10");// fertig
		config.addDefault("Chat.Team11", "sys.Team11");// fertig
		config.addDefault("Chat.Player1", "tab.freund");// fertig
		config.addDefault("Chat.Player2", "tab.yt+");// fertig
		config.addDefault("Chat.Player3", "tab.champ");// fertig
		config.addDefault("Chat.Player4", "tab.drache");// fertig
		config.addDefault("Chat.Player5", "tab.titan");// fertig
		config.addDefault("Chat.Player6", "tab.yt");// fertig
		config.addDefault("Chat.Player7", "tab.legende");// fertig
		config.addDefault("Chat.Player8", "tab.ultra");// fertig
		config.addDefault("Chat.Player9", "tab.premium");// fertig
		config.addDefault("Chat.Color", "sys.chat.color");// fertig
		config.addDefault("Chat.Block", "sys.chatblock");// fertig
		config.addDefault("Chat.Clear", "sys.cc");// fertig
		config.addDefault("Info.Info1", "sys.info.1");// fertig
		config.addDefault("Info.Info2", "sys.info.2");// fertig
		config.addDefault("Info.Info3", "sys.info.3");// fertig
		config.addDefault("Info.Info4", "sys.info.4");// fertig
		config.addDefault("Info.Info5", "sys.info.5");// fertig
		config.addDefault("Info.Info6", "sys.info.6");// fertig
		config.addDefault("Info.Info7", "sys.info.7");// fertig
		config.addDefault("Info.Info8", "sys.info.8");// fertig
		config.addDefault("Info.Info9", "sys.info.9");// fertig
		config.addDefault("Links.Ts:", "sys.ts");// fertig
		config.addDefault("Links.Web:", "sys.web");// fertig
		config.addDefault("Links.Discord:", "sys.discord");// fertig
		config.addDefault("Links.Forum:", "sys.forum");// fertig
		config.addDefault("Links.Shop:", "sys.shop");// fertig
		config.addDefault("Links.YT:", "sys.yt");// fertig
		config.addDefault("Links.Twitter:", "sys.twitter");// fertig
		config.addDefault("Links.Insta:", "sys.insta");// fertig
		config.addDefault("Links.Fb:", "sys.fb");// fertig
		config.addDefault("Links.Vote:", "sys.vote");// fertig
		config.addDefault("Links.Tiktok", "sys.tiktok");//fertig
		config.addDefault("Gamemode.GM*", "sys.gm*");// fertig
		config.addDefault("Gamemode.GM0", "sys.gm0");// fertig
		config.addDefault("Gamemode.GM1", "sys.gm1");// fertig
		config.addDefault("Gamemode.GM2", "sys.gm2");// fertig
		config.addDefault("Gamemode.GM3", "sys.gm3");// fertig
		config.addDefault("Gamemode.GM4", "sys.gm4");// fertig
		config.addDefault("Gamemode.GM5", "sys.gm5");// fertig
		config.addDefault("Gamemode.GM.Other0", "sys.gm0.other");// fertig
		config.addDefault("Gamemode.GM.Other1", "sys.gm1.other");// fertig
		config.addDefault("Gamemode.GM.Other2", "sys.gm2.other");// fertig
		config.addDefault("Gamemode.GM.Other3", "sys.gm2.other");// fertig
		config.addDefault("Gamemode.GM.Other4", "sys.gm3.other");// fertig
		config.addDefault("Live.Player1", "sys.live1");// fertig
		config.addDefault("Live.Player2", "sys.live2");// fertig
		config.addDefault("Live.Player3", "sys.live3");// fertig
		config.addDefault("Live.Player4", "sys.live4");// fertig
		config.addDefault("Live.Player5", "sys.live5");// fertig
		config.addDefault("Live.Player6", "sys.live6");// fertig
		config.addDefault("Live.Player7", "sys.live7");// fertig
		config.addDefault("Live.Player8", "sys.live8");// fertig
		config.addDefault("Live.Player9", "sys.live9");// fertig
		config.addDefault("Live.Player10", "sys.live10");// fertig
		config.addDefault("Spawn.SetSpawn", "sys.setspawn");// fertig
		config.addDefault("Spawn.Spawn", "sys.spawn");// fertig
		config.addDefault("Spawn.Inv", "sys.keep");// fertig
		config.addDefault("Spawn.Admin", "sys.gm");// fertig
		config.addDefault("Rezept.Spawner", "sys.spawner");// fertig
		config.addDefault("Rezept.Bedrock", "sys.bedrock");// fertig
		config.addDefault("Rezept.EndPortal", "sys.endportal");// fertig
		config.addDefault("Rezept.Drachenei", "sys.drachenei");// fertig
		config.addDefault("Tp.Tp", "sys.tp");// fertig
		config.addDefault("Tp.Tpa", "sys.tpa");// fertig
		config.addDefault("Tp.Tphere", "sys.tphere");// fertig
		config.addDefault("Enderchest.Player", "sys.ec");// fertig
		config.addDefault("Enderchest.Other", "sys.ec.other");// fertig
		config.addDefault("Kopf.Player", "sys.kopf");// fertig
		config.addDefault("Kopf.Admin", "sys.kopf.admin");// fertig
		config.addDefault("Vanish.Player", "sys.vanish");// fertig
		config.addDefault("Vanish.Other", "sys.vanish.other");// fertig
		config.addDefault("Vanish.See", "sys.see");// fertig
		config.addDefault("Time.Day", "sys.day");// fertig
		config.addDefault("Time.Night", "sys.night");// fertig
		config.addDefault("Time.Sun", "sys.sun");// fertig
		config.addDefault("Time.Rain", "sys.rain");// fertig
		config.addDefault("MapReset.Save", "map.save");// fertig
		config.addDefault("MapReset.Load", "map.load");// fertig
		config.addDefault("Start.Player", "sys.start");// fertig
		config.addDefault("Start.Admin", "sys.start.admin");// fertig
		config.addDefault("Warp.Set", "sys.setwarp");// fertig
		config.addDefault("Warp.Del", "sys.delwarp");// fertig
		config.addDefault("Color.Anvil", "sys.anvilcolor");// fertig
		config.addDefault("Color.Sign", "sys.colorsign");// fertig
		config.addDefault("Clan.Del", "Clan.delete.admin");// fertig
		config.addDefault("Clan.Create", "Clan.create");// fertig
		config.addDefault("Fly", "sys.fly");// fertig
		config.addDefault("Heal", "sys.heal");// fertig
		config.addDefault("Craft", "sys.craft");// fertig
		config.addDefault("Invsee", "sys.invsee");// fertig
		config.addDefault("Partner", "sys.partner");// fertig
		config.addDefault("ClearInventory", "sys.clear");// fertig
		config.addDefault("Kill", "sys.kill");// fertig
		config.addDefault("Sign", "sys.sign");// fertig
		config.addDefault("Give", "sys.give");// fertig
		config.addDefault("PlayerTime.Online", "sys.timeadmin");// fertig
		config.addDefault("PlayerTime.Offline", "sys.timeoffline");//fertig
		config.addDefault("Belohnung", "sys.belohnung");// fertig
		config.addDefault("Support.Chat", "sys.setsupport");// fertig
		config.addDefault("Ip.Player", "sys.seenip");// fertig
		config.addDefault("Broadcast", "sys.rundruf");// fertig
		config.addDefault("Holo.Create", "sys.holo");// fertig
		config.addDefault("Repair", "sys.repair");// fertig
		config.addDefault("Mob", "sys.spawnmob");// fertig
		config.addDefault("Report", "sys.report");// fertig
		config.addDefault("Case", "sys.create");// fertig
		config.addDefault("Chest.user", "sys.chest");// fertig
		config.addDefault("Chest.Admin", "sys.chestadmin");// fertig
		config.addDefault("Eco.Eco", "sys.eco");//fertig
		config.addDefault("Eco.Set", "sys.set");//fertig
		config.addDefault("Eco.PayAll", "sys.payall");//fertig
		config.addDefault("Premium.give", "sys.premium");//fertig
		config.addDefault("Premium.Higher", "sys.has");//fertig
		config.addDefault("Perks.Nachtsicht", "sys.nachtsicht");//fertig
		config.addDefault("Perks.Tod", "sys.tod");//fertig
		config.addDefault("Perks.Fallschaden", "sys.fallschaden");//fertig
		config.addDefault("Perks.XP", "sys.xp");//fertig
		config.addDefault("Perks.Abbau", "sys.abbau");//fertig
		config.addDefault("Perks.Feuer", "sys.feuer");//fertig
		config.addDefault("Perks.Laufen", "sys.laufen");//fertig
		config.addDefault("Perks.ertrinken", "sys.ertrinken");//fertig
		config.addDefault("Perks.Hunger", "sys.hunger");//fertig
		config.addDefault("Perks.Jagt", "sys.jagt");//fertig
		config.addDefault("World.Tp", "sys.world.tp");//fertig
		config.addDefault("World.Create", "sys.world.create");//fertig
		config.addDefault("World.List", "sys.world.list");//fertig
		config.addDefault("World.Info", "sys.world.info");//fertig

		config.options().copyDefaults(true);

		try {
			config.save(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
