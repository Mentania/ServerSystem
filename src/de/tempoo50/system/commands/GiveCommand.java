package de.tempoo50.system.commands;

import java.io.File;

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

public class GiveCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Give"))) {
				if (args.length == 0) {

					Inventory give = player.getPlayer().getServer().createInventory(null, 9 * 6, "§e§lGive");

					ItemStack item = new ItemStack(Material.APPLE);
					ItemMeta metaItem = item.getItemMeta();
					metaItem.setDisplayName("§eNahrung");
					item.setItemMeta(metaItem);

					ItemStack item1 = new ItemStack(Material.ACACIA_DOOR);
					ItemMeta metaItem1 = item1.getItemMeta();
					metaItem1.setDisplayName("§eBaumaterial");
					item1.setItemMeta(metaItem1);

					ItemStack item2 = new ItemStack(Material.DIAMOND_SWORD);
					ItemMeta metaItem2 = item2.getItemMeta();
					metaItem2.setDisplayName("§eWaffen");
					item2.setItemMeta(metaItem2);

					ItemStack item3 = new ItemStack(Material.DIAMOND_CHESTPLATE);
					ItemMeta metaItem3 = item3.getItemMeta();
					metaItem3.setDisplayName("§eR§stung");
					item3.setItemMeta(metaItem3);

					ItemStack item4 = new ItemStack(Material.REDSTONE);
					ItemMeta metaItem4 = item4.getItemMeta();
					metaItem4.setDisplayName("§eRedstone");
					item4.setItemMeta(metaItem4);

					ItemStack item5 = new ItemStack(Material.FLOWER_POT);
					ItemMeta metaItem5 = item5.getItemMeta();
					metaItem5.setDisplayName("§eDeko");
					item5.setItemMeta(metaItem5);

					ItemStack item6 = new ItemStack(Material.SPAWNER);
					ItemMeta metaItem6 = item6.getItemMeta();
					metaItem6.setDisplayName("§eAdminItems");
					item6.setItemMeta(metaItem6);

					ItemStack item7 = new ItemStack(Material.LEGACY_YELLOW_FLOWER);
					ItemMeta metaItem7 = item7.getItemMeta();
					metaItem7.setDisplayName("§eFarben");
					item7.setItemMeta(metaItem7);

					ItemStack item8 = new ItemStack(Material.IRON_ORE);
					ItemMeta metaItem8 = item8.getItemMeta();
					metaItem8.setDisplayName("§eErze");
					item8.setItemMeta(metaItem8);

					give.setItem(1, item);
					give.setItem(4, item1);
					give.setItem(7, item2);
					give.setItem(19, item3);
					give.setItem(22, item4);
					give.setItem(25, item5);
					give.setItem(40, item7);
					give.setItem(43, item8);
					give.setItem(46, item6);

					player.getPlayer().openInventory(give);

				}

			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}
		return false;
	}

}
