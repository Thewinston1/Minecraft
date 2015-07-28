package com.rithsagea.me;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.creativetab.CreativeTabs;

public class ItemMechaPickaxe extends ItemPickaxe 
{
	public ItemMechaPickaxe(ToolMaterial material, String name)
	{
		super(material);
		setUnlocalizedName(TMR_Core.MODID + "_" + name);
		setTextureName(TMR_Core.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
