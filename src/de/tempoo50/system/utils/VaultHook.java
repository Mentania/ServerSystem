package de.tempoo50.system.utils;

import de.tempoo50.system.main.*;
import de.tempoo50.system.api.*;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.ServicePriority;

public class VaultHook {

	private ServerSystem plugin = ServerSystem.getPlugin();
	private CoinAPI provider;

	public void hook() {

		provider = plugin.econ;
		Bukkit.getServicesManager().register(Economy.class, this.provider, this.plugin, ServicePriority.Normal);

	}

	public void unhook() {

		Bukkit.getServicesManager().unregister(Economy.class, this.provider);

	}
}
