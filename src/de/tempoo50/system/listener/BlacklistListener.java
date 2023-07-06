package de.tempoo50.system.listener;
//
//import java.io.File;
//
//import org.bukkit.configuration.file.FileConfiguration;
//import org.bukkit.configuration.file.YamlConfiguration;
//import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
//
public class BlacklistListener implements Listener {
//
	@EventHandler(priority = EventPriority.HIGHEST)
	public void Blacklist(AsyncPlayerChatEvent event) {
//
//		String msg = event.getMessage().toLowerCase().trim();
//		Player player = event.getPlayer();
//
//		File file = new File("plugins//ServerSystem//Chat//blacklist.yml");
//		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
//
//		String blocked1 = config.getString("BlockedMessage1");
//		String blocked2 = config.getString("BlockedMessage2");
//		String blocked3 = config.getString("BlockedMessage3");
//		String blocked4 = config.getString("BlockedMessage4");
//		String blocked5 = config.getString("BlockedMessage5");
//		String blocked6 = config.getString("BlockedMessage6");
//		String blocked7 = config.getString("BlockedMessage7");
//		String blocked8 = config.getString("BlockedMessage8");
//		String blocked9 = config.getString("BlockedMessage9");
//		String blocked10 = config.getString("BlockedMessage10");
//		String blocked11 = config.getString("BlockedMessage11");
//		String blocked12 = config.getString("BlockedMessage12");
//		String blocked13 = config.getString("BlockedMessage13");
//		String blocked14 = config.getString("BlockedMessage14");
//		String blocked15 = config.getString("BlockedMessage15");
//		String blocked16 = config.getString("BlockedMessage16");
//		String blocked17 = config.getString("BlockedMessage17");
//		String blocked18 = config.getString("BlockedMessage18");
//		String blocked19 = config.getString("BlockedMessage19");
//		String blocked20 = config.getString("BlockedMessage20");
//		String blocked21 = config.getString("BlockedMessage21");
//		String blocked22 = config.getString("BlockedMessage22");
//		String blocked23 = config.getString("BlockedMessage23");
//		String blocked24 = config.getString("BlockedMessage24");
//		String blocked25 = config.getString("BlockedMessage25");
//		String blocked26 = config.getString("BlockedMessage26");
//		String blocked27 = config.getString("BlockedMessage27");
//		String blocked28 = config.getString("BlockedMessage28");
//		String blocked29 = config.getString("BlockedMessage29");
//		String blocked30 = config.getString("BlockedMessage30");
//
//		try {
//			if ((msg.contains(blocked1) || (msg.contains(blocked2) || (msg.contains(blocked3) || (msg.contains(blocked4)
//					|| (msg.contains(blocked5) || (msg.contains(blocked6) || (msg.contains(blocked7) || (msg.contains(
//							blocked8)
//							|| (msg.contains(blocked9) || (msg.contains(blocked10) || (msg.contains(blocked11) || (msg
//									.contains(blocked12)
//									|| (msg.contains(blocked13) || (msg.contains(blocked14) || (msg.contains(blocked15)
//											|| (msg.contains(blocked16) || (msg.contains(blocked17) || (msg
//													.contains(blocked18)
//													|| (msg.contains(blocked19) || (msg.contains(blocked20) || (msg
//															.contains(blocked21)
//															|| (msg.contains(blocked22) || (msg.contains(blocked23)
//																	|| (msg.contains(blocked24) || (msg
//																			.contains(blocked25)
//																			|| (msg.contains(blocked26) || (msg
//																					.contains(blocked27)
//																					|| (msg.contains(blocked28) || (msg
//																							.contains(blocked29)
//																							|| (msg.contains(
//																									blocked30)))))))))))))))))))))))))))))))) {
//				event.setCancelled(true);
//				player.sendMessage((String) config.get("PlayerMessage"));
//			}
//		} catch (Exception e2) {
//
//		}
//
	}

}