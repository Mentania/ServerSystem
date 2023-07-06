package de.tempoo50.system.listener;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.tempoo50.system.utils.MessagesUtil;

public class ChatBlockListener implements Listener {

	public static boolean chatblock = true;

	@EventHandler
	public void onchatblock(AsyncPlayerChatEvent event) {

		File perm = new File("plugins//ServerSystem//Permission.yml");
		YamlConfiguration per = YamlConfiguration.loadConfiguration(perm);

		Player player = event.getPlayer();
		if (player.hasPermission((String) per.get("Chat.Block")))
			return;

		if (chatblock == false) {

			event.setCancelled(true);
			player.sendMessage(MessagesUtil.PREFIX + "§aDu kannst hier nicht schreiben!");
			return;

		}

	}

}
