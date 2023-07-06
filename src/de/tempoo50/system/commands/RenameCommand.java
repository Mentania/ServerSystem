package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.tempoo50.system.utils.MessagesUtil;

public class RenameCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File file = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

			if (player.hasPermission((String) config.get("Color.Anvil"))) {
				if (args.length == 1) {
					String format = args[0];
					if (player.getItemInHand().getType() != Material.AIR) {
						ItemStack item = this.renameItem(player.getItemInHand(), format);
						player.getInventory().remove(player.getItemInHand());
						player.getInventory().addItem(item);
						player.sendMessage(MessagesUtil.RENAME);
					} else
						player.sendMessage(MessagesUtil.RENAMENO);

				}

			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;
	}

	public String formatALL(String format) {
		format = format.replaceAll("&", "§");
		return format;
	}

	public ItemStack renameItem(ItemStack item, String format) {
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(this.formatALL(format));
		item.setItemMeta(meta);
		return item;
	}

}