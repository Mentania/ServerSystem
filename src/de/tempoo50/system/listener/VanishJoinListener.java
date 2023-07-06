
package de.tempoo50.system.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.tempoo50.system.commands.AcceptReport;
import de.tempoo50.system.commands.VanishCommand;

public class VanishJoinListener implements Listener {

	File perm = new File("plugins//ServerSystem//Permission.yml");
	YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {

		for (Player all : Bukkit.getOnlinePlayers()) {
			if (AcceptReport.vanish.contains(all)) {
				Player player = event.getPlayer();
				player.hidePlayer(all);
			}
		}

		for (Player vanish : VanishCommand.vanished) {

			if (!event.getPlayer().hasPermission((String) per.get("Vanish.Player"))) {
				event.getPlayer().hidePlayer(vanish);

			}
		}
	}

}
