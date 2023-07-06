package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class MessageFile {

	static File file = new File("plugins//ServerSystem//Message.yml");
	static YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
	
	public static void loadMessage() {

		config.addDefault("Prefix", "?8[?bMTKMC?8] ?7");
		config.addDefault("Noperm", "?cDazu hast du keine Rechte!");
		config.addDefault("NoCMD", "?c1 2 3 das war wohl nichts xD");
		config.addDefault("Block", "?cAchte auf deine Wortwahl! Hier spielen auch kleine Kinder");
		config.addDefault("Bewerbung", "?bwww.bewerben.de");
		config.addDefault("Kopf.KopY", "?bDu hast den Kopf erhalten von ?b");
		config.addDefault("Kopf.KopfN1", "?aDu musst noch bis zum ?b");
		config.addDefault("Kopf.KopfN2", " ?awarten!");
		config.addDefault("Sign.Sign", "?aDu hast das Item Erfolgreich signiert!");
		config.addDefault("Sign.UnSign", "?cDu hast die Signierung erfolgreich entfernt");
		config.addDefault("Sign.IsSign", "?cDas Item ist bereits Singniert!");
		config.addDefault("Sign.NoSign", "?aDas Item hat gar keine Signierung!");
		config.addDefault("CC", "?aDer Chat wurde geleert von ?b");
		config.addDefault("Clear.Player", "?aDu hast dein Inventar geleert ?b");
		config.addDefault("Clear.Target", "?cDein Inventar wurde geleert von ?b");
		config.addDefault("Clear.TargetPlayer", "?aDu hast das Inventar von einem Opfer geleert mit dem Namen ?b");
		config.addDefault("Offline", "?cEs wurde kein Spieler gefunden mit dem Namen ?b");
		config.addDefault("GM.GM0.GM0", "?aDu bist nun im ?b?lNullmodus?a!");
		config.addDefault("GM.GM0.GMO0", "?aDu wurdest in den ?b?lNullmodus ?agesetzt!");
		config.addDefault("GM.GM0.GMOO0", " ?aWurde von dir in den ?b?lNullmodus ?agesetzt!");
		config.addDefault("GM.GM1.GM1", "?aDu bist nun in der ?bUnendlichkeit ?agefangen!");
		config.addDefault("GM.GM1.GMO1", "?aDu wurdest in der ?b?lUnendlichkeit ?cgefangen!");
		config.addDefault("GM.GM1.GMOO1", "?aWurde von dir in der ?b?lUnendlichkeit ?agefangen");
		config.addDefault("GM.GM2.GM2", "?aDu bist nun im ?b?lAbenteuermodus");
		config.addDefault("GM.GM2.GMO2", "?aDu wurdest in den ?b?lAbenteuermodus ?agesetzt!");
		config.addDefault("GM.GM2.GMOO2", "?aWurde von dir in den ?b?lAbenteuermodus ?agesetzt!");
		config.addDefault("GM.GM3.GM3", "?aDu bist nun im ?b?lZuschauermodus?a!");
		config.addDefault("GM.GM3.GMO3", "?aDu wurdest in den ?b?lZuschauermodus ?agesetzt!");
		config.addDefault("GM.GM3.GMOO3", "?aWurde von dir in den ?b?lZuschauermodus ?agesetzt!");
		config.addDefault("GM.GM4.Yes", "?aDu bist jetzt im ?b?lGodmodus?a!");
		config.addDefault("GM.GM4.No", "?aDein ?b?lGodmodus ?awurde beendet!");
		config.addDefault("GM.GM5.Yes", "?aDu bist jetzt im ?b?lBaumodus?a!");
		config.addDefault("GM.GM5.No", "?aDein ?b?lBaumodus ?awurde beendet!");
		config.addDefault("Heal.Self", "?aWas f?r ein noob der Heilt sich ja!");
		config.addDefault("Heal.Other", "?aWas f?r ein noob der l?sst sich ja heilen!");
		config.addDefault("Heal.OtherM", " ?aWurde von dir geheilt!");
		config.addDefault("Map.Save", "?aDu hast Folgende Karten gespeichert ?b");
		config.addDefault("Map.Load", "?aDu hast deine gespeicherten Karten geladen! Nutze /mc reload um die Katrten zu aktivieren!");
		config.addDefault("Spawn.SetSpawn", "?aDu hast den SpawnPunkt auf deine Aktuelle Position gesetzt!");
		config.addDefault("Spawn.Spawn", "?aWillkommen am Anfang!");
		config.addDefault("Support.Player", "?aDu hast Hilfe angefordert! Warte einen kurzen Moment!");
		config.addDefault("Support.Help", " ?aben?tigt Hilfe! ?b/support accept ");
		config.addDefault("Support.APlayer", " ?aum ihm zu helfen!");
		config.addDefault("Support.Chat.Player", "?aDu bist nun in einem Chat mit ");
		config.addDefault("Support.Chat.Target", "?cDu hast bereits Hilfe angefordert!");
		config.addDefault("Support.Chat.Already", "?cDu bist bereits mit einem Spieler im Chat!");
		config.addDefault("Support.NO", "?cDer Spieler hat keine Hilfe angefordert!");
		config.addDefault("Support.Close", "?cDu bist nun nicht mehr im Hilfe-Chat!");
		config.addDefault("Support.NoChat", "?cDu bist nicht mit diesem Spieler im Chat!");
		config.addDefault("Support.Deny.Target", "?cDein Antrag auf Hilfe wurde abgelehnt!");
		config.addDefault("Support.Deny.Player", "?aDu hast die Supportanfrage abgelehnt von ?b");
		config.addDefault("Vanish.Self.Yes", "?aJUHU endlich bin ich ein Geist!");
		config.addDefault("Vanish.Self.No", "?aScheiﬂe ich bin wieder lebendig!");
		config.addDefault("Vanish.Other.Yes", " ?aWurde durch dich zu einem Geist!");
		config.addDefault("Vanish.Other.No", " ?aWurde durch dich wieder lebendich!");
		config.addDefault("Kill.Kill", "?aUpps da wollte dich wohl jemand Tot sehen xD!");
		config.addDefault("Kill.Other", "?aIch glaube du hast da jemanden auf dem Gewissen!");
		config.addDefault("Day", " ?aHUHU der neue Tag hier!");
		config.addDefault("Night", " ?aHUHU die Nacht hier!");
		config.addDefault("Fly.Yes", "?aJuhu ich bin Ikarus!");
		config.addDefault("Fly.No", "?aVerdammt ich bin der Sonne zu nahe gekommen!");
		config.addDefault("Home.SetHome.Set", "?aHGW dein Zuhause wurde erfolgreich errichtet!");
		config.addDefault("Home.SetHome.Exist", "?cBist du bl?d Dein Zuhause exestiert bereits!");
		config.addDefault("Home.Home.Home", "?aWillkommen daheim");
		config.addDefault("Home.Home.No", "?cDu hast kein Zuhause");
		config.addDefault("Home.Home.NoExist", "?cDu hast kein Zuhause mit diesem Namen!");
		config.addDefault("Home.DellHome.Dell", "?aOch schade das du dein Zuhause gel?scht hast ;(");
		config.addDefault("Msg.Player.1", "?8[?6Du ?a? ?9");
		config.addDefault("Msg.Player.2", "?8] ?7");
		config.addDefault("Msg.Target.1", "?8[?9");
		config.addDefault("Msg.Target.2", " ?a? ?6Dir?8] ?7");
		config.addDefault("Msg.Self", "?aAlso so langsam wirst du bescheuert da du jetzt schon Selbstgespr?che f?hren m?chtest!");
		config.addDefault("Msg.Toggle.On", "?aDu erh?lst ab jetzt keine msg-Nachrichten mehr bis du wieder ?b/msgtoggle ?aeingibst oder aber den Server verl‰sst!");
		config.addDefault("Msg.Toggle.Off", "?aDu erh?lst jetzt wieder msg nachrichten also beschwere dich nicht!");
		config.addDefault("Msg.No", "?aIch glaube dein Chat Partner m?chte von dir keine Nachrichten mehr erhalten versuch es doch einfach sp‰ter noch mal!");
		config.addDefault("ChatBlock.Yes", "?aDer Chat wurde blockiert von ?b");
		config.addDefault("ChatBlock.NO", " ?aHat den Chat wieder freigegeben!");
		config.addDefault("TP.1", "?aDu wurdest zu ?b");
		config.addDefault("TP.2", " ?ateleportiert");
		config.addDefault("TP.Tpa.P1", "?aDer Spieler ?b");
		config.addDefault("TP.Tpa.P2", " ?ahat dir eine ?bTpa ?agesendet! Benutze ?b/tpaccept ?aum die Anfrage anzunehmen!");
		config.addDefault("TP.Tpa.T1", "?aDer Spieler ?b");
		config.addDefault("TP.Tpa.T2", " ?ahat die Tpa-Anfrage empfangen!");
		config.addDefault("TP.Tpa.Accept", "?aDu wurdest erfolgreich zu Satan teleportiert xD!");
		config.addDefault("TP.Tphere", " ?aHat dich zu sich teleportiert!");
		config.addDefault("Warp.SetWarp.Exist", "?aDen Warppunkt gibt es schon!");
		config.addDefault("Warp.SetWarp.Set", "?aDu hast erfolgreich einen ?bWarp ?agesetzt!");
		config.addDefault("Warp.DelWarp.Exist", "?cDieser Warp existiert nicht!");
		config.addDefault("Warp.DelWarp.Del", "?aDu hast den Warp erfolgreich Entfernt!");
		config.addDefault("Warp.Warp.No", "?cEs existieren noch keine Warps!");
		config.addDefault("Warp.Warp.Exist", "?cDieser Warp existiert nicht!");
		config.addDefault("Warp.Warp.Warp", "?aDu befindest dich nun bei ?b");
		config.addDefault("Sun", "?aHallo ich bin die Sonne und ich vertreibe euch die Sorgen!");
		config.addDefault("Rain", " ?aHier ist wieder euer schlimmster Albtraum");
		config.addDefault("Blacklist.Add", " ?aWurde zur Backlist hinzugef?gt!");
		config.addDefault("Blacklist.Remove.Exist", "?cDieses Wort befindet sich nicht auf der Blacklist!");
		config.addDefault("Blacklist.Remove.Remove", " ?aWurde von der Blackliste entfernt!");
		config.addDefault("Belohnung.True", "?aDu hast deine ?bt?gliche Belohnung ?aerhalten!");
		config.addDefault("Belohnung.False", "?cDu hast deine ?bt?gliche Belohnung ?cschon erhalten!");
		config.addDefault("IP", " ?aSeine IP lautet ?b");
		config.addDefault("Holo.Create", "?aJuhu ich habe ein Holo erstellt!");
		config.addDefault("Holo.Remove.Remove", "?aSchade das du wieder verschwinden musst!");
		config.addDefault("Holo.Remove.Exist", "?aBiste bl?d mich gibs doch garnicht!");
		config.addDefault("Rename.Rename", "?aDu hast mich erfolgreich umbenannt!");
		config.addDefault("Rename.NoItem", "?aDu musst mich schon in der Hand halten!");
		config.addDefault("Repair.No", "?aHaste nicht geh?rt in der Hand halten musst du mich!");
		config.addDefault("Repair.Yes", "?aNa geht doch, du hast mich jetzt endlich repariert!");
		config.addDefault("Fail", "?aJuhu da hat mal wieder jemand was verkackt");
		config.addDefault("Pig", "?aGrunz da ist ein Schwein!");
		config.addDefault("Cow", "?aMuh da ist eine Kuh!");
		config.addDefault("Chicken", "?aGag da ist ein Huhn!");
		config.addDefault("Case", "?aDu hast den ?bCase Villager ?aspawnen lassen!");
		config.addDefault("Create.1", "?aDu hast das ?bCaseOpening 1 ?aerstellt");
		config.addDefault("Create.2", "?aDu hast das ?bCaseOpening 2 ?aerstellt");
		config.addDefault("Create.3", "?aDu hast das ?bCaseOpening 3 ?aerstellt");
		config.addDefault("Start", "?cDu hast dein StarterKit schon erhalten!");
		config.addDefault("Chest.Get", "?aDu hast eine Free Chest erhalten!");
		config.addDefault("Chest.No1", "?cDu musst noch bis ?b");
		config.addDefault("Chest.No2", " ?cwarten!");
		config.addDefault("Premium.No", "?aDu hast deinen kostenlosen Premium Rang schon vergeben!");
		config.addDefault("Premium.Give", " ?aHat dir gerade Premium f?r 14-Tage geschenkt");
		config.addDefault("Premium.Has.1", "?cDer Spieler ?b");
		config.addDefault("Premium.Has.2", " ?chat schon einen Rang!");
		config.addDefault("Premium.Yes.1", "?aDu hast dem Spieler ?b");
		config.addDefault("Premium.Yes.2", " ?aPremium geschenkt");
		config.addDefault("Economy.Konto.Player", "Du hast keinen Account!");
		config.addDefault("Economy.Konto.Target", " ?chat keinen Account!");
		config.addDefault("Economy.Eco.Player", "?aDein Kontostand betr‰gt ?b");
		config.addDefault("Economy.Eco.Target", " ?aHat einen Kontostand von verdammten ?b");
		config.addDefault("Economy.PayAll.1", " ?ahat einen Geldregen von ?b");
		config.addDefault("Economy.PayAll.2", " ?aausgel?st!");
		config.addDefault("Economy.Pay.Warn.1", "?aDu hast keine ?b");
		config.addDefault("Economy.Pay.Warn.2", " ?aauf deinem Account!");
		config.addDefault("Economy.Pay.Player.1", "?aDu hast ?b");
		config.addDefault("Economy.Pay.Player.2", " ?aeinen Betrag von ?b");
		config.addDefault("Economy.Pay.Player.3", " ?abezahlt!");
		config.addDefault("Economy.Pay.Target.1", " ?ahat dir ?b");
		config.addDefault("Economy.Pay.Target.2", " ?abezahlt!");
		config.addDefault("Economy.Set.Player", " ?aHat jetzt einen Kontostand von ?b");
		config.addDefault("Economy.Set.Target", "?aDu hast jetzt einen Kontostand von ?b");
		config.addDefault("Spamm", "?aH?r auf zu Spammen du kleines St?ck ...!");
		config.addDefault("Caps", "?cBitte benutze weniger Gro?buchstaben!");
		config.addDefault("Mob.Tier", "Das geh?rt bestarft du verlierst f?r das T?ten des armen Tieres ");
		config.addDefault("Mob.Mob", "Da du die Welt von einem Monster befreit hast erh?lst du ");
		config.addDefault("Mob.Boss", "Jetzt wei?t du das dir die Bosse auser Loot nichts bringen f?r die Lehrminute zahlst du ");
		config.addDefault("GM.Wrong", "Du Spinner bist im falschen Gamemode");
		config.addDefault("Mob.Player", "Du hast es geschafft und hast einen Noob gekillt. HGW Du Mongo. DAf?r bekommst du jetzt");
		config.addDefault("World.TP", "Du befindest dich jetzt in der Fantasiewelt Names");
		config.addDefault("World.Create.1", "Deine FantasieWelt wird erstellt habe noch ein bischen Geduld");
		config.addDefault("World.Create.2", "Deine Fantasiewelt wurde erfolgreich erstellt viel Spa? beim schei?e bauen in deiner eigenen Fantasiewelt");
		config.addDefault("World.List", "Du hast zur Zeit Folgende Fantasie Welten");
		config.addDefault("World.Info", "Du befindest dich gerade in der Fantasiewelt");
		config.addDefault("World.Exist", "So eine schei?e aber auch deine fast neue Fantasiewelt gibt es leider schon");
		config.addDefault("World.NOTP", "Tut mir ja leid aber diese Welt gibt es einfach nicht! Streng dein Gehrin weiter an vielleicht findest du ja eine passende Welt f?r dich!");
		
		config.options().copyDefaults(true);
		
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
