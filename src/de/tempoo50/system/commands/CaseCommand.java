package de.tempoo50.system.commands;

import de.tempoo50.system.utils.MessagesUtil;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;

import java.io.File;

public class CaseCommand implements CommandExecutor {

	public static void spawnVillager(Location location) {

		Villager vil = (Villager) location.getWorld().spawnEntity(location, EntityType.VILLAGER);
		vil.setCustomName("§eCaseOpening");
		vil.setCustomNameVisible(true);

	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {

			Player player = (Player) sender;

			File file = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

			if (player.hasPermission((String) config.get("Case"))) {

				spawnVillager(player.getLocation());
				player.sendMessage(MessagesUtil.CASE);

			} else

				player.sendMessage(MessagesUtil.NOPERM);

		}

		return false;
	}

}
