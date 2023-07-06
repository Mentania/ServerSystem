package de.tempoo50.system.commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;

public class Support implements CommandExecutor {

	private ServerSystem plugin;

	public Support(ServerSystem plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;

			File perm = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

			if (args.length == 0) {
				if (!plugin.needHelp.contains(player.getName())) {
					plugin.needHelp.add(player.getName());
					player.sendMessage(MessagesUtil.SUPPORTA);
					for (String suppString : plugin.onlineSupporters) {
						Player supporter = Bukkit.getPlayer(suppString);
						if (supporter == null)
							return true;
						supporter.sendMessage(MessagesUtil.PREFIX + "§b" + player.getName() + MessagesUtil.SUPPORTB
								+ player.getName() + MessagesUtil.SUPPORTCB);
					}
				} else {
					player.sendMessage(MessagesUtil.SUPPORTCT);
				}
			} else if (args.length == 2) {
				if (player.hasPermission((String) per.get("Support.Chat"))) {
					if (args[0].equalsIgnoreCase("accept")) {
						Player target = Bukkit.getPlayer(args[1]);
						if (target != null) {
							if (plugin.needHelp.contains(target.getName())) {
								if (!plugin.supportChat.containsKey(player.getName())) {
									plugin.needHelp.remove(target.getName());
									plugin.supportChat.put(player.getName(), target.getName());
									plugin.supportChat.put(target.getName(), player.getName());
									target.sendMessage(MessagesUtil.SUPPORTCP + player.getName());
									player.sendMessage(MessagesUtil.SUPPORTCP + target.getName());
								} else {
									player.sendMessage(MessagesUtil.SUPPORTCB);
								}
							} else {
								player.sendMessage(MessagesUtil.SUPPORTNO);
							}
						} else {
							player.sendMessage(MessagesUtil.NOPLAYER + target.getName());
						}
					} else if (args[0].equalsIgnoreCase("close")) {
						Player target = Bukkit.getPlayer(args[1]);
						if (target != null) {
							if (plugin.supportChat.containsKey(player.getName())
									&& plugin.supportChat.containsValue(target.getName())) {
								plugin.supportChat.remove(player.getName());
								plugin.supportChat.remove(target.getName());
								target.sendMessage(MessagesUtil.SUPPORTCLP);
								player.sendMessage(MessagesUtil.SUPPORTCLP);
							} else {
								player.sendMessage(MessagesUtil.SUPPORTNOC);
							}
						} else {
							player.sendMessage(MessagesUtil.NOPLAYER + target.getName());
						}
					} else if (args[0].equalsIgnoreCase("deny")) {
						Player target = Bukkit.getPlayer(args[1]);
						if (target != null) {
							if (plugin.needHelp.contains(target.getName())) {
								plugin.needHelp.remove(target.getName());
								target.sendMessage(MessagesUtil.SUPPORTDT);
								player.sendMessage(MessagesUtil.SUPPORTDP + target.getName());
							} else {
								player.sendMessage(MessagesUtil.SUPPORTNO);
							}
						} else {
							player.sendMessage(MessagesUtil.NOPLAYER + target.getName());
						}
					} else {
						player.sendMessage(MessagesUtil.PREFIX + "§cFalsche Syntax!");
					}
				} else {
					player.sendMessage(MessagesUtil.NOPERM);
				}
			} else {
				player.sendMessage(MessagesUtil.PREFIX + "§cFalsche Syntax!");
			}

			return true;
		}
		return false;
	}
}
