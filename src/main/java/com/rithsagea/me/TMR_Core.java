package com.rithsagea.me;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = TMR_Core.MODID, version = TMR_Core.VERSION)

public class TMR_Core {
	public static final String MODID = "TMRCore";
	public static final String VERSION = "1.0";
	
	public static Item orb;
	public static Item corrupted_orb;
	public static Item MechaDust;
	public static Item MechaIngot;	
	public static Item berry;
	
	public static Item mechapickaxe;
	
	ToolMaterial Mecha = EnumHelper.addToolMaterial("mecha", 20, 999999999, 999999999F, 20F, 100000);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		orb = new ItemOrb("orb");
		corrupted_orb = new ItemOrb("corrupted_orb");
		MechaDust = new ItemMechaGeneric("MechaDust");
		MechaIngot = new ItemMechaGeneric("MechaIngot");	
		berry = new ItemBerry(3, 0.3F, true,"berry");
		
		mechapickaxe = new ItemMechaPickaxe(Mecha, " MechaPickaxe");
		
		GameRegistry.registerItem(orb, "orb");
		GameRegistry.registerItem(corrupted_orb, "corrupted_orb");
		GameRegistry.registerItem(MechaDust, "MechaDust");
		GameRegistry.registerItem(MechaIngot,"MechaIngot");		
		GameRegistry.registerItem(berry, "Berry");
		
		GameRegistry.registerItem(mechapickaxe,"MechaPickaxe");
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		//Crafting
			//Sapling Conversion
		GameRegistry.addRecipe(new ItemStack(Blocks.sapling),
				"XXX",
				"XXX",
				"XXX",
				'X',Blocks.leaves
		);
		GameRegistry.addRecipe(new ItemStack(Items.saddle),
				"X X",
				" X ",
				'X',Items.leather);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sapling,1,2), new ItemStack(Blocks.sapling));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sapling,1,3), new ItemStack(Blocks.sapling,1,2));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sapling,1,4), new ItemStack(Blocks.sapling,1,3));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sapling,1,5), new ItemStack(Blocks.sapling,1,4));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sapling), new ItemStack(Blocks.sapling,1,5));
	}
}