package de.tempoo50.system.commands;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class EcoCommand implements CommandExecutor {

	private ServerSystem plugin = ServerSystem.getPlugin();

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {

			Player player = (Player) sender;
			
			File file = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

			if (args.length == 0) {

				if (!ServerSystem.getPlugin().econ.hasAccount(player)) {

					player.sendMessage(MessagesUtil.KONTONOP);

				} else {

					player.sendMessage(
							MessagesUtil.ECOP + plugin.econ.format(plugin.econ.getBalance(player.getName())));

				}

			} else if (player.hasPermission((String) config.get("Eco.Eco"))) {

				if (args.length == 1) {

					Player target = Bukkit.getPlayer(args[0]);
					
					if(target != null) {
					
						if (!ServerSystem.getPlugin().econ.hasAccount(target)) {

							player.sendMessage(MessagesUtil.KONTONOT);

						} else {

							player.sendMessage(MessagesUtil.PREFIX + target.getName() + MessagesUtil.ECOT + plugin.econ.format(ServerSystem.getPlugin().econ.getBalance(target)));

					
						}

					}else
						
						player.sendMessage(MessagesUtil.NOPLAYER + args[0]);
						
				}

			} else {

				player.sendMessage(MessagesUtil.NOPERM);

			}

		}

		return false;

	}

}
