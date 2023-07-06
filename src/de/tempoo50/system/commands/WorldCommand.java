package de.tempoo50.system.commands;

import de.tempoo50.system.main.ServerSystem;
import de.tempoo50.system.utils.MessagesUtil;
import de.tempoo50.system.utils.VoidUtil;
import de.tempoo50.system.utils.WorldHandler;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorldCommand implements CommandExecutor {

	private final ServerSystem plugin = ServerSystem.getPlugin();
	private final WorldHandler worldHandler = plugin.getWorldHandler();
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {

			File filep = new File("plugins//ServerSystem//Permission.yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(filep);

			Player player = (Player) sender;
			
			if(args.length == 0) {
					
				player.sendMessage("§b/world create <normal/nether/ende/void/flat> <Map-Name>");
				player.sendMessage("§b/world tp <Map-Name>");
				player.sendMessage("§b/world list");
				player.sendMessage("§b/world info");
				
			}else if(args[0].equalsIgnoreCase("tp")) {
				
				if(player.hasPermission((String) config.get("World.Tp"))) {
					
					if(args.length == 2) {

						String worldname = args[1];
						World w = Bukkit.getWorld(worldname);
						
						if(w != null) {
							
							player.teleport(w.getSpawnLocation());
							player.sendMessage(MessagesUtil.WORLDTP + " §b" + w.getName());
							
						}else
							
							player.sendMessage(MessagesUtil.WORLDNOTP);
						
					}else
						
						player.sendMessage("§b/world tp <Map-Name>");
						
				}else
					
					player.sendMessage(MessagesUtil.NOPERM);
				
			}else if(args[0].equalsIgnoreCase("create")) {
				
				if(player.hasPermission((String) config.get("World.Create"))) {
					
					if(args.length == 1) {
					
						player.sendMessage("§b/world create <normal/nether/ende/void/flat> <Map-Name>");
					
					}else if(args[1].equalsIgnoreCase("normal")) {

						if(args.length == 3) {
							
							String worldname = args[2];
							World world = Bukkit.getWorld(worldname);
							
							if(world == null) {
							
								player.sendMessage(MessagesUtil.WORLDCREATE1);
								
								Bukkit.createWorld((WorldCreator) WorldCreator.name(worldname).environment(Environment.NORMAL).type(WorldType.AMPLIFIED));

								worldHandler.addWorld(worldname, player.getName(), "normal");
								
								player.sendMessage(MessagesUtil.WORLDCREATE2);
						
								player.teleport(Bukkit.getWorld(worldname).getSpawnLocation());
								
							}else
								
								player.sendMessage(MessagesUtil.WORLDEXIST);
							
						}else
							
							player.sendMessage("§b/world create <normal/nether/ende/void/flat> <Map-Name>");
						
					}else if(args[1].equalsIgnoreCase("nether")) {
						
						if(args.length == 3) {
							
							String worldname = args[2];
							World world = Bukkit.getWorld(worldname);
							
							if(world == null) {
								
								player.sendMessage(MessagesUtil.WORLDCREATE1);
								
								Bukkit.createWorld(WorldCreator.name(worldname).environment(Environment.NETHER).type(WorldType.AMPLIFIED));

								worldHandler.addWorld(worldname, player.getName(), "nether");
								
								player.sendMessage(MessagesUtil.WORLDCREATE2);
								
								player.teleport(Bukkit.getWorld(worldname).getSpawnLocation());
								
							}else
								
								player.sendMessage(MessagesUtil.WORLDEXIST);
							
						}else
							
							player.sendMessage("§b/world create <normal/nether/ende/void/flat> <Map-Name>");
						
					}else if(args[1].equalsIgnoreCase("ende")) {
						
						if(args.length == 3) {
							
							String worldname = args[2];
							World world = Bukkit.getWorld(worldname);
							
							if(world == null) {
								
								player.sendMessage(MessagesUtil.WORLDCREATE1);
								
								Bukkit.createWorld(WorldCreator.name(worldname).environment(Environment.THE_END).type(WorldType.AMPLIFIED));

								worldHandler.addWorld(worldname, player.getName(), "ende");
								
								player.sendMessage(MessagesUtil.WORLDCREATE2);
								
								player.teleport(Bukkit.getWorld(worldname).getSpawnLocation());
								
							}else
								
								player.sendMessage(MessagesUtil.WORLDEXIST);
						
						}else
							
							player.sendMessage("§b/world create <normal/nether/ende/void/flat> <Map-Name>");
						
					}else if(args[1].equalsIgnoreCase("void")) {
						
						if(args.length == 3) {
						
							String worldname = args[2];
							World world = Bukkit.getWorld(worldname);
							
							if(world == null) {
							
								player.sendMessage(MessagesUtil.WORLDCREATE1);
								
								Bukkit.createWorld(WorldCreator.name(worldname).environment(Environment.NORMAL).type(WorldType.AMPLIFIED).generator(VoidUtil.getDefaultChunkGenerator(worldname)).generateStructures(false));

								worldHandler.addWorld(worldname, player.getName(), "void");
								
								player.sendMessage(MessagesUtil.WORLDCREATE2);
								
								player.teleport(Bukkit.getWorld(worldname).getSpawnLocation());
								
							}else
								
								player.sendMessage(MessagesUtil.WORLDEXIST);
							
						}else
							
							player.sendMessage("§b/world create <normal/nether/ende/void/flat> <Map-Name>");
						
					}else if(args[1].equalsIgnoreCase("flat")) {
						
						if(args.length == 3) {
						
							String worldname = args[2];
							World world = Bukkit.getWorld(worldname);
							
							if(world == null) {
								
								player.sendMessage(MessagesUtil.WORLDCREATE1);
								
								Bukkit.createWorld(WorldCreator.name(worldname).environment(Environment.NORMAL).type(WorldType.FLAT));

								worldHandler.addWorld(worldname, player.getName(), "flat");
								
								player.sendMessage(MessagesUtil.WORLDCREATE2);
								
								player.teleport(Bukkit.getWorld(worldname).getSpawnLocation());
							
							}else
								
								player.sendMessage(MessagesUtil.WORLDEXIST);
							
							
						}else
							
							player.sendMessage("§b/world create <normal/nether/ende/void/flat> <Map-Name>");
						
					}else
						
						player.sendMessage("§b/world create <normal/nether/ende/void/flat> <Map-Name>");
					
				}else
					
					player.sendMessage(MessagesUtil.NOPERM);
				
			}else if(args[0].equalsIgnoreCase("list")) {
				
				if(player.hasPermission((String) config.get("World.List"))) {
				
					ArrayList<String> worldnames = new ArrayList<String>();
					List<String> excludeFolders = Arrays.asList("plugins", "logs", "crash-reports");
					for(File file : Bukkit.getServer().getWorldContainer().listFiles()) {
							
						if(file.isDirectory() && !excludeFolders.contains(file.getName())) {
								
							worldnames.add(file.getName());
								
								
						}
						
					}
					
					player.sendMessage(MessagesUtil.WORLDLIST + " §b" + worldnames);
					
				}else
					
					player.sendMessage(MessagesUtil.NOPERM);
				
			}else if(args[0].equalsIgnoreCase("info")) {
				
				if(player.hasPermission((String) config.get("World.Info"))) {
					
					player.sendMessage(MessagesUtil.WORLDINFO + " §b" + player.getWorld().getName());
					
				}else
					
					player.sendMessage(MessagesUtil.NOPERM);
				
			}
			
		}
		
		return false;
		
	}

}
