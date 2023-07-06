package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.listener.GameProtectionListener;
import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;

public class BuildCommand implements CommandExecutor {

	private ServerSystem plugin;

	public BuildCommand(ServerSystem plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Gamemode.GM5"))) {
				if (args.length == 0) {
					GameProtectionListener gameProtectionListener = plugin.getGameProtectionListener();
					if (!gameProtectionListener.getBuildModePlayers().contains(player.getName())) {
						gameProtectionListener.getBuildModePlayers().add(player.getName());
						player.setGameMode(GameMode.CREATIVE);
						player.sendMessage(MessagesUtil.GM5Y);

					} else {

						gameProtectionListener.getBuildModePlayers().remove(player.getName());
						player.sendMessage(MessagesUtil.GM5N);
					}

				} else
					player.sendMessage("§cBitte benutze §b/build§c!");
			} else
				player.sendMessage(MessagesUtil.NOPERM);
		}

		return false;
	}

}
