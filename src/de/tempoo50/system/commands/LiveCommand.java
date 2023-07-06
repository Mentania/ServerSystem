package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class LiveCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		File file = new File("plugins//ServerSystem//Live.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		File pfile = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration pconfig = YamlConfiguration.loadConfiguration(pfile);

		String p1 = (String) config.get("Live.Player1");
		String p2 = (String) config.get("Live.Player2");
		String p3 = (String) config.get("Live.Player3");
		String p4 = (String) config.get("Live.Player4");
		String p5 = (String) config.get("Live.Player5");
		String p6 = (String) config.get("Live.Player6");
		String p7 = (String) config.get("Live.Player7");
		String p8 = (String) config.get("Live.Player8");
		String p9 = (String) config.get("Live.Player9");
		String p10 = (String) config.get("Live.Player10");

		String l1 = ChatColor.translateAlternateColorCodes('&', (String) config.get("Live.Message1"));
		String l2 = ChatColor.translateAlternateColorCodes('&', (String) config.get("Live.Message2"));
		String l3 = ChatColor.translateAlternateColorCodes('&', (String) config.get("Live.Message3"));
		String l4 = ChatColor.translateAlternateColorCodes('&', (String) config.get("Live.Message4"));
		String l5 = ChatColor.translateAlternateColorCodes('&', (String) config.get("Live.Message5"));
		String l6 = ChatColor.translateAlternateColorCodes('&', (String) config.get("Live.Message6"));
		String l7 = ChatColor.translateAlternateColorCodes('&', (String) config.get("Live.Message7"));
		String l8 = ChatColor.translateAlternateColorCodes('&', (String) config.get("Live.Message8"));
		String l9 = ChatColor.translateAlternateColorCodes('&', (String) config.get("Live.Message9"));
		String l10 = ChatColor.translateAlternateColorCodes('&', (String) config.get("Live.Message10"));

		if (sender instanceof Player) {
			Player player = (Player) sender;

			if (args.length == 0) {

				player.sendMessage("§aBitte benutze §b/live <Spieler>");

			} else if (args[0].equalsIgnoreCase(p1)) {

				if (player.hasPermission((String) pconfig.get("Live.Player1"))) {

					if (args.length == 1) {

						Bukkit.broadcastMessage("§b" + p1 + " §aist gerade Live auf §b" + l1);
					}

				} else
					player.sendMessage(MessagesUtil.NOPERM);

			} else if (args[0].equalsIgnoreCase(p2)) {

				if (player.hasPermission((String) pconfig.get("Live.Player2"))) {

					if (args.length == 1) {

						Bukkit.broadcastMessage("§b" + p2 + " §aist gerade Live auf §b" + l2);
					}
				} else
					player.sendMessage(MessagesUtil.NOPERM);

			} else if (args[0].equalsIgnoreCase(p3)) {

				if (player.hasPermission((String) pconfig.get("Live.Player3"))) {

					if (args.length == 1) {

						Bukkit.broadcastMessage("§b" + p3 + " §aist gerade Live auf §b" + l3);

					}
				} else
					player.sendMessage(MessagesUtil.NOPERM);

			} else if (args[0].equalsIgnoreCase(p4)) {

				if (player.hasPermission((String) pconfig.get("Live.Player4"))) {

					if (args.length == 1) {

						Bukkit.broadcastMessage("§b" + p4 + " §aist gerade Live auf §b" + l4);

					}

				} else
					player.sendMessage(MessagesUtil.NOPERM);

			} else if (args[0].equalsIgnoreCase(p5)) {

				if (player.hasPermission((String) pconfig.get("Live.Player5"))) {

					if (args.length == 1) {

						Bukkit.broadcastMessage("§b" + p5 + " §aist gerade Live auf §b" + l5);

					}
				} else
					player.sendMessage(MessagesUtil.NOPERM);

			} else if (args[0].equalsIgnoreCase(p6)) {

				if (player.hasPermission((String) pconfig.get("Live.Player6"))) {

					if (args.length == 1) {

						Bukkit.broadcastMessage("§b" + p6 + " §aist gerade Live auf §b" + l6);

					}

				} else
					player.sendMessage(MessagesUtil.NOPERM);

			} else if (args[0].equalsIgnoreCase(p7)) {

				if (player.hasPermission((String) pconfig.get("Live.Player7"))) {

					if (args.length == 1) {

						Bukkit.broadcastMessage("§b" + p7 + " §aist gerade Live auf §b" + l7);

					}
				} else
					player.sendMessage(MessagesUtil.NOPERM);

			} else if (args[0].equalsIgnoreCase(p8)) {

				if (player.hasPermission((String) pconfig.get("Live.Player8"))) {

					if (args.length == 1) {

						Bukkit.broadcastMessage("§b" + p8 + " §aist gerade Live auf §b" + l8);

					}
				} else
					player.sendMessage(MessagesUtil.NOPERM);

			} else if (args[0].equalsIgnoreCase(p9)) {

				if (player.hasPermission((String) pconfig.get("Live.Player9"))) {

					if (args.length == 1) {

						Bukkit.broadcastMessage("§b" + p9 + " §aist gerade Live auf §b" + l9);

					}
				} else
					player.sendMessage(MessagesUtil.NOPERM);

			} else if (args[0].equalsIgnoreCase(p10)) {

				if (player.hasPermission((String) pconfig.get("Live.Player10"))) {

					if (args.length == 1) {

						Bukkit.broadcastMessage("§b" + p10 + " §aist gerade Live auf §b" + l10);
					}

				} else
					player.sendMessage(MessagesUtil.NOPERM);
			}

		}

		return false;
	}

}
