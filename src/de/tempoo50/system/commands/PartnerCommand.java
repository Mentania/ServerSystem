package de.tempoo50.system.commands;

import java.io.File;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;

public class PartnerCommand implements CommandExecutor {

	private ServerSystem plugin;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Partner"))) {
				if (args.length == 0) {

					File file = new File("plugins//ServerSystem//Partner//Partner.yml");
					YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

					List<String> partner1lore = (List<String>) config.getStringList("Partner1.Lore");
					List<String> partner2lore = (List<String>) config.getStringList("Partner2.Lore");
					List<String> partner3lore = (List<String>) config.getStringList("Partner3.Lore");
					List<String> partner4lore = (List<String>) config.getStringList("Partner4.Lore");

					ItemStack partner1 = new ItemStack(Material.NETHER_STAR);
					ItemMeta partnerMeta1 = partner1.getItemMeta();
					partnerMeta1.setDisplayName((String) config.get("Partner1.DisplayName1"));
					partnerMeta1.setLore(partner1lore);
					partner1.setItemMeta(partnerMeta1);

					ItemStack partner2 = new ItemStack(Material.NETHER_STAR);
					ItemMeta partnerMeta2 = partner2.getItemMeta();
					partnerMeta2.setDisplayName((String) config.get("Partner2.DisplayName2"));
					partnerMeta2.setLore(partner2lore);
					partner2.setItemMeta(partnerMeta2);

					ItemStack partner3 = new ItemStack(Material.NETHER_STAR);
					ItemMeta partnerMeta3 = partner3.getItemMeta();
					partnerMeta3.setDisplayName((String) config.get("Partner3.DisplayName3"));
					partnerMeta3.setLore(partner3lore);
					partner3.setItemMeta(partnerMeta3);

					ItemStack partner4 = new ItemStack(Material.NETHER_STAR);
					ItemMeta partnerMeta4 = partner4.getItemMeta();
					partnerMeta4.setDisplayName((String) config.get("Partner4.DisplayName4"));
					partnerMeta4.setLore(partner4lore);
					partner4.setItemMeta(partnerMeta4);

					Inventory inv = player.getPlayer().getServer().createInventory(null, 9 * 3, "§e§lPartnerSystem");

					inv.setItem(1, partner1);
					inv.setItem(3, partner2);
					inv.setItem(5, partner3);
					inv.setItem(7, partner4);

					player.getPlayer().openInventory(inv);

				}
			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}
		return false;
	}

}
