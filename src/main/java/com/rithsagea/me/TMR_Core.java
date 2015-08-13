package com.rithsagea.me;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
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
	
	public static Item MechaDust;
	public static Item MechaIngot;	
	public static Item berry;
	
	public static Item mechapickaxe;
	public static Item mechaaxe;
	public static Item mechahoe;
	public static Item mechashovel;
	public static Item mechasword;
	
	public static Item mechapaxel;
	public static Item mechasphax;
	
	public static Item mechahelmet;
	public static Item mechachest;
	public static Item mechaleggings;
	public static Item mechaboots;
	
	ToolMaterial Mecha = EnumHelper.addToolMaterial("mecha", 5, -1, 999999999F, 20F, 100000);
	
	ArmorMaterial MechaArmor = EnumHelper.addArmorMaterial("MechaArmor", -1, new int[] {999,999,999,999}, 999);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		MechaDust = new ItemMechaGeneric("MechaDust");
		MechaIngot = new ItemMechaGeneric("MechaIngot");	
		berry = new ItemBerry(3, 0.3F, true,"berry");
		
		mechapickaxe = new ItemMechaPickaxe(Mecha, "MechaPickaxe");
		mechaaxe = new ItemMechaAxe(Mecha, "MechaAxe");
		mechahoe = new ItemMechaHoe(Mecha, "MechaHoe");
		mechashovel = new ItemMechaShovel(Mecha, "MechaShovel");
		mechasword = new ItemMechaSword(Mecha, "MechaSword");
		
		mechapaxel = new ItemMechaPaxel(Mecha, "MechaPaxel");
		mechasphax = new ItemMechaSphax(Mecha, "MechaSphax");
		
		mechahelmet = new ItemMechaArmor(MechaArmor, 0, "MechaHelmet");
		mechachest = new ItemMechaArmor(MechaArmor, 1, "MechaChest");
		mechaleggings = new ItemMechaArmor(MechaArmor, 2, "MechaLeggings");
		mechaboots = new ItemMechaArmor(MechaArmor, 3, "MechaBoots");
		
		GameRegistry.registerItem(MechaDust, "MechaDust");
		GameRegistry.registerItem(MechaIngot,"MechaIngot");		
		GameRegistry.registerItem(berry, "Berry");
		
		GameRegistry.registerItem(mechapickaxe,"MechaPickaxe");
		GameRegistry.registerItem(mechaaxe, "MechaAxe");
		GameRegistry.registerItem(mechahoe, "MechaHoe");
		GameRegistry.registerItem(mechashovel, "MechaShovel");
		GameRegistry.registerItem(mechasword, "MechaSword");
		
		GameRegistry.registerItem(mechapaxel, "MechaPaxel");
		GameRegistry.registerItem(mechasphax, "MechaSphax");
		
		GameRegistry.registerItem(mechahelmet,"MechaHelmet");
		GameRegistry.registerItem(mechachest, "MechaChest");
		GameRegistry.registerItem(mechaleggings, "MechaLeggings");
		GameRegistry.registerItem(mechaboots, "MechaBoots");
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.addRecipe(new ItemStack(Items.saddle),
				"X X",
				" X ",
				'X',Items.leather);
	}
}