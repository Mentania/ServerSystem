package de.tempoo50.system.commands;

import de.tempoo50.system.utils.MessagesUtil;
import net.milkbowl.vault.economy.EconomyResponse;
import net.milkbowl.vault.economy.EconomyResponse.ResponseType;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.tempoo50.system.main.ServerSystem;

public class PayCommand implements CommandExecutor {

	private ServerSystem plugin = ServerSystem.getPlugin();

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {

			Player player = (Player) sender;

			if (args.length == 2) {

				Player target = Bukkit.getPlayer(args[0]);
				Integer amount = Integer.valueOf(args[1]);

				if (target != null) {

					if (!plugin.econ.hasAccount(player)) {

						player.sendMessage(MessagesUtil.KONTONOP);
						return true;

					}

					if (!plugin.econ.hasAccount(target)) {

						player.sendMessage(target.getName() + MessagesUtil.KONTONOT);
						return true;

					}

					if (!plugin.econ.has(player, amount)) {

						player.sendMessage(MessagesUtil.PAYWARN1 + amount + " " + plugin.econ.currencyNameSingular() + MessagesUtil.PAYWARN2);
						return true;

					} else {

						EconomyResponse withdraw = plugin.econ.withdrawPlayer(player.getName(), amount);
						if(withdraw.type != ResponseType.SUCCESS) {
							player.sendMessage(withdraw.errorMessage);
						}else {
							EconomyResponse deposit = plugin.econ.depositPlayer(target.getName(), amount);
							if(deposit.type != ResponseType.SUCCESS) {
								player.sendMessage(deposit.errorMessage);
							}else {															
								player.sendMessage(MessagesUtil.PAYP1 + target.getName() + MessagesUtil.PAYP2 + amount + MessagesUtil.PAYP3);
								target.sendMessage(player.getName() + MessagesUtil.PAYT1 + amount + MessagesUtil.PAYT2);
							}
						}					
					}

				} else

					player.sendMessage(MessagesUtil.NOPLAYER + target.getName());

			}

		}

		return false;

	}

}