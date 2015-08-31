package com.ethereal.rithsagea.TMRCore;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;

import com.ethereal.rithsagea.TMRCore.Items.ItemChaosGeneric;
import com.ethereal.rithsagea.TMRCore.Items.ItemKey;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = TMRCore.MODID, version = TMRCore.VERSION, name = "Techno Magic Revolution Core")
public class TMRCore {
	public static final String MODID = "TMRCore";
	public static final String VERSION = "1.0";
	public static Item key;
	public static Item chaosdust;
	public static Item chaosingot;
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		key = new ItemKey("key");
		chaosdust = new ItemChaosGeneric("chaosdust");
		chaosingot = new ItemChaosGeneric("chaosingot");
		GameRegistry.registerItem(key,"key");
		GameRegistry.registerItem(chaosdust, "dustChaos");
		GameRegistry.registerItem(chaosingot,"ingotChaos");
	}
	@EventHandler
	public void init (FMLInitializationEvent event) {
		//craftchanting init
		ItemStack knockbackItemStack = new ItemStack(Items.stone_sword);
		knockbackItemStack.addEnchantment(Enchantment.knockback,1);
		//crafting
		GameRegistry.addRecipe(new ItemStack(Blocks.iron_ore),"XXX","XXX","XXX",'X',Blocks.cobblestone);
		GameRegistry.addRecipe(new ItemStack(Blocks.gold_ore),"XYX","YXY","XYX",'X',Items.iron_ingot,'Y',Blocks.cobblestone);
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian),"XXX","XYX","XXX",'X',Blocks.iron_block,'Y',Blocks.cobblestone);
		GameRegistry.addRecipe(new ItemStack(Blocks.redstone_ore),"XXX","XYX","XXX",'X',new ItemStack(Items.dye,1,1),'Y',Blocks.cobblestone);
		GameRegistry.addRecipe(new ItemStack(Blocks.diamond_ore),"XYX","XZX","XYX",'X',Items.redstone,'Y',Blocks.iron_block,'Z',Blocks.obsidian);;
		GameRegistry.addRecipe(new ItemStack(Blocks.waterlily),"XXX"," XX","XXX",'X',new ItemStack(Blocks.leaves,1,1));
		GameRegistry.addRecipe(new ItemStack(Blocks.waterlily),"XXX"," XX","XXX",'X',new ItemStack(Blocks.leaves,1,2));
		GameRegistry.addRecipe(new ItemStack(Blocks.waterlily),"XXX"," XX","XXX",'X',new ItemStack(Blocks.leaves,1,3));
		GameRegistry.addRecipe(new ItemStack(Blocks.waterlily),"XXX"," XX","XXX",'X',new ItemStack(Blocks.leaves,4));
		GameRegistry.addRecipe(new ItemStack(Blocks.waterlily),"XXX"," XX","XXX",'X',Blocks.leaves2);
		GameRegistry.addRecipe(new ItemStack(Blocks.waterlily),"XXX"," XX","XXX",'X',new ItemStack(Blocks.leaves2,2));
		GameRegistry.addRecipe(new ItemStack(Items.apple),"XXX","XXX","XXX",'X',Blocks.leaves);
		GameRegistry.addRecipe(new ItemStack(Items.arrow),"XY","Z ",'X',Items.stick,'Y',Blocks.leaves,'Z',Items.flint);
		GameRegistry.addRecipe(new ItemStack(Items.saddle),"X X"," X ",'X',Items.leather);
		//shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(Items.water_bucket),Blocks.water,Items.bucket);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.lava_bucket),Blocks.lava,Items.bucket);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian),Blocks.lava,Blocks.water);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian),Items.lava_bucket,Items.water_bucket);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,2,1),Items.redstone,new ItemStack(Items.dye,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.grass),Blocks.dirt,Blocks.vine);
		//smelting
		GameRegistry.addSmelting(Blocks.obsidian, new ItemStack(Blocks.lava), 2L);
		GameRegistry.addSmelting(Blocks.ice, new ItemStack(Blocks.water), 2L);
		GameRegistry.addSmelting(Blocks.stone,new ItemStack(Blocks.stonebrick), 0.1F);
		GameRegistry.addSmelting(Blocks.gravel,new ItemStack(Items.flint),0.1F);
		//craftchanting
		GameRegistry.addShapelessRecipe(knockbackItemStack,Items.gunpowder,Items.stone_sword);
		//dungeon spawn adds
		DungeonHooks.addDungeonMob("Pig",17);
		DungeonHooks.addDungeonMob("Sheep",17);
		DungeonHooks.addDungeonMob("Chicken",17);
		DungeonHooks.addDungeonMob("Cow",17);
		DungeonHooks.addDungeonMob("Rabbit",16);
		DungeonHooks.addDungeonMob("Mooshroom",16);
		//dungeon spawn removes
		DungeonHooks.removeDungeonMob("Spider");
		DungeonHooks.removeDungeonMob("Zombie");
		DungeonHooks.removeDungeonMob("Skelton");
		//dungeon chests adds
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent( new ItemStack(Blocks.cobblestone),25,50,10));
		//dungeon chests removes
		ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.saddle));
	}
}
