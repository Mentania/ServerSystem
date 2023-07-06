package de.tempoo50.system.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import de.tempoo50.system.main.ServerSystem;

public class FileManagerPerks {
	
	public static File getConfigFile() {
		
		return new File(ServerSystem.getInctance().getDataFolder(), "Perks//config.yml");
		
	}
	
	public static void setDefault() {
		
		FileConfiguration config = YamlConfiguration.loadConfiguration(getConfigFile());
		config.options().copyDefaults(true);
		config.addDefault("prefix","Perkgeschenk");
		List<String> comandfall = new ArrayList<String>();
		List<String> comandnacht = new ArrayList<String>();
		List<String> commandxp = new ArrayList<String>();
		List<String> commandabbau = new ArrayList<String>();
		List<String> commandfeuer = new ArrayList<String>();
		List<String> commandlaufen = new ArrayList<String>();
		List<String> commandertrinken = new ArrayList<String>();
		List<String> commandtod = new ArrayList<String>();
		List<String> commandhunger = new ArrayList<String>();
		List<String> commandjagt = new ArrayList<String>();
		comandfall.add("lp user target permission set sys.fallschaden");
		comandnacht.add("lp user target permission set sys.nachtsicht");
		commandxp.add("lp user target permission set sys.xp");
		commandabbau.add("lp user target permission set sys.abbau");
		commandfeuer.add("lp user target permission set sys.feuer");
		commandlaufen.add("lp user target permission set sys.laufen");
		commandertrinken.add("lp user target permission set sys.ertrinken");
		commandtod.add("lp user target permission set sys.tod");
		commandhunger.add("lp user target permission set sys.hunger");
		commandjagt.add("lp user target permission set sys.jagt");
		config.addDefault("perkcommandfallschaden", comandfall);
		config.addDefault("perkcommandnachtsicht", comandnacht);
		config.addDefault("perkcommandxp", commandxp);
		config.addDefault("perkcommandabbau", commandabbau);
		config.addDefault("perkcommandfeuer", commandfeuer);
		config.addDefault("perkcommandlaufen", commandlaufen);
		config.addDefault("perkcommandertrinken", commandertrinken);
		config.addDefault("perkcommandtod", commandtod);
		config.addDefault("perkcommandhunger", commandhunger);
		config.addDefault("perkcommandjagt", commandjagt);
		
		config.options().copyDefaults(true);
		
		try {
			config.save(getConfigFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
