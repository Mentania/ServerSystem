package de.tempoo50.system.listener;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.tempoo50.system.commands.JobsCommand;
import de.tempoo50.system.main.ServerSystem;

public class JobsListener implements Listener {

	private ServerSystem plugin = ServerSystem.getPlugin();
	
	@EventHandler
	
	public void Click(InventoryClickEvent event) {
		
		File job = new File("plugins//ServerSystem//Jobs//User.yml");
		YamlConfiguration jobs = YamlConfiguration.loadConfiguration(job);
		
		Player player = (Player) event.getWhoClicked();
		
		if(event.getView().getTitle().equalsIgnoreCase("§aJobs")) {
			
			event.setCancelled(true);
			
			if(event.getCurrentItem() != null) {
				
				if(event.getCurrentItem().getItemMeta() != null) {
					
					if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Holzfäller")) {
						
						if(player.hasPermission("sys.holz")) {
							
							if(!player.hasPermission("sys.mine") && !player.hasPermission("sys.bau")) {
							
								if(jobs.getString(player.getName() + ".Holzfäller") == null || ((String) jobs.get(player.getName() + ".Holzfäller")).equalsIgnoreCase("aus")) {
									
									jobs.set(player.getName() + ".Holzfäller", "an");
									
									jobs.options().copyDefaults(true);
									
									try {
										jobs.save(job);
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									
									JobsCommand.OpenInv(player);
									
								}else if(jobs.getString(player.getName() + ".Holzfäller").equalsIgnoreCase("an")) {
									
									jobs.set(player.getName() + ".Holzfäller", "aus");
									
									jobs.options().copyDefaults(true);
									
									try {
										jobs.save(job);
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									
								}
								
							}
							
						}else if(!player.hasPermission("sys.holz")) {
							
							if(!player.hasPermission("sys.mine") && !player.hasPermission("sys.bau")) {

								ServerSystem.jobsmanager.setJobHolzfäller(player);
								JobsCommand.closeInv(player);
								
							}else
								
								player.sendMessage("Du kannst nur einen Beruf besitzen");
							
						}
						
					}
					
				}
				
			}
			
		}
		
	}
	
}
