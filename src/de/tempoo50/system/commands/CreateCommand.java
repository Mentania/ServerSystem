package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.Create;
import de.tempoo50.system.utils.MessagesUtil;

public class CreateCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {

			Player player = (Player) sender;

			File file = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

			if (player.hasPermission((String) config.get("Case"))) {
				if (args.length == 0) {

					player.sendMessage("Bitte verwende /create <NR>");

				} else if (args[0].equalsIgnoreCase("1")) {
					if (args.length == 1) {

						Create c = new Create("Normal");
						c.create();
						c.setDisplayMaterial(Material.CHEST);
						c.setItems(player.getInventory());

						player.sendMessage(MessagesUtil.CREATE1);

					}
				} else if (args[0].equalsIgnoreCase("2")) {
					if (args.length == 1) {

						Create c = new Create("Premium");
						c.create();
						c.setDisplayMaterial(Material.CHEST);
						c.setItems(player.getInventory());

						player.sendMessage(MessagesUtil.CREATE2);

					}
				} else if (args[0].equalsIgnoreCase("3")) {
					if (args.length == 1) {

						Create c = new Create("OP");
						c.create();
						c.setDisplayMaterial(Material.CHEST);
						c.setItems(player.getInventory());

						player.sendMessage(MessagesUtil.CREATE3);

					}
				}
			} else

				player.sendMessage(MessagesUtil.NOPERM);

		}

		return false;
	}

}
