package com.wuppy.samsmod;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = SamsMod.MODID, version = SamsMod.VERSION, name = SamsMod.NAME)
public class SamsMod
{
	//mod defines
	public static final String MODID = "wuppy29_samsmod";
	public static final String NAME = "SamsMod";
	public static final String VERSION = "1.0";
	
	//items
	public static Item key;
	
	public static Item samdust;
	public static Item samingot;
	
	@EventHandler
	public void init(FMLPreInitializationEvent event)
	{
		key = new ItemKey();
		
		samdust = new ItemSamGeneric("samdust");
		samingot = new ItemSamGeneric("samingot");
		
		GameRegistry.registerItem(key, "Key");
		
		GameRegistry.registerItem(samdust, "samdust");
		GameRegistry.registerItem(samingot, "samingot");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		//enchanted tools
		ItemStack enchantedSwordItemStack = new ItemStack(Items.stone_sword);
		enchantedSwordItemStack .addEnchantment(Enchantment.sharpness, 1);
		
		ItemStack knockbackItemStack = new ItemStack(Items.stone_sword);
		knockbackItemStack.addEnchantment(Enchantment.knockback, 1);
		//recipes
		
		//static
		GameRegistry.addRecipe(new ItemStack(Items.apple),"XXX","XXX","XXX",'X', Blocks.leaves);
		
		GameRegistry.addRecipe(new ItemStack(Items.arrow),"YZ","X ",'X', Items.flint, 'Y', Items.stick, 'Z', Blocks.leaves);
		
		GameRegistry.addRecipe(new ItemStack(Items.apple),"XXX","XXX","XXX",'X', Blocks.leaves2);
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 120),"XAX","BYC","XDX",'X', new ItemStack(Items.egg), 'Y', new ItemStack(Items.emerald),'A', Blocks.enchanting_table, 'B', Blocks.furnace, 'C', Blocks.bookshelf,'D', new ItemStack(Items.porkchop));
		
		GameRegistry.addRecipe(new ItemStack(Items.saddle),"X X"," X ",'X', new ItemStack(Items.leather));
		//shapless		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 1), Items.redstone, new ItemStack(Items.dye,1, 1));
		
		GameRegistry.addShapelessRecipe(enchantedSwordItemStack, Items.flint, Items.stone_sword);
		
		GameRegistry.addShapelessRecipe(knockbackItemStack, Items.gunpowder, Items.stone_sword);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.grass), new ItemStack(Blocks.vine), new ItemStack(Blocks.dirt));
		//smelting
		GameRegistry.addSmelting(Blocks.stone,  new ItemStack(Blocks.stonebrick),  0.1F);
		
		GameRegistry.addSmelting(Blocks.gravel, new ItemStack(Items.flint), 0.1F);
		//dungeon tweaks
		
		//mobs
		//removes
		DungeonHooks.removeDungeonMob("Spider");
		DungeonHooks.removeDungeonMob("Zombie");
		DungeonHooks.removeDungeonMob("Skeleton");
		//adds
		DungeonHooks.addDungeonMob("Pig", 20);
		DungeonHooks.addDungeonMob("Cow", 20);
		DungeonHooks.addDungeonMob("Chicken", 20);
		DungeonHooks.addDungeonMob("Horse", 20);
		DungeonHooks.addDungeonMob("Sheep", 20);
		
		//items
		//removes
		ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.saddle));
		//adds
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(new ItemStack( Blocks.cobblestone), 25, 50, 10));
		
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(new ItemStack(Blocks.diamond_block), 1, 10, 15));
	}
}
