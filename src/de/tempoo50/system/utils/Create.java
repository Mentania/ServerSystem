package de.tempoo50.system.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import de.tempoo50.system.api.FileWriter;
import de.tempoo50.system.api.Item;
import de.tempoo50.system.main.ServerSystem;

public class Create {

	private FileWriter f;
	private String name;

	public Create(String name) {

		this.f = new FileWriter("plugins//Case//", name + ".yml");
		this.name = name;

	}

	public static List<Create> getCreates() {

		List<Create> temp = new ArrayList<>();
		File dir = new File("plugins//Case//");
		for (File f : dir.listFiles()) {
			if (f.isFile()) {
				temp.add(new Create(f.getName().replace(".yml", "")));
			}
		}

		return temp;

	}

	public Create setDisplayMaterial(Material m) {

		f.setValue("Material", m.toString());
		return this;

	}

	public Material getDisplayMaterial() {

		return Material.valueOf(f.getString("Material"));

	}

	public Create setItems(Inventory inv) {

		f.setValue("Items", inv.getContents());
		f.save();
		return this;

	}

	public List<ItemStack> getItems() {

		List<ItemStack> temp = new ArrayList<>();
		@SuppressWarnings("unchecked")
		ItemStack[] contents = ((List<ItemStack>) f.getObject("Items")).toArray(new ItemStack[0]);

		for (int i = 0; i < contents.length; i++) {

			if (contents[i] != null) {

				temp.add(contents[i]);

			}

		}

		return temp;

	}

	public Create create() {

		f.setValue("Material", Material.CHEST.toString());
		f.setValue("Beschreibung", Arrays.asList("Ã„ndere diese Beschreibung!", "Denn sie ist noch nicht", "fertig"));
		f.save();
		return this;

	}

	public static Inventory getCreateSelectionInventory() {

		Inventory inv = Bukkit.createInventory(null, 9 * 3, "§5Case §7- §aAuswahl");

		for (Create c : Create.getCreates()) {

			inv.addItem(new Item(c.getDisplayMaterial(), 1).setDisplayname(c.getName()).setLore(c.getDiscription()).build());
		}

		return inv;

	}

	public Create delete() {

		f.delete();
		return this;

	}

	public List<String> getDiscription() {

		return f.getStringList("Beschreibung");

	}

	public boolean exist() {

		return f.exist();

	}

	public void startAnimation(Player player) {

		List<ItemStack> temp = getItems();

		Collections.shuffle(temp);

		Inventory inv = Bukkit.createInventory(null, 9 * 3, "§5Case §7- §c" + getName());

		for (int i = 0; i < inv.getSize(); i++) {

			inv.setItem(i, new Item(Material.BLACK_STAINED_GLASS_PANE, 1, (short) 15).setDisplayname("§7").build());

		}

		inv.setItem(4, new Item(Material.HOPPER, 1).setDisplayname("§7Gewinn").setLore(Arrays.asList("§7Das Item hier unter Gewinntst du!")).build());
		player.openInventory(inv);

		new BukkitRunnable() {

			private final Player curr = player;
			private long sleep = 0;
			private int turns = 40;

			@Override
			public void run() {

				if (curr == null)
					this.cancel();

				int id = 0;

				for (int i = 9; i <= 17; i++) {
					if (temp.get(id) != null) {
						inv.setItem(i, temp.get(id));
					}

					id++;

				}

				player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);

				temp.add(temp.get(0));
				temp.remove(0);

				if (player.getOpenInventory() == null) {

					this.cancel();
					final ItemStack i = temp.get(new Random().nextInt(temp.size() - 1));
					player.getInventory().addItem(i);
					player.sendMessage(MessagesUtil.PREFIX + "Du hast " + i.getAmount() + " mal " + i.getType().toString() + " gewonnen!");
					Bukkit.broadcastMessage(MessagesUtil.PREFIX + player.getName() + " Hat " + i.getAmount() + " mal " + i.getType().toString() + " gewonnen!");

				}

				turns--;

				if (turns <= 10) {

					sleep = sleep + 100;

					try {

						Thread.sleep(sleep);

					} catch (InterruptedException e) {

					}

				}

				if (sleep == 1000) {
					this.cancel();
					player.getInventory().addItem(inv.getItem(13));
					player.sendMessage(MessagesUtil.PREFIX + "Du hast " + inv.getItem(13).getAmount() + " mal " + inv.getItem(13).getType().toString() + " gewonnen!");
					Bukkit.broadcastMessage(MessagesUtil.PREFIX + player.getName() + " Hat " + inv.getItem(13).getAmount() + " mal " + inv.getItem(13).getType().toString() + " gewonnen!");

				}

			}

		}.runTaskTimer(ServerSystem.getInctance(), 0, 5);

	}

	public String getName() {
		return name;
	}

}
