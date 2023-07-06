package de.tempoo50.system.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.tempoo50.system.main.ServerSystem;

public class ChatSupportListener implements Listener {

	private ServerSystem plugin;

	public ChatSupportListener(ServerSystem plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		Player player = e.getPlayer();
		if (plugin.needHelp.contains(player.getName())) {
			e.setCancelled(true);
			Bukkit.broadcastMessage("§c[§4!§c] §f<" + player.getName() + "> " + e.getMessage());
		}
		if (plugin.supportChat.containsKey(player.getName())) {
			Player target = Bukkit.getPlayer(plugin.supportChat.get(player.getName()));
			e.setCancelled(true);
			player.sendMessage(
					"§b§lSUPPORT §8§ §a" + "me" + " §7-> §c" + target.getName() + "§r: " + e.getMessage());
			target.sendMessage(
					"§b§lSUPPORT §8§ §a" + player.getName() + " §7-> §c" + "me" + "§r: " + e.getMessage());
		}
	}
}
