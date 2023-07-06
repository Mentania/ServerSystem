package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class ServerLinksFileGer {

	public static void loadServerLinksGer() {

		File file = new File("plugins//ServerSystem//Language//Ger//ServerLinks.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.options().header("Hier kannst du deine Liks einstellen!");
		config.addDefault("ServerLinks.TS:", "Deine Ts IP");
		config.addDefault("ServerLinks.Web:", "Deine Webseite");
		config.addDefault("ServerLinks.Discord:", "Dein Einladungs Link fÂ§r Discord");
		config.addDefault("ServerLinks.Forum:", "Dein Forum");
		config.addDefault("ServerLinks.Shop:", "Dein Shop");
		config.addDefault("ServerLinks.YT:", "YT Kanäle von deinem Server Server");
		config.addDefault("ServerLinks.Twitter:", "Deine Twitterseite");
		config.addDefault("ServerLinks.Insta:", "Deine Instaseite");
		config.addDefault("ServerLinks.Fb:", "Your Facebooksite");
		config.isString("#");
		config.addDefault("Permission.Ts:", "sys.ts");
		config.addDefault("Permission.Web:", "sys.web");
		config.addDefault("Permission.Discord:", "sys.discord");
		config.addDefault("Permission.Forum:", "sys.forum");
		config.addDefault("Permission.Shop:", "sys.shop");
		config.addDefault("Permission.YT:", "sys.yt");
		config.addDefault("Permission.Twitter:", "sys.twitter");
		config.addDefault("Permission.Insta:", "sys.insta");

		config.options().copyDefaults(true);
		try {
			config.save(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void reloadServerLinksGer() {

		File file = new File("plugins//ServerSystem//ServerLinks.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.get("ServerLinks.TS:");
		config.get("ServerLinks.Web:");
		config.get("ServerLinks.Discord:");
		config.get("ServerLinks.Forum:");
		config.get("ServerLinks.Shop:");
		config.get("ServerLinks.YT:");
		config.get("ServerLinks.Twitter:");
		config.get("ServerLinks.Insta:");
		config.get("Permission.Ts:");
		config.get("Permission.Web:");
		config.get("Permission.Discord:");
		config.get("Permission.Forum:");
		config.get("Permission.Shop:");
		config.get("Permission.YT:");
		config.get("Permission.Twitter:");
		config.get("Permission.Insta:");
	}

}