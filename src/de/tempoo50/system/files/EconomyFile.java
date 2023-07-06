package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class EconomyFile {
	
	public static void loadFile() {
		
		File eco = new File("plugins//ServerSystem//Eco.yml");
		YamlConfiguration e = YamlConfiguration.loadConfiguration(eco);
		
		e.options().header("Kill.World ist die Welt wo man kein Geld bekommt wenn man Gegner killt");
		e.addDefault("Eco.Single", "MTK-Dollar");
		e.addDefault("Eco.More", "MTK-Dollar");
		e.addDefault("Clan.Create", 10000);
		e.addDefault("Perks.NG.1", 10);
		e.addDefault("Perks.NG.2", 10);
		e.addDefault("Perks.NG.3", 10);
		e.addDefault("Perks.NG.4", 10);
		e.addDefault("Perks.NG.5", 10);
		e.addDefault("Perks.NG.6", 10);
		e.addDefault("Perks.NG.7", 10);
		e.addDefault("Perks.NG.8", 10);
		e.addDefault("Perks.NG.9", 10);
		e.addDefault("Perks.NG.10", 100000);
		e.addDefault("Kill.World", "cb");
		e.addDefault("Kill.Pig", 100); //fertig
		e.addDefault("Kill.Cow", 100); //fertig
		e.addDefault("Kill.Zombie", 100); //fertig
		e.addDefault("Kill.Skelett", 100); //fertig
		e.addDefault("Kill.Creeper", 100); //fertig
		e.addDefault("Kill.Spider", 100); //fertig
		e.addDefault("Kill.Zombievillager", 100); //fertig
		e.addDefault("Kill.Witch", 100); //fertig
		e.addDefault("Kill.Ghast", 100); //fertig
		e.addDefault("Kill.Magmacube", 100); //fertig
		e.addDefault("Kill.Pigmin", 100); //fertig
		e.addDefault("Kill.Enderman", 100); //fertig
		e.addDefault("Kill.Slime", 100); //fertig
		e.addDefault("Kill.Silverfish", 100); //fertig
		e.addDefault("Kill.Cavespider", 100); //fertig
		e.addDefault("Kill.Guardian", 100); //fertig
		e.addDefault("Kill.Elderguardian", 100); //fertig
		e.addDefault("Kill.Husk", 100); //fertig
		e.addDefault("Kill.Stray", 100); //fertig
		e.addDefault("Kill.Vindicator", 100); //fertig
		e.addDefault("Kill.Evoker", 100); //fertig
		e.addDefault("Kill.Vex", 100); //fertig
		e.addDefault("Kill.Lohe", 100); //fertig
		e.addDefault("Kill.Witherskelett", 100); //fertig
		e.addDefault("Kill.Shulker", 100); //fertig
		e.addDefault("Kill.Endermite", 100); //fertig
		e.addDefault("Kill.Wither", 100); //fertig
		e.addDefault("Kill.Enderdragon", 100); //fertig
		e.addDefault("Kill.Sheep", 100); //fertig
		e.addDefault("Kill.Chicken", 100); //fertig
		e.addDefault("Kill.Squid", 100); //fertig
		e.addDefault("Kill.Bat", 100); //fertig
		e.addDefault("Kill.Mushroom", 100); //fertig
		e.addDefault("Kill.Rabbit", 100); //fertig
		e.addDefault("Kill.Icebear", 100); //fertig
		e.addDefault("Kill.Wolf", 100); //fertig
		e.addDefault("Kill.Ozelot", 100); //fertig
		e.addDefault("Kill.Horse", 100); //fertig
		e.addDefault("Kill.Donkey", 100); //fertig
		e.addDefault("Kill.Mule", 100); //fertig
		e.addDefault("Kill.Skeletthorse", 100); //fertig
		e.addDefault("Kill.Lama", 100); //fertig
		e.addDefault("Kill.Parrot", 100); //fertig
		e.addDefault("Kill.Snowgolem", 100); //fertig
		e.addDefault("Kill.Irongolem", 100); //fertig
		e.addDefault("Kill.Villager", 100); //fertig
		e.addDefault("Kill.Giant", 100); //fertig
		e.addDefault("Kill.Zombiehorse", 100); //fertig
		e.addDefault("Kill.Illusioner", 100); //fertig
		e.addDefault("Kill.Player", 100); //fertig
		e.addDefault("Kill.Drowner", 100); //fertig
		e.addDefault("Kill.Phantom", 100); //fertig
		e.addDefault("Kill.Zoglin", 100); //fertig
		e.addDefault("Kill.Hoglin", 100); //fertig
		e.addDefault("Kill.Piglin", 100); //fertig
		e.addDefault("Kill.PiglinBrute", 100); //fertig
		e.addDefault("Kill.Pillager", 100); //fertig
		e.addDefault("Kill.Ravager", 100); //fertig
		e.addDefault("Kill.Turtle", 100); //fertig
		e.addDefault("Kill.Cod", 100); //fertig
		e.addDefault("Kill.Salmon", 100); //fertig
		e.addDefault("Kill.PufferFish", 100); //fertig
		e.addDefault("Kill.TropicalFish", 100); //fertig
		e.addDefault("Kill.Dolphin", 100); //fertig
		e.addDefault("Kill.Panda", 100); //fertig
		e.addDefault("Kill.Fox", 100); //fertig
		e.addDefault("Kill.Bee", 100); //fertig
		e.addDefault("Kill.Axolotl", 100); //fertig
		e.addDefault("Kill.GlowSquid", 100); //fertig
		e.addDefault("Kill.Goat", 100); //fertig
		e.addDefault("Kill.Cat", 100); //fertig
		e.addDefault("Kill.TraderLlame", 100); //fertig
		e.addDefault("Kill.WanderingTrader", 100); //fertig
		
		e.options().copyDefaults(true);
		try {
			e.save(eco);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
