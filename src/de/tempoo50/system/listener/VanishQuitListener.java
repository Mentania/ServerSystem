package de.tempoo50.system.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import de.tempoo50.system.commands.VanishCommand;

public class VanishQuitListener implements Listener {

	@EventHandler
	public void onQuit(PlayerQuitEvent event) {

		if (VanishCommand.vanished.contains(event.getPlayer()))
			VanishCommand.vanished.remove(event.getPlayer());
	}

}
