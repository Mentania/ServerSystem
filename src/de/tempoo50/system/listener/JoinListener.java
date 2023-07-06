package de.tempoo50.system.listener;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.ScoreboardUtil;
import de.tempoo50.system.utils.TablistUtil;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.File;

public class JoinListener implements Listener {

	private ServerSystem plugin = ServerSystem.getPlugin();

	@EventHandler
	public void handlePlayerJoin(PlayerJoinEvent event) {
		
		plugin.table.timer(event.getPlayer());
		plugin.econ.createPlayerAccount(event.getPlayer());

		TablistUtil.setPrefix(event.getPlayer());
		ScoreboardUtil.loadScoreboard(event.getPlayer());

		File perm = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

		File file = new File("plugins//ServerSystem//Spawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		Player player = event.getPlayer();

//		if(BanManager.isbannedmysql(player.getUniqueId().toString())) {
//			
//			BanManager.unbanmysql(player.getUniqueId().toString());
//			
//		}
		
		if (player.hasPermission((String) per.get("Spawn.Admin"))) {

			event.setJoinMessage((String) config.get("Message.Join"));

			player.setGameMode(GameMode.CREATIVE);
			player.setFoodLevel(20);
			player.setHealth(20);

			World world = Bukkit.getWorld(config.getString("Spawn.World"));
			double x = config.getDouble("Spawn.X");
			double y = config.getDouble("Spawn.Y");
			double z = config.getDouble("Spawn.Z");
			float yaw = (float) config.getDouble("Spawn.Yaw");
			float pitch = (float) config.getDouble("Spawn.Pitch");
			Location location = new Location(world, x, y, z, yaw, pitch);

			player.teleport(location);

		} else {

			event.setJoinMessage((String) config.get("Message.Join"));

			player.setGameMode(GameMode.SURVIVAL);
			player.setFoodLevel(20);
			player.setHealth(20);

			World world = Bukkit.getWorld(config.getString("Spawn.World"));
			double x = config.getDouble("Spawn.X");
			double y = config.getDouble("Spawn.Y");
			double z = config.getDouble("Spawn.Z");
			float yaw = (float) config.getDouble("Spawn.Yaw");
			float pitch = (float) config.getDouble("Spawn.Pitch");
			Location location = new Location(world, x, y, z, yaw, pitch);

			player.teleport(location);

		}

	}

}
