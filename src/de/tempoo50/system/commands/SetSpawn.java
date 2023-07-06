package de.tempoo50.system.commands;

import java.io.File;
import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class SetSpawn implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		File perm = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

		File file = new File("plugins//ServerSystem//Spawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (player.hasPermission((String) per.get("Spawn.SetSpawn"))) {
				if (args.length == 0) {

					config.set("Spawn.World", player.getWorld().getName());
					config.set("Spawn.X", player.getLocation().getX());
					config.set("Spawn.Y", player.getLocation().getY());
					config.set("Spawn.Z", player.getLocation().getZ());
					config.set("Spawn.Yaw", player.getLocation().getYaw());
					config.set("Spawn.Pitch", player.getLocation().getPitch());
					try {
						config.save(file);
					} catch (IOException e) {
						e.printStackTrace();
					}
					player.sendMessage(MessagesUtil.SETSPAWN);

				} else
					player.sendMessage(MessagesUtil.PREFIX + "§cBitte benutze §b/setspawn§c!");

			} else
				player.sendMessage(MessagesUtil.NOPERM);

		}

		return false;
	}

}
