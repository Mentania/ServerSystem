package de.tempoo50.system.commands;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.tempoo50.system.main.ServerSystem;

public class PerksCommand implements CommandExecutor {

	private ServerSystem plugin = ServerSystem.getPlugin();

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			
			Player player = (Player) sender;
			
			OpenInv(player);

		}
		
		return false;
	}
	
	public static void OpenInv(Player player) {

		File file = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		File eco = new File("plugins//ServerSystem//Eco.yml");
		YamlConfiguration e = YamlConfiguration.loadConfiguration(eco);
		
		File perks = new File("plugins//ServerSystem//Perks//User.yml");
		YamlConfiguration p = YamlConfiguration.loadConfiguration(perks);
		
		Inventory inv = Bukkit.createInventory(null, 9*5, "§aPerks");
		
		//Nicht gekauft
		
		Integer i1 = (Integer) e.get("Perks.NG.1");
		String s1 = Integer.toString(i1);
		
		Integer i2 = (Integer) e.get("Perks.NG.2");
		String s2 = Integer.toString(i2);
		
		Integer i3 = (Integer) e.get("Perks.NG.3");
		String s3 = Integer.toString(i3);
		
		Integer i4 = (Integer) e.get("Perks.NG.4");
		String s4 = Integer.toString(i4);
		
		Integer i5 = (Integer) e.get("Perks.NG.5");
		String s5 = Integer.toString(i5);
		
		Integer i6 = (Integer) e.get("Perks.NG.6");
		String s6 = Integer.toString(i6);
		
		Integer i7 = (Integer) e.get("Perks.NG.7");
		String s7 = Integer.toString(i7);
		
		Integer i8 = (Integer) e.get("Perks.NG.8");
		String s8 = Integer.toString(i8);
		
		Integer i9 = (Integer) e.get("Perks.NG.9");
		String s9 = Integer.toString(i9);
		
		Integer i10 = (Integer) e.get("Perks.NG.10");
		String s10 = Integer.toString(i10);
		
		ItemStack NG1 = new ItemStack(Material.BARRIER);
		ItemMeta NGM1 = NG1.getItemMeta();
		NGM1.setDisplayName("§cNicht gekauft");
		ArrayList<String> Lore1 = new ArrayList<>();
		Lore1.add("§aDas Perk Kostet:");
		Lore1.add(s1);
		NGM1.setLore(Lore1);
		NG1.setItemMeta(NGM1);

		ItemStack NG2 = new ItemStack(Material.BARRIER);
		ItemMeta NGM2 = NG2.getItemMeta();
		NGM2.setDisplayName("§cNicht gekauft");
		ArrayList<String> Lore2 = new ArrayList<>();
		Lore2.add("§aDas Perk Kostet:");
		Lore2.add(s2);
		NGM2.setLore(Lore2);
		NG2.setItemMeta(NGM2);

		ItemStack NG3 = new ItemStack(Material.BARRIER);
		ItemMeta NGM3 = NG3.getItemMeta();
		NGM3.setDisplayName("§cNicht gekauft");
		ArrayList<String> Lore3 = new ArrayList<>();
		Lore3.add("§aDas Perk Kostet:");
		Lore3.add(s3);
		NGM3.setLore(Lore3);
		NG3.setItemMeta(NGM3);

		ItemStack NG4 = new ItemStack(Material.BARRIER);
		ItemMeta NGM4 = NG4.getItemMeta();
		NGM4.setDisplayName("§cNicht gekauft");
		ArrayList<String> Lore4 = new ArrayList<>();
		Lore4.add("§aDas Perk Kostet:");
		Lore4.add(s4);
		NGM4.setLore(Lore4);
		NG4.setItemMeta(NGM4);

		ItemStack NG5 = new ItemStack(Material.BARRIER);
		ItemMeta NGM5 = NG5.getItemMeta();
		NGM5.setDisplayName("§cNicht gekauft");
		ArrayList<String> Lore5 = new ArrayList<>();
		Lore5.add("§aDas Perk Kostet:");
		Lore5.add(s5);
		NGM5.setLore(Lore5);
		NG5.setItemMeta(NGM5);

		ItemStack NG6 = new ItemStack(Material.BARRIER);
		ItemMeta NGM6 = NG6.getItemMeta();
		NGM6.setDisplayName("§cNicht gekauft");
		ArrayList<String> Lore6 = new ArrayList<>();
		Lore6.add("§aDas Perk Kostet:");
		Lore6.add(s6);
		NGM6.setLore(Lore6);
		NG6.setItemMeta(NGM6);

		ItemStack NG7 = new ItemStack(Material.BARRIER);
		ItemMeta NGM7 = NG7.getItemMeta();
		NGM7.setDisplayName("§cNicht gekauft");
		ArrayList<String> Lore7 = new ArrayList<>();
		Lore7.add("§aDas Perk Kostet:");
		Lore7.add(s7);
		NGM7.setLore(Lore7);
		NG7.setItemMeta(NGM7);

		ItemStack NG8 = new ItemStack(Material.BARRIER);
		ItemMeta NGM8 = NG8.getItemMeta();
		NGM8.setDisplayName("§cNicht gekauft");
		ArrayList<String> Lore8 = new ArrayList<>();
		Lore8.add("§aDas Perk Kostet:");
		Lore8.add(s8);
		NGM8.setLore(Lore8);
		NG8.setItemMeta(NGM8);

		ItemStack NG9 = new ItemStack(Material.BARRIER);
		ItemMeta NGM9 = NG9.getItemMeta();
		NGM9.setDisplayName("§cNicht gekauft");
		ArrayList<String> Lore9 = new ArrayList<>();
		Lore9.add("§aDas Perk Kostet:");
		Lore9.add(s9);
		NGM9.setLore(Lore9);
		NG9.setItemMeta(NGM9);
		
		ItemStack NG10 = new ItemStack(Material.BARRIER);
		ItemMeta NGM10 = NG10.getItemMeta();
		NGM10.setDisplayName("§cNicht gekauft");
		ArrayList<String> Lore10 = new ArrayList<>();
		Lore10.add("§aDas Perk Kostet:");
		Lore10.add(s10);
		NG10.setItemMeta(NGM10);
		
		//Aktiviert
		
		@SuppressWarnings("deprecation")
		ItemStack Aktiv = new ItemStack(Material.GREEN_DYE);
		ItemMeta AktivM = Aktiv.getItemMeta();
		AktivM.setDisplayName("§aAktiv");
		Aktiv.setItemMeta(AktivM);
		
		//Deaktiviert
		
		ItemStack Deaktiv = new ItemStack(Material.RED_DYE);
		ItemMeta DeaktivM = Deaktiv.getItemMeta();
		DeaktivM.setDisplayName("§cDeaktiviert");
		Deaktiv.setItemMeta(DeaktivM);
		
		//Perks
		
		//Kein Fallschaden
		
		ItemStack fall = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta metafall = fall.getItemMeta();
		metafall.setDisplayName("§aKein Fallschaden");
		metafall.addEnchant(Enchantment.PROTECTION_FALL, 2, true);
		fall.setItemMeta(metafall);
		
		inv.setItem(1, fall);
		
		if(!player.hasPermission((String) config.get("Perks.Fallschaden"))) {
			
			inv.setItem(2, NG1);
			
		}else if((String) p.get(player.getName() + ".Fallschaden") == null || ((String) p.get(player.getName() + ".Fallschaden")).equalsIgnoreCase("aus")) {
			
			inv.setItem(2, Deaktiv);
			
		}else if(((String) p.get(player.getName() + ".Fallschaden")).equalsIgnoreCase("an")) {
		
			inv.setItem(2, Aktiv);
		
		}
		
		//Nachtsicht
		
		ItemStack sicht = new ItemStack(Material.POTION);
		ItemMeta sichtmeta = sicht.getItemMeta();
		sichtmeta.setDisplayName("§eNachtsicht");
		sicht.setItemMeta(sichtmeta);
		
		inv.setItem(10, sicht);
		
		if(!player.hasPermission((String) config.get("Perks.Nachtsicht"))) {
			
			inv.setItem(11, NG2);
			
		}else if((String) p.get(player.getName() + ".Nachtsicht") == null || ((String) p.get(player.getName() + ".Nachtsicht")).equalsIgnoreCase("aus")) {
			
			inv.setItem(11, Deaktiv);
			
		}else if(((String) p.get(player.getName() + ".Nachtsicht")).equalsIgnoreCase("an")) {
			
			inv.setItem(11, Aktiv);
			
		}
		
		//Doppel XP
		
		ItemStack exp = new ItemStack(Material.EXPERIENCE_BOTTLE);
		ItemMeta expmeta = exp.getItemMeta();
		expmeta.setDisplayName("§5Doppelte XP");
		exp.setItemMeta(expmeta);
		
		inv.setItem(19, exp);
		
		if(!player.hasPermission((String) config.get("Perks.XP"))) {
			
			inv.setItem(20, NG3);
			
		}else if((String) p.get(player.getName() + ".DoppelteXP") == null || ((String) p.get(player.getName() + ".DoppelteXP")).equalsIgnoreCase("aus")) {
			
			inv.setItem(20, Deaktiv);
			
		}else if(((String) p.get(player.getName() + ".DoppelteXP")).equalsIgnoreCase("an")) {
			
			inv.setItem(20, Aktiv);
			
		}
		
		//Schnelles abbauen
		
		ItemStack abbau = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta abbaumeta = abbau.getItemMeta();
		abbaumeta.setDisplayName("§cSchnelles abbauen");
		abbaumeta.addEnchant(Enchantment.DIG_SPEED, 2, true);
		abbau.setItemMeta(abbaumeta);
		
		inv.setItem(28, abbau);
		
		if(!player.hasPermission((String) config.get("Perks.Abbau"))) {
			
			inv.setItem(29, NG4);
			
		}else if((String) p.get(player.getName() + ".SchnellesAbbauen") == null || ((String) p.get(player.getName() + ".SchnellesAbbauen")).equalsIgnoreCase("aus")) {
			
			inv.setItem(29, Deaktiv);
			
		}else if(((String) p.get(player.getName() + ".SchnellesAbbauen")).equalsIgnoreCase("an")) {
			
			inv.setItem(29, Aktiv);
			
		}
		
		//Kein Feuerschaden
		
		ItemStack keinfeuer = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta feuermeta = keinfeuer.getItemMeta();
		feuermeta.setDisplayName("§3Kein Feuerschaden");
		feuermeta.addEnchant(Enchantment.PROTECTION_FIRE, 2, true);
		keinfeuer.setItemMeta(feuermeta);
		
		inv.setItem(37, keinfeuer);
		
		if(!player.hasPermission((String) config.get("Perks.Feuer"))) {
			
			inv.setItem(38, NG5);
			
		}else if((String) p.get(player.getName() + ".Feuerschaden") == null || ((String) p.get(player.getName() + ".Feuerschaden")).equalsIgnoreCase("aus")) {
			
			inv.setItem(38, Deaktiv);
			
		}else if(((String) p.get(player.getName() + ".Feuerschaden")).equalsIgnoreCase("an")) {
			
			inv.setItem(38, Aktiv);
			
		}
		
		//Schneller laufen
		
		ItemStack laufen = new ItemStack(Material.IRON_BOOTS);
		ItemMeta laufenmeta = laufen.getItemMeta();
		laufenmeta.setDisplayName("§7Schneller laufen");
		laufen.setItemMeta(laufenmeta);
		
		inv.setItem(7, laufen);
		
		if(!player.hasPermission((String) config.get("Perks.Laufen"))) {
			
			inv.setItem(6, NG6);
			
		}else if((String) p.get(player.getName() + ".Schnellerlaufen") == null || ((String) p.get(player.getName() + ".Schnellerlaufen")).equalsIgnoreCase("aus")) {
			
			inv.setItem(6, Deaktiv);
			
		}else if(((String) p.get(player.getName() + ".Schnellerlaufen")).equalsIgnoreCase("an")) {
			
			inv.setItem(6, Aktiv);
			
		}
		
		//Kein ertrinken
		
		ItemStack ertrinken = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta ertrinkenmeta = ertrinken.getItemMeta();
		ertrinkenmeta.setDisplayName("§cKein ertrinken");
		ertrinkenmeta.addEnchant(Enchantment.WATER_WORKER, 2, true);
		ertrinken.setItemMeta(ertrinkenmeta);
		
		inv.setItem(16, ertrinken);
	
		if(!player.hasPermission((String) config.get("Perks.ertrinken"))) {
			
			inv.setItem(15, NG7);
			
		}else if((String) p.get(player.getName() + ".ertrinken") == null || ((String) p.get(player.getName() + ".ertrinken")).equalsIgnoreCase("aus")) {
			
			inv.setItem(15, Deaktiv);
			
		}else if(((String) p.get(player.getName() + ".ertrinken")).equalsIgnoreCase("an")) {
			
			inv.setItem(15, Aktiv);
			
		}
		
		//Xp nach Todbehalten
		
		ItemStack tod = new ItemStack(Material.GLASS_BOTTLE);
		ItemMeta todmeta = tod.getItemMeta();
		todmeta.setDisplayName("§bXp nach Tod behalten");
		tod.setItemMeta(todmeta);
		
		inv.setItem(25, tod);
		
		if(!player.hasPermission((String) config.get("Perks.Tod"))) {
			
			inv.setItem(24, NG8);
			
		}else if((String) p.get(player.getName() + ".Tod") == null || ((String) p.get(player.getName() + ".Tod")).equalsIgnoreCase("aus")) {
			
			inv.setItem(24, Deaktiv);
			
		}else if(((String) p.get(player.getName() + ".Tod")).equalsIgnoreCase("an")) {
			
			inv.setItem(24, Aktiv);
			
		}
		
		//Kein Hunger
		
		ItemStack hunger = new ItemStack(Material.COOKED_BEEF);
		ItemMeta hungermeta = hunger.getItemMeta();
		hungermeta.setDisplayName("§eKein Hunger");
		hunger.setItemMeta(hungermeta);
		
		inv.setItem(34, hunger);
		
		if(!player.hasPermission((String) config.get("Perks.Hunger"))) {
			
			inv.setItem(33, NG9);
			
		}else if((String) p.get(player.getName() + ".Hunger") == null || ((String) p.get(player.getName() + ".Hunger")).equalsIgnoreCase("aus")) {
			
			inv.setItem(33, Deaktiv);
			
		}else if(((String) p.get(player.getName() + ".Hunger")).equalsIgnoreCase("an")) {
			
			inv.setItem(33, Aktiv);
			
		}
		
		//Jagt Lizenz
		
		ItemStack jagt = new ItemStack(Material.COOKED_CHICKEN);
		ItemMeta jagtmeta = jagt.getItemMeta();
		jagtmeta.setDisplayName("§aJagt Lizenz");
		jagt.setItemMeta(jagtmeta);
		
		inv.setItem(43, jagt);
		
		if(!player.hasPermission((String) config.get("Perks.Jagt"))) {
			
			inv.setItem(42, NG10);
			
		}else if((String) p.get(player.getName() + ".Jagt") == null || ((String) p.get(player.getName() + ".Jagt")).equalsIgnoreCase("aus")) {
			
			inv.setItem(42, Deaktiv);
			
		}else if(((String) p.get(player.getName() + ".Jagt")).equalsIgnoreCase("an")) {
			
			inv.setItem(42, Aktiv);
			
		}
		
		player.openInventory(inv);
		
	}
	
	public static void closeInv(Player player) {
		
		player.closeInventory();
		
	}

}
