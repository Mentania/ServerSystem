package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class CommandFile {

	public static void loadCmdFile() {

		File file = new File("plugins//ServerSystem//Commands.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.options().header("Änderungen in dieser Config haben keinen Einfluss auf das Plugin!");
		config.addDefault("Links.Ts:", "/ts");
		config.addDefault("Links.Web:", "/web");
		config.addDefault("Links.Discord:", "/discord");
		config.addDefault("Links.Forum:", "/forum");
		config.addDefault("Links.Shop:", "/shop");
		config.addDefault("Links.YT:", "/yt");
		config.addDefault("Links.Twitter:", "/twitter");
		config.addDefault("Links.Insta:", "/insta");
		config.addDefault("Links.Fb:", "/fb");
		config.addDefault("Links.Vote", "/vote");
		config.addDefault("Gamemode.GM0", "/gm0");
		config.addDefault("Gamemode.GM1", "/gm1");
		config.addDefault("Gamemode.GM2", "/gm2");
		config.addDefault("Gamemode.GM3", "/gm3");
		config.addDefault("Gamemode.GM4", "/gm4");
		config.addDefault("Gamemode.GM5", "/gm5");
		config.addDefault("Gamemode.GM0Other", "/gm0 <Spieler>");
		config.addDefault("Gamemode.GM1Other", "/gm1 <Spieler>");
		config.addDefault("Gamemode.GM2Other", "/gm2 <Spieler>");
		config.addDefault("Gamemode.GM3Other", "/gm3 <Spieler>");
		config.addDefault("Inv.EnderChest", "/ec");
		config.addDefault("Inv.EnderChestOther", "/ec <Spieler>");
		config.addDefault("Inv.Invsee", "/invsee <Spieler>");
		config.addDefault("Inv.Clear", "/clear");
		config.addDefault("Inv.ClearOther", "/clear <Spieler>");
		config.addDefault("Chat.Clear", "/cc");
		config.addDefault("Chat.Block", "/cblock");
		config.addDefault("Chat.Support", "/support");
		config.addDefault("Chat.Blacklist.add", "/blacklist add <wort>");
		config.addDefault("Chat.Blacklist.remove", "/blacklist remove <wort>");
		config.addDefault("Tp.Tphere", "/tphere <Spieler>");
		config.addDefault("Tp.Tpa", "/tpa <Spieler>");
		config.addDefault("Tp.Tp", "/tp <Spieler>");
		config.addDefault("Home.SetHome", "/sethome <Home Name>");
		config.addDefault("Home.Home", "/home <Home Name>");
		config.addDefault("Home.DelHome", "/delhome <Home Name>");
		config.addDefault("Warp.SetWarp", "/setwarp <Warp Name>");
		config.addDefault("Warp.Warp", "/warp <Warp Name>");
		config.addDefault("Warp.DelWarp", "/delwarp <Warp Name>");
		config.addDefault("Spawn.Setspawn", "/setspawn");
		config.addDefault("Spawn.Spawn", "/spawn");
		config.addDefault("Time.Day", "/day");
		config.addDefault("Time.Night", "/night");
		config.addDefault("Time.Sun", "/sun");
		config.addDefault("Time.Rain", "/rain");
		config.addDefault("Report.Report", "/report");
		config.addDefault("Report.Accept", "/spec <spieler>");
		config.addDefault("Report.Finish", "/finish");
		config.addDefault("Vanish.Vanish", "/v");
		config.addDefault("Vanish.VanishOther", "/vanish <Spieler>");
		config.addDefault("Map.Save", "/save");
		config.addDefault("Map.Load", "/load");
		config.addDefault("Heal.Heal", "/heal");
		config.addDefault("Heal.HealOther", "/heal <Spieler>");
		config.addDefault("Flüstern.Msg", "/msg <Spieler>");
		config.addDefault("Flüstern.Antworten", "/r");
		config.addDefault("Flüstern.Stumm", "/msgtoggle");
		config.addDefault("PlayerTime.Player", "/ontime");
		config.addDefault("PlayerTime.Other", "/ontime <Spieler>");
		config.addDefault("Clan.Clan", "/clan");
		config.addDefault("Clan.Message", "/cm");
		config.addDefault("MobileWerkbank", "/craft");
		config.addDefault("Bewerbung", "/bewerbung");
		config.addDefault("Kill", "/kill <Spieler>");
		config.addDefault("Sign", "/sign <Item in der Hand>");
		config.addDefault("Partner", "/partner");
		config.addDefault("Info", "/info");
		config.addDefault("Fly", "/fly");
		config.addDefault("Kopf", "/kopf <Spieler>");
		config.addDefault("TäglicheBelohnung", "/belohnung");
		config.addDefault("Broadcast", "/rundruf");
		config.addDefault("Holo", "/holo <create, remove>");
		config.addDefault("Rename", "/rename");
		config.addDefault("Repair", "/repair");
		config.addDefault("Fail", "/fail");
		config.addDefault("MobSpawn", "/spawnmob");
		config.addDefault("Case.Villager", "/case");
		config.addDefault("Case.Create", "/create");
		config.addDefault("Case.Chest", "/chest");
		config.addDefault("Eco.Eco", "/eco");
		config.addDefault("Eco.Pay", "/pay <Spieler> <Betrag>");
		config.addDefault("Eco.Set", "/set <Spieler> <Betrag>");
		config.addDefault("Eco.PayAll", "/payall <Betrag>");
		config.addDefault("Premium", "/premium <Spieler>");
	
		config.options().copyDefaults(true);
		try {
			config.save(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
