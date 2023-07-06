package de.tempoo50.system.utils;

import de.tempoo50.system.api.ScoreboardAPI;
import de.tempoo50.system.main.ServerSystem;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class ScoreboardUtil {

	private static ServerSystem plugin = ServerSystem.getPlugin();

	static File file = new File("plugins//ServerSystem//Scoreboard.yml");
	static YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

	public static void loadScoreboard(Player player) {

		ScoreboardAPI board = new ScoreboardAPI(player);

		board.updateTitle(ChatColor.GOLD + (String) config.get("Scoreboard.Header"));
		board.updateLines(

				"",
				"§6Server",
				(String) config.get("Scoreboard.Server"),
				"",
				"§6Name",
				player.getDisplayName(),
				"",
				"§6Online",
				"§d§l" + Bukkit.getOnlinePlayers().size() + "§b§l/§c§l" + Bukkit.getMaxPlayers(),
				"",
				"§6Kontostand",
				"§d§l" + plugin.econ.format(plugin.econ.getBalance(player.getName())),
				""

				);

	}

	public static void updateScoreboard(Player player) {

		ScoreboardAPI board = new ScoreboardAPI(player);

		board.updateTitle(ChatColor.GOLD + (String) config.get("Scoreboard.Header"));
		board.updateLines(

				"",
				"§6Server",
				(String) config.get("Scoreboard.Server"),
				"",
				"§6Name",
				player.getDisplayName(),
				"",
				"§6Online",
				"§d§l" + Bukkit.getOnlinePlayers().size() + "§b§l/§c§l" + Bukkit.getMaxPlayers(),
				"",
				"§6Kontostand",
				"§d§l" + plugin.econ.format(plugin.econ.getBalance(player.getName())),
				""

		);

	}



/*	public static void loadScoreBoard(Player player) {

		Scoreboard board = new Scoreboard();

		ScoreboardObjective obj = new ScoreboardObjective(board, "Test §<-- geht", IScoreboardCriteria.b, IChatBaseComponent.a((String) config.get("Scoreboard.Header")), IScoreboardCriteria.EnumScoreboardHealthDisplay.b);

		PacketPlayOutScoreboardObjective createPacket = new PacketPlayOutScoreboardObjective(obj, 0);
		PacketPlayOutScoreboardObjective removePacket = new PacketPlayOutScoreboardObjective(obj, 1);
		PacketPlayOutScoreboardDisplayObjective display = new PacketPlayOutScoreboardDisplayObjective(1, obj);

		obj.setDisplayName(IChatBaseComponent.a((String) config.get("Scoreboard.Header")));

		ScoreboardScore s01 = new ScoreboardScore(board, obj, "§c");
		ScoreboardScore s02 = new ScoreboardScore(board, obj, "§6Server");
		ScoreboardScore s03 = new ScoreboardScore(board, obj, "§b" + Bukkit.getServer().getName());
		ScoreboardScore s04 = new ScoreboardScore(board, obj, "§4");
		ScoreboardScore s05 = new ScoreboardScore(board, obj, "§6Name");
		ScoreboardScore s06 = new ScoreboardScore(board, obj, player.getDisplayName());
		ScoreboardScore s07 = new ScoreboardScore(board, obj, "§1");
		ScoreboardScore s08 = new ScoreboardScore(board, obj, "§6Online");
		ScoreboardScore s09 = new ScoreboardScore(board, obj, "§d§l" + Bukkit.getOnlinePlayers().size() + "§b§l/§c§l" + Bukkit.getMaxPlayers());
		ScoreboardScore s10 = new ScoreboardScore(board, obj, "§0");
        ScoreboardScore s11 = new ScoreboardScore(board, obj, "§6Kontostand");
        ScoreboardScore s12 = new ScoreboardScore(board, obj, "§d§l" + plugin.econ.format(plugin.econ.getBalance(player.getName())));
        ScoreboardScore s13 = new ScoreboardScore(board, obj, "§3");

		s01.setScore(13);
		s02.setScore(12);
		s03.setScore(11);
		s04.setScore(10);
		s05.setScore(9);
		s06.setScore(8);
		s07.setScore(7);
		s08.setScore(6);
		s09.setScore(5);
		s10.setScore(4);
		s11.setScore(3);
		s12.setScore(2);
		s13.setScore(1);

		PacketPlayOutScoreboardScore ps01 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§1", 13);
		PacketPlayOutScoreboardScore ps02 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§6Server", 12);
		PacketPlayOutScoreboardScore ps03 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", (String) config.get("Scoreboard.Server"), 11);
		PacketPlayOutScoreboardScore ps04 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§2", 10);
		PacketPlayOutScoreboardScore ps05 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§6Name", 9);
		PacketPlayOutScoreboardScore ps06 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", player.getDisplayName(), 8);
		PacketPlayOutScoreboardScore ps07 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§3", 7);
		PacketPlayOutScoreboardScore ps08 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§6Online", 6);
		PacketPlayOutScoreboardScore ps09 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§d§l" + Bukkit.getOnlinePlayers().size() + "§b§l/§c§l" + Bukkit.getMaxPlayers(), 5);
		PacketPlayOutScoreboardScore ps10 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§4", 4);
		PacketPlayOutScoreboardScore ps11 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§6Kontostand", 3);
		PacketPlayOutScoreboardScore ps12 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§d§l" + plugin.econ.format(plugin.econ.getBalance(player.getName())), 2);
		PacketPlayOutScoreboardScore ps13 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§5", 1);

		sendPacket(player, removePacket);
		sendPacket(player, createPacket);
		sendPacket(player, display);
		sendPacket(player, ps01);
		sendPacket(player, ps02);
		sendPacket(player, ps03);
		sendPacket(player, ps04);
		sendPacket(player, ps05);
		sendPacket(player, ps06);
		sendPacket(player, ps07);
		sendPacket(player, ps08);
		sendPacket(player, ps09);
		sendPacket(player, ps10);
		sendPacket(player, ps11);
		sendPacket(player, ps12);
		sendPacket(player, ps13);

	}

	public static void updateScoreboard(Player player) {

		Scoreboard board = new Scoreboard();

		ScoreboardObjective obj = new ScoreboardObjective(board, "Test §<-- geht", IScoreboardCriteria.b, IChatBaseComponent.a((String) config.get("Scoreboard.Header")), IScoreboardCriteria.EnumScoreboardHealthDisplay.b);

		PacketPlayOutScoreboardObjective createPacket = new PacketPlayOutScoreboardObjective(obj, 0);
		PacketPlayOutScoreboardObjective removePacket = new PacketPlayOutScoreboardObjective(obj, 1);
		PacketPlayOutScoreboardDisplayObjective display = new PacketPlayOutScoreboardDisplayObjective(1, obj);

		obj.setDisplayName(IChatBaseComponent.a((String) config.get("Scoreboard.Header")));
		
		ScoreboardScore s01 = new ScoreboardScore(board, obj, "§c");
		ScoreboardScore s02 = new ScoreboardScore(board, obj, "§6Server");
		ScoreboardScore s03 = new ScoreboardScore(board, obj, "§b" + Bukkit.getServer().getName());
		ScoreboardScore s04 = new ScoreboardScore(board, obj, "§4");
		ScoreboardScore s05 = new ScoreboardScore(board, obj, "§6Name");
		ScoreboardScore s06 = new ScoreboardScore(board, obj, player.getDisplayName());
		ScoreboardScore s07 = new ScoreboardScore(board, obj, "§1");
		ScoreboardScore s08 = new ScoreboardScore(board, obj, "§6Online");
		ScoreboardScore s09 = new ScoreboardScore(board, obj, "§d§l" + Bukkit.getOnlinePlayers().size() + "§b§l/§c§l" + Bukkit.getMaxPlayers());
		ScoreboardScore s10 = new ScoreboardScore(board, obj, "§0");
        ScoreboardScore s11 = new ScoreboardScore(board, obj, "§6Kontostand");
        ScoreboardScore s12 = new ScoreboardScore(board, obj, "§d§l" + plugin.econ.format(plugin.econ.getBalance(player.getName())));
        ScoreboardScore s13 = new ScoreboardScore(board, obj, "§3");

		s01.setScore(13);
		s02.setScore(12);
		s03.setScore(11);
		s04.setScore(10);
		s05.setScore(9);
		s06.setScore(8);
		s07.setScore(7);
		s08.setScore(6);
		s09.setScore(5);
		s10.setScore(4);
		s11.setScore(3);
		s12.setScore(2);
		s13.setScore(1);

		PacketPlayOutScoreboardScore ps01 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§1", 13);
		PacketPlayOutScoreboardScore ps02 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§6Server", 12);
		PacketPlayOutScoreboardScore ps03 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", (String) config.get("Scoreboard.Server"), 11);
		PacketPlayOutScoreboardScore ps04 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§2", 10);
		PacketPlayOutScoreboardScore ps05 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§6Name", 9);
		PacketPlayOutScoreboardScore ps06 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", player.getDisplayName(), 8);
		PacketPlayOutScoreboardScore ps07 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§3", 7);
		PacketPlayOutScoreboardScore ps08 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§6Online", 6);
		PacketPlayOutScoreboardScore ps09 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§d§l" + Bukkit.getOnlinePlayers().size() + "§b§l/§c§l" + Bukkit.getMaxPlayers(), 5);
		PacketPlayOutScoreboardScore ps10 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§4", 4);
		PacketPlayOutScoreboardScore ps11 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§6Kontostand", 3);
		PacketPlayOutScoreboardScore ps12 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§d§l" + plugin.econ.format(plugin.econ.getBalance(player.getName())), 2);
		PacketPlayOutScoreboardScore ps13 = new PacketPlayOutScoreboardScore(ScoreboardServer.Action.a, "Test §<-- geht", "§5", 1);

		sendPacket(player, removePacket);
		sendPacket(player, createPacket);
		sendPacket(player, display);
		sendPacket(player, ps01);
		sendPacket(player, ps02);
		sendPacket(player, ps03);
		sendPacket(player, ps04);
		sendPacket(player, ps05);
		sendPacket(player, ps06);
		sendPacket(player, ps07);
		sendPacket(player, ps08);
		sendPacket(player, ps09);
		sendPacket(player, ps10);
		sendPacket(player, ps11);
		sendPacket(player, ps12);
		sendPacket(player, ps13);
	}

	public static void sendPacket(Player player, Packet<?> packet) {

		((CraftPlayer) player).getHandle().b.sendPacket(packet);

	}
*/
}
