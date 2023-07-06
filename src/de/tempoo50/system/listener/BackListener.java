package de.tempoo50.system.listener;

import java.io.File;

import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BackListener implements Listener {

	File file = new File("plugins//ServerSystem//Info.yml");
	YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

	@EventHandler
	public void onRang1(InventoryClickEvent event) {

		Player player = (Player) event.getWhoClicked();

		if (event.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName1"))) {
			event.setCancelled(true);

			if (event.getCurrentItem().getType() == Material.SKELETON_SKULL) {
				Inventory info = player.getPlayer().getServer().createInventory(null, 9 * 6, "ßeßl‹bersicht");

				ItemStack Info1 = new ItemStack(Material.NETHER_STAR);
				ItemMeta metaInfo1 = Info1.getItemMeta();
				metaInfo1.setDisplayName((String) config.get("DisplayName1"));
				Info1.setItemMeta(metaInfo1);

				ItemStack Info2 = new ItemStack(Material.ENDER_CHEST);
				ItemMeta metaInfo2 = Info2.getItemMeta();
				metaInfo2.setDisplayName((String) config.get("DisplayName2"));
				Info2.setItemMeta(metaInfo2);

				ItemStack Info3 = new ItemStack(Material.END_CRYSTAL);
				ItemMeta metaInfo3 = Info3.getItemMeta();
				metaInfo3.setDisplayName((String) config.get("DisplayName3"));
				Info3.setItemMeta(metaInfo3);

				ItemStack Info4 = new ItemStack(Material.DRAGON_EGG);
				ItemMeta metaInfo4 = Info4.getItemMeta();
				metaInfo4.setDisplayName((String) config.get("DisplayName4"));
				Info4.setItemMeta(metaInfo4);

				ItemStack Info5 = new ItemStack(Material.DRAGON_BREATH);
				ItemMeta metaInfo5 = Info5.getItemMeta();
				metaInfo5.setDisplayName((String) config.get("DisplayName5"));
				Info5.setItemMeta(metaInfo5);

				ItemStack Info6 = new ItemStack(Material.END_PORTAL_FRAME);
				ItemMeta metaInfo6 = Info6.getItemMeta();
				metaInfo6.setDisplayName((String) config.get("DisplayName6"));
				Info6.setItemMeta(metaInfo6);

				ItemStack Info7 = new ItemStack(Material.ENDER_PEARL);
				ItemMeta metaInfo7 = Info7.getItemMeta();
				metaInfo7.setDisplayName((String) config.get("DisplayName7"));
				Info7.setItemMeta(metaInfo7);

				ItemStack Info8 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
				ItemMeta metaInfo8 = Info8.getItemMeta();
				metaInfo8.setDisplayName((String) config.get("DisplayName8"));
				Info8.setItemMeta(metaInfo8);

				ItemStack Info9 = new ItemStack(Material.CHORUS_FRUIT);
				ItemMeta metaInfo9 = Info9.getItemMeta();
				metaInfo9.setDisplayName((String) config.get("DisplayName9"));
				Info9.setItemMeta(metaInfo9);

				ItemStack Info10 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaInfo10 = Info10.getItemMeta();
				metaInfo10.setDisplayName((String) config.get("DisplayName10"));
				Info10.setItemMeta(metaInfo10);

				ItemStack Info11 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaInfo11 = Info11.getItemMeta();
				metaInfo11.setDisplayName((String) config.get("DisplayName11"));
				Info11.setItemMeta(metaInfo11);

				info.setItem(1, Info1);
				info.setItem(4, Info2);
				info.setItem(7, Info3);
				info.setItem(19, Info4);
				info.setItem(22, Info5);
				info.setItem(25, Info6);
				info.setItem(37, Info7);
				info.setItem(40, Info8);
				info.setItem(43, Info9);
				info.setItem(46, Info10);
				info.setItem(52, Info11);

				player.getPlayer().openInventory(info);

			}
		}

		if (event.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName2"))) {
			event.setCancelled(true);

			if (event.getCurrentItem().getType() == Material.SKELETON_SKULL) {
				Inventory info = player.getPlayer().getServer().createInventory(null, 9 * 6, "ßeßl‹bersicht");

				ItemStack Info1 = new ItemStack(Material.NETHER_STAR);
				ItemMeta metaInfo1 = Info1.getItemMeta();
				metaInfo1.setDisplayName((String) config.get("DisplayName1"));
				Info1.setItemMeta(metaInfo1);

				ItemStack Info2 = new ItemStack(Material.ENDER_CHEST);
				ItemMeta metaInfo2 = Info2.getItemMeta();
				metaInfo2.setDisplayName((String) config.get("DisplayName2"));
				Info2.setItemMeta(metaInfo2);

				ItemStack Info3 = new ItemStack(Material.END_CRYSTAL);
				ItemMeta metaInfo3 = Info3.getItemMeta();
				metaInfo3.setDisplayName((String) config.get("DisplayName3"));
				Info3.setItemMeta(metaInfo3);

				ItemStack Info4 = new ItemStack(Material.DRAGON_EGG);
				ItemMeta metaInfo4 = Info4.getItemMeta();
				metaInfo4.setDisplayName((String) config.get("DisplayName4"));
				Info4.setItemMeta(metaInfo4);

				ItemStack Info5 = new ItemStack(Material.DRAGON_BREATH);
				ItemMeta metaInfo5 = Info5.getItemMeta();
				metaInfo5.setDisplayName((String) config.get("DisplayName5"));
				Info5.setItemMeta(metaInfo5);

				ItemStack Info6 = new ItemStack(Material.END_PORTAL_FRAME);
				ItemMeta metaInfo6 = Info6.getItemMeta();
				metaInfo6.setDisplayName((String) config.get("DisplayName6"));
				Info6.setItemMeta(metaInfo6);

				ItemStack Info7 = new ItemStack(Material.ENDER_PEARL);
				ItemMeta metaInfo7 = Info7.getItemMeta();
				metaInfo7.setDisplayName((String) config.get("DisplayName7"));
				Info7.setItemMeta(metaInfo7);

				ItemStack Info8 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
				ItemMeta metaInfo8 = Info8.getItemMeta();
				metaInfo8.setDisplayName((String) config.get("DisplayName8"));
				Info8.setItemMeta(metaInfo8);

				ItemStack Info9 = new ItemStack(Material.CHORUS_FRUIT);
				ItemMeta metaInfo9 = Info9.getItemMeta();
				metaInfo9.setDisplayName((String) config.get("DisplayName9"));
				Info9.setItemMeta(metaInfo9);

				ItemStack Info10 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaInfo10 = Info10.getItemMeta();
				metaInfo10.setDisplayName((String) config.get("DisplayName10"));
				Info10.setItemMeta(metaInfo10);

				ItemStack Info11 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaInfo11 = Info11.getItemMeta();
				metaInfo11.setDisplayName((String) config.get("DisplayName11"));
				Info11.setItemMeta(metaInfo11);

				info.setItem(1, Info1);
				info.setItem(4, Info2);
				info.setItem(7, Info3);
				info.setItem(19, Info4);
				info.setItem(22, Info5);
				info.setItem(25, Info6);
				info.setItem(37, Info7);
				info.setItem(40, Info8);
				info.setItem(43, Info9);
				info.setItem(46, Info10);
				info.setItem(52, Info11);

				player.getPlayer().openInventory(info);

			}
		}

		if (event.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName3"))) {
			event.setCancelled(true);

			if (event.getCurrentItem().getType() == Material.SKELETON_SKULL) {
				Inventory info = player.getPlayer().getServer().createInventory(null, 9 * 6, "ßeßl‹bersicht");

				ItemStack Info1 = new ItemStack(Material.NETHER_STAR);
				ItemMeta metaInfo1 = Info1.getItemMeta();
				metaInfo1.setDisplayName((String) config.get("DisplayName1"));
				Info1.setItemMeta(metaInfo1);

				ItemStack Info2 = new ItemStack(Material.ENDER_CHEST);
				ItemMeta metaInfo2 = Info2.getItemMeta();
				metaInfo2.setDisplayName((String) config.get("DisplayName2"));
				Info2.setItemMeta(metaInfo2);

				ItemStack Info3 = new ItemStack(Material.END_CRYSTAL);
				ItemMeta metaInfo3 = Info3.getItemMeta();
				metaInfo3.setDisplayName((String) config.get("DisplayName3"));
				Info3.setItemMeta(metaInfo3);

				ItemStack Info4 = new ItemStack(Material.DRAGON_EGG);
				ItemMeta metaInfo4 = Info4.getItemMeta();
				metaInfo4.setDisplayName((String) config.get("DisplayName4"));
				Info4.setItemMeta(metaInfo4);

				ItemStack Info5 = new ItemStack(Material.DRAGON_BREATH);
				ItemMeta metaInfo5 = Info5.getItemMeta();
				metaInfo5.setDisplayName((String) config.get("DisplayName5"));
				Info5.setItemMeta(metaInfo5);

				ItemStack Info6 = new ItemStack(Material.END_PORTAL_FRAME);
				ItemMeta metaInfo6 = Info6.getItemMeta();
				metaInfo6.setDisplayName((String) config.get("DisplayName6"));
				Info6.setItemMeta(metaInfo6);

				ItemStack Info7 = new ItemStack(Material.ENDER_PEARL);
				ItemMeta metaInfo7 = Info7.getItemMeta();
				metaInfo7.setDisplayName((String) config.get("DisplayName7"));
				Info7.setItemMeta(metaInfo7);

				ItemStack Info8 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
				ItemMeta metaInfo8 = Info8.getItemMeta();
				metaInfo8.setDisplayName((String) config.get("DisplayName8"));
				Info8.setItemMeta(metaInfo8);

				ItemStack Info9 = new ItemStack(Material.CHORUS_FRUIT);
				ItemMeta metaInfo9 = Info9.getItemMeta();
				metaInfo9.setDisplayName((String) config.get("DisplayName9"));
				Info9.setItemMeta(metaInfo9);

				ItemStack Info10 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaInfo10 = Info10.getItemMeta();
				metaInfo10.setDisplayName((String) config.get("DisplayName10"));
				Info10.setItemMeta(metaInfo10);

				ItemStack Info11 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaInfo11 = Info11.getItemMeta();
				metaInfo11.setDisplayName((String) config.get("DisplayName11"));
				Info11.setItemMeta(metaInfo11);

				info.setItem(1, Info1);
				info.setItem(4, Info2);
				info.setItem(7, Info3);
				info.setItem(19, Info4);
				info.setItem(22, Info5);
				info.setItem(25, Info6);
				info.setItem(37, Info7);
				info.setItem(40, Info8);
				info.setItem(43, Info9);
				info.setItem(46, Info10);
				info.setItem(52, Info11);

				player.getPlayer().openInventory(info);

			}
		}

		if (event.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName4"))) {
			event.setCancelled(true);

			if (event.getCurrentItem().getType() == Material.SKELETON_SKULL) {
				Inventory info = player.getPlayer().getServer().createInventory(null, 9 * 6, "ßeßl‹bersicht");

				ItemStack Info1 = new ItemStack(Material.NETHER_STAR);
				ItemMeta metaInfo1 = Info1.getItemMeta();
				metaInfo1.setDisplayName((String) config.get("DisplayName1"));
				Info1.setItemMeta(metaInfo1);

				ItemStack Info2 = new ItemStack(Material.ENDER_CHEST);
				ItemMeta metaInfo2 = Info2.getItemMeta();
				metaInfo2.setDisplayName((String) config.get("DisplayName2"));
				Info2.setItemMeta(metaInfo2);

				ItemStack Info3 = new ItemStack(Material.END_CRYSTAL);
				ItemMeta metaInfo3 = Info3.getItemMeta();
				metaInfo3.setDisplayName((String) config.get("DisplayName3"));
				Info3.setItemMeta(metaInfo3);

				ItemStack Info4 = new ItemStack(Material.DRAGON_EGG);
				ItemMeta metaInfo4 = Info4.getItemMeta();
				metaInfo4.setDisplayName((String) config.get("DisplayName4"));
				Info4.setItemMeta(metaInfo4);

				ItemStack Info5 = new ItemStack(Material.DRAGON_BREATH);
				ItemMeta metaInfo5 = Info5.getItemMeta();
				metaInfo5.setDisplayName((String) config.get("DisplayName5"));
				Info5.setItemMeta(metaInfo5);

				ItemStack Info6 = new ItemStack(Material.END_PORTAL_FRAME);
				ItemMeta metaInfo6 = Info6.getItemMeta();
				metaInfo6.setDisplayName((String) config.get("DisplayName6"));
				Info6.setItemMeta(metaInfo6);

				ItemStack Info7 = new ItemStack(Material.ENDER_PEARL);
				ItemMeta metaInfo7 = Info7.getItemMeta();
				metaInfo7.setDisplayName((String) config.get("DisplayName7"));
				Info7.setItemMeta(metaInfo7);

				ItemStack Info8 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
				ItemMeta metaInfo8 = Info8.getItemMeta();
				metaInfo8.setDisplayName((String) config.get("DisplayName8"));
				Info8.setItemMeta(metaInfo8);

				ItemStack Info9 = new ItemStack(Material.CHORUS_FRUIT);
				ItemMeta metaInfo9 = Info9.getItemMeta();
				metaInfo9.setDisplayName((String) config.get("DisplayName9"));
				Info9.setItemMeta(metaInfo9);

				ItemStack Info10 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaInfo10 = Info10.getItemMeta();
				metaInfo10.setDisplayName((String) config.get("DisplayName10"));
				Info10.setItemMeta(metaInfo10);

				ItemStack Info11 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaInfo11 = Info11.getItemMeta();
				metaInfo11.setDisplayName((String) config.get("DisplayName11"));
				Info11.setItemMeta(metaInfo11);

				info.setItem(1, Info1);
				info.setItem(4, Info2);
				info.setItem(7, Info3);
				info.setItem(19, Info4);
				info.setItem(22, Info5);
				info.setItem(25, Info6);
				info.setItem(37, Info7);
				info.setItem(40, Info8);
				info.setItem(43, Info9);
				info.setItem(46, Info10);
				info.setItem(52, Info11);

				player.getPlayer().openInventory(info);

			}
		}

		if (event.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName5"))) {
			event.setCancelled(true);

			if (event.getCurrentItem().getType() == Material.SKELETON_SKULL) {
				Inventory info = player.getPlayer().getServer().createInventory(null, 9 * 6, "ßeßl‹bersicht");

				ItemStack Info1 = new ItemStack(Material.NETHER_STAR);
				ItemMeta metaInfo1 = Info1.getItemMeta();
				metaInfo1.setDisplayName((String) config.get("DisplayName1"));
				Info1.setItemMeta(metaInfo1);

				ItemStack Info2 = new ItemStack(Material.ENDER_CHEST);
				ItemMeta metaInfo2 = Info2.getItemMeta();
				metaInfo2.setDisplayName((String) config.get("DisplayName2"));
				Info2.setItemMeta(metaInfo2);

				ItemStack Info3 = new ItemStack(Material.END_CRYSTAL);
				ItemMeta metaInfo3 = Info3.getItemMeta();
				metaInfo3.setDisplayName((String) config.get("DisplayName3"));
				Info3.setItemMeta(metaInfo3);

				ItemStack Info4 = new ItemStack(Material.DRAGON_EGG);
				ItemMeta metaInfo4 = Info4.getItemMeta();
				metaInfo4.setDisplayName((String) config.get("DisplayName4"));
				Info4.setItemMeta(metaInfo4);

				ItemStack Info5 = new ItemStack(Material.DRAGON_BREATH);
				ItemMeta metaInfo5 = Info5.getItemMeta();
				metaInfo5.setDisplayName((String) config.get("DisplayName5"));
				Info5.setItemMeta(metaInfo5);

				ItemStack Info6 = new ItemStack(Material.END_PORTAL_FRAME);
				ItemMeta metaInfo6 = Info6.getItemMeta();
				metaInfo6.setDisplayName((String) config.get("DisplayName6"));
				Info6.setItemMeta(metaInfo6);

				ItemStack Info7 = new ItemStack(Material.ENDER_PEARL);
				ItemMeta metaInfo7 = Info7.getItemMeta();
				metaInfo7.setDisplayName((String) config.get("DisplayName7"));
				Info7.setItemMeta(metaInfo7);

				ItemStack Info8 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
				ItemMeta metaInfo8 = Info8.getItemMeta();
				metaInfo8.setDisplayName((String) config.get("DisplayName8"));
				Info8.setItemMeta(metaInfo8);

				ItemStack Info9 = new ItemStack(Material.CHORUS_FRUIT);
				ItemMeta metaInfo9 = Info9.getItemMeta();
				metaInfo9.setDisplayName((String) config.get("DisplayName9"));
				Info9.setItemMeta(metaInfo9);

				ItemStack Info10 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaInfo10 = Info10.getItemMeta();
				metaInfo10.setDisplayName((String) config.get("DisplayName10"));
				Info10.setItemMeta(metaInfo10);

				ItemStack Info11 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaInfo11 = Info11.getItemMeta();
				metaInfo11.setDisplayName((String) config.get("DisplayName11"));
				Info11.setItemMeta(metaInfo11);

				info.setItem(1, Info1);
				info.setItem(4, Info2);
				info.setItem(7, Info3);
				info.setItem(19, Info4);
				info.setItem(22, Info5);
				info.setItem(25, Info6);
				info.setItem(37, Info7);
				info.setItem(40, Info8);
				info.setItem(43, Info9);
				info.setItem(46, Info10);
				info.setItem(52, Info11);

				player.getPlayer().openInventory(info);

			}
		}

		if (event.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName6"))) {
			event.setCancelled(true);

			if (event.getCurrentItem().getType() == Material.SKELETON_SKULL) {
				Inventory info = player.getPlayer().getServer().createInventory(null, 9 * 6, "ßeßl‹bersicht");

				ItemStack Info1 = new ItemStack(Material.NETHER_STAR);
				ItemMeta metaInfo1 = Info1.getItemMeta();
				metaInfo1.setDisplayName((String) config.get("DisplayName1"));
				Info1.setItemMeta(metaInfo1);

				ItemStack Info2 = new ItemStack(Material.ENDER_CHEST);
				ItemMeta metaInfo2 = Info2.getItemMeta();
				metaInfo2.setDisplayName((String) config.get("DisplayName2"));
				Info2.setItemMeta(metaInfo2);

				ItemStack Info3 = new ItemStack(Material.END_CRYSTAL);
				ItemMeta metaInfo3 = Info3.getItemMeta();
				metaInfo3.setDisplayName((String) config.get("DisplayName3"));
				Info3.setItemMeta(metaInfo3);

				ItemStack Info4 = new ItemStack(Material.DRAGON_EGG);
				ItemMeta metaInfo4 = Info4.getItemMeta();
				metaInfo4.setDisplayName((String) config.get("DisplayName4"));
				Info4.setItemMeta(metaInfo4);

				ItemStack Info5 = new ItemStack(Material.DRAGON_BREATH);
				ItemMeta metaInfo5 = Info5.getItemMeta();
				metaInfo5.setDisplayName((String) config.get("DisplayName5"));
				Info5.setItemMeta(metaInfo5);

				ItemStack Info6 = new ItemStack(Material.END_PORTAL_FRAME);
				ItemMeta metaInfo6 = Info6.getItemMeta();
				metaInfo6.setDisplayName((String) config.get("DisplayName6"));
				Info6.setItemMeta(metaInfo6);

				ItemStack Info7 = new ItemStack(Material.ENDER_PEARL);
				ItemMeta metaInfo7 = Info7.getItemMeta();
				metaInfo7.setDisplayName((String) config.get("DisplayName7"));
				Info7.setItemMeta(metaInfo7);

				ItemStack Info8 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
				ItemMeta metaInfo8 = Info8.getItemMeta();
				metaInfo8.setDisplayName((String) config.get("DisplayName8"));
				Info8.setItemMeta(metaInfo8);

				ItemStack Info9 = new ItemStack(Material.CHORUS_FRUIT);
				ItemMeta metaInfo9 = Info9.getItemMeta();
				metaInfo9.setDisplayName((String) config.get("DisplayName9"));
				Info9.setItemMeta(metaInfo9);

				ItemStack Info10 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaInfo10 = Info10.getItemMeta();
				metaInfo10.setDisplayName((String) config.get("DisplayName10"));
				Info10.setItemMeta(metaInfo10);

				ItemStack Info11 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaInfo11 = Info11.getItemMeta();
				metaInfo11.setDisplayName((String) config.get("DisplayName11"));
				Info11.setItemMeta(metaInfo11);

				info.setItem(1, Info1);
				info.setItem(4, Info2);
				info.setItem(7, Info3);
				info.setItem(19, Info4);
				info.setItem(22, Info5);
				info.setItem(25, Info6);
				info.setItem(37, Info7);
				info.setItem(40, Info8);
				info.setItem(43, Info9);
				info.setItem(46, Info10);
				info.setItem(52, Info11);

				player.getPlayer().openInventory(info);

			}
		}

		if (event.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName7"))) {
			event.setCancelled(true);

			if (event.getCurrentItem().getType() == Material.SKELETON_SKULL) {
				Inventory info = player.getPlayer().getServer().createInventory(null, 9 * 6, "ßeßl‹bersicht");

				ItemStack Info1 = new ItemStack(Material.NETHER_STAR);
				ItemMeta metaInfo1 = Info1.getItemMeta();
				metaInfo1.setDisplayName((String) config.get("DisplayName1"));
				Info1.setItemMeta(metaInfo1);

				ItemStack Info2 = new ItemStack(Material.ENDER_CHEST);
				ItemMeta metaInfo2 = Info2.getItemMeta();
				metaInfo2.setDisplayName((String) config.get("DisplayName2"));
				Info2.setItemMeta(metaInfo2);

				ItemStack Info3 = new ItemStack(Material.END_CRYSTAL);
				ItemMeta metaInfo3 = Info3.getItemMeta();
				metaInfo3.setDisplayName((String) config.get("DisplayName3"));
				Info3.setItemMeta(metaInfo3);

				ItemStack Info4 = new ItemStack(Material.DRAGON_EGG);
				ItemMeta metaInfo4 = Info4.getItemMeta();
				metaInfo4.setDisplayName((String) config.get("DisplayName4"));
				Info4.setItemMeta(metaInfo4);

				ItemStack Info5 = new ItemStack(Material.DRAGON_BREATH);
				ItemMeta metaInfo5 = Info5.getItemMeta();
				metaInfo5.setDisplayName((String) config.get("DisplayName5"));
				Info5.setItemMeta(metaInfo5);

				ItemStack Info6 = new ItemStack(Material.END_PORTAL_FRAME);
				ItemMeta metaInfo6 = Info6.getItemMeta();
				metaInfo6.setDisplayName((String) config.get("DisplayName6"));
				Info6.setItemMeta(metaInfo6);

				ItemStack Info7 = new ItemStack(Material.ENDER_PEARL);
				ItemMeta metaInfo7 = Info7.getItemMeta();
				metaInfo7.setDisplayName((String) config.get("DisplayName7"));
				Info7.setItemMeta(metaInfo7);

				ItemStack Info8 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
				ItemMeta metaInfo8 = Info8.getItemMeta();
				metaInfo8.setDisplayName((String) config.get("DisplayName8"));
				Info8.setItemMeta(metaInfo8);

				ItemStack Info9 = new ItemStack(Material.CHORUS_FRUIT);
				ItemMeta metaInfo9 = Info9.getItemMeta();
				metaInfo9.setDisplayName((String) config.get("DisplayName9"));
				Info9.setItemMeta(metaInfo9);

				ItemStack Info10 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaInfo10 = Info10.getItemMeta();
				metaInfo10.setDisplayName((String) config.get("DisplayName10"));
				Info10.setItemMeta(metaInfo10);

				ItemStack Info11 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaInfo11 = Info11.getItemMeta();
				metaInfo11.setDisplayName((String) config.get("DisplayName11"));
				Info11.setItemMeta(metaInfo11);

				info.setItem(1, Info1);
				info.setItem(4, Info2);
				info.setItem(7, Info3);
				info.setItem(19, Info4);
				info.setItem(22, Info5);
				info.setItem(25, Info6);
				info.setItem(37, Info7);
				info.setItem(40, Info8);
				info.setItem(43, Info9);
				info.setItem(46, Info10);
				info.setItem(52, Info11);

				player.getPlayer().openInventory(info);

			}
		}

		if (event.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName8"))) {
			event.setCancelled(true);

			if (event.getCurrentItem().getType() == Material.SKELETON_SKULL) {
				Inventory info = player.getPlayer().getServer().createInventory(null, 9 * 6, "ßeßl‹bersicht");

				ItemStack Info1 = new ItemStack(Material.NETHER_STAR);
				ItemMeta metaInfo1 = Info1.getItemMeta();
				metaInfo1.setDisplayName((String) config.get("DisplayName1"));
				Info1.setItemMeta(metaInfo1);

				ItemStack Info2 = new ItemStack(Material.ENDER_CHEST);
				ItemMeta metaInfo2 = Info2.getItemMeta();
				metaInfo2.setDisplayName((String) config.get("DisplayName2"));
				Info2.setItemMeta(metaInfo2);

				ItemStack Info3 = new ItemStack(Material.END_CRYSTAL);
				ItemMeta metaInfo3 = Info3.getItemMeta();
				metaInfo3.setDisplayName((String) config.get("DisplayName3"));
				Info3.setItemMeta(metaInfo3);

				ItemStack Info4 = new ItemStack(Material.DRAGON_EGG);
				ItemMeta metaInfo4 = Info4.getItemMeta();
				metaInfo4.setDisplayName((String) config.get("DisplayName4"));
				Info4.setItemMeta(metaInfo4);

				ItemStack Info5 = new ItemStack(Material.DRAGON_BREATH);
				ItemMeta metaInfo5 = Info5.getItemMeta();
				metaInfo5.setDisplayName((String) config.get("DisplayName5"));
				Info5.setItemMeta(metaInfo5);

				ItemStack Info6 = new ItemStack(Material.END_PORTAL_FRAME);
				ItemMeta metaInfo6 = Info6.getItemMeta();
				metaInfo6.setDisplayName((String) config.get("DisplayName6"));
				Info6.setItemMeta(metaInfo6);

				ItemStack Info7 = new ItemStack(Material.ENDER_PEARL);
				ItemMeta metaInfo7 = Info7.getItemMeta();
				metaInfo7.setDisplayName((String) config.get("DisplayName7"));
				Info7.setItemMeta(metaInfo7);

				ItemStack Info8 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
				ItemMeta metaInfo8 = Info8.getItemMeta();
				metaInfo8.setDisplayName((String) config.get("DisplayName8"));
				Info8.setItemMeta(metaInfo8);

				ItemStack Info9 = new ItemStack(Material.CHORUS_FRUIT);
				ItemMeta metaInfo9 = Info9.getItemMeta();
				metaInfo9.setDisplayName((String) config.get("DisplayName9"));
				Info9.setItemMeta(metaInfo9);

				ItemStack Info10 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaInfo10 = Info10.getItemMeta();
				metaInfo10.setDisplayName((String) config.get("DisplayName10"));
				Info10.setItemMeta(metaInfo10);

				ItemStack Info11 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaInfo11 = Info11.getItemMeta();
				metaInfo11.setDisplayName((String) config.get("DisplayName11"));
				Info11.setItemMeta(metaInfo11);

				info.setItem(1, Info1);
				info.setItem(4, Info2);
				info.setItem(7, Info3);
				info.setItem(19, Info4);
				info.setItem(22, Info5);
				info.setItem(25, Info6);
				info.setItem(37, Info7);
				info.setItem(40, Info8);
				info.setItem(43, Info9);
				info.setItem(46, Info10);
				info.setItem(52, Info11);

				player.getPlayer().openInventory(info);

			}
		}

		if (event.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName9"))) {
			event.setCancelled(true);

			if (event.getCurrentItem().getType() == Material.SKELETON_SKULL) {
				Inventory info = player.getPlayer().getServer().createInventory(null, 9 * 6, "ßeßl‹bersicht");

				ItemStack Info1 = new ItemStack(Material.NETHER_STAR);
				ItemMeta metaInfo1 = Info1.getItemMeta();
				metaInfo1.setDisplayName((String) config.get("DisplayName1"));
				Info1.setItemMeta(metaInfo1);

				ItemStack Info2 = new ItemStack(Material.ENDER_CHEST);
				ItemMeta metaInfo2 = Info2.getItemMeta();
				metaInfo2.setDisplayName((String) config.get("DisplayName2"));
				Info2.setItemMeta(metaInfo2);

				ItemStack Info3 = new ItemStack(Material.END_CRYSTAL);
				ItemMeta metaInfo3 = Info3.getItemMeta();
				metaInfo3.setDisplayName((String) config.get("DisplayName3"));
				Info3.setItemMeta(metaInfo3);

				ItemStack Info4 = new ItemStack(Material.DRAGON_EGG);
				ItemMeta metaInfo4 = Info4.getItemMeta();
				metaInfo4.setDisplayName((String) config.get("DisplayName4"));
				Info4.setItemMeta(metaInfo4);

				ItemStack Info5 = new ItemStack(Material.DRAGON_BREATH);
				ItemMeta metaInfo5 = Info5.getItemMeta();
				metaInfo5.setDisplayName((String) config.get("DisplayName5"));
				Info5.setItemMeta(metaInfo5);

				ItemStack Info6 = new ItemStack(Material.END_PORTAL_FRAME);
				ItemMeta metaInfo6 = Info6.getItemMeta();
				metaInfo6.setDisplayName((String) config.get("DisplayName6"));
				Info6.setItemMeta(metaInfo6);

				ItemStack Info7 = new ItemStack(Material.ENDER_PEARL);
				ItemMeta metaInfo7 = Info7.getItemMeta();
				metaInfo7.setDisplayName((String) config.get("DisplayName7"));
				Info7.setItemMeta(metaInfo7);

				ItemStack Info8 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
				ItemMeta metaInfo8 = Info8.getItemMeta();
				metaInfo8.setDisplayName((String) config.get("DisplayName8"));
				Info8.setItemMeta(metaInfo8);

				ItemStack Info9 = new ItemStack(Material.CHORUS_FRUIT);
				ItemMeta metaInfo9 = Info9.getItemMeta();
				metaInfo9.setDisplayName((String) config.get("DisplayName9"));
				Info9.setItemMeta(metaInfo9);

				ItemStack Info10 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaInfo10 = Info10.getItemMeta();
				metaInfo10.setDisplayName((String) config.get("DisplayName10"));
				Info10.setItemMeta(metaInfo10);

				ItemStack Info11 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaInfo11 = Info11.getItemMeta();
				metaInfo11.setDisplayName((String) config.get("DisplayName11"));
				Info11.setItemMeta(metaInfo11);

				info.setItem(1, Info1);
				info.setItem(4, Info2);
				info.setItem(7, Info3);
				info.setItem(19, Info4);
				info.setItem(22, Info5);
				info.setItem(25, Info6);
				info.setItem(37, Info7);
				info.setItem(40, Info8);
				info.setItem(43, Info9);
				info.setItem(46, Info10);
				info.setItem(52, Info11);

				player.getPlayer().openInventory(info);

			}
		}

		if (event.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName9"))) {
			event.setCancelled(true);

			if (event.getCurrentItem().getType() == Material.SKELETON_SKULL) {
				Inventory info = player.getPlayer().getServer().createInventory(null, 9 * 6, "ßeßl‹bersicht");

				ItemStack Info1 = new ItemStack(Material.NETHER_STAR);
				ItemMeta metaInfo1 = Info1.getItemMeta();
				metaInfo1.setDisplayName((String) config.get("DisplayName1"));
				Info1.setItemMeta(metaInfo1);

				ItemStack Info2 = new ItemStack(Material.ENDER_CHEST);
				ItemMeta metaInfo2 = Info2.getItemMeta();
				metaInfo2.setDisplayName((String) config.get("DisplayName2"));
				Info2.setItemMeta(metaInfo2);

				ItemStack Info3 = new ItemStack(Material.END_CRYSTAL);
				ItemMeta metaInfo3 = Info3.getItemMeta();
				metaInfo3.setDisplayName((String) config.get("DisplayName3"));
				Info3.setItemMeta(metaInfo3);

				ItemStack Info4 = new ItemStack(Material.DRAGON_EGG);
				ItemMeta metaInfo4 = Info4.getItemMeta();
				metaInfo4.setDisplayName((String) config.get("DisplayName4"));
				Info4.setItemMeta(metaInfo4);

				ItemStack Info5 = new ItemStack(Material.DRAGON_BREATH);
				ItemMeta metaInfo5 = Info5.getItemMeta();
				metaInfo5.setDisplayName((String) config.get("DisplayName5"));
				Info5.setItemMeta(metaInfo5);

				ItemStack Info6 = new ItemStack(Material.END_PORTAL_FRAME);
				ItemMeta metaInfo6 = Info6.getItemMeta();
				metaInfo6.setDisplayName((String) config.get("DisplayName6"));
				Info6.setItemMeta(metaInfo6);

				ItemStack Info7 = new ItemStack(Material.ENDER_PEARL);
				ItemMeta metaInfo7 = Info7.getItemMeta();
				metaInfo7.setDisplayName((String) config.get("DisplayName7"));
				Info7.setItemMeta(metaInfo7);

				ItemStack Info8 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
				ItemMeta metaInfo8 = Info8.getItemMeta();
				metaInfo8.setDisplayName((String) config.get("DisplayName8"));
				Info8.setItemMeta(metaInfo8);

				ItemStack Info9 = new ItemStack(Material.CHORUS_FRUIT);
				ItemMeta metaInfo9 = Info9.getItemMeta();
				metaInfo9.setDisplayName((String) config.get("DisplayName9"));
				Info9.setItemMeta(metaInfo9);

				ItemStack Info10 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaInfo10 = Info10.getItemMeta();
				metaInfo10.setDisplayName((String) config.get("DisplayName10"));
				Info10.setItemMeta(metaInfo10);

				ItemStack Info11 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaInfo11 = Info11.getItemMeta();
				metaInfo11.setDisplayName((String) config.get("DisplayName11"));
				Info11.setItemMeta(metaInfo11);

				info.setItem(1, Info1);
				info.setItem(4, Info2);
				info.setItem(7, Info3);
				info.setItem(19, Info4);
				info.setItem(22, Info5);
				info.setItem(25, Info6);
				info.setItem(37, Info7);
				info.setItem(40, Info8);
				info.setItem(43, Info9);
				info.setItem(46, Info10);
				info.setItem(52, Info11);

				player.getPlayer().openInventory(info);

			}
		}

		if (event.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName10"))) {
			event.setCancelled(true);

			if (event.getCurrentItem().getType() == Material.SKELETON_SKULL) {
				Inventory info = player.getPlayer().getServer().createInventory(null, 9 * 6, "ßeßl‹bersicht");

				ItemStack Info1 = new ItemStack(Material.NETHER_STAR);
				ItemMeta metaInfo1 = Info1.getItemMeta();
				metaInfo1.setDisplayName((String) config.get("DisplayName1"));
				Info1.setItemMeta(metaInfo1);

				ItemStack Info2 = new ItemStack(Material.ENDER_CHEST);
				ItemMeta metaInfo2 = Info2.getItemMeta();
				metaInfo2.setDisplayName((String) config.get("DisplayName2"));
				Info2.setItemMeta(metaInfo2);

				ItemStack Info3 = new ItemStack(Material.END_CRYSTAL);
				ItemMeta metaInfo3 = Info3.getItemMeta();
				metaInfo3.setDisplayName((String) config.get("DisplayName3"));
				Info3.setItemMeta(metaInfo3);

				ItemStack Info4 = new ItemStack(Material.DRAGON_EGG);
				ItemMeta metaInfo4 = Info4.getItemMeta();
				metaInfo4.setDisplayName((String) config.get("DisplayName4"));
				Info4.setItemMeta(metaInfo4);

				ItemStack Info5 = new ItemStack(Material.DRAGON_BREATH);
				ItemMeta metaInfo5 = Info5.getItemMeta();
				metaInfo5.setDisplayName((String) config.get("DisplayName5"));
				Info5.setItemMeta(metaInfo5);

				ItemStack Info6 = new ItemStack(Material.END_PORTAL_FRAME);
				ItemMeta metaInfo6 = Info6.getItemMeta();
				metaInfo6.setDisplayName((String) config.get("DisplayName6"));
				Info6.setItemMeta(metaInfo6);

				ItemStack Info7 = new ItemStack(Material.ENDER_PEARL);
				ItemMeta metaInfo7 = Info7.getItemMeta();
				metaInfo7.setDisplayName((String) config.get("DisplayName7"));
				Info7.setItemMeta(metaInfo7);

				ItemStack Info8 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
				ItemMeta metaInfo8 = Info8.getItemMeta();
				metaInfo8.setDisplayName((String) config.get("DisplayName8"));
				Info8.setItemMeta(metaInfo8);

				ItemStack Info9 = new ItemStack(Material.CHORUS_FRUIT);
				ItemMeta metaInfo9 = Info9.getItemMeta();
				metaInfo9.setDisplayName((String) config.get("DisplayName9"));
				Info9.setItemMeta(metaInfo9);

				ItemStack Info10 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaInfo10 = Info10.getItemMeta();
				metaInfo10.setDisplayName((String) config.get("DisplayName10"));
				Info10.setItemMeta(metaInfo10);

				ItemStack Info11 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaInfo11 = Info11.getItemMeta();
				metaInfo11.setDisplayName((String) config.get("DisplayName11"));
				Info11.setItemMeta(metaInfo11);

				info.setItem(1, Info1);
				info.setItem(4, Info2);
				info.setItem(7, Info3);
				info.setItem(19, Info4);
				info.setItem(22, Info5);
				info.setItem(25, Info6);
				info.setItem(37, Info7);
				info.setItem(40, Info8);
				info.setItem(43, Info9);
				info.setItem(46, Info10);
				info.setItem(52, Info11);

				player.getPlayer().openInventory(info);

			}
		}

		if (event.getView().getTitle().equalsIgnoreCase((String) config.get("DisplayName11"))) {
			event.setCancelled(true);

			if (event.getCurrentItem().getType() == Material.SKELETON_SKULL) {
				Inventory info = player.getPlayer().getServer().createInventory(null, 9 * 6, "ßeßl‹bersicht");

				ItemStack Info1 = new ItemStack(Material.NETHER_STAR);
				ItemMeta metaInfo1 = Info1.getItemMeta();
				metaInfo1.setDisplayName((String) config.get("DisplayName1"));
				Info1.setItemMeta(metaInfo1);

				ItemStack Info2 = new ItemStack(Material.ENDER_CHEST);
				ItemMeta metaInfo2 = Info2.getItemMeta();
				metaInfo2.setDisplayName((String) config.get("DisplayName2"));
				Info2.setItemMeta(metaInfo2);

				ItemStack Info3 = new ItemStack(Material.END_CRYSTAL);
				ItemMeta metaInfo3 = Info3.getItemMeta();
				metaInfo3.setDisplayName((String) config.get("DisplayName3"));
				Info3.setItemMeta(metaInfo3);

				ItemStack Info4 = new ItemStack(Material.DRAGON_EGG);
				ItemMeta metaInfo4 = Info4.getItemMeta();
				metaInfo4.setDisplayName((String) config.get("DisplayName4"));
				Info4.setItemMeta(metaInfo4);

				ItemStack Info5 = new ItemStack(Material.DRAGON_BREATH);
				ItemMeta metaInfo5 = Info5.getItemMeta();
				metaInfo5.setDisplayName((String) config.get("DisplayName5"));
				Info5.setItemMeta(metaInfo5);

				ItemStack Info6 = new ItemStack(Material.END_PORTAL_FRAME);
				ItemMeta metaInfo6 = Info6.getItemMeta();
				metaInfo6.setDisplayName((String) config.get("DisplayName6"));
				Info6.setItemMeta(metaInfo6);

				ItemStack Info7 = new ItemStack(Material.ENDER_PEARL);
				ItemMeta metaInfo7 = Info7.getItemMeta();
				metaInfo7.setDisplayName((String) config.get("DisplayName7"));
				Info7.setItemMeta(metaInfo7);

				ItemStack Info8 = new ItemStack(Material.POPPED_CHORUS_FRUIT);
				ItemMeta metaInfo8 = Info8.getItemMeta();
				metaInfo8.setDisplayName((String) config.get("DisplayName8"));
				Info8.setItemMeta(metaInfo8);

				ItemStack Info9 = new ItemStack(Material.CHORUS_FRUIT);
				ItemMeta metaInfo9 = Info9.getItemMeta();
				metaInfo9.setDisplayName((String) config.get("DisplayName9"));
				Info9.setItemMeta(metaInfo9);

				ItemStack Info10 = new ItemStack(Material.ENDER_EYE);
				ItemMeta metaInfo10 = Info10.getItemMeta();
				metaInfo10.setDisplayName((String) config.get("DisplayName10"));
				Info10.setItemMeta(metaInfo10);

				ItemStack Info11 = new ItemStack(Material.DIAMOND_BLOCK);
				ItemMeta metaInfo11 = Info11.getItemMeta();
				metaInfo11.setDisplayName((String) config.get("DisplayName11"));
				Info11.setItemMeta(metaInfo11);

				info.setItem(1, Info1);
				info.setItem(4, Info2);
				info.setItem(7, Info3);
				info.setItem(19, Info4);
				info.setItem(22, Info5);
				info.setItem(25, Info6);
				info.setItem(37, Info7);
				info.setItem(40, Info8);
				info.setItem(43, Info9);
				info.setItem(46, Info10);
				info.setItem(52, Info11);

				player.getPlayer().openInventory(info);

			}
		}

	}

	@EventHandler
	public void ongiveBack(InventoryClickEvent e) {

		Player player = (Player) e.getWhoClicked();

		if (e.getView().getTitle().equalsIgnoreCase("ßeßlNahrung")) {
			e.setCancelled(true);

			if (e.getCurrentItem().getType() == Material.SKELETON_SKULL) {
				Inventory give = player.getPlayer().getServer().createInventory(null, 9 * 6, "ßeßlGive");

				ItemStack item = new ItemStack(Material.APPLE);
				ItemMeta metaItem = item.getItemMeta();
				metaItem.setDisplayName("ßeNahrung");
				item.setItemMeta(metaItem);

				ItemStack item1 = new ItemStack(Material.ACACIA_DOOR);
				ItemMeta metaItem1 = item1.getItemMeta();
				metaItem1.setDisplayName("ßeBaumaterial");
				item1.setItemMeta(metaItem1);

				ItemStack item2 = new ItemStack(Material.DIAMOND_SWORD);
				ItemMeta metaItem2 = item2.getItemMeta();
				metaItem2.setDisplayName("ßeWaffen");
				item2.setItemMeta(metaItem2);

				ItemStack item3 = new ItemStack(Material.DIAMOND_CHESTPLATE);
				ItemMeta metaItem3 = item3.getItemMeta();
				metaItem3.setDisplayName("ßeRßstung");
				item3.setItemMeta(metaItem3);

				ItemStack item4 = new ItemStack(Material.REDSTONE);
				ItemMeta metaItem4 = item4.getItemMeta();
				metaItem4.setDisplayName("ßeRedstone");
				item4.setItemMeta(metaItem4);

				ItemStack item5 = new ItemStack(Material.FLOWER_POT);
				ItemMeta metaItem5 = item5.getItemMeta();
				metaItem5.setDisplayName("ßeDeko");
				item5.setItemMeta(metaItem5);

				ItemStack item6 = new ItemStack(Material.SPAWNER);
				ItemMeta metaItem6 = item6.getItemMeta();
				metaItem6.setDisplayName("ßeAdminItems");
				item6.setItemMeta(metaItem6);

				give.setItem(1, item);
				give.setItem(4, item1);
				give.setItem(7, item2);
				give.setItem(19, item3);
				give.setItem(22, item4);
				give.setItem(25, item5);
				give.setItem(40, item6);

				player.getPlayer().openInventory(give);
			}

		}

	}

}
