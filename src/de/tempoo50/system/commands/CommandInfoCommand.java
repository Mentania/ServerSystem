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

public class CommandInfoCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			if (args.length == 0) {

				File file = new File("plugins//ServerSystem//Info.yml");
				YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

				Inventory inv = player.getPlayer().getServer().createInventory(null, 9 * 6, "ßeßl‹bersicht");

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

				inv.setItem(1, Info1);
				inv.setItem(4, Info2);
				inv.setItem(7, Info3);
				inv.setItem(19, Info4);
				inv.setItem(22, Info5);
				inv.setItem(25, Info6);
				inv.setItem(37, Info7);
				inv.setItem(40, Info8);
				inv.setItem(43, Info9);
				inv.setItem(46, Info10);
				inv.setItem(52, Info11);

				player.getPlayer().openInventory(inv);

			}
		}

		return false;
	}

}
