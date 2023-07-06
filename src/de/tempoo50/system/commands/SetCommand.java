package de.tempoo50.system.commands;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;
import net.milkbowl.vault.economy.EconomyResponse;
import net.milkbowl.vault.economy.EconomyResponse.ResponseType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class SetCommand implements CommandExecutor {

	private ServerSystem plugin = ServerSystem.getPlugin();

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {

			Player player = (Player) sender;

			File file = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
			
			if(player.hasPermission((String) config.get("Eco.Set")))
			if (args.length == 2) {

				Player target = Bukkit.getPlayer(args[0]);
				Integer setAmount = Integer.valueOf(args[1]);

				if (target != null) {

					double amount = plugin.econ.getBalance(target);
					EconomyResponse result = plugin.econ.withdrawPlayer(target, amount);

					if (result.type == ResponseType.SUCCESS) {

						plugin.econ.depositPlayer(target, setAmount);

						player.sendMessage(target.getName() + MessagesUtil.SETP + setAmount);
						target.sendMessage(MessagesUtil.SETT + setAmount);

					} else {

						player.sendMessage(result.errorMessage);

					}

				} else

					player.sendMessage(MessagesUtil.NOPLAYER + target.getName());

			}
		}
		return false;
	}

}