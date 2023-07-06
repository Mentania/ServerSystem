package de.tempoo50.system.commands;

import java.io.File;
import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class EcCommand implements CommandExecutor {

	public static ArrayList<UUID> enderchest = new ArrayList<UUID>();

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (!(sender instanceof Player)) {
			sender.sendMessage("Du musst ein Spieler sein!");
			return true;
		}

		Player p = (Player) sender;

		File perm = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

		if (!p.hasPermission((String) per.get("Enderchest.Player"))) {
			p.sendMessage(MessagesUtil.NOPERM);
			return true;
		}

		if (args.length == 0) {
			p.openInventory(p.getEnderChest());
		}

		else if (args.length == 1) {
			if (!p.hasPermission((String) per.get("Enderchest.Other"))) {
				p.sendMessage(MessagesUtil.NOPERM);
				return true;
			}

			Player target = Bukkit.getPlayer(args[0]);
			if (target == null) {
				p.sendMessage(MessagesUtil.PREFIX + "§cDieser Spieler ist nicht online!");
				return true;
			}
			p.openInventory(target.getEnderChest());
			p.sendMessage(
					MessagesUtil.PREFIX + "§aDu schaust nun in die Enderchest von §b" + target.getName() + "§a.");
			enderchest.contains(p.getUniqueId());
		} else {
			p.sendMessage(MessagesUtil.PREFIX + "§cVerwendung: §b/" + label + "<Spieler>");
		}
		return false;
	}

}