package de.tempoo50.system.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import de.tempoo50.system.utils.Create;

public class CaseClick implements Listener {

	@EventHandler
	public void oncase(InventoryClickEvent event) {

		Player player = (Player) event.getWhoClicked();

		if (!event.getView().getTitle().contains("Case"))
			return;

		event.setCancelled(true);

		if (event.getView().getTitle().equals("§5Case §7- §aAuswahl")) {

			if (event.getCurrentItem() == null)
				return;
			if (event.getCurrentItem().getType() == Material.AIR)
				return;

			Create c = new Create(event.getCurrentItem().getItemMeta().getDisplayName());

			if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Normal")) {
				event.setCancelled(true);
				if (player.getInventory().contains(Material.BARRIER, 1)) {

					int place = BestMaterial(player, Material.BARRIER);

					player.getInventory().getItem(place)
							.setAmount(player.getInventory().getItem(place).getAmount() - 1);

					c.startAnimation((Player) event.getWhoClicked());

				} else
					player.sendMessage("Dir fehlt der passende Gutschein");

			} else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Premium")) {
				event.setCancelled(true);
				if (player.getInventory().contains(Material.STRUCTURE_BLOCK, 1)) {

					int place = BestMaterial(player, Material.STRUCTURE_BLOCK);

					player.getInventory().getItem(place)
							.setAmount(player.getInventory().getItem(place).getAmount() - 1);

					c.startAnimation((Player) event.getWhoClicked());

				} else
					player.sendMessage("Dir fehlt der passende Gutschein");

			} else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("OP")) {
				event.setCancelled(true);
				if (player.getInventory().contains(Material.BEDROCK, 1)) {

					int place = BestMaterial(player, Material.BEDROCK);

					player.getInventory().getItem(place)
							.setAmount(player.getInventory().getItem(place).getAmount() - 1);

					c.startAnimation((Player) event.getWhoClicked());

				} else
					player.sendMessage("Dir fehlt der passende Gutschein");

			}

		}

	}

	@EventHandler
	public void onHandleVillager(PlayerInteractEntityEvent event) {

		if (event.getRightClicked() instanceof Villager) {

			Villager vill = (Villager) event.getRightClicked();
			if (vill.getCustomName().equalsIgnoreCase("§eCaseOpening")) {
				event.setCancelled(true);
				Player player = event.getPlayer();

				player.openInventory(Create.getCreateSelectionInventory());

			}

		}

	}

	@EventHandler
	public void onKillVillager(EntityDamageByEntityEvent event) {

		if (!(event.getEntity() instanceof Villager))
			return;
		Villager vil = (Villager) event.getEntity();
		if (!vil.getCustomName().equalsIgnoreCase("§eCaseOpening"))
			return;

		event.setCancelled(true);

	}

	private int BestMaterial(Player player, Material material) {

		int i = 0;
		int bestMaterial = 0;

		for (int i2 = 0; i2 < 27; i2++) {

			if (player.getInventory().getItem(i2) != null) {
				if (player.getInventory().getItem(i2).getType() == material
						&& player.getInventory().getItem(i2).getAmount() >= bestMaterial) {

					i = i2;

				}
			}

		}

		return i;

	}

}
