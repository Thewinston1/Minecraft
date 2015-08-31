package com.ethereal.rithsagea.TMRCore.Items;

import com.ethereal.rithsagea.TMRCore.TMRCore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemChaosGeneric extends Item {
	public ItemChaosGeneric(String name) {
		setUnlocalizedName(TMRCore.MODID + "_" + name);
		setTextureName(TMRCore.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
