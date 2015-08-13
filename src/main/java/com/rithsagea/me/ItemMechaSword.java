package com.rithsagea.me;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ItemMechaSword extends ItemSword {
	public ItemMechaSword(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(TMR_Core.MODID + "_" + name);
		setTextureName(TMR_Core.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
