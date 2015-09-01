package com.ethereal.rithsagea.TMRCore.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

import com.ethereal.rithsagea.TMRCore.TMRCore;

public class ItemChaosSword extends ItemSword{
	public ItemChaosSword(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(TMRCore.MODID + "_" + name);
		setTextureName(TMRCore.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabCombat);
	}
}
