package de.tempoo50.system.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.io.File;
import java.text.SimpleDateFormat;

import de.tempoo50.system.kopfmanager.ErschaffeKopf;
import de.tempoo50.system.utils.MessagesUtil;

public class KopfCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

		if (!(sender instanceof Player)) {

			return false;
		}

		Player p = ((Player) sender);

		File perm = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

		if (!p.hasPermission((String) per.get("Kopf.Player"))) {
			p.sendMessage(MessagesUtil.NOPERM);
			return false;
		}

		if (args.length == 1) {
			if (ErschaffeKopf.canGetSkull(p)) {
				ErschaffeKopf.setWatingTime(p);
				ItemStack item = new ItemStack(Material.PLAYER_HEAD, 1, (byte) 3);
				SkullMeta im = (SkullMeta) item.getItemMeta();
				im.setOwner(args[0]);
				im.setDisplayName("§6Kopf von " + args[0]);
				item.setItemMeta(im);
				p.getInventory().addItem(item);
				p.sendMessage(MessagesUtil.KOPFY + args[0]);
				playSoundForAll(Sound.ENTITY_WITHER_DEATH, 1, 2);
			} else {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
				p.sendMessage(MessagesUtil.KOPFN1 + simpleDateFormat.format(ErschaffeKopf.getRemindingTIme(p))
						+ MessagesUtil.KOPFN2);
			}
		} else {
			if (ErschaffeKopf.canGetSkull(p)) {
				p.sendMessage(MessagesUtil.PREFIX + "§cBenutze: §b/kopf <Spieler>");
			} else {
				p.sendMessage(MessagesUtil.PREFIX + "§cBenutze: §b/kopf <Spieler>");
			}
		}

		return false;
	}

	private void playSoundForAll(Sound sound, Integer v1, Integer v2) {
		Bukkit.getOnlinePlayers().forEach(o -> o.playSound(o.getLocation(), sound, v1, v2));
	}
}