package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.Hologram;
import de.tempoo50.system.utils.MessagesUtil;

public class HologramCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Holo.Create"))) {
				if (label.equalsIgnoreCase("holo")) {
					if (args.length >= 2) {
						if (args[0].equalsIgnoreCase("create")) {
							String text = "";
							for (int i = 1; i < args.length; i++) {
								text = text + " " + args[i];
							}

							text = text.replaceFirst(" ", "").replace("/n", "\n");

							Hologram holo = new Hologram(player.getLocation(), text);
							holo.create();

							player.sendMessage(MessagesUtil.HOLOC);

						}
					} else if (args.length == 1) {
						if (args[0].equalsIgnoreCase("remove")) {
							Hologram holo = Hologram.getByLocation(player.getLocation());
							if (holo != null) {
								holo.remove();
								player.sendMessage(MessagesUtil.HOLOR);
							} else {
								player.sendMessage(MessagesUtil.HOLOE);
							}

						}
					} else {
						player.sendMessage(MessagesUtil.PREFIX + "§b/holo <create, remove>");
					}

				}
			}

		}

		return false;
	}

}
