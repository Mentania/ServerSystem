package de.tempoo50.system.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class NahrungsListener implements Listener {

	@EventHandler
	public void onNahrung(InventoryClickEvent nahrung) {
//
//		Player player = (Player) nahrung.getWhoClicked();
//
//		if (nahrung.getInventory().getName().equalsIgnoreCase("§e§lGive")) {
//			nahrung.setCancelled(true);
//
//			if (nahrung.getCurrentItem().getType() == Material.APPLE) {
//				Inventory essen = player.getPlayer().getServer().createInventory(null, 9 * 6, "§e§lNahrung");
//
//				ItemStack nahrung1 = new ItemStack(Material.APPLE);
//				ItemMeta metanahrung1 = nahrung1.getItemMeta();
//				nahrung1.setItemMeta(metanahrung1);
//
//				ItemStack nahrung2 = new ItemStack(Material.BAKED_POTATO);
//				ItemMeta metanahrung2 = nahrung2.getItemMeta();
//				nahrung2.setItemMeta(metanahrung2);
//
//				ItemStack nahrung3 = new ItemStack(Material.BEETROOT_SOUP);
//				ItemMeta metanahrung3 = nahrung3.getItemMeta();
//				nahrung3.setItemMeta(metanahrung3);
//
//				ItemStack nahrung4 = new ItemStack(Material.BREAD);
//				ItemMeta metanahrung4 = nahrung4.getItemMeta();
//				nahrung4.setItemMeta(metanahrung4);
//
//				ItemStack nahrung5 = new ItemStack(Material.CAKE);
//				ItemMeta metanahrung5 = nahrung5.getItemMeta();
//				nahrung5.setItemMeta(metanahrung5);
//
//				ItemStack nahrung6 = new ItemStack(Material.CARROT);
//				ItemMeta metanahrung6 = nahrung6.getItemMeta();
//				nahrung6.setItemMeta(metanahrung6);
//
//				ItemStack nahrung7 = new ItemStack(Material.CARROT_ON_A_STICK);
//				ItemMeta metanahrung7 = nahrung7.getItemMeta();
//				nahrung7.setItemMeta(metanahrung7);
//
//				ItemStack nahrung8 = new ItemStack(Material.COOKED_BEEF);
//				ItemMeta metanahrung8 = nahrung8.getItemMeta();
//				nahrung8.setItemMeta(metanahrung8);
//
//				ItemStack nahrung9 = new ItemStack(Material.COOKED_CHICKEN);
//				ItemMeta metanahrung9 = nahrung9.getItemMeta();
//				nahrung9.setItemMeta(metanahrung9);
//
//				ItemStack nahrung10 = new ItemStack(Material.COOKED_SALMON);
//				ItemMeta metanahrung10 = nahrung10.getItemMeta();
//				nahrung10.setItemMeta(metanahrung10);
//
//				ItemStack nahrung11 = new ItemStack(Material.COOKED_MUTTON);
//				ItemMeta metanahrung11 = nahrung11.getItemMeta();
//				nahrung11.setItemMeta(metanahrung11);
//
//				ItemStack nahrung12 = new ItemStack(Material.COOKED_RABBIT);
//				ItemMeta metanahrung12 = nahrung12.getItemMeta();
//				nahrung12.setItemMeta(metanahrung12);
//
//				ItemStack nahrung13 = new ItemStack(Material.BEETROOT_SEEDS);
//				ItemMeta metanahrung13 = nahrung13.getItemMeta();
//				nahrung13.setItemMeta(metanahrung13);
//
//				ItemStack nahrung14 = new ItemStack(Material.BEETROOT);
//				ItemMeta metanahrung14 = nahrung14.getItemMeta();
//				nahrung14.setItemMeta(metanahrung14);
//
//				ItemStack nahrung15 = new ItemStack(Material.COOKIE);
//				ItemMeta metanahrung15 = nahrung15.getItemMeta();
//				nahrung15.setItemMeta(metanahrung15);
//
//				ItemStack nahrung16 = new ItemStack(Material.EGG);
//				ItemMeta metanahrung16 = nahrung16.getItemMeta();
//				nahrung16.setItemMeta(metanahrung16);
//
//				ItemStack nahrung17 = new ItemStack(Material.GRILLED_PORK);
//				ItemMeta metanahrung17 = nahrung17.getItemMeta();
//				nahrung17.setItemMeta(metanahrung17);
//
//				ItemStack nahrung18 = new ItemStack(Material.HUGE_MUSHROOM_1);
//				ItemMeta metanahrung18 = nahrung18.getItemMeta();
//				nahrung18.setItemMeta(metanahrung18);
//
//				ItemStack nahrung19 = new ItemStack(Material.HUGE_MUSHROOM_2);
//				ItemMeta metanahrung19 = nahrung19.getItemMeta();
//				nahrung19.setItemMeta(metanahrung19);
//
//				ItemStack nahrung20 = new ItemStack(Material.MELON);
//				ItemMeta metanahrung20 = nahrung20.getItemMeta();
//				nahrung20.setItemMeta(metanahrung20);
//
//				ItemStack nahrung21 = new ItemStack(Material.MELON_BLOCK);
//				ItemMeta metanahrung21 = nahrung21.getItemMeta();
//				nahrung21.setItemMeta(metanahrung21);
//
//				ItemStack nahrung22 = new ItemStack(Material.MELON_SEEDS);
//				ItemMeta metanahrung22 = nahrung22.getItemMeta();
//				nahrung22.setItemMeta(metanahrung22);
//
//				ItemStack nahrung23 = new ItemStack(Material.MELON_STEM);
//				ItemMeta metanahrung23 = nahrung23.getItemMeta();
//				nahrung23.setItemMeta(metanahrung23);
//
//				ItemStack nahrung24 = new ItemStack(Material.SPECKLED_MELON);
//				ItemMeta metanahrung24 = nahrung20.getItemMeta();
//				nahrung24.setItemMeta(metanahrung24);
//
//				ItemStack back = new ItemStack(Material.SKULL_ITEM);
//				ItemMeta metaback = back.getItemMeta();
//				metaback.setDisplayName("§eZurück");
//				back.setItemMeta(metaback);
//
//				essen.setItem(0, nahrung1);
//				essen.setItem(1, nahrung2);
//				essen.setItem(2, nahrung3);
//				essen.setItem(3, nahrung4);
//				essen.setItem(4, nahrung5);
//				essen.setItem(5, nahrung6);
//				essen.setItem(6, nahrung7);
//				essen.setItem(7, nahrung8);
//				essen.setItem(8, nahrung9);
//				essen.setItem(9, nahrung10);
//				essen.setItem(10, nahrung11);
//				essen.setItem(11, nahrung12);
//				essen.setItem(12, nahrung13);
//				essen.setItem(13, nahrung14);
//				essen.setItem(14, nahrung15);
//				essen.setItem(15, nahrung16);
//				essen.setItem(16, nahrung17);
//				essen.setItem(17, nahrung18);
//				essen.setItem(18, nahrung19);
//				essen.setItem(19, nahrung20);
//				essen.setItem(20, nahrung21);
//				essen.setItem(21, nahrung22);
//				essen.setItem(22, nahrung23);
//				essen.setItem(23, nahrung24);
//				essen.setItem(53, back);
//
//				player.getPlayer().openInventory(essen);
//
//			}
//
//		}
//
	}
//
}
