package com.rithsagea.me;

import com.rithsagea.me.TMR_Core;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class ItemMechaGeneric extends Item
{
	public ItemMechaGeneric(String name) {
		setUnlocalizedName(TMR_Core.MODID + "_" + name);
		setTextureName(TMR_Core.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
