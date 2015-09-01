package com.ethereal.rithsagea.TMRCore.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

import com.ethereal.rithsagea.TMRCore.TMRCore;

public class ItemChaosAxe extends ItemAxe {
	public ItemChaosAxe(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(TMRCore.MODID + "_" + name);
		setTextureName(TMRCore.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
