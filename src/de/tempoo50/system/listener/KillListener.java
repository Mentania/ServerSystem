package de.tempoo50.system.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Axolotl;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Cat;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cod;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Dolphin;
import org.bukkit.entity.Donkey;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.ElderGuardian;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Endermite;
import org.bukkit.entity.Evoker;
import org.bukkit.entity.Fox;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Giant;
import org.bukkit.entity.GlowSquid;
import org.bukkit.entity.Goat;
import org.bukkit.entity.Guardian;
import org.bukkit.entity.Hoglin;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Husk;
import org.bukkit.entity.Illusioner;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Llama;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Mule;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Panda;
import org.bukkit.entity.Parrot;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.Pig;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.PiglinBrute;
import org.bukkit.entity.Pillager;
import org.bukkit.entity.Player;
import org.bukkit.entity.PolarBear;
import org.bukkit.entity.PufferFish;
import org.bukkit.entity.Rabbit;
import org.bukkit.entity.Ravager;
import org.bukkit.entity.Salmon;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Shulker;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.SkeletonHorse;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Snowman;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Stray;
import org.bukkit.entity.TraderLlama;
import org.bukkit.entity.TropicalFish;
import org.bukkit.entity.Turtle;
import org.bukkit.entity.Vex;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Vindicator;
import org.bukkit.entity.WanderingTrader;
import org.bukkit.entity.Witch;
import org.bukkit.entity.Wither;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zoglin;
import org.bukkit.entity.Zombie;
import org.bukkit.entity.ZombieHorse;
import org.bukkit.entity.ZombieVillager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;
import de.tempoo50.system.utils.SpawnUtil;

import net.milkbowl.vault.economy.EconomyResponse;
import net.milkbowl.vault.economy.EconomyResponse.ResponseType;

public class KillListener implements Listener {

	private ServerSystem plugin = ServerSystem.getPlugin();

	@EventHandler
	public void mobDeath(EntityDeathEvent event) {

		File eco = new File("plugins//ServerSystem//Eco.yml");
		YamlConfiguration e = YamlConfiguration.loadConfiguration(eco);

		File file = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		if (event.getEntity() instanceof Pig) {
			
			Pig pig = (Pig) event.getEntity();
			
			if (pig.getName().contains("Quiek")) {

				event.getDrops().clear();
				ItemStack food = new ItemStack(Material.COOKED_BEEF, 3);
				pig.getWorld().dropItemNaturally(pig.getLocation(), food);

				if (pig.isDead()) {
					Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

						@Override
						public void run() {
							SpawnUtil.spawnPig(pig.getLocation());

						}
					}, 20);
				}
				
			}else {
				
				Player player = pig.getKiller();
				Integer amount = (Integer) e.get("Kill.Pig");
				
				if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {
					
					if(player.getGameMode() == GameMode.SURVIVAL) {
					
						if(!plugin.econ.hasAccount(player)) {
								
							player.sendMessage(MessagesUtil.KONTONOP);
							return;
								
						}
							
						if(!plugin.econ.has(player, amount)) {
								
							player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
							event.getDrops().clear();
								
						}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
							
							EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
							player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
						
							if(deposit.type != ResponseType.SUCCESS) {
							
								player.sendMessage(deposit.errorMessage);
							
							}
						
						}else {
							
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER + " §b" + amount + " " +plugin.econ.currencyNamePlural());
							
						if(withdraw.type != ResponseType.SUCCESS) {
								
							player.sendMessage(withdraw.errorMessage);
								
						}
						
					}
							
					}else {
						
						player.sendMessage(MessagesUtil.WRONGGM);
						event.getDrops().clear();
						
					}
					
				}
			
			}
			
		}else if (event.getEntity() instanceof Cow) {

			Cow cow = (Cow) event.getEntity();
			
			if (cow.getName().contains("Muh")) {

				event.getDrops().clear();
				ItemStack food = new ItemStack(Material.COOKED_BEEF, 3);
				cow.getWorld().dropItemNaturally(cow.getLocation(), food);

				if (cow.isDead()) {
					Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

						@Override
						public void run() {
							SpawnUtil.spawnCow(cow.getLocation());

						}
					}, 20);
				}

			}else {
				
				Integer amount = (Integer) e.get("Kill.Cow");
				Player player = cow.getKiller();
				
				if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {
				
					if(player.getGameMode() == GameMode.SURVIVAL) {
					
						if(!plugin.econ.hasAccount(player)) {
							
							player.sendMessage(MessagesUtil.KONTONOP);
							return;
							
						}
						
						if(!plugin.econ.has(player, amount)) {
							
							player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
							event.getDrops().clear();
							
						}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
							
							EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
							player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
						
							if(deposit.type != ResponseType.SUCCESS) {
							
								player.sendMessage(deposit.errorMessage);
							
							}
						
						}else {
							
							EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
							player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
							
							if(withdraw.type != ResponseType.SUCCESS) {
								
								player.sendMessage(withdraw.errorMessage);
								
							}
							
						}
						
					}else {
						
						player.sendMessage(MessagesUtil.WRONGGM);
						event.getDrops().clear();
						
					}
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Chicken) {

			Chicken chicken = (Chicken) event.getEntity();
			
			if (chicken.getName().contains("Hühnchen")) {

				event.getDrops().clear();
				ItemStack food = new ItemStack(Material.COOKED_CHICKEN, 3);
				chicken.getWorld().dropItemNaturally(chicken.getLocation(), food);

				if (chicken.isDead()) {
					Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

						@Override
						public void run() {
							SpawnUtil.spawnChicken(chicken.getLocation());

						}
					}, 20);
				}
				
			}else {
				
				Integer amount = (Integer) e.get("Kill.Chicken");
				Player player = chicken.getKiller();
				
				if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {
					
					if(player.getGameMode() == GameMode.SURVIVAL) {
					
						if(!plugin.econ.hasAccount(player)) {
							
							player.sendMessage(MessagesUtil.KONTONOP);
							return;
							
						}
						
						if(!plugin.econ.has(player, amount)) {
							
							player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
							event.getDrops().clear();
							
						}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
							
							EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
							player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
						
							if(deposit.type != ResponseType.SUCCESS) {
							
								player.sendMessage(deposit.errorMessage);
							
							}
						
						}else {
							
							EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
							player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
							
							if(withdraw.type != ResponseType.SUCCESS) {
								
								player.sendMessage(withdraw.errorMessage);
								
							}
							
						}
						
					}else {
						
						player.sendMessage(MessagesUtil.WRONGGM);
						event.getDrops().clear();
						
					}
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Wolf) {

			Wolf wolf = (Wolf) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Wolf");
			Player player = wolf.getKiller();
		
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {
				
				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Sheep) {

			Sheep sheep = (Sheep) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Sheep");
			Player player = sheep.getKiller();
		
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {
				
				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
				
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof MushroomCow) {

			MushroomCow mushroom = (MushroomCow) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Mushroom");
			Player player = ((LivingEntity) mushroom).getKiller();
		
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {
				
				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Rabbit) {

			Rabbit rabbit = (Rabbit) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Rabbit");
			Player player = rabbit.getKiller();
		
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {
				
				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof PolarBear) {

			PolarBear polarbear = (PolarBear) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Icebear");
			Player player = polarbear.getKiller();
		
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {
				
				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Squid) {

			Squid squid = (Squid) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Squid");
			Player player = squid.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {
				
				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Bat) {

			Bat bat = (Bat) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Bat");
			Player player = bat.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {
				
				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Ocelot) {
			
			Ocelot ocelot = (Ocelot) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Ozelot");
			Player player = ocelot.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {
				
				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Horse) {
			
			Horse horse = (Horse) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Horse");
			Player player = horse.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {
				
				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Donkey) {
			
			Donkey donkey = (Donkey) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Donkey");
			Player player = donkey.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {
				
				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Mule) {
			
			Mule mule = (Mule) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Mule");
			Player player = mule.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {
				
				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof SkeletonHorse) {
			
			SkeletonHorse skeletthorse = (SkeletonHorse) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Skeletthorse");
			Player player = skeletthorse.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {
				
				if(player.getGameMode() == GameMode.SURVIVAL) {
					
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Llama) {
			
			Llama lama = (Llama) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Lama");
			Player player = lama.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Parrot) {
			
			Parrot parrot = (Parrot) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Parrot");
			Player player = parrot.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount +" " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Snowman) {
			
			Snowman snowman = (Snowman) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Snowgolem");
			Player player = snowman.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount +" " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof IronGolem) {
			
			IronGolem irongolem = (IronGolem) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Irongolem");
			Player player = irongolem.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Villager) {
			
			Villager villager = (Villager) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Villager");
			Player player = villager.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " + plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Giant) {
			
			Giant giant = (Giant) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Giant");
			Player player = giant.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof ZombieHorse) {
			
			ZombieHorse zombiehorse = (ZombieHorse) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Zombiehorse");
			Player player = zombiehorse.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
					
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Illusioner) {
			
			Illusioner illusioner = (Illusioner) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Illusioner");
			Player player = illusioner.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Zombie) {
			
			Zombie zombie = (Zombie) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Zombie");
			Player player = zombie.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Husk) {
			
			Husk husk = (Husk) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Husk");
			Player player = husk.getKiller();
		
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
						
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof ZombieVillager) {
			
			ZombieVillager zombievillager = (ZombieVillager) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Zombievillager");
			Player player = zombievillager.getKiller();
		
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
						
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Skeleton) {
			
			Skeleton skeleton = (Skeleton) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Skelett");
			Player player = skeleton.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Creeper) {
			
			Creeper creeper = (Creeper) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Creeper");
			Player player = creeper.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Spider) {
			
			Spider spider = (Spider) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Spider");
			Player player = spider.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Witch) {
			
			Witch witch = (Witch) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Witch");
			Player player = witch.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof PigZombie) {
			
			PigZombie pigzombie = (PigZombie) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Pigmin");
			Player player = pigzombie.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
				
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
			
		}else if(event.getEntity() instanceof Ghast) {
			
			Ghast ghast = (Ghast) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Ghast");
			Player player = ghast.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof MagmaCube) {
			
			MagmaCube magmacube = (MagmaCube) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Magmacube");
			Player player = magmacube.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
				
		}else if(event.getEntity() instanceof Enderman) {
			
			Enderman enderman = (Enderman) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Enderman");
			Player player = enderman.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Slime) {
			
			Slime slime = (Slime) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Slime");
			Player player = slime.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Silverfish) {
			
			Silverfish silverfish = (Silverfish) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Silverfish");
			Player player = silverfish.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof CaveSpider) {
			
			CaveSpider cavespider = (CaveSpider) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Cavespider");
			Player player = cavespider.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Guardian) {
			
			Guardian guardian = (Guardian) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Guardian");
			Player player = guardian.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof ElderGuardian) {
			
			ElderGuardian elderguardian = (ElderGuardian) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Elderguardian");
			Player player = elderguardian.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Stray) {
			
			Stray stray = (Stray) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Stray");
			Player player = stray.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " + plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Vindicator) {
			
			Vindicator vindicator = (Vindicator) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Vindicator");
			Player player = vindicator.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Evoker) {
			
			Evoker evoker = (Evoker) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Evoker");
			Player player = evoker.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Vex) {
			
			Vex vex = (Vex) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Vex");
			Player player = vex.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Blaze) {
			
			Blaze blaze = (Blaze) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Lohe");
			Player player = blaze.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof WitherSkeleton) {
			
			WitherSkeleton witherskeleton = (WitherSkeleton) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Witherskelett");
			Player player = witherskeleton.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Shulker) {
			
			Shulker shulker = (Shulker) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Shulker");
			Player player = shulker.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Endermite) {
			
			Endermite endermite = (Endermite) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Endermite");
			Player player = endermite.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof EnderDragon) {
			
			EnderDragon enderdragon = (EnderDragon) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Enderdragon");
			Player player = enderdragon.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
						
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLBOSS + " §b" + amount + " " + plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Wither) {
			
			Wither wither = (Wither) event.getEntity();

			Integer amount = (Integer) e.get("Kill.Wither");
			Player player = wither.getKiller();

			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLBOSS + " §b" + amount + " " + plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Drowned) {
			
			Drowned drowned = (Drowned) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Drowner");
			Player player = drowned.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Phantom) {
			
			Phantom phantom = (Phantom) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Phantom");
			Player player = phantom.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Zoglin) {
			
			Zoglin zoglin = (Zoglin) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Zoglin");
			Player player = zoglin.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Hoglin) {
			
			Hoglin hoglin = (Hoglin) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Hoglin");
			Player player = hoglin.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Piglin) {
			
			Piglin piglin = (Piglin) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Piglin");
			Player player = piglin.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof PiglinBrute) {
			
			PiglinBrute piglinbrute = (PiglinBrute) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.PiglinBrute");
			Player player = piglinbrute.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Pillager) {
			
			Pillager Pillager = (Pillager) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Pillager");
			Player player = Pillager.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Ravager) {
			
			Ravager ravager = (Ravager) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Ravager");
			Player player = ravager.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Turtle) {
			
			Turtle turtle = (Turtle) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Turtle");
			Player player = turtle.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
						
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Cod) {
			
			Cod cod = (Cod) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Cod");
			Player player = cod.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
						
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Salmon) {
			
			Salmon salmon = (Salmon) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Salmon");
			Player player = salmon.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
						
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof PufferFish) {
			
			PufferFish pufferfish = (PufferFish) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.PufferFish");
			Player player = pufferfish.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
						
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof TropicalFish) {
			
			TropicalFish tropicalfish = (TropicalFish) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.TropicalFish");
			Player player = tropicalfish.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
						
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Dolphin) {
			
			Dolphin dolphin = (Dolphin) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Dolphin");
			Player player = dolphin.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
						
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Panda) {
			
			Panda panda = (Panda) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Panda");
			Player player = panda.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
						
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Fox) {
			
			Fox fox = (Fox) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Fox");
			Player player = fox.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
						
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Bee) {
			
			Bee bee = (Bee) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Bee");
			Player player = bee.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
						
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Axolotl) {
			
			Axolotl axolotl = (Axolotl) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Axolotl");
			Player player = axolotl.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof GlowSquid) {
			
			GlowSquid glowsquid = (GlowSquid) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.GlowSquid");
			Player player = glowsquid.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
					
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else {
					
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Goat) {
			
			Goat goat = (Goat) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Goat");
			Player player = goat.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
						
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Cat) {
			
			Cat cat = (Cat) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.Cat");
			Player player = cat.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
						
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof TraderLlama) {
			
			TraderLlama traderllama = (TraderLlama) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.TraderLlame");
			Player player = traderllama.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
						
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof WanderingTrader) {
			
			WanderingTrader wanderingtrader = (WanderingTrader) event.getEntity();
			
			Integer amount = (Integer) e.get("Kill.WanderingTrader");
			Player player = wanderingtrader.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}
				
					if(!plugin.econ.has(player, amount)) {
						
						player.sendMessage(MessagesUtil.PAYWARN1 + " §b" + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						event.getDrops().clear();
						
					}else if(player.hasPermission((String) config.get("Perks.Jagt"))) {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLMOB + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}else {
					
						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLTIER  + " §b" + amount + " " +plugin.econ.currencyNamePlural());
					
						if(withdraw.type != ResponseType.SUCCESS) {
						
							player.sendMessage(withdraw.errorMessage);
						
						}
					
					}
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}else if(event.getEntity() instanceof Player) {
			
			Integer amount = (Integer) e.get("Kill.Player");
			Player target = (Player) event.getEntity();
			Player player = target.getKiller();
			
			if(player instanceof Player && !player.getLocation().getWorld().getName().equalsIgnoreCase(e.getString("Kill.World"))) {

				if(player.getGameMode() == GameMode.SURVIVAL) {
				
					if(!plugin.econ.hasAccount(player)) {
					
						player.sendMessage(MessagesUtil.KONTONOP);
						return;
					
					}else {
						
						EconomyResponse deposit = plugin.econ.depositPlayer(player.getName(), amount);
						player.sendMessage(MessagesUtil.KILLPLAYER + " §b" + amount + " " + plugin.econ.currencyNamePlural());
					
						if(deposit.type != ResponseType.SUCCESS) {
						
							player.sendMessage(deposit.errorMessage);
						
						}
					
					}
				
					
				}else {
					
					player.sendMessage(MessagesUtil.WRONGGM);
					event.getDrops().clear();
					
				}
				
			}
			
		}
		
	}

}
