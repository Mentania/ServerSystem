package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class ServerLinksFile {

	public static void loadServerLinks() {

		File file = new File("plugins//ServerSystem//ServerLinks.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.options().header("Here you can set the server links");
		config.addDefault("ServerLinks.TS:", "Your Ts Ip");
		config.addDefault("ServerLinks.Web:", "Your Website");
		config.addDefault("ServerLinks.Discord:", "Your Invite Link for Discord");
		config.addDefault("ServerLinks.Forum:", "Your Forum");
		config.addDefault("ServerLinks.Shop:", "Your Shop");
		config.addDefault("ServerLinks.YT:", "YT Channel on your Server");
		config.addDefault("ServerLinks.Twitter:", "Your Twittersite");
		config.addDefault("ServerLinks.Insta:", "Your Instasite");
		config.addDefault("ServerLinks.Fb:", "Your Facebooksite");
		config.addDefault("ServerLinks.Vote:", "Your Votingsite");
		config.addDefault("ServerLinks.Tiktok", "Your TikTok Channel");
		config.isString("#");

		config.options().copyDefaults(true);
		try {
			config.save(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void reloadServerLinks() {

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
