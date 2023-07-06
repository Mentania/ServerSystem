package de.tempoo50.system.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;

import java.io.File;

public class PremiumCommand implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {

			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (player.hasPermission((String) per.get("Premium.give"))) {
				if (args.length == 1) {

					Player target = Bukkit.getPlayer(args[0]);

					if (target != null) {

						if (!target.hasPermission((String) per.get("Premium.Higher"))) {

							if (!ServerSystem.premiumManager.getAllowPremium(player)) {
								player.sendMessage(MessagesUtil.PREMIUMNO);
								long current = System.currentTimeMillis();
								long release = ServerSystem.premiumManager.getTime(player);
								long millis = release - current;
								player.sendMessage(
										MessagesUtil.PREFIX + ServerSystem.premiumManager.getRemainingTime(millis));
								return true;
							}
							player.sendMessage(MessagesUtil.PREMIUMYES1 + target.getName() + MessagesUtil.PREMIUMYES2);
							target.sendMessage(MessagesUtil.PREMIUMGIVE);
							ServerSystem.premiumManager.setPremium(player, target);

						} else {
							player.sendMessage(MessagesUtil.PREMIUMHAS1 + target.getName() + MessagesUtil.PREMIUMHAS2);
						}

					} else {
						player.sendMessage(MessagesUtil.NOPLAYER + target.getName());
					}

				} else {
					player.sendMessage(MessagesUtil.PREFIX + "§cBenutze §e/premium <Spieler>");
				}
			} else {
				player.sendMessage(MessagesUtil.NOPERM);
			}
		}

		return false;
	}
}