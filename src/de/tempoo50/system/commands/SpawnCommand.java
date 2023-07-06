package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class SpawnCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Spawn.Spawn"))) {
				if (args.length == 0) {

					File file = new File("plugins//ServerSystem//Spawn.yml");
					YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

					World world = Bukkit.getWorld(config.getString("Spawn.World"));
					double x = config.getDouble("Spawn.X");
					double y = config.getDouble("Spawn.Y");
					double z = config.getDouble("Spawn.Z");
					float yaw = (float) config.getDouble("Spawn.Yaw");
					float pitch = (float) config.getDouble("Spawn.Pitch");
					Location location = new Location(world, x, y, z, yaw, pitch);

					player.teleport(location);
					player.sendMessage(MessagesUtil.SPAWN);

				} else
					player.sendMessage("§cBitte benutze §b/spawn §c!");
			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;
	}

}
