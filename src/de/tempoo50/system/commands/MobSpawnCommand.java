package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;
import de.tempoo50.system.utils.SpawnUtil;

public class MobSpawnCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		File file = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		if (sender instanceof Player) {

			Player player = (Player) sender;

			if (player.hasPermission((String) config.get("Mob"))) {

				if (args.length == 0) {

					player.sendMessage("§cBitte benutze §b/mob <Pig, Cow, Chicken>");

				} else if (args[0].equalsIgnoreCase("Pig")) {

					if (args.length == 1) {

						SpawnUtil.spawnPig(player.getLocation());
						player.sendMessage(MessagesUtil.PIG);

					}

				} else if (args[0].equalsIgnoreCase("Cow")) {

					if (args.length == 1) {

						SpawnUtil.spawnCow(player.getLocation());
						player.sendMessage(MessagesUtil.COW);

					}

				} else if (args[0].equalsIgnoreCase("Chicken")) {

					if (args.length == 1) {

						SpawnUtil.spawnChicken(player.getLocation());
						player.sendMessage(MessagesUtil.CHICKEN);

					}
				}
			} else

				player.sendMessage(MessagesUtil.NOPERM);

		}

		return false;
	}

}
