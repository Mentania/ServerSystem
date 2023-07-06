package de.tempoo50.system.commands;

import java.io.File;
import java.text.SimpleDateFormat;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.tempoo50.system.data.ErschaffeChest;
import de.tempoo50.system.utils.MessagesUtil;

public class ChestCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {

			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Chest.user"))) {

				if (args.length == 0) {

					if (ErschaffeChest.canGetChest(player)) {
						ErschaffeChest.setWaitingTime(player);

						ItemStack chest = new ItemStack(Material.STRUCTURE_BLOCK);
						ItemMeta meta = chest.getItemMeta();

						meta.setDisplayName("§5Gutschein §afür §6Case §bPremium");
						chest.setItemMeta(meta);

						player.getInventory().addItem(chest);
						player.sendMessage(MessagesUtil.CHESTGET);

					} else {

						SimpleDateFormat simpel = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
						player.sendMessage(MessagesUtil.CHESTN1 + simpel.format(ErschaffeChest.getRemindingTime(player))
								+ MessagesUtil.CHESTN2);

					}

				} else {
					if (ErschaffeChest.canGetChest(player)) {

						player.sendMessage(MessagesUtil.PREFIX + "§cBenutze /chest!");

					} else

						player.sendMessage(MessagesUtil.PREFIX + "§cBenutze /chest!");

				}

			} else

				player.sendMessage(MessagesUtil.NOPERM);

		}

		return false;
	}

}
