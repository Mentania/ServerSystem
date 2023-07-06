package de.tempoo50.system.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import de.tempoo50.system.data.ErschaffeStartKit;

public class StartKitListener implements Listener {

	@EventHandler
	public void StartKit(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();

		ItemStack foot = new ItemStack(Material.COOKED_BEEF, 64);
		ItemStack stone = new ItemStack(Material.STONE, 64);
		ItemStack wood = new ItemStack(Material.OAK_WOOD, 64);
		ItemStack wool = new ItemStack(Material.WHITE_WOOL, 64);
		ItemStack chest = new ItemStack(Material.CHEST, 12);
		ItemStack water = new ItemStack(Material.WATER_BUCKET, 1);
		ItemStack lava = new ItemStack(Material.LAVA_BUCKET, 1);
		ItemStack glass = new ItemStack(Material.GLASS, 64);
		ItemStack sand = new ItemStack(Material.SAND, 32);

		if(event.getView().getTitle().equalsIgnoreCase("§e§lStarterKits")) {
			event.setCancelled(true);

			if (event.getCurrentItem().getType() == Material.IRON_PICKAXE) {
				player.getInventory().addItem(new ItemStack(Material.IRON_AXE));
				player.getInventory().addItem(new ItemStack(Material.IRON_PICKAXE));
				player.getInventory().addItem(new ItemStack(Material.IRON_SHOVEL));
				player.getInventory().addItem(new ItemStack(Material.IRON_HOE));
				player.getInventory().addItem(new ItemStack(Material.LEATHER_BOOTS));
				player.getInventory().addItem(new ItemStack(Material.LEATHER_CHESTPLATE));
				player.getInventory().addItem(new ItemStack(Material.LEATHER_HELMET));
				player.getInventory().addItem(new ItemStack(Material.LEATHER_LEGGINGS));
				player.getInventory().addItem(foot);

				event.getView().close();
				ErschaffeStartKit.setWatingTime(player);

			} else if (event.getCurrentItem().getType() == Material.IRON_SWORD) {
				player.getInventory().addItem(new ItemStack(Material.WOODEN_AXE));
				player.getInventory().addItem(new ItemStack(Material.WOODEN_PICKAXE));
				player.getInventory().addItem(new ItemStack(Material.WOODEN_SHOVEL));
				player.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
				player.getInventory().addItem(new ItemStack(Material.IRON_BOOTS));
				player.getInventory().addItem(new ItemStack(Material.IRON_CHESTPLATE));
				player.getInventory().addItem(new ItemStack(Material.IRON_HELMET));
				player.getInventory().addItem(new ItemStack(Material.IRON_LEGGINGS));
				player.getInventory().addItem(foot);

				event.getView().close();
				ErschaffeStartKit.setWatingTime(player);

			} else if (event.getCurrentItem().getType() == Material.STONE) {
				player.getInventory().addItem(new ItemStack(stone));
				player.getInventory().addItem(new ItemStack(wood));
				player.getInventory().addItem(new ItemStack(wool));
				player.getInventory().addItem(new ItemStack(chest));
				player.getInventory().addItem(new ItemStack(water));
				player.getInventory().addItem(new ItemStack(lava));
				player.getInventory().addItem(new ItemStack(glass));
				player.getInventory().addItem(new ItemStack(sand));
				player.getInventory().addItem(foot);

				event.getView().close();
				ErschaffeStartKit.setWatingTime(player);

			}
		}
	}

}
