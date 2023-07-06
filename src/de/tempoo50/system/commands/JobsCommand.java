package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.tempoo50.system.utils.MessagesUtil;

public class JobsCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			
			Player player = (Player) sender;
			
			if(player.hasPermission("sys.test")) {
				
				OpenInv(player);
				
			}else
				
				player.sendMessage(MessagesUtil.NOPERM);
			
		}
		
		return false;
	}
	
	public static void OpenInv(Player player) {
		
		File job = new File("plugins//ServerSystem//Jobs//User.yml");
		YamlConfiguration jobs = YamlConfiguration.loadConfiguration(job);
		
		Inventory inv = Bukkit.createInventory(null, 9*5, "§aJobs");
		
		//Aktiv
		
		ItemStack arbeit = new ItemStack(Material.GREEN_DYE);
		ItemMeta arbeitmeta = arbeit.getItemMeta();
		arbeitmeta.setDisplayName("Arbeiter");
		arbeit.setItemMeta(arbeitmeta);
		
		//Deaktiv
		
		ItemStack keinearbeit = new ItemStack(Material.RED_DYE);
		ItemMeta keinemeta = keinearbeit.getItemMeta();
		keinemeta.setDisplayName("Kein arbeiter");
		keinearbeit.setItemMeta(keinemeta);
		
		//Holzfäller
		
		ItemStack holz = new ItemStack(Material.GOLDEN_AXE);
		ItemMeta holzmeta = holz.getItemMeta();
		holzmeta.setDisplayName("Holzfäller");
		holz.setItemMeta(holzmeta);
		
		inv.setItem(1, holz);
		
		if(!player.hasPermission("sys.holz")) {
			
			inv.setItem(2, keinearbeit);
			
		}else if((String) jobs.get(player.getName() + ".Holzfäller") == null || ((String) jobs.get(player.getName() + ".Holzfäller")).equalsIgnoreCase("aus")) { 
		
			inv.setItem(2, keinearbeit);
			
		}else if(((String) jobs.get(player.getName() + ".Holzfäller")).equalsIgnoreCase("an")) {
			
			inv.setItem(2, arbeit);
		
		}
		
		//Minenarbeiter
		
		ItemStack mine = new ItemStack(Material.GOLDEN_PICKAXE);
		ItemMeta minemeta = mine.getItemMeta();
		minemeta.setDisplayName("Minenarbeiter");
		mine.setItemMeta(minemeta);
		
		inv.setItem(4, mine);
		
		if(!player.hasPermission("sys.mine")) {
			
			inv.setItem(5, keinearbeit);
			
		}else if((String) jobs.get(player.getName() + ".Minenarbeiter") == null || ((String) jobs.get(player.getName() + ".Minenarbeiter")).equalsIgnoreCase("aus")) {
		
			inv.setItem(5, keinearbeit);
			
		}else if(((String) jobs.get(player.getName() + ".Minenarbeiter")).equalsIgnoreCase("an")) {
			
			inv.setItem(6, arbeit);
			
		}
		
		//Bauarbeiter
		
		ItemStack build = new ItemStack(Material.GOLD_BLOCK);
		ItemMeta buildmeta = build.getItemMeta();
		buildmeta.setDisplayName("Bauarbeiter");
		build.setItemMeta(buildmeta);

		inv.setItem(8, build);
		
		if(!player.hasPermission("sys.bau")) {
		
			inv.setItem(9, keinearbeit);
			
		}else if((String) jobs.get(player.getName() + ".Bauarbeiter") == null || ((String) jobs.get(player.getName() + ".Bauarbeiter")).equalsIgnoreCase("aus")) {
			
			inv.setItem(9, keinearbeit);
			
		}else if(((String) jobs.get(player.getName() + ".Bauarbeiter")).equalsIgnoreCase("an")) {
			
			inv.setItem(9, arbeit);
			
		}
		
		player.openInventory(inv);
		
	}
	
	public static void closeInv(Player player) {
		
		player.closeInventory();
		
	}

}
