package de.tempoo50.system.commands;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.tempoo50.system.utils.MessagesUtil;

public class FailCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {

			Player player = (Player) sender;

			if (args.length == 0) {

				Bukkit.broadcastMessage(MessagesUtil.FAIL);
				playSoundforAll(Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, 1, 2);

			}

		}

		return false;
	}

	private void playSoundforAll(Sound sound, Integer v1, Integer v2) {

		Bukkit.getOnlinePlayers().forEach(o -> o.playSound(o.getLocation(), sound, v1, v2));

	}

}
