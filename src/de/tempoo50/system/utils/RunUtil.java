package de.tempoo50.system.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import de.tempoo50.system.main.ServerSystem;

public class RunUtil {

	private static ServerSystem plugin;

	public RunUtil(ServerSystem plugin) {
		RunUtil.plugin = plugin;
	}

	public void startScoreboard() {

		new BukkitRunnable() {


			public void run() {
				for (Player on : Bukkit.getOnlinePlayers()) {
					ScoreboardUtil.updateScoreboard(on);
				}

			}
		}.runTaskTimerAsynchronously(plugin, 0, 60 * 20);

	}

}
