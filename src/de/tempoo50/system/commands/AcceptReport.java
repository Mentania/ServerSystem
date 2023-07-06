package de.tempoo50.system.commands;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.tempoo50.system.utils.MessagesUtil;

public class AcceptReport implements CommandExecutor {

	public static HashMap<Player, ItemStack[]> oldInv = new HashMap<Player, ItemStack[]>();
	public static HashMap<Player, Location> oldLoc = new HashMap<Player, Location>();
	public static ArrayList<Player> vanish = new ArrayList<Player>();

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		File file = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		if (sender instanceof Player) {

			Player player = (Player) sender;
			if (command.getName().equalsIgnoreCase("spec")) {

				if (player.hasPermission((String) config.get("Report"))) {

					if (args.length == 1) {

						String target = args[0];
						Player tar = Bukkit.getServer().getPlayer(target);
						if (tar != null) {

							if (ReportCommand.reporteter.contains(tar)) {

								oldInv.put(player, player.getInventory().getContents());
								player.closeInventory();
								ItemStack barrier = new ItemStack(Material.BARRIER);
								ItemMeta bm = barrier.getItemMeta();
								bm.setDisplayName("§cReportmodus");
								barrier.setItemMeta(bm);
								player.getInventory().setItem(4, barrier);
								oldLoc.put(player, player.getLocation());

								for (Player all : Bukkit.getOnlinePlayers()) {
									all.hidePlayer(player);
									if (all.hasPermission((String) config.get("Report"))) {
										all.sendMessage(MessagesUtil.PREFIX + "§b" + player.getName()
												+ " §6kümmert sich nun um §b" + tar.getName() + "§6!");
									}
								}

								vanish.add(player);
								player.setFlying(true);
								player.setAllowFlight(true);
								player.teleport(tar.getLocation());
								player.sendMessage(
										MessagesUtil.PREFIX + "§bDu beobachtest nun §c" + tar.getName() + "§b!");
								ReportCommand.reporteter.remove(tar);
								player.sendMessage("§6=== " + MessagesUtil.PREFIX + "§6===");
								player.sendMessage(
										MessagesUtil.PREFIX + "§bNutze §6/finish §bum den Report zu beenden!");

							} else
								player.sendMessage(MessagesUtil.PREFIX
										+ "§cFür diesen Spieler ist kein offener Report vorhanden!");

						} else
							player.sendMessage(MessagesUtil.PREFIX + "§cDer angegebene Spieler ist nicht Online!");

					} else
						player.sendMessage(MessagesUtil.PREFIX + "§c/spec <spieler>");

				} else
					player.sendMessage(MessagesUtil.NOPERM);

			}

		}

		return false;
	}

}
