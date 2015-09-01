package com.ethereal.rithsagea.TMRCore.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.ethereal.rithsagea.TMRCore.TMRCore;

public class ItemShard extends Item{
	public ItemShard(String name) {
		setUnlocalizedName(TMRCore.MODID + "_" + name);
		setTextureName(TMRCore.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
