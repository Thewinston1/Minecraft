package com.rithsagea.me;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.creativetab.CreativeTabs;

public class ItemMechaAxe extends ItemAxe {
	public ItemMechaAxe(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(TMR_Core.MODID + "_" + name);
		setTextureName(TMR_Core.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
