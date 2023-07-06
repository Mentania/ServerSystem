package de.tempoo50.system.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class RecipeLoader {

	public void registerRecipes() {

		ItemStack spawner = new ItemStack(Material.SPAWNER);
		ItemMeta spawnerMeta = spawner.getItemMeta();
		spawnerMeta.setDisplayName("Mob_Spawner");
		spawner.setItemMeta(spawnerMeta);
		ShapedRecipe spawnerRecipe = new ShapedRecipe(spawner);
		spawnerRecipe.shape("LMW", "ESG", "IBT");
		spawnerRecipe.setIngredient('L', Material.LAVA_BUCKET);
		spawnerRecipe.setIngredient('M', Material.BEDROCK);
		spawnerRecipe.setIngredient('W', Material.WATER_BUCKET);
		spawnerRecipe.setIngredient('E', Material.IRON_BLOCK);
		spawnerRecipe.setIngredient('S', Material.PIG_SPAWN_EGG);
		spawnerRecipe.setIngredient('G', Material.IRON_BARS);
		spawnerRecipe.setIngredient('I', Material.EGG);
		spawnerRecipe.setIngredient('B', Material.BEACON);
		spawnerRecipe.setIngredient('T', Material.HOPPER);

		ItemStack ground = new ItemStack(Material.BEDROCK);
		ItemMeta groundMeta = ground.getItemMeta();
		groundMeta.setDisplayName("Grundgestein");
		ground.setItemMeta(groundMeta);
		ShapedRecipe groundRecipe = new ShapedRecipe(ground);
		groundRecipe.shape("SLD", "EAT", "CPZ");
		groundRecipe.setIngredient('S', Material.EMERALD_BLOCK);
		groundRecipe.setIngredient('L', Material.BEACON);
		groundRecipe.setIngredient('D', Material.DIAMOND_BLOCK);
		groundRecipe.setIngredient('E', Material.END_STONE);
		groundRecipe.setIngredient('A', Material.ANVIL);
		groundRecipe.setIngredient('T', Material.TNT);
		groundRecipe.setIngredient('C', Material.ENDER_CHEST);
		groundRecipe.setIngredient('P', Material.PURPUR_PILLAR);
		groundRecipe.setIngredient('Z', Material.ENCHANTING_TABLE);

		ItemStack portal = new ItemStack(Material.END_PORTAL_FRAME);
		ItemMeta portalMeta = portal.getItemMeta();
		portalMeta.setDisplayName("EndPortalRahmen");
		portal.setItemMeta(portalMeta);
		ShapedRecipe portalRecipe = new ShapedRecipe(portal);
		portalRecipe.shape("ESZ", "PSU", "LSG");
		portalRecipe.setIngredient('E', Material.END_STONE);
		portalRecipe.setIngredient('S', Material.END_ROD);
		portalRecipe.setIngredient('Z', Material.END_STONE_BRICKS);
		portalRecipe.setIngredient('P', Material.ENDER_PEARL);
		portalRecipe.setIngredient('U', Material.PURPUR_BLOCK);
		portalRecipe.setIngredient('L', Material.PURPUR_PILLAR);
		portalRecipe.setIngredient('G', Material.DISPENSER);

		ItemStack dragon = new ItemStack(Material.DRAGON_EGG);
		ItemMeta dragonMeta = dragon.getItemMeta();
		dragonMeta.setDisplayName("Drachenein");
		dragon.setItemMeta(dragonMeta);
		ShapedRecipe dragonRecipe = new ShapedRecipe(dragon);
		dragonRecipe.shape("RKR", "GEZ", "ROR");
		dragonRecipe.setIngredient('R', Material.END_PORTAL_FRAME);
		dragonRecipe.setIngredient('K', Material.END_CRYSTAL);
		dragonRecipe.setIngredient('G', Material.BEDROCK);
		dragonRecipe.setIngredient('E', Material.EGG);
		dragonRecipe.setIngredient('Z', Material.ENCHANTING_TABLE);
		dragonRecipe.setIngredient('O', Material.OBSIDIAN);

		Bukkit.addRecipe(spawnerRecipe);
		Bukkit.addRecipe(groundRecipe);
		Bukkit.addRecipe(portalRecipe);
		Bukkit.addRecipe(dragonRecipe);

	}

}
