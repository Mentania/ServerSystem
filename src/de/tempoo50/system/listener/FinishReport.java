package de.tempoo50.system.listener;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import de.tempoo50.system.commands.AcceptReport;
import de.tempoo50.system.utils.MessagesUtil;

public class FinishReport implements Listener {

	@EventHandler
	public void onPlay(PlayerCommandPreprocessEvent event) {

		File file = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		if (event.getMessage().equals("/finish")) {

			Player player = event.getPlayer();
			if (player.hasPermission((String) config.get("Report"))) {

				if (AcceptReport.vanish.contains(player)) {

					player.sendMessage(MessagesUtil.PREFIX + "§aDu hast den Reportmodus verlassen!");
					player.teleport(AcceptReport.oldLoc.get(player));
					player.getInventory().clear();
					player.getInventory().setContents(AcceptReport.oldInv.get(player));
					player.setFlying(false);
					player.setAllowFlight(true);
					for (Player all : Bukkit.getOnlinePlayers()) {
						all.showPlayer(player);
					}
				} else
					player.sendMessage(MessagesUtil.NOPERM);

			}

		}

	}

}
