package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

import de.tempoo50.system.utils.*;

public class ClanMessage implements CommandExecutor {

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("cm")) {
			if (args.length >= 1) {

				File perm = new File("plugins//ServerSystem//Permission.yml");
				YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

				if (sender.hasPermission((String) per.get("Clan.Create"))) {
					if (!(ClanPlayer.getClan(Bukkit.getOfflinePlayer(sender.getName())) == null)) {
						StringBuilder builder = new StringBuilder();
						for (int i = 0; i < args.length; i++) {
							builder.append(args[i]);
							builder.append(" ");
						}
						String result = builder.toString();
						Clanfunktionen.sendMessage(Bukkit.getOfflinePlayer(sender.getName()),
								ClanPlayer.getClan(Bukkit.getOfflinePlayer(sender.getName())), result);
					} else {
						sender.sendMessage(ClanUtil.prefix() + " " + ClanUtil.DubistinkeinemClan());
					}
				} else {
					sender.sendMessage(ClanUtil.prefix() + " " + MessagesUtil.NOPERM);
				}
			} else {
				sender.sendMessage(ClanUtil.prefix() + " " + "§cVerwende: §b/cm [Text]");
			}

		}
		return false;
	}

}
