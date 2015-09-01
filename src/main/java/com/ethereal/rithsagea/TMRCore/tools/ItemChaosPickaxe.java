package com.ethereal.rithsagea.TMRCore.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

import com.ethereal.rithsagea.TMRCore.TMRCore;

public class ItemChaosPickaxe extends ItemPickaxe {

	public ItemChaosPickaxe(ToolMaterial material,String name) {
		super(material);
		setUnlocalizedName(TMRCore.MODID + "_" + name);
		setTextureName(TMRCore.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
