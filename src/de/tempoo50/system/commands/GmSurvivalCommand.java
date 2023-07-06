package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.listener.GameProtectionListener;
import de.tempoo50.system.listener.GodListener;
import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;

public class GmSurvivalCommand implements CommandExecutor {

	ServerSystem plugin;

	public GmSurvivalCommand(ServerSystem plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Gamemode.GM*"))) {
				if (args.length == 0) {

					player.setGameMode(GameMode.SURVIVAL);
					GodListener godListener = plugin.getGodListener();
					GameProtectionListener gameProtectionListener = plugin.getGameProtectionListener();
					godListener.getGodModePlayers().remove(player.getName());
					gameProtectionListener.getBuildModePlayers().remove(player.getName());

					player.sendMessage(MessagesUtil.GM0);
				} else if (player.hasPermission((String) per.get("Gamemode.GM*"))) {
					if (args.length == 1) {
						Player target = Bukkit.getPlayer(args[0]);
						if (target != null) {

							target.setGameMode(GameMode.SURVIVAL);
							target.sendMessage(MessagesUtil.GMO0);
							player.sendMessage(MessagesUtil.PREFIX + target.getName() + MessagesUtil.GMOO0);
						} else {
							player.sendMessage(MessagesUtil.NOPLAYER + args[0]);
						}

					} else {
						player.sendMessage(MessagesUtil.PREFIX + "§cBenutze §b/gm0 <Spieler>§c!");
					}
				} else {
					player.sendMessage(MessagesUtil.NOPERM);
				}

			} else if (player.hasPermission((String) per.get("Gamemode.GM0"))) {
				if (args.length == 0) {

					player.setGameMode(GameMode.SURVIVAL);
					GodListener godListener = plugin.getGodListener();
					godListener.getGodModePlayers().remove(player.getName());

					player.sendMessage(MessagesUtil.GM0);

				} else if (player.hasPermission((String) per.get("Gamemode.GM.Other0"))) {
					if (args.length == 1) {
						Player target = Bukkit.getPlayer(args[0]);
						if (target != null) {

							target.setGameMode(GameMode.SURVIVAL);
							target.sendMessage(MessagesUtil.GMO0);
							player.sendMessage(MessagesUtil.PREFIX + target.getName() + MessagesUtil.GMOO0);
						} else
							player.sendMessage(MessagesUtil.NOPLAYER + args[0]);
					} else {
						player.sendMessage(MessagesUtil.PREFIX + "§cBenutze §b/gm0 <Spieler>");
					}
				} else
					player.sendMessage(MessagesUtil.NOPERM);

			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;
	}

}
