package de.tempoo50.system.commands;

import de.tempoo50.system.utils.MessagesUtil;
import de.tempoo50.system.utils.ReportManager;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.ArrayList;
import java.util.UUID;

public class ReportCommand implements CommandExecutor {

	public static ArrayList<Player> reporteter = new ArrayList<>();

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		File file = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		if (command.getName().equalsIgnoreCase("report")) {
			if (args.length == 0) {

				sender.sendMessage(MessagesUtil.PREFIX + "§cBitte benutze §b/report <Spieler> <Grund>");

			} else if (args.length > 1) {

				UUID uuid = ReportManager.getUUIDFromName(args[0]);
				String target = args[0];
				String grund = "";

				for (int i = 1; i < args.length; i++) {
					grund = grund + args[i] + " ";
				}

				Player tar = Bukkit.getServer().getPlayer(target);
				if (tar != null) {

					reporteter.add(tar);
					ReportManager.reportPlayer(uuid, args[0], grund, sender);

					for (Player all : Bukkit.getOnlinePlayers()) {
						if (all.hasPermission((String) config.get("Report"))) {

							all.sendMessage("§6=== " + MessagesUtil.PREFIX + "§6===");
							all.sendMessage(MessagesUtil.PREFIX + "§cReport ersteller: §6" + sender.getName());
							all.sendMessage(MessagesUtil.PREFIX + "§cBeschuldigter: §6" + tar.getName());
							all.sendMessage(MessagesUtil.PREFIX + "§cGrund: §6" + grund);
							all.sendMessage(MessagesUtil.PREFIX + "§7>>>>");
							all.sendMessage(MessagesUtil.PREFIX + "§3Beschuldigter IP-Adresse: §6"
									+ tar.getAddress().getAddress());
							all.sendMessage(MessagesUtil.PREFIX + "§2Nutze §2§l/spec " + tar.getName()
									+ "§2, um diesen Report zu bearbeiten!");
							all.sendMessage("§6=== " + MessagesUtil.PREFIX + "§6===");

						}
					}

					sender.sendMessage(MessagesUtil.PREFIX
							+ "§aDein Report wurde erfolgreich eingereicht! Alle Teammitglieder werden informiert");

				} else
					sender.sendMessage(MessagesUtil.PREFIX + "§cDer angegebene Spieler ist nicht Online!");

			} else
				sender.sendMessage(MessagesUtil.PREFIX + "§bBitte benutze §6/report <Spieler> <Grund>");
		}

		return false;
	}

}
