package de.tempoo50.system.listener;

import de.tempoo50.system.api.ScoreboardAPI;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import java.io.File;

public class QuitListener implements Listener {

	@EventHandler
	public void handlePlayerRespawn(PlayerQuitEvent event) {

		Player p = event.getPlayer();

		ScoreboardAPI board = new ScoreboardAPI(p);

		File file = new File("plugins//ServerSystem//Spawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		if(board != null) {
			board.delete();
		}

		event.setQuitMessage((String) config.get("Message.Quit", ""));

	}

}
