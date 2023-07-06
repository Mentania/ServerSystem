package de.tempoo50.system.listener;

import java.io.File;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InfoListener implements Listener {

	File perm = new File("plugins//ServerSystem//Permission.yml");
	YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

	File file = new File("plugins//ServerSystem//Info.yml");
	YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

	@EventHandler
	public void onInfo(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();

		List<String> info1Command1 = (List<String>) config.getStringList("Lore.Info1.Command1");
		List<String> info1Command2 = (List<String>) config.getStringList("Lore.Info1.Command2");
		List<String> info1Command3 = (List<String>) config.getStringList("Lore.Info1.Command3");
		List<String> info1Command4 = (List<String>) config.getStringList("Lore.Info1.Command4");
		List<String> info1Command5 = (List<String>) config.getStringList("Lore.Info1.Command5");
		List<String> info1Command6 = (List<String>) config.getStringList("Lore.Info1.Command6");
		List<String> info1Command7 = (List<String>) config.getStringList("Lore.Info1.Command7");
		List<String> info1Command8 = (List<String>) config.getStringList("Lore.Info1.Command8");
		List<String> info1Command9 = (List<String>) config.getStringList("Lore.Info1.Command9");
		List<String> info1Command10 = (List<String>) config.getStringList("Lore.Info1.Command10");
		List<String> info1Command11 = (List<String>) config.getStringList("Lore.Info1.Command11");
		List<String> info1Command12 = (List<String>) config.getStringList("Lore.Info1.Command12");
		List<String> info1Command13 = (List<String>) config.getStringList("Lore.Info1.Command13");
		List<String> info1Command14 = (List<String>) config.getStringList("Lore.Info1.Command14");
		List<String> info1Command15 = (List<String>) config.getStringList("Lore.Info1.Command15");
		List<String> info1Command16 = (List<String>) config.getStringList("Lore.Info1.Command16");
		List<String> info1Command17 = (List<String>) config.getStringList("Lore.Info1.Command17");
		List<String> info1Command18 = (List<String>) config.getStringList("Lore.Info1.Command18");

		if (event.getView().getTitle().equalsIgnoreCase("ßeßl‹bersicht")) {
			event.setCancelled(true);

			if (player.hasPermission((String) per.get("Info.Info1"))) {
				if (event.getCurrentItem().getType() == Material.NETHER_STAR) {
					Inventory info1 = player.getPlayer().getServer().createInventory(null, 9 * 6, (String) config.get("DisplayName1"));

					ItemStack Rang1 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1 = Rang1.getItemMeta();
					metaRang1.setDisplayName((String) config.get("DisplayRang1.Command1"));
					metaRang1.setLore(info1Command1);
					Rang1.setItemMeta(metaRang1);

					ItemStack Rang1_1 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_1 = Rang1_1.getItemMeta();
					metaRang1_1.setDisplayName((String) config.get("DisplayRang1.Command2"));
					metaRang1_1.setLore(info1Command2);
					Rang1_1.setItemMeta(metaRang1_1);

					ItemStack Rang1_2 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_2 = Rang1_2.getItemMeta();
					metaRang1_2.setDisplayName((String) config.get("DisplayRang1.Command3"));
					metaRang1_2.setLore(info1Command3);
					Rang1_2.setItemMeta(metaRang1_2);

					ItemStack Rang1_3 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_3 = Rang1_3.getItemMeta();
					metaRang1_3.setDisplayName((String) config.get("DisplayRang1.Command4"));
					metaRang1_3.setLore(info1Command4);
					Rang1_3.setItemMeta(metaRang1_3);

					ItemStack Rang1_4 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_4 = Rang1_4.getItemMeta();
					metaRang1_4.setDisplayName((String) config.get("DisplayRang1.Command5"));
					metaRang1_4.setLore(info1Command5);
					Rang1_4.setItemMeta(metaRang1_4);

					ItemStack Rang1_5 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_5 = Rang1_5.getItemMeta();
					metaRang1_5.setDisplayName((String) config.get("DisplayRang1.Command6"));
					metaRang1_5.setLore(info1Command6);
					Rang1_5.setItemMeta(metaRang1_5);

					ItemStack Rang1_6 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_6 = Rang1_6.getItemMeta();
					metaRang1_6.setDisplayName((String) config.get("DisplayRang1.Command7"));
					metaRang1_6.setLore(info1Command7);
					Rang1_6.setItemMeta(metaRang1_6);

					ItemStack Rang1_7 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_7 = Rang1_7.getItemMeta();
					metaRang1_7.setDisplayName((String) config.get("DisplayRang1.Command8"));
					metaRang1_7.setLore(info1Command8);
					Rang1_7.setItemMeta(metaRang1_7);

					ItemStack Rang1_8 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_8 = Rang1_8.getItemMeta();
					metaRang1_8.setDisplayName((String) config.get("DisplayRang1.Command9"));
					metaRang1_8.setLore(info1Command9);
					Rang1_8.setItemMeta(metaRang1_8);

					ItemStack Rang1_9 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_9 = Rang1_9.getItemMeta();
					metaRang1_9.setDisplayName((String) config.get("DisplayRang1.Command10"));
					metaRang1_9.setLore(info1Command10);
					Rang1_9.setItemMeta(metaRang1_9);

					ItemStack Rang1_10 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_10 = Rang1_10.getItemMeta();
					metaRang1_10.setDisplayName((String) config.get("DisplayRang1.Command11"));
					metaRang1_10.setLore(info1Command11);
					Rang1_10.setItemMeta(metaRang1_10);

					ItemStack Rang1_11 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_11 = Rang1_11.getItemMeta();
					metaRang1_11.setDisplayName((String) config.get("DisplayRang1.Command12"));
					metaRang1_11.setLore(info1Command12);
					Rang1_11.setItemMeta(metaRang1_11);

					ItemStack Rang1_12 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_12 = Rang1_12.getItemMeta();
					metaRang1_12.setDisplayName((String) config.get("DisplayRang1.Command13"));
					metaRang1_12.setLore(info1Command13);
					Rang1_12.setItemMeta(metaRang1_12);

					ItemStack Rang1_13 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_13 = Rang1_13.getItemMeta();
					metaRang1_13.setDisplayName((String) config.get("DisplayRang1.Command14"));
					metaRang1_13.setLore(info1Command14);
					Rang1_13.setItemMeta(metaRang1_13);

					ItemStack Rang1_14 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_14 = Rang1_14.getItemMeta();
					metaRang1_14.setDisplayName((String) config.get("DisplayRang1.Command15"));
					metaRang1_14.setLore(info1Command15);
					Rang1_14.setItemMeta(metaRang1_14);

					ItemStack Rang1_15 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_15 = Rang1_15.getItemMeta();
					metaRang1_15.setDisplayName((String) config.get("DisplayRang1.Command16"));
					metaRang1_15.setLore(info1Command16);
					Rang1_15.setItemMeta(metaRang1_15);

					ItemStack Rang1_16 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_16 = Rang1_16.getItemMeta();
					metaRang1_16.setDisplayName((String) config.get("DisplayRang1.Command17"));
					metaRang1_16.setLore(info1Command17);
					Rang1_16.setItemMeta(metaRang1_16);

					ItemStack Rang1_17 = new ItemStack(Material.NETHER_STAR);
					ItemMeta metaRang1_17 = Rang1_17.getItemMeta();
					metaRang1_17.setDisplayName((String) config.get("DisplayRang1.Command18"));
					metaRang1_17.setLore(info1Command18);
					Rang1_17.setItemMeta(metaRang1_17);

					ItemStack Back = new ItemStack(Material.SKELETON_SKULL);
					ItemMeta metaback = Back.getItemMeta();
					metaback.setDisplayName("Back");
					Back.setItemMeta(metaback);

					info1.setItem(1, Rang1);
					info1.setItem(4, Rang1_1);
					info1.setItem(7, Rang1_2);
					info1.setItem(10, Rang1_3);
					info1.setItem(13, Rang1_4);
					info1.setItem(16, Rang1_5);
					info1.setItem(19, Rang1_6);
					info1.setItem(22, Rang1_7);
					info1.setItem(25, Rang1_8);
					info1.setItem(28, Rang1_9);
					info1.setItem(31, Rang1_10);
					info1.setItem(34, Rang1_11);
					info1.setItem(37, Rang1_12);
					info1.setItem(40, Rang1_13);
					info1.setItem(43, Rang1_14);
					info1.setItem(46, Rang1_15);
					info1.setItem(49, Rang1_16);
					info1.setItem(52, Rang1_17);
					info1.setItem(53, Back);

					player.getPlayer().openInventory(info1);

				}
			}
		}

		if (event.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName1"))) {
			event.setCancelled(true);
			event.getView().close();
		}

	}

	@EventHandler
	public void onInfo2(InventoryClickEvent event1) {
		Player player = (Player) event1.getWhoClicked();

		List<String> info2Command1 = (List<String>) config.getStringList("Lore.Info2.Command1");
		List<String> info2Command2 = (List<String>) config.getStringList("Lore.Info2.Command2");
		List<String> info2Command3 = (List<String>) config.getStringList("Lore.Info2.Command3");
		List<String> info2Command4 = (List<String>) config.getStringList("Lore.Info2.Command4");
		List<String> info2Command5 = (List<String>) config.getStringList("Lore.Info2.Command5");
		List<String> info2Command6 = (List<String>) config.getStringList("Lore.Info2.Command6");
		List<String> info2Command7 = (List<String>) config.getStringList("Lore.Info2.Command7");
		List<String> info2Command8 = (List<String>) config.getStringList("Lore.Info2.Command8");
		List<String> info2Command9 = (List<String>) config.getStringList("Lore.Info2.Command9");
		List<String> info2Command10 = (List<String>) config.getStringList("Lore.Info2.Command10");
		List<String> info2Command11 = (List<String>) config.getStringList("Lore.Info2.Command11");
		List<String> info2Command12 = (List<String>) config.getStringList("Lore.Info2.Command12");
		List<String> info2Command13 = (List<String>) config.getStringList("Lore.Info2.Command13");
		List<String> info2Command14 = (List<String>) config.getStringList("Lore.Info2.Command14");
		List<String> info2Command15 = (List<String>) config.getStringList("Lore.Info2.Command15");
		List<String> info2Command16 = (List<String>) config.getStringList("Lore.Info2.Command16");
		List<String> info2Command17 = (List<String>) config.getStringList("Lore.Info2.Command17");
		List<String> info2Command18 = (List<String>) config.getStringList("Lore.Info2.Command18");

		if (event1.getView().getTitle().equalsIgnoreCase("ßeßl‹bersicht")) {
			event1.setCancelled(true);

			if (player.hasPermission((String) per.get("Info.Info2"))) {
				if (event1.getCurrentItem().getType() == Material.ENDER_CHEST) {
					Inventory info2 = player.getPlayer().getServer().createInventory(null, 9 * 6,
							(String) config.get("DisplayName2"));

					ItemStack Rang2 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2 = Rang2.getItemMeta();
					metaRang2.setDisplayName((String) config.get("DisplayRang2.Command1"));
					metaRang2.setLore(info2Command1);
					Rang2.setItemMeta(metaRang2);

					ItemStack Rang2_1 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_1 = Rang2_1.getItemMeta();
					metaRang2_1.setDisplayName((String) config.get("DisplayRang2.Command2"));
					metaRang2_1.setLore(info2Command2);
					Rang2_1.setItemMeta(metaRang2_1);

					ItemStack Rang2_2 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_2 = Rang2_2.getItemMeta();
					metaRang2_2.setDisplayName((String) config.get("DisplayRang2.Command3"));
					metaRang2_2.setLore(info2Command3);
					Rang2_2.setItemMeta(metaRang2_2);

					ItemStack Rang2_3 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_3 = Rang2_3.getItemMeta();
					metaRang2_3.setDisplayName((String) config.get("DisplayRang2.Command4"));
					metaRang2_3.setLore(info2Command4);
					Rang2_3.setItemMeta(metaRang2_3);

					ItemStack Rang2_4 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_4 = Rang2_4.getItemMeta();
					metaRang2_4.setDisplayName((String) config.get("DisplayRang2.Command5"));
					metaRang2_4.setLore(info2Command5);
					Rang2_4.setItemMeta(metaRang2_4);

					ItemStack Rang2_5 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_5 = Rang2_5.getItemMeta();
					metaRang2_5.setDisplayName((String) config.get("DisplayRang2.Command6"));
					metaRang2_5.setLore(info2Command6);
					Rang2_5.setItemMeta(metaRang2_5);

					ItemStack Rang2_6 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_6 = Rang2_6.getItemMeta();
					metaRang2_6.setDisplayName((String) config.get("DisplayRang2.Command7"));
					metaRang2_6.setLore(info2Command7);
					Rang2_6.setItemMeta(metaRang2_6);

					ItemStack Rang2_7 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_7 = Rang2_7.getItemMeta();
					metaRang2_7.setDisplayName((String) config.get("DisplayRang2.Command8"));
					metaRang2_7.setLore(info2Command8);
					Rang2_7.setItemMeta(metaRang2_7);

					ItemStack Rang2_8 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_8 = Rang2_8.getItemMeta();
					metaRang2_8.setDisplayName((String) config.get("DisplayRang2.Command9"));
					metaRang2_8.setLore(info2Command9);
					Rang2_8.setItemMeta(metaRang2_8);

					ItemStack Rang2_9 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_9 = Rang2_9.getItemMeta();
					metaRang2_9.setDisplayName((String) config.get("DisplayRang2.Command10"));
					metaRang2_9.setLore(info2Command10);
					Rang2_9.setItemMeta(metaRang2_9);

					ItemStack Rang2_10 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_10 = Rang2_10.getItemMeta();
					metaRang2_10.setDisplayName((String) config.get("DisplayRang2.Command11"));
					metaRang2_10.setLore(info2Command11);
					Rang2_10.setItemMeta(metaRang2_10);

					ItemStack Rang2_11 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_11 = Rang2_11.getItemMeta();
					metaRang2_11.setDisplayName((String) config.get("DisplayRang2.Command12"));
					metaRang2_11.setLore(info2Command12);
					Rang2_11.setItemMeta(metaRang2_11);

					ItemStack Rang2_12 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_12 = Rang2_12.getItemMeta();
					metaRang2_12.setDisplayName((String) config.get("DisplayRang2.Command13"));
					metaRang2_12.setLore(info2Command13);
					Rang2_12.setItemMeta(metaRang2_12);

					ItemStack Rang2_13 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_13 = Rang2_13.getItemMeta();
					metaRang2_13.setDisplayName((String) config.get("DisplayRang2.Command14"));
					metaRang2_13.setLore(info2Command14);
					Rang2_13.setItemMeta(metaRang2_13);

					ItemStack Rang2_14 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_14 = Rang2_14.getItemMeta();
					metaRang2_14.setDisplayName((String) config.get("DisplayRang2.Command15"));
					metaRang2_14.setLore(info2Command15);
					Rang2_14.setItemMeta(metaRang2_14);

					ItemStack Rang2_15 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_15 = Rang2_15.getItemMeta();
					metaRang2_15.setDisplayName((String) config.get("DisplayRang2.Command16"));
					metaRang2_15.setLore(info2Command16);
					Rang2_15.setItemMeta(metaRang2_15);

					ItemStack Rang2_16 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_16 = Rang2_16.getItemMeta();
					metaRang2_16.setDisplayName((String) config.get("DisplayRang2.Command17"));
					metaRang2_16.setLore(info2Command17);
					Rang2_16.setItemMeta(metaRang2_16);

					ItemStack Rang2_17 = new ItemStack(Material.ENDER_CHEST);
					ItemMeta metaRang2_17 = Rang2_17.getItemMeta();
					metaRang2_17.setDisplayName((String) config.get("DisplayRang2.Command18"));
					metaRang2_17.setLore(info2Command18);
					Rang2_17.setItemMeta(metaRang2_17);

					ItemStack Back = new ItemStack(Material.SKELETON_SKULL);
					ItemMeta metaback = Back.getItemMeta();
					metaback.setDisplayName("Back");
					Back.setItemMeta(metaback);

					info2.setItem(1, Rang2);
					info2.setItem(4, Rang2_1);
					info2.setItem(7, Rang2_2);
					info2.setItem(10, Rang2_3);
					info2.setItem(13, Rang2_4);
					info2.setItem(16, Rang2_5);
					info2.setItem(19, Rang2_6);
					info2.setItem(22, Rang2_7);
					info2.setItem(25, Rang2_8);
					info2.setItem(28, Rang2_9);
					info2.setItem(31, Rang2_10);
					info2.setItem(34, Rang2_11);
					info2.setItem(37, Rang2_12);
					info2.setItem(40, Rang2_13);
					info2.setItem(43, Rang2_14);
					info2.setItem(46, Rang2_15);
					info2.setItem(49, Rang2_16);
					info2.setItem(52, Rang2_17);
					info2.setItem(53, Back);

					player.getPlayer().openInventory(info2);

				}

			}
		}

		if (event1.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName2"))) {
			event1.setCancelled(true);
			event1.getView().close();
		}

	}

	@EventHandler
	public void onInfo3(InventoryClickEvent event2) {
		Player player = (Player) event2.getWhoClicked();

		List<String> info3Command1 = (List<String>) config.getStringList("Lore.Info3.Command1");
		List<String> info3Command2 = (List<String>) config.getStringList("Lore.Info3.Command2");
		List<String> info3Command3 = (List<String>) config.getStringList("Lore.Info3.Command3");
		List<String> info3Command4 = (List<String>) config.getStringList("Lore.Info3.Command4");
		List<String> info3Command5 = (List<String>) config.getStringList("Lore.Info3.Command5");
		List<String> info3Command6 = (List<String>) config.getStringList("Lore.Info3.Command6");
		List<String> info3Command7 = (List<String>) config.getStringList("Lore.Info3.Command7");
		List<String> info3Command8 = (List<String>) config.getStringList("Lore.Info3.Command8");
		List<String> info3Command9 = (List<String>) config.getStringList("Lore.Info3.Command9");
		List<String> info3Command10 = (List<String>) config.getStringList("Lore.Info3.Command10");
		List<String> info3Command11 = (List<String>) config.getStringList("Lore.Info3.Command11");
		List<String> info3Command12 = (List<String>) config.getStringList("Lore.Info3.Command12");
		List<String> info3Command13 = (List<String>) config.getStringList("Lore.Info3.Command13");
		List<String> info3Command14 = (List<String>) config.getStringList("Lore.Info3.Command14");
		List<String> info3Command15 = (List<String>) config.getStringList("Lore.Info3.Command15");
		List<String> info3Command16 = (List<String>) config.getStringList("Lore.Info3.Command16");
		List<String> info3Command17 = (List<String>) config.getStringList("Lore.Info3.Command17");
		List<String> info3Command18 = (List<String>) config.getStringList("Lore.Info3.Command18");

		if (event2.getView().getTitle().equalsIgnoreCase("ßeßl‹bersicht")) {
			event2.setCancelled(true);

			if (player.hasPermission((String) per.get("Info.Info3"))) {
				if (event2.getCurrentItem().getType() == Material.END_CRYSTAL) {
					Inventory info3 = player.getPlayer().getServer().createInventory(null, 9 * 6,
							(String) config.get("DisplayName3"));

					ItemStack Rang3 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3 = Rang3.getItemMeta();
					metaRang3.setDisplayName((String) config.get("DisplayRang3.Command1"));
					metaRang3.setLore(info3Command1);
					Rang3.setItemMeta(metaRang3);

					ItemStack Rang3_1 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_1 = Rang3_1.getItemMeta();
					metaRang3_1.setDisplayName((String) config.get("DisplayRang3.Command2"));
					metaRang3_1.setLore(info3Command2);
					Rang3_1.setItemMeta(metaRang3_1);

					ItemStack Rang3_2 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_2 = Rang3_2.getItemMeta();
					metaRang3_2.setDisplayName((String) config.get("DisplayRang3.Command3"));
					metaRang3_2.setLore(info3Command3);
					Rang3_2.setItemMeta(metaRang3_2);

					ItemStack Rang3_3 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_3 = Rang3_3.getItemMeta();
					metaRang3_3.setDisplayName((String) config.get("DisplayRang3.Command4"));
					metaRang3_3.setLore(info3Command4);
					Rang3_3.setItemMeta(metaRang3_3);

					ItemStack Rang3_4 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_4 = Rang3_4.getItemMeta();
					metaRang3_4.setDisplayName((String) config.get("DisplayRang3.Command5"));
					metaRang3_4.setLore(info3Command5);
					Rang3_4.setItemMeta(metaRang3_4);

					ItemStack Rang3_5 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_5 = Rang3_5.getItemMeta();
					metaRang3_5.setDisplayName((String) config.get("DisplayRang3.Command6"));
					metaRang3_5.setLore(info3Command6);
					Rang3_5.setItemMeta(metaRang3_5);

					ItemStack Rang3_6 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_6 = Rang3_6.getItemMeta();
					metaRang3_6.setDisplayName((String) config.get("DisplayRang3.Command7"));
					metaRang3_6.setLore(info3Command7);
					Rang3_6.setItemMeta(metaRang3_6);

					ItemStack Rang3_7 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_7 = Rang3_7.getItemMeta();
					metaRang3_7.setDisplayName((String) config.get("DisplayRang3.Command8"));
					metaRang3_7.setLore(info3Command8);
					Rang3_7.setItemMeta(metaRang3_7);

					ItemStack Rang3_8 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_8 = Rang3_8.getItemMeta();
					metaRang3_8.setDisplayName((String) config.get("DisplayRang3.Command9"));
					metaRang3_8.setLore(info3Command9);
					Rang3_8.setItemMeta(metaRang3_8);

					ItemStack Rang3_9 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_9 = Rang3_9.getItemMeta();
					metaRang3_9.setDisplayName((String) config.get("DisplayRang3.Command10"));
					metaRang3_9.setLore(info3Command10);
					Rang3_9.setItemMeta(metaRang3_9);

					ItemStack Rang3_10 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_10 = Rang3_10.getItemMeta();
					metaRang3_10.setDisplayName((String) config.get("DisplayRang3.Command11"));
					metaRang3_10.setLore(info3Command11);
					Rang3_10.setItemMeta(metaRang3_10);

					ItemStack Rang3_11 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_11 = Rang3_11.getItemMeta();
					metaRang3_11.setDisplayName((String) config.get("DisplayRang3.Command12"));
					metaRang3_11.setLore(info3Command12);
					Rang3_11.setItemMeta(metaRang3_11);

					ItemStack Rang3_12 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_12 = Rang3_12.getItemMeta();
					metaRang3_12.setDisplayName((String) config.get("DisplayRang3.Command13"));
					metaRang3_12.setLore(info3Command13);
					Rang3_12.setItemMeta(metaRang3_12);

					ItemStack Rang3_13 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_13 = Rang3_13.getItemMeta();
					metaRang3_13.setDisplayName((String) config.get("DisplayRang3.Command14"));
					metaRang3_13.setLore(info3Command14);
					Rang3_13.setItemMeta(metaRang3_13);

					ItemStack Rang3_14 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_14 = Rang3_14.getItemMeta();
					metaRang3_14.setDisplayName((String) config.get("DisplayRang3.Command15"));
					metaRang3_14.setLore(info3Command15);
					Rang3_14.setItemMeta(metaRang3_14);

					ItemStack Rang3_15 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_15 = Rang3_15.getItemMeta();
					metaRang3_15.setDisplayName((String) config.get("DisplayRang3.Command16"));
					metaRang3_15.setLore(info3Command16);
					Rang3_15.setItemMeta(metaRang3_15);

					ItemStack Rang3_16 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_16 = Rang3_16.getItemMeta();
					metaRang3_16.setDisplayName((String) config.get("DisplayRang3.Command17"));
					metaRang3_16.setLore(info3Command17);
					Rang3_16.setItemMeta(metaRang3_16);

					ItemStack Rang3_17 = new ItemStack(Material.END_CRYSTAL);
					ItemMeta metaRang3_17 = Rang3_17.getItemMeta();
					metaRang3_17.setDisplayName((String) config.get("DisplayRang3.Command18"));
					metaRang3_17.setLore(info3Command18);
					Rang3_17.setItemMeta(metaRang3_17);

					ItemStack Back = new ItemStack(Material.SKELETON_SKULL);
					ItemMeta metaback = Back.getItemMeta();
					metaback.setDisplayName("Back");
					Back.setItemMeta(metaback);

					info3.setItem(1, Rang3);
					info3.setItem(4, Rang3_1);
					info3.setItem(7, Rang3_2);
					info3.setItem(10, Rang3_3);
					info3.setItem(13, Rang3_4);
					info3.setItem(16, Rang3_5);
					info3.setItem(19, Rang3_6);
					info3.setItem(22, Rang3_7);
					info3.setItem(25, Rang3_8);
					info3.setItem(28, Rang3_9);
					info3.setItem(31, Rang3_10);
					info3.setItem(34, Rang3_11);
					info3.setItem(37, Rang3_12);
					info3.setItem(40, Rang3_13);
					info3.setItem(43, Rang3_14);
					info3.setItem(46, Rang3_15);
					info3.setItem(49, Rang3_16);
					info3.setItem(52, Rang3_17);
					info3.setItem(53, Back);

					player.getPlayer().openInventory(info3);

				}

			}
		}

		if (event2.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName3"))) {
			event2.setCancelled(true);
			event2.getView().close();
		}

	}

	@EventHandler
	public void onInfo4(InventoryClickEvent event3) {
		Player player = (Player) event3.getWhoClicked();

		List<String> info4Command1 = (List<String>) config.getStringList("Lore.Info4.Command1");
		List<String> info4Command2 = (List<String>) config.getStringList("Lore.Info4.Command2");
		List<String> info4Command3 = (List<String>) config.getStringList("Lore.Info4.Command3");
		List<String> info4Command4 = (List<String>) config.getStringList("Lore.Info4.Command4");
		List<String> info4Command5 = (List<String>) config.getStringList("Lore.Info4.Command5");
		List<String> info4Command6 = (List<String>) config.getStringList("Lore.Info4.Command6");
		List<String> info4Command7 = (List<String>) config.getStringList("Lore.Info4.Command7");
		List<String> info4Command8 = (List<String>) config.getStringList("Lore.Info4.Command8");
		List<String> info4Command9 = (List<String>) config.getStringList("Lore.Info4.Command9");
		List<String> info4Command10 = (List<String>) config.getStringList("Lore.Info4.Command10");
		List<String> info4Command11 = (List<String>) config.getStringList("Lore.Info4.Command11");
		List<String> info4Command12 = (List<String>) config.getStringList("Lore.Info4.Command12");
		List<String> info4Command13 = (List<String>) config.getStringList("Lore.Info4.Command13");
		List<String> info4Command14 = (List<String>) config.getStringList("Lore.Info4.Command14");
		List<String> info4Command15 = (List<String>) config.getStringList("Lore.Info4.Command15");
		List<String> info4Command16 = (List<String>) config.getStringList("Lore.Info4.Command16");
		List<String> info4Command17 = (List<String>) config.getStringList("Lore.Info4.Command17");
		List<String> info4Command18 = (List<String>) config.getStringList("Lore.Info4.Command18");

		if (event3.getView().getTitle().equalsIgnoreCase("ßeßl‹bersicht")) {
			event3.setCancelled(true);

			if (player.hasPermission((String) per.get("Info.Info4"))) {
				if (event3.getCurrentItem().getType() == Material.DRAGON_EGG) {
					Inventory info4 = player.getPlayer().getServer().createInventory(null, 9 * 6,
							(String) config.get("DisplayName4"));

					ItemStack Rang4 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4 = Rang4.getItemMeta();
					metaRang4.setDisplayName((String) config.get("DisplayRang4.Command1"));
					metaRang4.setLore(info4Command1);
					Rang4.setItemMeta(metaRang4);

					ItemStack Rang4_1 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_1 = Rang4_1.getItemMeta();
					metaRang4_1.setDisplayName((String) config.get("DisplayRang4.Command2"));
					metaRang4_1.setLore(info4Command2);
					Rang4_1.setItemMeta(metaRang4_1);

					ItemStack Rang4_2 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_2 = Rang4_2.getItemMeta();
					metaRang4_2.setDisplayName((String) config.get("DisplayRang4.Command3"));
					metaRang4_2.setLore(info4Command3);
					Rang4_2.setItemMeta(metaRang4_2);

					ItemStack Rang4_3 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_3 = Rang4_3.getItemMeta();
					metaRang4_3.setDisplayName((String) config.get("DisplayRang4.Command4"));
					metaRang4_3.setLore(info4Command4);
					Rang4_3.setItemMeta(metaRang4_3);

					ItemStack Rang4_4 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_4 = Rang4_4.getItemMeta();
					metaRang4_4.setDisplayName((String) config.get("DisplayRang4.Command5"));
					metaRang4_4.setLore(info4Command5);
					Rang4_4.setItemMeta(metaRang4_4);

					ItemStack Rang4_5 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_5 = Rang4_5.getItemMeta();
					metaRang4_5.setDisplayName((String) config.get("DisplayRang4.Command6"));
					metaRang4_5.setLore(info4Command6);
					Rang4_5.setItemMeta(metaRang4_5);

					ItemStack Rang4_6 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_6 = Rang4_6.getItemMeta();
					metaRang4_6.setDisplayName((String) config.get("DisplayRang4.Command7"));
					metaRang4_6.setLore(info4Command7);
					Rang4_6.setItemMeta(metaRang4_6);

					ItemStack Rang4_7 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_7 = Rang4_7.getItemMeta();
					metaRang4_7.setDisplayName((String) config.get("DisplayRang4.Command8"));
					metaRang4_7.setLore(info4Command8);
					Rang4_7.setItemMeta(metaRang4_7);

					ItemStack Rang4_8 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_8 = Rang4_8.getItemMeta();
					metaRang4_8.setDisplayName((String) config.get("DisplayRang4.Command9"));
					metaRang4_8.setLore(info4Command9);
					Rang4_8.setItemMeta(metaRang4_8);

					ItemStack Rang4_9 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_9 = Rang4_9.getItemMeta();
					metaRang4_9.setDisplayName((String) config.get("DisplayRang4.Command10"));
					metaRang4_9.setLore(info4Command10);
					Rang4_9.setItemMeta(metaRang4_9);

					ItemStack Rang4_10 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_10 = Rang4_10.getItemMeta();
					metaRang4_10.setDisplayName((String) config.get("DisplayRang4.Command11"));
					metaRang4_10.setLore(info4Command11);
					Rang4_10.setItemMeta(metaRang4_10);

					ItemStack Rang4_11 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_11 = Rang4_11.getItemMeta();
					metaRang4_11.setDisplayName((String) config.get("DisplayRang4.Command12"));
					metaRang4_11.setLore(info4Command12);
					Rang4_11.setItemMeta(metaRang4_11);

					ItemStack Rang4_12 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_12 = Rang4_12.getItemMeta();
					metaRang4_12.setDisplayName((String) config.get("DisplayRang4.Command13"));
					metaRang4_12.setLore(info4Command13);
					Rang4_12.setItemMeta(metaRang4_12);

					ItemStack Rang4_13 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_13 = Rang4_13.getItemMeta();
					metaRang4_13.setDisplayName((String) config.get("DisplayRang4.Command14"));
					metaRang4_13.setLore(info4Command14);
					Rang4_13.setItemMeta(metaRang4_13);

					ItemStack Rang4_14 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_14 = Rang4_14.getItemMeta();
					metaRang4_14.setDisplayName((String) config.get("DisplayRang4.Command15"));
					metaRang4_14.setLore(info4Command15);
					Rang4_14.setItemMeta(metaRang4_14);

					ItemStack Rang4_15 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_15 = Rang4_15.getItemMeta();
					metaRang4_15.setDisplayName((String) config.get("DisplayRang4.Command16"));
					metaRang4_15.setLore(info4Command16);
					Rang4_15.setItemMeta(metaRang4_15);

					ItemStack Rang4_16 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_16 = Rang4_16.getItemMeta();
					metaRang4_16.setDisplayName((String) config.get("DisplayRang4.Command17"));
					metaRang4_16.setLore(info4Command17);
					Rang4_16.setItemMeta(metaRang4_16);

					ItemStack Rang4_17 = new ItemStack(Material.DRAGON_EGG);
					ItemMeta metaRang4_17 = Rang4_17.getItemMeta();
					metaRang4_17.setDisplayName((String) config.get("DisplayRang4.Command18"));
					metaRang4_17.setLore(info4Command18);
					Rang4_17.setItemMeta(metaRang4_17);

					ItemStack Back = new ItemStack(Material.SKELETON_SKULL);
					ItemMeta metaback = Back.getItemMeta();
					metaback.setDisplayName("Back");
					Back.setItemMeta(metaback);

					info4.setItem(1, Rang4);
					info4.setItem(4, Rang4_1);
					info4.setItem(7, Rang4_2);
					info4.setItem(10, Rang4_3);
					info4.setItem(13, Rang4_4);
					info4.setItem(16, Rang4_5);
					info4.setItem(19, Rang4_6);
					info4.setItem(22, Rang4_7);
					info4.setItem(25, Rang4_8);
					info4.setItem(28, Rang4_9);
					info4.setItem(31, Rang4_10);
					info4.setItem(34, Rang4_11);
					info4.setItem(37, Rang4_12);
					info4.setItem(40, Rang4_13);
					info4.setItem(43, Rang4_14);
					info4.setItem(46, Rang4_15);
					info4.setItem(49, Rang4_16);
					info4.setItem(52, Rang4_17);
					info4.setItem(53, Back);

					player.getPlayer().openInventory(info4);

				}

			}
		}

		if (event3.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName4"))) {
			event3.setCancelled(true);
			event3.getView().close();
		}

	}

	@EventHandler
	public void onInfo5(InventoryClickEvent event4) {
		Player player = (Player) event4.getWhoClicked();

		List<String> info5Command1 = (List<String>) config.getStringList("Lore.Info5.Command1");
		List<String> info5Command2 = (List<String>) config.getStringList("Lore.Info5.Command2");
		List<String> info5Command3 = (List<String>) config.getStringList("Lore.Info5.Command3");
		List<String> info5Command4 = (List<String>) config.getStringList("Lore.Info5.Command4");
		List<String> info5Command5 = (List<String>) config.getStringList("Lore.Info5.Command5");
		List<String> info5Command6 = (List<String>) config.getStringList("Lore.Info5.Command6");
		List<String> info5Command7 = (List<String>) config.getStringList("Lore.Info5.Command7");
		List<String> info5Command8 = (List<String>) config.getStringList("Lore.Info5.Command8");
		List<String> info5Command9 = (List<String>) config.getStringList("Lore.Info5.Command9");
		List<String> info5Command10 = (List<String>) config.getStringList("Lore.Info5.Command10");
		List<String> info5Command11 = (List<String>) config.getStringList("Lore.Info5.Command11");
		List<String> info5Command12 = (List<String>) config.getStringList("Lore.Info5.Command12");
		List<String> info5Command13 = (List<String>) config.getStringList("Lore.Info5.Command13");
		List<String> info5Command14 = (List<String>) config.getStringList("Lore.Info5.Command14");
		List<String> info5Command15 = (List<String>) config.getStringList("Lore.Info5.Command15");
		List<String> info5Command16 = (List<String>) config.getStringList("Lore.Info5.Command16");
		List<String> info5Command17 = (List<String>) config.getStringList("Lore.Info5.Command17");
		List<String> info5Command18 = (List<String>) config.getStringList("Lore.Info5.Command18");

		if (event4.getView().getTitle().equalsIgnoreCase("ßeßl‹bersicht")) {
			event4.setCancelled(true);

			if (player.hasPermission((String) per.get("Info.Info5"))) {
				if (event4.getCurrentItem().getType() == Material.DRAGON_BREATH) {
					Inventory info5 = player.getPlayer().getServer().createInventory(null, 9 * 6,
							(String) config.get("DisplayName5"));

					ItemStack Rang5 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5 = Rang5.getItemMeta();
					metaRang5.setDisplayName((String) config.get("DisplayRang5.Command1"));
					metaRang5.setLore(info5Command1);
					Rang5.setItemMeta(metaRang5);

					ItemStack Rang5_1 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_1 = Rang5_1.getItemMeta();
					metaRang5_1.setDisplayName((String) config.get("DisplayRang5.Command2"));
					metaRang5_1.setLore(info5Command2);
					Rang5_1.setItemMeta(metaRang5_1);

					ItemStack Rang5_2 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_2 = Rang5_2.getItemMeta();
					metaRang5_2.setDisplayName((String) config.get("DisplayRang5.Command3"));
					metaRang5_2.setLore(info5Command3);
					Rang5_2.setItemMeta(metaRang5_2);

					ItemStack Rang5_3 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_3 = Rang5_3.getItemMeta();
					metaRang5_3.setDisplayName((String) config.get("DisplayRang5.Command4"));
					metaRang5_3.setLore(info5Command4);
					Rang5_3.setItemMeta(metaRang5_3);

					ItemStack Rang5_4 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_4 = Rang5_4.getItemMeta();
					metaRang5_4.setDisplayName((String) config.get("DisplayRang5.Command5"));
					metaRang5_4.setLore(info5Command5);
					Rang5_4.setItemMeta(metaRang5_4);

					ItemStack Rang5_5 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_5 = Rang5_5.getItemMeta();
					metaRang5_5.setDisplayName((String) config.get("DisplayRang5.Command6"));
					metaRang5_5.setLore(info5Command6);
					Rang5_5.setItemMeta(metaRang5_5);

					ItemStack Rang5_6 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_6 = Rang5_6.getItemMeta();
					metaRang5_6.setDisplayName((String) config.get("DisplayRang5.Command7"));
					metaRang5_6.setLore(info5Command7);
					Rang5_6.setItemMeta(metaRang5_6);

					ItemStack Rang5_7 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_7 = Rang5_7.getItemMeta();
					metaRang5_7.setDisplayName((String) config.get("DisplayRang5.Command8"));
					metaRang5_7.setLore(info5Command8);
					Rang5_7.setItemMeta(metaRang5_7);

					ItemStack Rang5_8 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_8 = Rang5_8.getItemMeta();
					metaRang5_8.setDisplayName((String) config.get("DisplayRang5.Command9"));
					metaRang5_8.setLore(info5Command9);
					Rang5_8.setItemMeta(metaRang5_8);

					ItemStack Rang5_9 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_9 = Rang5_9.getItemMeta();
					metaRang5_9.setDisplayName((String) config.get("DisplayRang5.Command10"));
					metaRang5_9.setLore(info5Command10);
					Rang5_9.setItemMeta(metaRang5_9);

					ItemStack Rang5_10 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_10 = Rang5_10.getItemMeta();
					metaRang5_10.setDisplayName((String) config.get("DisplayRang5.Command11"));
					metaRang5_10.setLore(info5Command11);
					Rang5_10.setItemMeta(metaRang5_10);

					ItemStack Rang5_11 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_11 = Rang5_11.getItemMeta();
					metaRang5_11.setDisplayName((String) config.get("DisplayRang5.Command12"));
					metaRang5_11.setLore(info5Command12);
					Rang5_11.setItemMeta(metaRang5_11);

					ItemStack Rang5_12 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_12 = Rang5_12.getItemMeta();
					metaRang5_12.setDisplayName((String) config.get("DisplayRang5.Command13"));
					metaRang5_12.setLore(info5Command13);
					Rang5_12.setItemMeta(metaRang5_12);

					ItemStack Rang5_13 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_13 = Rang5_13.getItemMeta();
					metaRang5_13.setDisplayName((String) config.get("DisplayRang5.Command14"));
					metaRang5_13.setLore(info5Command14);
					Rang5_13.setItemMeta(metaRang5_13);

					ItemStack Rang5_14 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_14 = Rang5_14.getItemMeta();
					metaRang5_14.setDisplayName((String) config.get("DisplayRang5.Command15"));
					metaRang5_14.setLore(info5Command15);
					Rang5_14.setItemMeta(metaRang5_14);

					ItemStack Rang5_15 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_15 = Rang5_15.getItemMeta();
					metaRang5_15.setDisplayName((String) config.get("DisplayRang5.Command16"));
					metaRang5_15.setLore(info5Command16);
					Rang5_15.setItemMeta(metaRang5_15);

					ItemStack Rang5_16 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_16 = Rang5_16.getItemMeta();
					metaRang5_16.setDisplayName((String) config.get("DisplayRang5.Command17"));
					metaRang5_16.setLore(info5Command17);
					Rang5_16.setItemMeta(metaRang5_16);

					ItemStack Rang5_17 = new ItemStack(Material.DRAGON_BREATH);
					ItemMeta metaRang5_17 = Rang5_17.getItemMeta();
					metaRang5_17.setDisplayName((String) config.get("DisplayRang5.Command18"));
					metaRang5_17.setLore(info5Command18);
					Rang5_17.setItemMeta(metaRang5_17);

					ItemStack Back = new ItemStack(Material.SKELETON_SKULL);
					ItemMeta metaback = Back.getItemMeta();
					metaback.setDisplayName("Back");
					Back.setItemMeta(metaback);

					info5.setItem(1, Rang5);
					info5.setItem(4, Rang5_1);
					info5.setItem(7, Rang5_2);
					info5.setItem(10, Rang5_3);
					info5.setItem(13, Rang5_4);
					info5.setItem(16, Rang5_5);
					info5.setItem(19, Rang5_6);
					info5.setItem(22, Rang5_7);
					info5.setItem(25, Rang5_8);
					info5.setItem(28, Rang5_9);
					info5.setItem(31, Rang5_10);
					info5.setItem(34, Rang5_11);
					info5.setItem(37, Rang5_12);
					info5.setItem(40, Rang5_13);
					info5.setItem(43, Rang5_14);
					info5.setItem(46, Rang5_15);
					info5.setItem(49, Rang5_16);
					info5.setItem(52, Rang5_17);
					info5.setItem(53, Back);

					player.getPlayer().openInventory(info5);

				}

			}
		}

		if (event4.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName5"))) {
			event4.setCancelled(true);
			event4.getView().close();
		}

	}

	@EventHandler
	public void onRang7(InventoryClickEvent event5) {
		Player player = (Player) event5.getWhoClicked();

		List<String> info6Command1 = (List<String>) config.getStringList("Lore.Info6.Command1");
		List<String> info6Command2 = (List<String>) config.getStringList("Lore.Info6.Command2");
		List<String> info6Command3 = (List<String>) config.getStringList("Lore.Info6.Command3");
		List<String> info6Command4 = (List<String>) config.getStringList("Lore.Info6.Command4");
		List<String> info6Command5 = (List<String>) config.getStringList("Lore.Info6.Command5");
		List<String> info6Command6 = (List<String>) config.getStringList("Lore.Info6.Command6");
		List<String> info6Command7 = (List<String>) config.getStringList("Lore.Info6.Command7");
		List<String> info6Command8 = (List<String>) config.getStringList("Lore.Info6.Command8");
		List<String> info6Command9 = (List<String>) config.getStringList("Lore.Info6.Command9");
		List<String> info6Command10 = (List<String>) config.getStringList("Lore.Info6.Command10");
		List<String> info6Command11 = (List<String>) config.getStringList("Lore.Info6.Command11");
		List<String> info6Command12 = (List<String>) config.getStringList("Lore.Info6.Command12");
		List<String> info6Command13 = (List<String>) config.getStringList("Lore.Info6.Command13");
		List<String> info6Command14 = (List<String>) config.getStringList("Lore.Info6.Command14");
		List<String> info6Command15 = (List<String>) config.getStringList("Lore.Info6.Command15");
		List<String> info6Command16 = (List<String>) config.getStringList("Lore.Info6.Command16");
		List<String> info6Command17 = (List<String>) config.getStringList("Lore.Info6.Command17");
		List<String> info6Command18 = (List<String>) config.getStringList("Lore.Info6.Command18");

		if (event5.getView().getTitle().equalsIgnoreCase("ßeßl‹bersicht")) {
			event5.setCancelled(true);

			if (player.hasPermission((String) per.get("Info.Info6"))) {
				if (event5.getCurrentItem().getType() == Material.END_PORTAL_FRAME) {
					Inventory info6 = player.getPlayer().getServer().createInventory(null, 9 * 6,
							(String) config.get("DisplayName6"));

					ItemStack Rang6 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6 = Rang6.getItemMeta();
					metaRang6.setDisplayName((String) config.get("DisplayRang6.Command1"));
					metaRang6.setLore(info6Command1);
					Rang6.setItemMeta(metaRang6);

					ItemStack Rang6_1 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_1 = Rang6_1.getItemMeta();
					metaRang6_1.setDisplayName((String) config.get("DisplayRang6.Command2"));
					metaRang6_1.setLore(info6Command2);
					Rang6_1.setItemMeta(metaRang6_1);

					ItemStack Rang6_2 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_2 = Rang6_2.getItemMeta();
					metaRang6_2.setDisplayName((String) config.get("DisplayRang6.Command3"));
					metaRang6_2.setLore(info6Command3);
					Rang6_2.setItemMeta(metaRang6_2);

					ItemStack Rang6_3 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_3 = Rang6_3.getItemMeta();
					metaRang6_3.setDisplayName((String) config.get("DisplayRang6.Command4"));
					metaRang6_2.setLore(info6Command4);
					Rang6_3.setItemMeta(metaRang6_3);

					ItemStack Rang6_4 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_4 = Rang6_4.getItemMeta();
					metaRang6_4.setDisplayName((String) config.get("DisplayRang6.Command5"));
					metaRang6_4.setLore(info6Command5);
					Rang6_4.setItemMeta(metaRang6_4);

					ItemStack Rang6_5 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_5 = Rang6_5.getItemMeta();
					metaRang6_5.setDisplayName((String) config.get("DisplayRang6.Command6"));
					metaRang6_5.setLore(info6Command6);
					Rang6_5.setItemMeta(metaRang6_5);

					ItemStack Rang6_6 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_6 = Rang6_6.getItemMeta();
					metaRang6_6.setDisplayName((String) config.get("DisplayRang6.Command7"));
					metaRang6_6.setLore(info6Command7);
					Rang6_6.setItemMeta(metaRang6_6);

					ItemStack Rang6_7 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_7 = Rang6_7.getItemMeta();
					metaRang6_7.setDisplayName((String) config.get("DisplayRang6.Command8"));
					metaRang6_7.setLore(info6Command8);
					Rang6_7.setItemMeta(metaRang6_7);

					ItemStack Rang6_8 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_8 = Rang6_8.getItemMeta();
					metaRang6_8.setDisplayName((String) config.get("DisplayRang6.Command9"));
					metaRang6_8.setLore(info6Command9);
					Rang6_8.setItemMeta(metaRang6_8);

					ItemStack Rang6_9 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_9 = Rang6_9.getItemMeta();
					metaRang6_9.setDisplayName((String) config.get("DisplayRang6.Command10"));
					metaRang6_9.setLore(info6Command10);
					Rang6_9.setItemMeta(metaRang6_9);

					ItemStack Rang6_10 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_10 = Rang6_10.getItemMeta();
					metaRang6_10.setDisplayName((String) config.get("DisplayRang6.Command11"));
					metaRang6_10.setLore(info6Command11);
					Rang6_10.setItemMeta(metaRang6_10);

					ItemStack Rang6_11 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_11 = Rang6_11.getItemMeta();
					metaRang6_11.setDisplayName((String) config.get("DisplayRang6.Command12"));
					metaRang6_11.setLore(info6Command12);
					Rang6_11.setItemMeta(metaRang6_11);

					ItemStack Rang6_12 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_12 = Rang6_12.getItemMeta();
					metaRang6_12.setDisplayName((String) config.get("DisplayRang6.Command13"));
					metaRang6_12.setLore(info6Command13);
					Rang6_12.setItemMeta(metaRang6_12);

					ItemStack Rang6_13 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_13 = Rang6_13.getItemMeta();
					metaRang6_13.setDisplayName((String) config.get("DisplayRang6.Command14"));
					metaRang6_13.setLore(info6Command14);
					Rang6_13.setItemMeta(metaRang6_13);

					ItemStack Rang6_14 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_14 = Rang6_14.getItemMeta();
					metaRang6_14.setDisplayName((String) config.get("DisplayRang6.Command15"));
					metaRang6_14.setLore(info6Command15);
					Rang6_14.setItemMeta(metaRang6_14);

					ItemStack Rang6_15 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_15 = Rang6_15.getItemMeta();
					metaRang6_15.setDisplayName((String) config.get("DisplayRang6.Command16"));
					metaRang6_15.setLore(info6Command16);
					Rang6_15.setItemMeta(metaRang6_15);

					ItemStack Rang6_16 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_16 = Rang6_16.getItemMeta();
					metaRang6_16.setDisplayName((String) config.get("DisplayRang6.Command17"));
					metaRang6_16.setLore(info6Command17);
					Rang6_16.setItemMeta(metaRang6_16);

					ItemStack Rang6_17 = new ItemStack(Material.END_PORTAL_FRAME);
					ItemMeta metaRang6_17 = Rang6_17.getItemMeta();
					metaRang6_17.setDisplayName((String) config.get("DisplayRang6.Command18"));
					metaRang6_17.setLore(info6Command18);
					Rang6_17.setItemMeta(metaRang6_17);

					ItemStack Back = new ItemStack(Material.SKELETON_SKULL);
					ItemMeta metaback = Back.getItemMeta();
					metaback.setDisplayName("Back");
					Back.setItemMeta(metaback);

					info6.setItem(1, Rang6);
					info6.setItem(4, Rang6_1);
					info6.setItem(7, Rang6_2);
					info6.setItem(10, Rang6_3);
					info6.setItem(13, Rang6_4);
					info6.setItem(16, Rang6_5);
					info6.setItem(19, Rang6_6);
					info6.setItem(22, Rang6_7);
					info6.setItem(25, Rang6_8);
					info6.setItem(28, Rang6_9);
					info6.setItem(31, Rang6_10);
					info6.setItem(34, Rang6_11);
					info6.setItem(37, Rang6_12);
					info6.setItem(40, Rang6_13);
					info6.setItem(43, Rang6_14);
					info6.setItem(46, Rang6_15);
					info6.setItem(49, Rang6_16);
					info6.setItem(52, Rang6_17);
					info6.setItem(53, Back);

					player.getPlayer().openInventory(info6);

				}

			}
		}

		if (event5.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName6"))) {
			event5.setCancelled(true);
			event5.getView().close();
		}

	}

	@EventHandler
	public void onInfo7(InventoryClickEvent event5) {
		Player player = (Player) event5.getWhoClicked();

		List<String> info7Command1 = (List<String>) config.getStringList("Lore.Info7.Command1");
		List<String> info7Command2 = (List<String>) config.getStringList("Lore.Info7.Command2");
		List<String> info7Command3 = (List<String>) config.getStringList("Lore.Info7.Command3");
		List<String> info7Command4 = (List<String>) config.getStringList("Lore.Info7.Command4");
		List<String> info7Command5 = (List<String>) config.getStringList("Lore.Info7.Command5");
		List<String> info7Command6 = (List<String>) config.getStringList("Lore.Info7.Command6");
		List<String> info7Command7 = (List<String>) config.getStringList("Lore.Info7.Command7");
		List<String> info7Command8 = (List<String>) config.getStringList("Lore.Info7.Command8");
		List<String> info7Command9 = (List<String>) config.getStringList("Lore.Info7.Command9");
		List<String> info7Command10 = (List<String>) config.getStringList("Lore.Info7.Command10");
		List<String> info7Command11 = (List<String>) config.getStringList("Lore.Info7.Command11");
		List<String> info7Command12 = (List<String>) config.getStringList("Lore.Info7.Command12");
		List<String> info7Command13 = (List<String>) config.getStringList("Lore.Info7.Command13");
		List<String> info7Command14 = (List<String>) config.getStringList("Lore.Info7.Command14");
		List<String> info7Command15 = (List<String>) config.getStringList("Lore.Info7.Command15");
		List<String> info7Command16 = (List<String>) config.getStringList("Lore.Info7.Command16");
		List<String> info7Command17 = (List<String>) config.getStringList("Lore.Info7.Command17");
		List<String> info7Command18 = (List<String>) config.getStringList("Lore.Info7.Command18");

		if (event5.getView().getTitle().equalsIgnoreCase("ßeßl‹bersicht")) {
			event5.setCancelled(true);

			if (player.hasPermission((String) per.get("Info.Info7"))) {
				if (event5.getCurrentItem().getType() == Material.ENDER_PEARL) {
					Inventory info7 = player.getPlayer().getServer().createInventory(null, 9 * 6,
							(String) config.get("DisplayName7"));

					ItemStack Rang7 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7 = Rang7.getItemMeta();
					metaRang7.setDisplayName((String) config.get("DisplayRang7.Command1"));
					metaRang7.setLore(info7Command1);
					Rang7.setItemMeta(metaRang7);

					ItemStack Rang7_1 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_1 = Rang7_1.getItemMeta();
					metaRang7_1.setDisplayName((String) config.get("DisplayRang7.Command2"));
					metaRang7_1.setLore(info7Command2);
					Rang7_1.setItemMeta(metaRang7_1);

					ItemStack Rang7_2 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_2 = Rang7_2.getItemMeta();
					metaRang7_2.setDisplayName((String) config.get("DisplayRang7.Command3"));
					metaRang7_2.setLore(info7Command3);
					Rang7_2.setItemMeta(metaRang7_2);

					ItemStack Rang7_3 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_3 = Rang7_3.getItemMeta();
					metaRang7_3.setDisplayName((String) config.get("DisplayRang7.Command4"));
					metaRang7_3.setLore(info7Command4);
					Rang7_3.setItemMeta(metaRang7_3);

					ItemStack Rang7_4 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_4 = Rang7_4.getItemMeta();
					metaRang7_4.setDisplayName((String) config.get("DisplayRang7.Command5"));
					metaRang7_4.setLore(info7Command5);
					Rang7_4.setItemMeta(metaRang7_4);

					ItemStack Rang7_5 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_5 = Rang7_5.getItemMeta();
					metaRang7_5.setDisplayName((String) config.get("DisplayRang7.Command6"));
					metaRang7_5.setLore(info7Command6);
					Rang7_5.setItemMeta(metaRang7_5);

					ItemStack Rang7_6 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_6 = Rang7_6.getItemMeta();
					metaRang7_6.setDisplayName((String) config.get("DisplayRang7.Command7"));
					metaRang7_6.setLore(info7Command7);
					Rang7_6.setItemMeta(metaRang7_6);

					ItemStack Rang7_7 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_7 = Rang7_7.getItemMeta();
					metaRang7_7.setDisplayName((String) config.get("DisplayRang7.Command8"));
					metaRang7_7.setLore(info7Command8);
					Rang7_7.setItemMeta(metaRang7_7);

					ItemStack Rang7_8 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_8 = Rang7_8.getItemMeta();
					metaRang7_8.setDisplayName((String) config.get("DisplayRang7.Command9"));
					metaRang7_8.setLore(info7Command9);
					Rang7_8.setItemMeta(metaRang7_8);

					ItemStack Rang7_9 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_9 = Rang7_9.getItemMeta();
					metaRang7_9.setDisplayName((String) config.get("DisplayRang7.Command10"));
					metaRang7_9.setLore(info7Command10);
					Rang7_9.setItemMeta(metaRang7_9);

					ItemStack Rang7_10 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_10 = Rang7_10.getItemMeta();
					metaRang7_10.setDisplayName((String) config.get("DisplayRang7.Command11"));
					metaRang7_10.setLore(info7Command11);
					Rang7_10.setItemMeta(metaRang7_10);

					ItemStack Rang7_11 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_11 = Rang7_11.getItemMeta();
					metaRang7_11.setDisplayName((String) config.get("DisplayRang7.Command12"));
					metaRang7_11.setLore(info7Command12);
					Rang7_11.setItemMeta(metaRang7_11);

					ItemStack Rang7_12 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_12 = Rang7_12.getItemMeta();
					metaRang7_12.setDisplayName((String) config.get("DisplayRang7.Command13"));
					metaRang7_12.setLore(info7Command13);
					Rang7_12.setItemMeta(metaRang7_12);

					ItemStack Rang7_13 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_13 = Rang7_13.getItemMeta();
					metaRang7_13.setDisplayName((String) config.get("DisplayRang7.Command14"));
					metaRang7_13.setLore(info7Command14);
					Rang7_13.setItemMeta(metaRang7_13);

					ItemStack Rang7_14 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_14 = Rang7_14.getItemMeta();
					metaRang7_14.setDisplayName((String) config.get("DisplayRang7.Command15"));
					metaRang7_14.setLore(info7Command15);
					Rang7_14.setItemMeta(metaRang7_14);

					ItemStack Rang7_15 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_15 = Rang7_15.getItemMeta();
					metaRang7_15.setDisplayName((String) config.get("DisplayRang7.Command16"));
					metaRang7_15.setLore(info7Command16);
					Rang7_15.setItemMeta(metaRang7_15);

					ItemStack Rang7_16 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_16 = Rang7_16.getItemMeta();
					metaRang7_16.setDisplayName((String) config.get("DisplayRang7.Command17"));
					metaRang7_16.setLore(info7Command17);
					Rang7_16.setItemMeta(metaRang7_16);

					ItemStack Rang7_17 = new ItemStack(Material.ENDER_PEARL);
					ItemMeta metaRang7_17 = Rang7_17.getItemMeta();
					metaRang7_17.setDisplayName((String) config.get("DisplayRang7.Command18"));
					metaRang7_17.setLore(info7Command18);
					Rang7_17.setItemMeta(metaRang7_17);

					ItemStack Back = new ItemStack(Material.SKELETON_SKULL);
					ItemMeta metaback = Back.getItemMeta();
					metaback.setDisplayName("Back");
					Back.setItemMeta(metaback);

					info7.setItem(1, Rang7);
					info7.setItem(4, Rang7_1);
					info7.setItem(7, Rang7_2);
					info7.setItem(10, Rang7_3);
					info7.setItem(13, Rang7_4);
					info7.setItem(16, Rang7_5);
					info7.setItem(19, Rang7_6);
					info7.setItem(22, Rang7_7);
					info7.setItem(25, Rang7_8);
					info7.setItem(28, Rang7_9);
					info7.setItem(31, Rang7_10);
					info7.setItem(34, Rang7_11);
					info7.setItem(37, Rang7_12);
					info7.setItem(40, Rang7_13);
					info7.setItem(43, Rang7_14);
					info7.setItem(46, Rang7_15);
					info7.setItem(49, Rang7_16);
					info7.setItem(52, Rang7_17);
					info7.setItem(53, Back);

					player.getPlayer().openInventory(info7);

				}

			}
		}

		if (event5.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName7"))) {
			event5.setCancelled(true);
			event5.getView().close();
		}

	}

	@EventHandler
	public void onInfo8(InventoryClickEvent event6) {
		Player player = (Player) event6.getWhoClicked();

		List<String> info8Command1 = (List<String>) config.getStringList("Lore.Info8.Command1");
		List<String> info8Command2 = (List<String>) config.getStringList("Lore.Info8.Command2");
		List<String> info8Command3 = (List<String>) config.getStringList("Lore.Info8.Command3");
		List<String> info8Command4 = (List<String>) config.getStringList("Lore.Info8.Command4");
		List<String> info8Command5 = (List<String>) config.getStringList("Lore.Info8.Command5");
		List<String> info8Command6 = (List<String>) config.getStringList("Lore.Info8.Command6");
		List<String> info8Command7 = (List<String>) config.getStringList("Lore.Info8.Command7");
		List<String> info8Command8 = (List<String>) config.getStringList("Lore.Info8.Command8");
		List<String> info8Command9 = (List<String>) config.getStringList("Lore.Info8.Command9");
		List<String> info8Command10 = (List<String>) config.getStringList("Lore.Info8.Command10");
		List<String> info8Command11 = (List<String>) config.getStringList("Lore.Info8.Command11");
		List<String> info8Command12 = (List<String>) config.getStringList("Lore.Info8.Command12");
		List<String> info8Command13 = (List<String>) config.getStringList("Lore.Info8.Command13");
		List<String> info8Command14 = (List<String>) config.getStringList("Lore.Info8.Command14");
		List<String> info8Command15 = (List<String>) config.getStringList("Lore.Info8.Command15");
		List<String> info8Command16 = (List<String>) config.getStringList("Lore.Info8.Command16");
		List<String> info8Command17 = (List<String>) config.getStringList("Lore.Info8.Command17");
		List<String> info8Command18 = (List<String>) config.getStringList("Lore.Info8.Command18");

		if (event6.getView().getTitle().equalsIgnoreCase("ßeßl‹bersicht")) {
			event6.setCancelled(true);

			if (player.hasPermission((String) per.get("Info.Info8"))) {
				if (event6.getCurrentItem().getType() == Material.POPPED_CHORUS_FRUIT) {
					Inventory Info8 = player.getPlayer().getServer().createInventory(null, 9 * 6,
							(String) config.get("DisplayName8"));

					ItemStack Rang8 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8 = Rang8.getItemMeta();
					metaRang8.setDisplayName((String) config.get("DisplayRang8.Command1"));
					metaRang8.setLore(info8Command1);
					Rang8.setItemMeta(metaRang8);

					ItemStack Rang8_1 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_1 = Rang8_1.getItemMeta();
					metaRang8_1.setDisplayName((String) config.get("DisplayRang8.Command2"));
					metaRang8_1.setLore(info8Command2);
					Rang8_1.setItemMeta(metaRang8_1);

					ItemStack Rang8_2 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_2 = Rang8_2.getItemMeta();
					metaRang8_2.setDisplayName((String) config.get("DisplayRang8.Command3"));
					metaRang8_2.setLore(info8Command3);
					Rang8_2.setItemMeta(metaRang8_2);

					ItemStack Rang8_3 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_3 = Rang8_3.getItemMeta();
					metaRang8_3.setDisplayName((String) config.get("DisplayRang8.Command4"));
					metaRang8_3.setLore(info8Command4);
					Rang8_3.setItemMeta(metaRang8_3);

					ItemStack Rang8_4 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_4 = Rang8_4.getItemMeta();
					metaRang8_4.setDisplayName((String) config.get("DisplayRang8.Command5"));
					metaRang8_4.setLore(info8Command5);
					Rang8_4.setItemMeta(metaRang8_4);

					ItemStack Rang8_5 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_5 = Rang8_5.getItemMeta();
					metaRang8_5.setDisplayName((String) config.get("DisplayRang8.Command6"));
					metaRang8_5.setLore(info8Command6);
					Rang8_5.setItemMeta(metaRang8_5);

					ItemStack Rang8_6 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_6 = Rang8_6.getItemMeta();
					metaRang8_6.setDisplayName((String) config.get("DisplayRang8.Command7"));
					metaRang8_6.setLore(info8Command7);
					Rang8_6.setItemMeta(metaRang8_6);

					ItemStack Rang8_7 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_7 = Rang8_7.getItemMeta();
					metaRang8_7.setDisplayName((String) config.get("DisplayRang8.Command8"));
					metaRang8_7.setLore(info8Command8);
					Rang8_7.setItemMeta(metaRang8_7);

					ItemStack Rang8_8 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_8 = Rang8_8.getItemMeta();
					metaRang8_8.setDisplayName((String) config.get("DisplayRang8.Command9"));
					metaRang8_8.setLore(info8Command9);
					Rang8_8.setItemMeta(metaRang8_8);

					ItemStack Rang8_9 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_9 = Rang8_9.getItemMeta();
					metaRang8_9.setDisplayName((String) config.get("DisplayRang8.Command10"));
					metaRang8_9.setLore(info8Command10);
					Rang8_9.setItemMeta(metaRang8_9);

					ItemStack Rang8_10 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_10 = Rang8_10.getItemMeta();
					metaRang8_10.setDisplayName((String) config.get("DisplayRang8.Command11"));
					metaRang8_10.setLore(info8Command11);
					Rang8_10.setItemMeta(metaRang8_10);

					ItemStack Rang8_11 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_11 = Rang8_11.getItemMeta();
					metaRang8_11.setDisplayName((String) config.get("DisplayRang8.Command12"));
					metaRang8_11.setLore(info8Command12);
					Rang8_11.setItemMeta(metaRang8_11);

					ItemStack Rang8_12 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_12 = Rang8_12.getItemMeta();
					metaRang8_12.setDisplayName((String) config.get("DisplayRang8.Command13"));
					metaRang8_12.setLore(info8Command13);
					Rang8_12.setItemMeta(metaRang8_12);

					ItemStack Rang8_13 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_13 = Rang8_13.getItemMeta();
					metaRang8_13.setDisplayName((String) config.get("DisplayRang8.Command14"));
					metaRang8_13.setLore(info8Command14);
					Rang8_13.setItemMeta(metaRang8_13);

					ItemStack Rang8_14 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_14 = Rang8_14.getItemMeta();
					metaRang8_14.setDisplayName((String) config.get("DisplayRang8.Command15"));
					metaRang8_14.setLore(info8Command15);
					Rang8_14.setItemMeta(metaRang8_14);

					ItemStack Rang8_15 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_15 = Rang8_15.getItemMeta();
					metaRang8_15.setDisplayName((String) config.get("DisplayRang8.Command16"));
					metaRang8_15.setLore(info8Command16);
					Rang8_15.setItemMeta(metaRang8_15);

					ItemStack Rang8_16 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_16 = Rang8_16.getItemMeta();
					metaRang8_16.setDisplayName((String) config.get("DisplayRang8.Command17"));
					metaRang8_16.setLore(info8Command17);
					Rang8_16.setItemMeta(metaRang8_16);

					ItemStack Rang8_17 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
					ItemMeta metaRang8_17 = Rang8_17.getItemMeta();
					metaRang8_17.setDisplayName((String) config.get("DisplayRang8.Command18"));
					metaRang8_17.setLore(info8Command18);
					Rang8_17.setItemMeta(metaRang8_17);

					ItemStack Back = new ItemStack(Material.SKELETON_SKULL);
					ItemMeta metaback = Back.getItemMeta();
					metaback.setDisplayName("Back");
					Back.setItemMeta(metaback);

					Info8.setItem(1, Rang8);
					Info8.setItem(4, Rang8_1);
					Info8.setItem(7, Rang8_2);
					Info8.setItem(10, Rang8_3);
					Info8.setItem(13, Rang8_4);
					Info8.setItem(16, Rang8_5);
					Info8.setItem(19, Rang8_6);
					Info8.setItem(22, Rang8_7);
					Info8.setItem(25, Rang8_8);
					Info8.setItem(28, Rang8_9);
					Info8.setItem(31, Rang8_10);
					Info8.setItem(34, Rang8_11);
					Info8.setItem(37, Rang8_12);
					Info8.setItem(40, Rang8_13);
					Info8.setItem(43, Rang8_14);
					Info8.setItem(46, Rang8_15);
					Info8.setItem(49, Rang8_16);
					Info8.setItem(52, Rang8_17);
					Info8.setItem(53, Back);

					player.getPlayer().openInventory(Info8);

				}

			}
		}

		if (event6.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName8"))) {
			event6.setCancelled(true);
			event6.getView().close();
		}

	}

	@EventHandler
	public void onInfo9(InventoryClickEvent event7) {
		Player player = (Player) event7.getWhoClicked();

		List<String> info9Command1 = (List<String>) config.getStringList("Lore.Info9.Command1");
		List<String> info9Command2 = (List<String>) config.getStringList("Lore.Info9.Command2");
		List<String> info9Command3 = (List<String>) config.getStringList("Lore.Info9.Command3");
		List<String> info9Command4 = (List<String>) config.getStringList("Lore.Info9.Command4");
		List<String> info9Command5 = (List<String>) config.getStringList("Lore.Info9.Command5");
		List<String> info9Command6 = (List<String>) config.getStringList("Lore.Info9.Command6");
		List<String> info9Command7 = (List<String>) config.getStringList("Lore.Info9.Command7");
		List<String> info9Command8 = (List<String>) config.getStringList("Lore.Info9.Command8");
		List<String> info9Command9 = (List<String>) config.getStringList("Lore.Info9.Command9");
		List<String> info9Command10 = (List<String>) config.getStringList("Lore.Info9.Command10");
		List<String> info9Command11 = (List<String>) config.getStringList("Lore.Info9.Command11");
		List<String> info9Command12 = (List<String>) config.getStringList("Lore.Info9.Command12");
		List<String> info9Command13 = (List<String>) config.getStringList("Lore.Info9.Command13");
		List<String> info9Command14 = (List<String>) config.getStringList("Lore.Info9.Command14");
		List<String> info9Command15 = (List<String>) config.getStringList("Lore.Info9.Command15");
		List<String> info9Command16 = (List<String>) config.getStringList("Lore.Info9.Command16");
		List<String> info9Command17 = (List<String>) config.getStringList("Lore.Info9.Command17");
		List<String> info9Command18 = (List<String>) config.getStringList("Lore.Info9.Command18");

		if (event7.getView().getTitle().equalsIgnoreCase("ßeßl‹bersicht")) {
			event7.setCancelled(true);

			if (player.hasPermission((String) per.get("Info.Info9"))) {
				if (event7.getCurrentItem().getType() == Material.CHORUS_FRUIT) {
					Inventory Info9 = player.getPlayer().getServer().createInventory(null, 9 * 6,
							(String) config.get("DisplayName9"));

					ItemStack Rang9 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9 = Rang9.getItemMeta();
					metaRang9.setDisplayName((String) config.get("DisplayRang9.Command1"));
					metaRang9.setLore(info9Command1);
					Rang9.setItemMeta(metaRang9);

					ItemStack Rang9_1 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_1 = Rang9_1.getItemMeta();
					metaRang9_1.setDisplayName((String) config.get("DisplayRang9.Command2"));
					metaRang9_1.setLore(info9Command2);
					Rang9_1.setItemMeta(metaRang9_1);

					ItemStack Rang9_2 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_2 = Rang9_2.getItemMeta();
					metaRang9_2.setDisplayName((String) config.get("DisplayRang9.Command3"));
					metaRang9_2.setLore(info9Command3);
					Rang9_2.setItemMeta(metaRang9_2);

					ItemStack Rang9_3 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_3 = Rang9_3.getItemMeta();
					metaRang9_3.setDisplayName((String) config.get("DisplayRang9.Command4"));
					metaRang9_3.setLore(info9Command4);
					Rang9_3.setItemMeta(metaRang9_3);

					ItemStack Rang9_4 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_4 = Rang9_4.getItemMeta();
					metaRang9_4.setDisplayName((String) config.get("DisplayRang9.Command5"));
					metaRang9_4.setLore(info9Command5);
					Rang9_4.setItemMeta(metaRang9_4);

					ItemStack Rang9_5 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_5 = Rang9_5.getItemMeta();
					metaRang9_5.setDisplayName((String) config.get("DisplayRang9.Command6"));
					metaRang9_5.setLore(info9Command6);
					Rang9_5.setItemMeta(metaRang9_5);

					ItemStack Rang9_6 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_6 = Rang9_6.getItemMeta();
					metaRang9_6.setDisplayName((String) config.get("DisplayRang9.Command7"));
					metaRang9_6.setLore(info9Command7);
					Rang9_6.setItemMeta(metaRang9_6);

					ItemStack Rang9_7 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_7 = Rang9_7.getItemMeta();
					metaRang9_7.setDisplayName((String) config.get("DisplayRang9.Command8"));
					metaRang9_7.setLore(info9Command8);
					Rang9_7.setItemMeta(metaRang9_7);

					ItemStack Rang9_8 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_8 = Rang9_8.getItemMeta();
					metaRang9_8.setDisplayName((String) config.get("DisplayRang9.Command9"));
					metaRang9_8.setLore(info9Command9);
					Rang9_8.setItemMeta(metaRang9_8);

					ItemStack Rang9_9 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_9 = Rang9_9.getItemMeta();
					metaRang9_9.setDisplayName((String) config.get("DisplayRang9.Command10"));
					metaRang9_9.setLore(info9Command10);
					Rang9_9.setItemMeta(metaRang9_9);

					ItemStack Rang9_10 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_10 = Rang9_10.getItemMeta();
					metaRang9_10.setDisplayName((String) config.get("DisplayRang9.Command11"));
					metaRang9_10.setLore(info9Command11);
					Rang9_10.setItemMeta(metaRang9_10);

					ItemStack Rang9_11 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_11 = Rang9_11.getItemMeta();
					metaRang9_11.setDisplayName((String) config.get("DisplayRang9.Command12"));
					metaRang9_11.setLore(info9Command12);
					Rang9_11.setItemMeta(metaRang9_11);

					ItemStack Rang9_12 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_12 = Rang9_12.getItemMeta();
					metaRang9_12.setDisplayName((String) config.get("DisplayRang9.Command13"));
					metaRang9_12.setLore(info9Command13);
					Rang9_12.setItemMeta(metaRang9_12);

					ItemStack Rang9_13 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_13 = Rang9_13.getItemMeta();
					metaRang9_13.setDisplayName((String) config.get("DisplayRang9.Command14"));
					metaRang9_13.setLore(info9Command14);
					Rang9_13.setItemMeta(metaRang9_13);

					ItemStack Rang9_14 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_14 = Rang9_14.getItemMeta();
					metaRang9_14.setDisplayName((String) config.get("DisplayRang9.Command15"));
					metaRang9_14.setLore(info9Command15);
					Rang9_14.setItemMeta(metaRang9_14);

					ItemStack Rang9_15 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_15 = Rang9_15.getItemMeta();
					metaRang9_15.setDisplayName((String) config.get("DisplayRang9.Command16"));
					metaRang9_15.setLore(info9Command16);
					Rang9_15.setItemMeta(metaRang9_15);

					ItemStack Rang9_16 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_16 = Rang9_16.getItemMeta();
					metaRang9_16.setDisplayName((String) config.get("DisplayRang9.Command17"));
					metaRang9_16.setLore(info9Command17);
					Rang9_16.setItemMeta(metaRang9_16);

					ItemStack Rang9_17 = new ItemStack(Material.CHORUS_FRUIT);
					ItemMeta metaRang9_17 = Rang9_17.getItemMeta();
					metaRang9_17.setDisplayName((String) config.get("DisplayRang9.Command18"));
					metaRang9_17.setLore(info9Command18);
					Rang9_17.setItemMeta(metaRang9_17);

					ItemStack Back = new ItemStack(Material.SKELETON_SKULL);
					ItemMeta metaback = Back.getItemMeta();
					metaback.setDisplayName("Back");
					Back.setItemMeta(metaback);

					Info9.setItem(1, Rang9);
					Info9.setItem(4, Rang9_1);
					Info9.setItem(7, Rang9_2);
					Info9.setItem(10, Rang9_3);
					Info9.setItem(13, Rang9_4);
					Info9.setItem(16, Rang9_5);
					Info9.setItem(19, Rang9_6);
					Info9.setItem(22, Rang9_7);
					Info9.setItem(25, Rang9_8);
					Info9.setItem(28, Rang9_9);
					Info9.setItem(31, Rang9_10);
					Info9.setItem(34, Rang9_11);
					Info9.setItem(37, Rang9_12);
					Info9.setItem(40, Rang9_13);
					Info9.setItem(43, Rang9_14);
					Info9.setItem(46, Rang9_15);
					Info9.setItem(49, Rang9_16);
					Info9.setItem(52, Rang9_17);
					Info9.setItem(53, Back);

					player.getPlayer().openInventory(Info9);

				}

			}
		}

		if (event7.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName9"))) {
			event7.setCancelled(true);
			event7.getView().close();
		}

	}

	@EventHandler
	public void onRang10(InventoryClickEvent event8) {
		Player player = (Player) event8.getWhoClicked();

		List<String> info10Command1 = (List<String>) config.getStringList("Lore.Info10.Command1");
		List<String> info10Command2 = (List<String>) config.getStringList("Lore.Info10.Command2");
		List<String> info10Command3 = (List<String>) config.getStringList("Lore.Info10.Command3");
		List<String> info10Command4 = (List<String>) config.getStringList("Lore.Info10.Command4");
		List<String> info10Command5 = (List<String>) config.getStringList("Lore.Info10.Command5");
		List<String> info10Command6 = (List<String>) config.getStringList("Lore.Info10.Command6");
		List<String> info10Command7 = (List<String>) config.getStringList("Lore.Info10.Command7");
		List<String> info10Command8 = (List<String>) config.getStringList("Lore.Info10.Command8");
		List<String> info10Command9 = (List<String>) config.getStringList("Lore.Info10.Command9");
		List<String> info10Command10 = (List<String>) config.getStringList("Lore.Info10.Command10");
		List<String> info10Command11 = (List<String>) config.getStringList("Lore.Info10.Command11");
		List<String> info10Command12 = (List<String>) config.getStringList("Lore.Info10.Command12");
		List<String> info10Command13 = (List<String>) config.getStringList("Lore.Info10.Command13");
		List<String> info10Command14 = (List<String>) config.getStringList("Lore.Info10.Command14");
		List<String> info10Command15 = (List<String>) config.getStringList("Lore.Info10.Command15");
		List<String> info10Command16 = (List<String>) config.getStringList("Lore.Info10.Command16");
		List<String> info10Command17 = (List<String>) config.getStringList("Lore.Info10.Command17");
		List<String> info10Command18 = (List<String>) config.getStringList("Lore.Info10.Command18");

		if (event8.getView().getTitle().equalsIgnoreCase("ßeßl‹bersicht")) {
			event8.setCancelled(true);

			if (event8.getCurrentItem().getType() == Material.ENDER_EYE) {
				Inventory Info10 = player.getPlayer().getServer().createInventory(null, 9 * 6,
						(String) config.get("DisplayName10"));

				ItemStack Rang10 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10 = Rang10.getItemMeta();
				metaRang10.setDisplayName((String) config.get("DisplayRang10.Command1"));
				metaRang10.setLore(info10Command1);
				Rang10.setItemMeta(metaRang10);

				ItemStack Rang10_1 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_1 = Rang10_1.getItemMeta();
				metaRang10_1.setDisplayName((String) config.get("DisplayRang10.Command2"));
				metaRang10_1.setLore(info10Command2);
				Rang10_1.setItemMeta(metaRang10_1);

				ItemStack Rang10_2 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_2 = Rang10_2.getItemMeta();
				metaRang10_2.setDisplayName((String) config.get("DisplayRang10.Command3"));
				metaRang10_2.setLore(info10Command3);
				Rang10_2.setItemMeta(metaRang10_2);

				ItemStack Rang10_3 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_3 = Rang10_3.getItemMeta();
				metaRang10_3.setDisplayName((String) config.get("DisplayRang10.Command4"));
				metaRang10_3.setLore(info10Command4);
				Rang10_3.setItemMeta(metaRang10_3);

				ItemStack Rang10_4 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_4 = Rang10_4.getItemMeta();
				metaRang10_4.setDisplayName((String) config.get("DisplayRang10.Command5"));
				metaRang10_4.setLore(info10Command5);
				Rang10_4.setItemMeta(metaRang10_4);

				ItemStack Rang10_5 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_5 = Rang10_5.getItemMeta();
				metaRang10_5.setDisplayName((String) config.get("DisplayRang10.Command6"));
				metaRang10_5.setLore(info10Command6);
				Rang10_5.setItemMeta(metaRang10_5);

				ItemStack Rang10_6 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_6 = Rang10_6.getItemMeta();
				metaRang10_6.setDisplayName((String) config.get("DisplayRang10.Command7"));
				metaRang10_6.setLore(info10Command7);
				Rang10_6.setItemMeta(metaRang10_6);

				ItemStack Rang10_7 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_7 = Rang10_7.getItemMeta();
				metaRang10_7.setDisplayName((String) config.get("DisplayRang10.Command8"));
				metaRang10_7.setLore(info10Command8);
				Rang10_7.setItemMeta(metaRang10_7);

				ItemStack Rang10_8 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_8 = Rang10_8.getItemMeta();
				metaRang10_8.setDisplayName((String) config.get("DisplayRang10.Command9"));
				metaRang10_8.setLore(info10Command9);
				Rang10_8.setItemMeta(metaRang10_8);

				ItemStack Rang10_9 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_9 = Rang10_9.getItemMeta();
				metaRang10_9.setDisplayName((String) config.get("DisplayRang10.Command10"));
				metaRang10_9.setLore(info10Command10);
				Rang10_9.setItemMeta(metaRang10_9);

				ItemStack Rang10_10 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_10 = Rang10_10.getItemMeta();
				metaRang10_10.setDisplayName((String) config.get("DisplayRang10.Command11"));
				metaRang10_10.setLore(info10Command11);
				Rang10_10.setItemMeta(metaRang10_10);

				ItemStack Rang10_11 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_11 = Rang10_11.getItemMeta();
				metaRang10_11.setDisplayName((String) config.get("DisplayRang10.Command12"));
				metaRang10_11.setLore(info10Command12);
				Rang10_11.setItemMeta(metaRang10_11);

				ItemStack Rang10_12 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_12 = Rang10_12.getItemMeta();
				metaRang10_12.setDisplayName((String) config.get("DisplayRang10.Command13"));
				metaRang10_12.setLore(info10Command13);
				Rang10_12.setItemMeta(metaRang10_12);

				ItemStack Rang10_13 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_13 = Rang10_13.getItemMeta();
				metaRang10_13.setDisplayName((String) config.get("DisplayRang10.Command14"));
				metaRang10_13.setLore(info10Command14);
				Rang10_13.setItemMeta(metaRang10_13);

				ItemStack Rang10_14 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_14 = Rang10_14.getItemMeta();
				metaRang10_14.setDisplayName((String) config.get("DisplayRang10.Command15"));
				metaRang10_14.setLore(info10Command15);
				Rang10_14.setItemMeta(metaRang10_14);

				ItemStack Rang10_15 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_15 = Rang10_15.getItemMeta();
				metaRang10_15.setDisplayName((String) config.get("DisplayRang10.Command16"));
				metaRang10_15.setLore(info10Command16);
				Rang10_15.setItemMeta(metaRang10_15);

				ItemStack Rang10_16 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_16 = Rang10_16.getItemMeta();
				metaRang10_16.setDisplayName((String) config.get("DisplayRang10.Command17"));
				metaRang10_16.setLore(info10Command17);
				Rang10_16.setItemMeta(metaRang10_16);

				ItemStack Rang10_17 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaRang10_17 = Rang10_17.getItemMeta();
				metaRang10_17.setDisplayName((String) config.get("DisplayRang10.Command18"));
				metaRang10_17.setLore(info10Command18);
				Rang10_17.setItemMeta(metaRang10_17);

				ItemStack Back = new ItemStack(Material.SKELETON_SKULL);
				ItemMeta metaback = Back.getItemMeta();
				metaback.setDisplayName("Back");
				Back.setItemMeta(metaback);

				Info10.setItem(1, Rang10);
				Info10.setItem(4, Rang10_1);
				Info10.setItem(7, Rang10_2);
				Info10.setItem(10, Rang10_3);
				Info10.setItem(13, Rang10_4);
				Info10.setItem(16, Rang10_5);
				Info10.setItem(19, Rang10_6);
				Info10.setItem(22, Rang10_7);
				Info10.setItem(25, Rang10_8);
				Info10.setItem(28, Rang10_9);
				Info10.setItem(31, Rang10_10);
				Info10.setItem(34, Rang10_11);
				Info10.setItem(37, Rang10_12);
				Info10.setItem(40, Rang10_13);
				Info10.setItem(43, Rang10_14);
				Info10.setItem(46, Rang10_15);
				Info10.setItem(49, Rang10_16);
				Info10.setItem(52, Rang10_17);
				Info10.setItem(53, Back);

				player.getPlayer().openInventory(Info10);

			}

		}

		if (event8.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName10"))) {
			event8.setCancelled(true);
			event8.getView().close();
		}

	}

	@EventHandler
	public void onRang11(InventoryClickEvent event9) {
		Player player = (Player) event9.getWhoClicked();

		List<String> info11Shop1 = (List<String>) config.getStringList("Lore.Shop1");
		List<String> info11Shop2 = (List<String>) config.getStringList("Lore.Shop2");
		List<String> info11Shop3 = (List<String>) config.getStringList("Lore.Shop3");
		List<String> info11Shop4 = (List<String>) config.getStringList("Lore.Shop4");
		List<String> info11Shop5 = (List<String>) config.getStringList("Lore.Shop5");
		List<String> info11Shop6 = (List<String>) config.getStringList("Lore.Shop6");
		List<String> info11Shop7 = (List<String>) config.getStringList("Lore.Shop7");
		List<String> info11Shop8 = (List<String>) config.getStringList("Lore.Shop8");
		List<String> info11Shop9 = (List<String>) config.getStringList("Lore.Shop9");
		List<String> info11Shop10 = (List<String>) config.getStringList("Lore.Shop10");
		List<String> info11Shop11 = (List<String>) config.getStringList("Lore.Shop11");
		List<String> info11Shop12 = (List<String>) config.getStringList("Lore.Shop12");
		List<String> info11Shop13 = (List<String>) config.getStringList("Lore.Shop13");
		List<String> info11Shop14 = (List<String>) config.getStringList("Lore.Shop14");
		List<String> info11Shop15 = (List<String>) config.getStringList("Lore.Shop15");
		List<String> info11Shop16 = (List<String>) config.getStringList("Lore.Shop16");
		List<String> info11Shop17 = (List<String>) config.getStringList("Lore.Shop17");
		List<String> info11Shop18 = (List<String>) config.getStringList("Lore.Shop18");

		if (event9.getView().getTitle().equalsIgnoreCase("ßeßl‹bersicht")) {
			event9.setCancelled(true);

			if (event9.getCurrentItem().getType() == Material.DIAMOND_BLOCK) {
				Inventory Info11 = player.getPlayer().getServer().createInventory(null, 9 * 6,
						(String) config.get("DisplayName11"));

				ItemStack Shop11 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11 = Shop11.getItemMeta();
				metaShop11.setDisplayName((String) config.get("DisplayShop11.Shop1"));
				metaShop11.setLore(info11Shop1);
				Shop11.setItemMeta(metaShop11);

				ItemStack Shop11_1 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_1 = Shop11_1.getItemMeta();
				metaShop11_1.setDisplayName((String) config.get("DisplayShop11.Shop2"));
				metaShop11_1.setLore(info11Shop2);
				Shop11_1.setItemMeta(metaShop11_1);

				ItemStack Shop11_2 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_2 = Shop11_2.getItemMeta();
				metaShop11_2.setDisplayName((String) config.get("DisplayShop11.Shop3"));
				metaShop11_2.setLore(info11Shop3);
				Shop11_2.setItemMeta(metaShop11_2);

				ItemStack Shop11_3 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_3 = Shop11_3.getItemMeta();
				metaShop11_3.setDisplayName((String) config.get("DisplayShop11.Shop4"));
				metaShop11_3.setLore(info11Shop4);
				Shop11_3.setItemMeta(metaShop11_3);

				ItemStack Shop11_4 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_4 = Shop11_4.getItemMeta();
				metaShop11_4.setDisplayName((String) config.get("DisplayShop11.Shop5"));
				metaShop11_4.setLore(info11Shop5);
				Shop11_4.setItemMeta(metaShop11_4);

				ItemStack Shop11_5 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_5 = Shop11_5.getItemMeta();
				metaShop11_5.setDisplayName((String) config.get("DisplayShop11.Shop6"));
				metaShop11_5.setLore(info11Shop6);
				Shop11_5.setItemMeta(metaShop11_5);

				ItemStack Shop11_6 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_6 = Shop11_6.getItemMeta();
				metaShop11_6.setDisplayName((String) config.get("DisplayShop11.Shop7"));
				metaShop11_6.setLore(info11Shop7);
				Shop11_6.setItemMeta(metaShop11_6);

				ItemStack Shop11_7 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_7 = Shop11_7.getItemMeta();
				metaShop11_7.setDisplayName((String) config.get("DisplayShop11.Shop8"));
				metaShop11_7.setLore(info11Shop8);
				Shop11_7.setItemMeta(metaShop11_7);

				ItemStack Shop11_8 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_8 = Shop11_8.getItemMeta();
				metaShop11_8.setDisplayName((String) config.get("DisplayShop11.Shop9"));
				metaShop11_8.setLore(info11Shop9);
				Shop11_8.setItemMeta(metaShop11_8);

				ItemStack Shop11_9 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_9 = Shop11_9.getItemMeta();
				metaShop11_9.setDisplayName((String) config.get("DisplayShop11.Shop10"));
				metaShop11_9.setLore(info11Shop10);
				Shop11_9.setItemMeta(metaShop11_9);

				ItemStack Shop11_10 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_10 = Shop11_10.getItemMeta();
				metaShop11_10.setDisplayName((String) config.get("DisplayShop11.Shop11"));
				metaShop11_10.setLore(info11Shop11);
				Shop11_10.setItemMeta(metaShop11_10);

				ItemStack Shop11_11 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_11 = Shop11_11.getItemMeta();
				metaShop11_11.setDisplayName((String) config.get("DisplayShop11.Shop12"));
				metaShop11_11.setLore(info11Shop12);
				Shop11_11.setItemMeta(metaShop11_11);

				ItemStack Shop11_12 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_12 = Shop11_12.getItemMeta();
				metaShop11_12.setDisplayName((String) config.get("DisplayShop11.Shop13"));
				metaShop11_12.setLore(info11Shop13);
				Shop11_12.setItemMeta(metaShop11_12);

				ItemStack Shop11_13 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_13 = Shop11_13.getItemMeta();
				metaShop11_13.setDisplayName((String) config.get("DisplayShop11.Shop14"));
				metaShop11_13.setLore(info11Shop14);
				Shop11_13.setItemMeta(metaShop11_13);

				ItemStack Shop11_14 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_14 = Shop11_14.getItemMeta();
				metaShop11_14.setDisplayName((String) config.get("DisplayShop11.Shop15"));
				metaShop11_14.setLore(info11Shop15);
				Shop11_14.setItemMeta(metaShop11_14);

				ItemStack Shop11_15 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_15 = Shop11_15.getItemMeta();
				metaShop11_15.setDisplayName((String) config.get("DisplayShop11.Shop16"));
				metaShop11_15.setLore(info11Shop16);
				Shop11_15.setItemMeta(metaShop11_15);

				ItemStack Shop11_16 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_16 = Shop11_16.getItemMeta();
				metaShop11_16.setDisplayName((String) config.get("DisplayShop11.Shop17"));
				metaShop11_16.setLore(info11Shop17);
				Shop11_16.setItemMeta(metaShop11_16);

				ItemStack Shop11_17 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaShop11_17 = Shop11_17.getItemMeta();
				metaShop11_17.setDisplayName((String) config.get("DisplayShop11.Shop18"));
				metaShop11_17.setLore(info11Shop18);
				Shop11_17.setItemMeta(metaShop11_17);

				ItemStack Back = new ItemStack(Material.SKELETON_SKULL);
				ItemMeta metaback = Back.getItemMeta();
				metaback.setDisplayName("Back");
				Back.setItemMeta(metaback);

				Info11.setItem(1, Shop11);
				Info11.setItem(4, Shop11_1);
				Info11.setItem(7, Shop11_2);
				Info11.setItem(10, Shop11_3);
				Info11.setItem(13, Shop11_4);
				Info11.setItem(16, Shop11_5);
				Info11.setItem(19, Shop11_6);
				Info11.setItem(22, Shop11_7);
				Info11.setItem(25, Shop11_8);
				Info11.setItem(28, Shop11_9);
				Info11.setItem(31, Shop11_10);
				Info11.setItem(34, Shop11_11);
				Info11.setItem(37, Shop11_12);
				Info11.setItem(40, Shop11_13);
				Info11.setItem(43, Shop11_14);
				Info11.setItem(46, Shop11_15);
				Info11.setItem(49, Shop11_16);
				Info11.setItem(52, Shop11_17);
				Info11.setItem(53, Back);

				player.getPlayer().openInventory(Info11);

			}

		}

		if (event9.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName11"))) {
			event9.setCancelled(true);
			event9.getView().close();
		}

	}

}
