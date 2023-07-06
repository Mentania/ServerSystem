package de.tempoo50.system.commands;

import de.tempoo50.system.signmanager.SignManager;
import de.tempoo50.system.utils.MessagesUtil;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class SignCommand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (!(sender instanceof Player)) {
			return false;
		}

		final Player player = ((Player) sender);

		File perm = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

		if (player.hasPermission((String) per.get("Sign"))) {

			if (args.length >= 1) {

				if (player.getItemInHand().getType() != Material.AIR) {
					for (int i = 0; i < 364; i++) {
						if (player.getItemInHand().getAmount() == i) {

							SignManager signManager = new SignManager(player.getItemInHand());

							//if (args[0].equalsIgnoreCase("del")) {

								//if (signManager.isSigned()) {
									//player.setItemInHand(signManager.unSign());
									//player.sendMessage(MessagesUtil.UNSIGN);
									//} else {
									//	player.sendMessage(MessagesUtil.NOSIGN);
									//}

									//} else {
									StringBuilder stringBuilder = new StringBuilder();

									for (String arg : args) {
										stringBuilder.append(arg).append(" ");
									}

									//if (!signManager.isSigned()) {
									player.setItemInHand(signManager.sign(player.getName(), stringBuilder.toString(),player.getPlayer()));
									//player.sendMessage(MessagesUtil.SIGN);
									//} else {
									//	player.sendMessage(MessagesUtil.ISSIGN);
									//}
								//}

							}
						}
					} else{
						player.sendMessage(MessagesUtil.RENAMENO);
					}
				} else {
					player.sendMessage(MessagesUtil.PREFIX + "§cBenutze: §b/sign <Nachricht>");

				}
			} else {
				player.sendMessage(MessagesUtil.NOPERM);
			}
			return false;
		}

}