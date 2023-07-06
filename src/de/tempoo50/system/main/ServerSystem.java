package de.tempoo50.system.main;

import de.tempoo50.system.commands.*;
import de.tempoo50.system.data.*;
import de.tempoo50.system.files.*;
import de.tempoo50.system.listener.*;
import de.tempoo50.system.mysql.*;
import de.tempoo50.system.utils.*;
import de.tempoo50.system.api.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ServerSystem extends JavaPlugin {

	private static ServerSystem plugin;
	private static ServerSystem inctance;
	
	public CoinAPI econ = null;
	public InsertTabeUtil table = null;
	public SelectTableUtil select = null;

	private VaultHook vaulthook;

	public static HashMap<Player, KopfPlayer> players = new HashMap<>();
	public static HashMap<Player, ChestPlayer> chests = new HashMap<>();
	public static HashMap<Player, Player> chat = new HashMap<>();
	public static HashMap<Player, KitPlayer> kits = new HashMap<>();
	public static HashMap<Player, Player> tpa = new HashMap<Player, Player>();
	public HashMap<String, String> supportChat = new HashMap<>();
	
	public String supporterPermission;
	
	public List<String> needHelp = new LinkedList<String>();
	public List<String> onlineSupporters = new ArrayList<String>();

	private GodListener godModeListener;
	public static BelohnungsManager behlohnungsManager;
	private GameProtectionListener gameProtectionListener;
	public static PremiumManager premiumManager;
	public static PerkManager perkmanager;
	private WorldHandler worldHandler;
	public static JobsManager jobsmanager;

	public void onEnable() {

		plugin = this;
		inctance = this;

		econ = new CoinAPI();
		table = new InsertTabeUtil();
		select = new SelectTableUtil();
		worldHandler = new WorldHandler();
		vaulthook = new VaultHook();
		vaulthook.hook();

		new Broadcaster(this).startBroadcast();
		new RecipeLoader().registerRecipes();
		ServerSystem.behlohnungsManager = new BelohnungsManager();
		ServerSystem.premiumManager = new PremiumManager();
		ServerSystem.perkmanager = new PerkManager();
		ServerSystem.jobsmanager = new JobsManager();
		godModeListener = new GodListener(this);
		gameProtectionListener = new GameProtectionListener(this);

		try {

			loadFile();
			
			TablistUtil.loadTab();
			loadTimer();
			loadCommands();
			loadListener(Bukkit.getPluginManager());

			MySQLPlayer.connect();
			MySQLPlayer.createTable();
			
			MySQL.connect();
			MySQL.createTable();
			
			new PlayerTimer(this).startTimer();

			if (Data.useMySQL) {

				loadMySQL();
				Bukkit.getOnlinePlayers().forEach(p -> p.kickPlayer("Server reload!"));

			}

			if (DataKit.useMySQL) {
				loadMySQL();
				Bukkit.getOnlinePlayers().forEach(p -> p.kickPlayer("Server reload!"));

			}

			if (DataChest.useMySQL) {

				loadMySQL();
				Bukkit.getOnlinePlayers().forEach(p -> p.kickPlayer("Server reload!"));

			}
			
//			if(DataBan.useMySQL) {
//				
//				loadMySQL();
//				Bukkit.getOnlinePlayers().forEach(p -> p.kickPlayer("Server reload!"));
//				
//			}

		} catch (Exception e1) {

			e1.printStackTrace();
			log("§4Fehler: Plugin konnte nicht geladen werden.");
			Bukkit.getPluginManager().disablePlugin(this);

			return;

		} finally {

			log("§aPlugin geladen");
			log("§agecodet von Tempoo50");

		}
	}

	@Override

	public void onDisable() {

		try {
			worldHandler.saveWorld();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vaulthook.unhook();
		MySQL.disconnect();
		MySQLPlayer.disconnect();
		log("Plugin entladen.");

	}

	private void loadCommands() {

		getCommand("kopf").setExecutor(new KopfCommand());
		getCommand("sign").setExecutor(new SignCommand());
		getCommand("c").setExecutor(new ChatclearCommand());
		getCommand("clear").setExecutor(new ClearCommand());
		getCommand("craft").setExecutor(new CraftCommand());
		getCommand("gm0").setExecutor(new GmSurvivalCommand(this));
		getCommand("gm1").setExecutor(new GmCreativCommand());
		getCommand("gm2").setExecutor(new GmAdventureCommand());
		getCommand("gm3").setExecutor(new GmSpectatorCommand());
		getCommand("heal").setExecutor(new HealCommand());
		getCommand("save").setExecutor(new SaveCommand());
		getCommand("load").setExecutor(new LoadCommand());
		getCommand("SetSpawn").setExecutor(new SetSpawn());
		getCommand("Spawn").setExecutor(new SpawnCommand());
		getCommand("support").setExecutor(new Support(this));
		getCommand("v").setExecutor(new VanishCommand());
		getCommand("kill").setExecutor(new KillCommand());
		getCommand("day").setExecutor(new DayCommand());
		getCommand("night").setExecutor(new NightCommand());
		getCommand("fly").setExecutor(new FlyCommand());
		getCommand("bewerbung").setExecutor(new BewerbungCommand(this));
		getCommand("discord").setExecutor(new DiscordCommand());
		getCommand("ts").setExecutor(new TSCommand());
		getCommand("web").setExecutor(new WebCommand());
		getCommand("forum").setExecutor(new ForumCommand());
		getCommand("twitter").setExecutor(new TwitterCommand());
		getCommand("shop").setExecutor(new ShopCommand());
		getCommand("yt").setExecutor(new YTCommand());
		getCommand("insta").setExecutor(new InstaCommand());
		getCommand("tp").setExecutor(new TpCommand());
		getCommand("ec").setExecutor(new EcCommand());
		getCommand("invsee").setExecutor(new InvseeCommand());
		getCommand("live").setExecutor(new LiveCommand());
		getCommand("partner").setExecutor(new PartnerCommand());
		getCommand("sethome").setExecutor(new SetHomeCommand());
		getCommand("home").setExecutor(new HomeCommand());
		getCommand("delhome").setExecutor(new DelHome());
		getCommand("msg").setExecutor(new MsgCommand());
		getCommand("r").setExecutor(new RCommand());
		getCommand("start").setExecutor(new StarterKitsCommand());
		getCommand("cblock").setExecutor(new ChatBlockCommand());
		getCommand("tpa").setExecutor(new TpaCommand());
		getCommand("tpaccept").setExecutor(new TpacceptCommand());
		getCommand("tphere").setExecutor(new TpHereCommand());
		getCommand("fb").setExecutor(new FbCommand());
		getCommand("help").setExecutor(new CommandInfoCommand());
		// getCommand("give").setExecutor(new GiveCommand());
		getCommand("setwarp").setExecutor(new SetWarpCommand());
		getCommand("delWarp").setExecutor(new DelWarps());
		getCommand("warp").setExecutor(new WarpCommand());
		getCommand("sun").setExecutor(new SunCommand());
		getCommand("rain").setExecutor(new RainCommand());
		getCommand("gm4").setExecutor(new GodCommand(this));
		getCommand("ontime").setExecutor(new PlayerTimeCommand());
		getCommand("blacklist").setExecutor(new BlackListCommand());
		getCommand("belohnung").setExecutor(new BelohnungsCommand());
		getCommand("seeip").setExecutor(new IpCommands());
		getCommand("rundruf").setExecutor(new BroadcasterCommand());
		getCommand("holo").setExecutor(new HologramCommand());
		getCommand("vote").setExecutor(new VoteCommand());
		getCommand("rename").setExecutor(new RenameCommand());
		getCommand("clan").setExecutor(new ClanCommand());
		getCommand("cm").setExecutor(new ClanMessage());
		getCommand("clan").setTabCompleter(new TabCompleteClan());
		getCommand("repair").setExecutor(new RepairCommand());
		getCommand("gm5").setExecutor(new BuildCommand(this));
		getCommand("fail").setExecutor(new FailCommand());
		getCommand("spawnmob").setExecutor(new MobSpawnCommand());
		getCommand("report").setExecutor(new ReportCommand());
		getCommand("spec").setExecutor(new AcceptReport());
		getCommand("case").setExecutor(new CaseCommand());
		getCommand("create").setExecutor(new CreateCommand());
		getCommand("chest").setExecutor(new ChestCommand());
		getCommand("premium").setExecutor(new PremiumCommand());
		getCommand("eco").setExecutor(new EcoCommand());
		getCommand("pay").setExecutor(new PayCommand());
		getCommand("set").setExecutor(new SetCommand());
		getCommand("payall").setExecutor(new PayAllCommand());
		getCommand("msgtoggle").setExecutor(new MsgToggleCommand());
		getCommand("perks").setExecutor(new PerksCommand());
		getCommand("world").setExecutor(new WorldCommand());
		//getCommand("jobs").setExecutor(new JobsCommand());
		getCommand("tiktok").setExecutor(new TikTokCommand());
		 
	}

	private void loadListener(PluginManager pm) {

		pm.registerEvents(new KopfJoinListener(), this);
		pm.registerEvents(new JoinListener(), this);
		pm.registerEvents(new DeathListener(), this);
		pm.registerEvents(new QuitListener(), this);
		pm.registerEvents(new RespawnListener(), this);
		pm.registerEvents(new VanishJoinListener(), this);
		pm.registerEvents(new VanishQuitListener(), this);
		pm.registerEvents(new ChatListener(this), this);
		pm.registerEvents(new PartnerListener(), this);
		pm.registerEvents(new StartKitListener(), this);
		pm.registerEvents(new KitListener(), this);
		pm.registerEvents(new SignListener(), this);
		pm.registerEvents(new ChatBlockListener(), this);
		pm.registerEvents(new InfoListener(), this);
		pm.registerEvents(new AnvilListener(), this);
		//pm.registerEvents(new NahrungsListener(), this);
		pm.registerEvents(new BackListener(), this);
		pm.registerEvents(godModeListener, this);
		pm.registerEvents(new CommandBlockerListener(), this);
		pm.registerEvents(new TabCompleteListener(), this);
		pm.registerEvents(new BlackListCommand(), this);
		pm.registerEvents(new PlayerListener(this), this);
		pm.registerEvents(new ChatSupportListener(this), this);
		pm.registerEvents(new ClanDeath(), this);
		pm.registerEvents(new ClanJoin(), this);
		pm.registerEvents(new ClanQuit(), this);
		pm.registerEvents(gameProtectionListener, this);
		pm.registerEvents(new CraftingListener(), this);
		pm.registerEvents(new KillListener(), this);
		pm.registerEvents(new FinishReport(), this);
		pm.registerEvents(new CaseClick(), this);
		pm.registerEvents(new ChestListener(), this);
		pm.registerEvents(new PerksListener(), this);
		pm.registerEvents(new JobsListener(), this);
		
	}

	private void loadFile() {

		FileManagerEco.loadFile();
		FileManagerEco.readFile();
		FileManagaerKit.loadFile();
		FileManagaerKit.readFile();
		FileManagerPlayer.loadFile();
		FileManagerPlayer.readFile();
		FileManager.loadFile();
		FileManager.readFile();
		FileManagerChest.loadFile();
		FileManagerChest.readFile();
		FileManagerBelohnung.setDefault();
		BewerbungsFile.loadBewerbung();
		ServerLinksFile.loadServerLinks();
		SpawnFile.loadSpawn();
		ChatSystemFile.loadChatSystem();
		BewerbungsFileGer.loadBewerbungGer();
		ServerLinksFileGer.loadServerLinksGer();
		SpawnFileGer.loadSpawnGer();
		ChatSystemFileGer.loadChatSystemGer();
		WorldresetFile.loadWorldReset();
		PartnetFile.loadPartner();
		PermissionFile.loadPermission();
		InfoFile.loadInfo();
		CommandFile.loadCmdFile();
		MessageFile.loadMessage();
		CommandBlockerFile.loadBlocker();
		ClanFile.loadClan();
		ClanPlayerData.savePlayerFile();
		Clandata.saveClanFile();
		ProtactionFile.loadConfig();
		LiveFile.loadFile();
		TablistFile.loadFile();
		ScoreboardFile.loadFile();
		FileManagerPremium.setDefault();
		EconomyFile.loadFile();
		FileManagerPerks.setDefault();
		FileManagerJobs.setDefault();
//		BanFile.loadFile();
//		FileManagerBan.loadFile();
//		FileManagerBan.readFile();

	}

	private void loadMySQL() {

		MySQLKopf.connect();
		MySQLKopf.update("CREATE TABLE IF NOT EXISTS Kopf (UUID VARCHAR(255),Time LONG)");
		MySQLKit.connect();
		MySQLKit.update("CREATE TABLE IF NOT EXISTS Kit (UUID VARCHAR(255),Time LONG)");
		MySQLChest.connect();
		MySQLChest.update("CREATE TABLE IF NOT EXISTS CHEST (UUID VARCHAR(255),Time LONG");

	}

	private void loadTimer() {

		new RunUtil(this).startScoreboard();

	}

	public static void log(String msg) {

		Bukkit.getConsoleSender().sendMessage(MessagesUtil.STARTING + msg);

	}

	public static void logs(final String message) {

		Bukkit.getConsoleSender().sendMessage(MessagesUtil.STARTING + message);

	}

	public static ServerSystem getPlugin() {

		return plugin;

	}

	public static ServerSystem getInctance() {

		return inctance;

	}

	public GodListener getGodListener() {

		return godModeListener;

	}

	public GameProtectionListener getGameProtectionListener() {

		return gameProtectionListener;

	}
	
	public WorldHandler getWorldHandler() {

		return worldHandler;

	}

}