package de.tempoo50.system.listener;

import de.tempoo50.system.commands.PerksCommand;
import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;
import net.milkbowl.vault.economy.EconomyResponse;
import net.milkbowl.vault.economy.EconomyResponse.ResponseType;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.io.File;
import java.io.IOException;

public class PerksListener implements Listener {
	
	private ServerSystem plugin = ServerSystem.getPlugin();
	
	@EventHandler
	
	public void Click(InventoryClickEvent event) {

		File file = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		File eco = new File("plugins//ServerSystem//Eco.yml");
		YamlConfiguration e = YamlConfiguration.loadConfiguration(eco);

		File perks = new File("plugins//ServerSystem//Perks//User.yml");
		YamlConfiguration p = YamlConfiguration.loadConfiguration(perks);
		
		Player player = (Player) event.getWhoClicked();
		
		if(event.getView().getTitle().equalsIgnoreCase("§aPerks")) {
			
			event.setCancelled(true);
			
			if(event.getCurrentItem() != null) {
				
				if(event.getCurrentItem().getItemMeta() != null) {
					
					if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aKein Fallschaden")) {
						
						if(player.hasPermission((String) config.get("Perks.Fallschaden"))) {
							
							if(p.getString(player.getName() + ".Fallschaden") == null || p.getString(player.getName() + ".Fallschaden").equalsIgnoreCase("aus")) {
								
								p.set(player.getName() + ".Fallschaden", "an");
								
								p.options().copyDefaults(true);
								
								try {
									p.save(perks);
								} catch (IOException ex) {
									// TODO Auto-generated catch block
									ex.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
							}else if(p.getString(player.getName() + ".Fallschaden").equalsIgnoreCase("an")) {
								
								p.set(player.getName() + ".Fallschaden", "aus");
								
								p.options().copyDefaults(true);
								
								try {
									p.save(perks);
								} catch (IOException ex) {
									// TODO Auto-generated catch block
									ex.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
							}
							
						}else if(!player.hasPermission((String) config.get("Perks.Fallschaden"))) {
							
							Integer amount = (Integer) e.get("Perks.NG.1");
							
							if(!plugin.econ.hasAccount(player)) {
								
								player.sendMessage(MessagesUtil.KONTONOP);
								return;
								
							}
							
							if(!plugin.econ.has(player, amount)) {
								
								player.sendMessage(MessagesUtil.PAYWARN1 + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
								
							}else {
								
								EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
								
								ServerSystem.perkmanager.setPerkFall(player);
								PerksCommand.closeInv(player);
								
								
								if(withdraw.type != ResponseType.SUCCESS) {
									
									player.sendMessage(withdraw.errorMessage);
									
								}
								
							}
							
						}
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eNachtsicht")) {
						
						if(player.hasPermission((String) config.get("Perks.Nachtsicht"))) {
							
							if(p.getString(player.getName() + ".Nachtsicht") == null || p.getString(player.getName() + ".Nachtsicht").equalsIgnoreCase("aus")) {
								
								p.set(player.getName() + ".Nachtsicht", "an");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 99999999, 0));
								
							}else if(p.getString(player.getName() + ".Nachtsicht").equalsIgnoreCase("an")) {
								
								p.set(player.getName() + ".Nachtsicht", "aus");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								player.getPlayer().removePotionEffect(PotionEffectType.NIGHT_VISION);
								
							}
							
						}else if(!player.hasPermission((String) config.get("Perks.Nachtsicht"))) {
							
							Integer amount = (Integer) e.get("Perks.NG.2");
							
							if(!plugin.econ.hasAccount(player)) {
								
								player.sendMessage(MessagesUtil.KONTONOP);
								return;
								
							}
							
							if(!plugin.econ.has(player, amount)) {
								
								player.sendMessage(MessagesUtil.PAYWARN1 + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
								
							}else {
								
								EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
								
								ServerSystem.perkmanager.setPerkNacht(player);
								PerksCommand.closeInv(player);
								
								
								if(withdraw.type != ResponseType.SUCCESS) {
									
									player.sendMessage(withdraw.errorMessage);
									
								}
								
							}
							
						}
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5Doppelte XP")) {
						
						if(player.hasPermission((String) config.get("Perks.XP"))) {
							
							if(p.getString(player.getName() + ".DoppelteXP") == null || p.getString(player.getName() + ".DoppelteXP").equalsIgnoreCase("aus")) {
								
								p.set(player.getName() + ".DoppelteXP", "an");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
							}else if(p.getString(player.getName() + ".DoppelteXP").equalsIgnoreCase("an")) {
								
								p.set(player.getName() + ".DoppelteXP", "aus");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
							}
							
						}else if(!player.hasPermission((String) config.get("Perks.XP"))) {
							
							Integer amount = (Integer) e.get("Perks.NG.3");
							
							if(!plugin.econ.hasAccount(player)) {
								
								player.sendMessage(MessagesUtil.KONTONOP);
								return;
								
							}
							
							if(!plugin.econ.has(player, amount)) {
								
								player.sendMessage(MessagesUtil.PAYWARN1 + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
								
							}else {
								
								EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
								
								ServerSystem.perkmanager.setPerkXP(player);
								PerksCommand.closeInv(player);
								
								
								if(withdraw.type != ResponseType.SUCCESS) {
									
									player.sendMessage(withdraw.errorMessage);
									
								}
								
							}
							
						}
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cSchnelles abbauen")) {
						
						if(player.hasPermission((String) config.get("Perks.Abbau"))) {
							
							if(p.getString(player.getName() + ".SchnellesAbbauen") == null || p.getString(player.getName() + ".SchnellesAbbauen").equalsIgnoreCase("aus")) {
								
								p.set(player.getName() + ".SchnellesAbbauen", "an");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
								player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 99999999, 0));
								
							}else if(p.getString(player.getName() + ".SchnellesAbbauen").equalsIgnoreCase("an")) {
								
								p.set(player.getName() + ".SchnellesAbbauen", "aus");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
								player.getPlayer().removePotionEffect(PotionEffectType.FAST_DIGGING);
								
							}
							
						}else if(!player.hasPermission((String) config.get("Perks.Abbau"))) {
							
							Integer amount = (Integer) e.get("Perks.NG.4");
							
							if(!plugin.econ.hasAccount(player)) {
								
								player.sendMessage(MessagesUtil.KONTONOP);
								return;
								
							}
							
							if(!plugin.econ.has(player, amount)) {
								
								player.sendMessage(MessagesUtil.PAYWARN1 + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
								
							}else {
								
								EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
								
								ServerSystem.perkmanager.setPerkAbbau(player);
								PerksCommand.closeInv(player);
								
								
								if(withdraw.type != ResponseType.SUCCESS) {
									
									player.sendMessage(withdraw.errorMessage);
									
								}
								
							}
							
						}
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3Kein Feuerschaden")) {
						
						if(player.hasPermission((String) config.get("Perks.Feuer"))) {
							
							if(p.getString(player.getName() + ".Feuerschaden") == null || p.getString(player.getName() + ".Feuerschaden").equalsIgnoreCase("aus")) {
								
								p.set(player.getName() + ".Feuerschaden", "an");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
							}else if(p.getString(player.getName() + ".Feuerschaden").equalsIgnoreCase("an")) {
								
								p.set(player.getName() + ".Feuerschaden", "aus");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
							}
							
						}else if(!player.hasPermission((String) config.get("Perks.Feuer"))) {
							
							Integer amount = (Integer) e.get("Perks.NG.5");
							
							if(!plugin.econ.hasAccount(player)) {
								
								player.sendMessage(MessagesUtil.KONTONOP);
								return;
								
							}
							
							if(!plugin.econ.has(player, amount)) {
								
								player.sendMessage(MessagesUtil.PAYWARN1 + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
								
							}else {
								
								EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
								
								ServerSystem.perkmanager.setPerkFeuer(player);
								PerksCommand.closeInv(player);
								
								
								if(withdraw.type != ResponseType.SUCCESS) {
									
									player.sendMessage(withdraw.errorMessage);
									
								}
								
							}
							
						}
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Schneller laufen")) {
						
						if(player.hasPermission((String) config.get("Perks.Laufen"))) {
							
							if(p.getString(player.getName() + ".Schnellerlaufen") == null  || p.getString(player.getName() + ".Schnellerlaufen").equalsIgnoreCase("aus")) {
								
								p.set(player.getName() + ".Schnellerlaufen", "an");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
								player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 99999999, 0));
								
							}else if(p.getString(player.getName() + ".Schnellerlaufen") == null || p.getString(player.getName() + ".Schnellerlaufen").equalsIgnoreCase("an")) {
								
								p.set(player.getName() + ".Schnellerlaufen", "aus");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								player.getPlayer().removePotionEffect(PotionEffectType.SPEED);
								
							}
							
						}else if(!player.hasPermission((String) config.get("Perks.Laufen"))) {
							
							Integer amount = (Integer) e.get("Perks.NG.6");
							
							if(!plugin.econ.hasAccount(player)) {
								
								player.sendMessage(MessagesUtil.KONTONOP);
								return;
								
							}
							
							if(!plugin.econ.has(player, amount)) {
								
								player.sendMessage(MessagesUtil.PAYWARN1 + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
								
							}else {
								
								EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
								
								ServerSystem.perkmanager.setPerkLaufen(player);
								PerksCommand.closeInv(player);
								
								
								if(withdraw.type != ResponseType.SUCCESS) {
									
									player.sendMessage(withdraw.errorMessage);
									
								}
								
							}
							
						}
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cKein ertrinken")) {
						
						if(player.hasPermission((String) config.get("Perks.ertrinken"))) {
							
							if(p.getString(player.getName() + ".ertrinken") == null || p.getString(player.getName() + ".ertrinken").equalsIgnoreCase("aus")) {
								
								p.set(player.getName() + ".ertrinken", "an");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
							}else if(p.getString(player.getName() + ".ertrinken").equalsIgnoreCase("an")) {
								
								p.set(player.getName() + ".ertrinken", "aus");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
							}
							
						}else if(!player.hasPermission((String) config.get("Perks.ertrinken"))) {
							
							Integer amount = (Integer) e.get("Perks.NG.7");
							
							if(!plugin.econ.hasAccount(player)) {
								
								player.sendMessage(MessagesUtil.KONTONOP);
								return;
								
							}
							
							if(!plugin.econ.has(player, amount)) {
								
								player.sendMessage(MessagesUtil.PAYWARN1 + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
								
							}else {
								
								EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
								
								ServerSystem.perkmanager.setPerkErtrinken(player);
								PerksCommand.closeInv(player);
								
								
								if(withdraw.type != ResponseType.SUCCESS) {
									
									player.sendMessage(withdraw.errorMessage);
									
								}
								
							}
							
						}
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bXP nach Tod behalten")) {
						
						if(player.hasPermission((String) config.get("Perks.Tod"))) {
							
							if(p.getString(player.getName() + ".Tod") == null || p.getString(player.getName() + ".Tod").equalsIgnoreCase("aus")) {
								
								p.set(player.getName() + ".Tod", "an");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
							}else if(p.getString(player.getName() + ".Tod").equalsIgnoreCase("an")) {
								
								p.set(player.getName() + ".Tod", "aus");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
							}
							
						}else if(!player.hasPermission((String) config.get("Perks.Tod"))) {
							
							Integer amount = (Integer) e.get("Perks.NG.8");
							
							if(!plugin.econ.hasAccount(player)) {
								
								player.sendMessage(MessagesUtil.KONTONOP);
								return;
								
							}
							
							if(!plugin.econ.has(player, amount)) {
								
								player.sendMessage(MessagesUtil.PAYWARN1 + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
								
							}else {
								
								EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
								
								ServerSystem.perkmanager.setPerkTod(player);
								PerksCommand.closeInv(player);
								
								
								if(withdraw.type != ResponseType.SUCCESS) {
									
									player.sendMessage(withdraw.errorMessage);
									
								}
								
							}
							
						}
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eKein Hunger")) {
						
						if(player.hasPermission((String) config.get("Perks.Hunger"))) {
							
							if(p.getString(player.getName() + ".Hunger") == null || p.getString(player.getName() + ".Hunger").equalsIgnoreCase("aus")) {
								
								p.set(player.getName() + ".Hunger", "an");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
							}else if(p.getString(player.getName() + ".Hunger").equalsIgnoreCase("an")) {
								
								p.set(player.getName() + ".Hunger", "aus");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
							}
							
						}else if(!player.hasPermission((String) config.get("Perks.Hunger"))) {
							
							Integer amount = (Integer) e.get("Perks.NG.9");
							
							if(!plugin.econ.hasAccount(player)) {
								
								player.sendMessage(MessagesUtil.KONTONOP);
								return;
								
							}
							
							if(!plugin.econ.has(player, amount)) {
								
								player.sendMessage(MessagesUtil.PAYWARN1 + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
								
							}else {
								
								EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
								
								ServerSystem.perkmanager.setPerkHunger(player);
								PerksCommand.closeInv(player);
								
								
								if(withdraw.type != ResponseType.SUCCESS) {
									
									player.sendMessage(withdraw.errorMessage);
									
								}
								
							}
							
						}
						
					}else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aJagt Lizenz")) {
						
						if(player.hasPermission((String) config.get("Perks.Jagt"))) {
							
							if(p.getString(player.getName() + ".Jagt") == null || p.getString(player.getName() + ".Jagt").equalsIgnoreCase("aus")) {
								
								p.set(player.getName() + ".Jagt", "an");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
							}else if(p.getString(player.getName() + ".Jagt").equalsIgnoreCase("an")) {
								
								p.set(player.getName() + ".Jagt", "aus");
								p.options().copyDefaults(true);
								try {
									p.save(perks);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								PerksCommand.OpenInv(player);
								
							}
							
						}else if(!player.hasPermission((String) config.get("Perks.Jagt"))) {
							
							Integer amount = (Integer) e.get("Perks.NG.10");
							
							if(!plugin.econ.hasAccount(player)) {
								
								player.sendMessage(MessagesUtil.KONTONOP);
								return;
								
							}
							
							if(!plugin.econ.has(player, amount)) {
								
								player.sendMessage(MessagesUtil.PAYWARN1 + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
								
							}else {
								
								EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
								
								ServerSystem.perkmanager.setPerkJagt(player);
								PerksCommand.closeInv(player);
								
								
								if(withdraw.type != ResponseType.SUCCESS) {
									
									player.sendMessage(withdraw.errorMessage);
									
								}
								
							}
							
						}
						
					}
				}
			}
			
		}
		
	}
	
	@EventHandler
	public void DMG(EntityDamageEvent event) {

		File file = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		File perks = new File("plugins//ServerSystem//Perks//User.yml");
		YamlConfiguration p = YamlConfiguration.loadConfiguration(perks);
		
		if(event.getEntity() instanceof Player) {
			
			Player player = (Player) event.getEntity();
			
			if(event.getCause().equals(DamageCause.FALL)) {
				
				if(player.hasPermission((String) config.get("Perks.Fallschaden"))) {
					
					if((String) p.get(player.getName() + ".Fallschaden") != null) {
						
						if(((String) p.get(player.getName() + ".Fallschaden")).equalsIgnoreCase("an")) {
							
							event.setCancelled(true);
							
						}
						
					}
					
				}
				
			}else if(event.getCause().equals(DamageCause.FIRE)  || (event.getCause().equals(DamageCause.FIRE_TICK) || (event.getCause().equals(DamageCause.LAVA)))) {
				
				if(player.hasPermission((String) config.get("Perks.Feuer"))) {
					
					if(p.getString(player.getName() + ".Feuerschaden") != null) {
						
						if(p.getString(player.getName() + ".Feuerschaden").equalsIgnoreCase("an")) {
							
							event.setCancelled(true);
							
						}
						
					}
					
				}
				
			}else if(event.getCause().equals(DamageCause.DROWNING)) {
				
				if(player.hasPermission((String) config.get("Perks.ertrinken"))) {
					
					if(p.getString(player.getName() + ".ertrinken") != null) {
						
						if(p.getString(player.getName() + ".ertrinken").equalsIgnoreCase("an")) {
							
							event.setCancelled(true);
							
						}
						
					}
					
				}
				
			}
			
		}
		
	}
	
	public void XP(PlayerExpChangeEvent event) {

		File file = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		File perks = new File("plugins//ServerSystem//Perks//User.yml");
		YamlConfiguration p = YamlConfiguration.loadConfiguration(perks);
		
		Player player = (Player) event.getPlayer();
		
		if(player.hasPermission((String) config.get("Perks.XP"))) {
			
			if(p.getString(player.getName() + ".DoppelteXP") != null) {
				
				if(p.getString(player.getName() + ".DopelteXP").equalsIgnoreCase("an")) {
					
					event.setAmount(event.getAmount()*2);
					
				}
				
			}
			
		}
		
	}
	
	@EventHandler
	public void Death(PlayerDeathEvent event) {

		File file = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		File perks = new File("plugins//ServerSystem//Perks//User.yml");
		YamlConfiguration p = YamlConfiguration.loadConfiguration(perks);
		
		Player player = event.getEntity();
		
		if(player.hasPermission((String) config.get("Perks.Tod"))) {
			
			if(p.getString(player.getName() + ".Tod") != null) {
				
				if(p.getString(player.getName() + ".Tod").equalsIgnoreCase("an")) {
					
					event.setKeepLevel(true);
					event.setDroppedExp(0);
					
				}
				
			}
			
		}
		
	}
	
	@EventHandler
	public void Hunger(FoodLevelChangeEvent event) {

		File file = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		File perks = new File("plugins//ServerSystem//Perks//User.yml");
		YamlConfiguration p = YamlConfiguration.loadConfiguration(perks);
		
		if(event.getEntity() instanceof Player) {
			
			Player player = (Player) event.getEntity();
			
			if(player.hasPermission((String) config.get("Perks.Hunger"))) {
				
				if(p.getString(player.getName() + ".Hunger") != null) {
					
					if(p.getString(player.getName() + ".Hunger").equalsIgnoreCase("an")) {
						
						event.setCancelled(true);
						
					}
					
				}
				
			}
			
		}
		
	}

}
