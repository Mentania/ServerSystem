package de.tempoo50.system.listener;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

import de.tempoo50.system.main.ServerSystem;

public class GameProtectionListener implements Listener {

	File file = new File("plugins//ServerSystem//Protaction.yml");
	YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

	private ServerSystem plugin;
	private ArrayList<String> buildModePlayers;
	private String world = (String) config.get("World");

	public static boolean useProtaction = true;
	public static boolean useShoot = true;
	public static boolean useElytra = true;

	public GameProtectionListener(ServerSystem plugin) {
		this.plugin = plugin;
		buildModePlayers = new ArrayList<>();
		useProtaction = config.getBoolean("UseProtaction");
		useShoot = config.getBoolean("UseShoot");
		useElytra = config.getBoolean("UseElytra");
	}

	@EventHandler
	public void handlePlayerBuild(BlockPlaceEvent event) {
		if ((boolean) config.get("UseProtaction") == true) {
			Player player = event.getPlayer();
			if (event.getPlayer() instanceof Player
					&& player.getLocation().distance(Bukkit.getWorld(world).getSpawnLocation()) < 30) {
				if (buildModePlayers.contains(event.getPlayer().getName()))
					return;
				event.setCancelled(true);
				player.sendMessage("Du musst 30 Blöcke vom Spawn entfernt sein");
			}
		}
	}

	@EventHandler
	public void handlePlayerDestruction(BlockBreakEvent event) {
		if ((boolean) config.get("UseProtaction") == true) {
			Player player = event.getPlayer();
			if (event.getPlayer() instanceof Player
					&& player.getLocation().distance(Bukkit.getWorld(world).getSpawnLocation()) < 30) {
				if (buildModePlayers.contains(event.getPlayer().getName()))
					return;
				event.setCancelled(true);
				player.sendMessage("Du musst 30 Blöcke vom Spawn entfernt sein");
			}
		}
	}

	@EventHandler
	public void handlePlayerDropItem(PlayerDropItemEvent event) {
		if ((boolean) config.get("UseProtaction") == true) {
			Player player = (Player) event.getPlayer();
			if (event.getPlayer() instanceof Player
					&& player.getLocation().distance(Bukkit.getWorld(world).getSpawnLocation()) < 30) {
				event.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void handleInventoryClick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((boolean) config.get("UseProtaction") == true) {
			if ((boolean) config.getBoolean("UseElytra") == true) {
				if (event.getCurrentItem().getType() == Material.ELYTRA) {
					event.setCancelled(true);
				}
			}
		}
	}

	@EventHandler
	public void handleFoodLevelChange(FoodLevelChangeEvent event) {
		if ((boolean) config.get("UseProtaction") == true) {
			if (event.getEntity() instanceof Player
					&& event.getEntity().getLocation().distance(Bukkit.getWorld(world).getSpawnLocation()) < 30) {
				event.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void handleBetEnter(PlayerBedEnterEvent event) {
		if ((boolean) config.get("UseProtaction") == true) {
			event.setCancelled(true);
		}
	}

	@EventHandler
	public void handlePlayerFight(EntityDamageEvent event) {
		if ((boolean) config.get("UseProtaction") == true) {
			if (event.getEntity() instanceof Player
					&& event.getEntity().getLocation().distance(Bukkit.getWorld(world).getSpawnLocation()) < 30) {
				event.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void handleLaunch(ProjectileLaunchEvent event) {
		if ((boolean) config.get("UseProtaction") == true) {
			if ((boolean) config.getBoolean("UseShoot") == true) {
				if (event.getEntity().getShooter() instanceof Player) {
					event.setCancelled(true);
				}
			}
		}

	}
	
	public void handleCreeperExplosion(EntityExplodeEvent event) {
		
		if((boolean) config.get("UseProtaction") == true) {
			
			if(event.getEntity().getLocation().distance(Bukkit.getWorld(world).getSpawnLocation()) < 30) {
			
				event.setCancelled(true);
				
			}
		}
		
		
	}

	public ArrayList<String> getBuildModePlayers() {
		return buildModePlayers;
	}

}
