package com.ethereal.rithsagea.TMRCore.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

import com.ethereal.rithsagea.TMRCore.TMRCore;

public class ItemChaosShovel extends ItemSpade{
	public ItemChaosShovel(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(TMRCore.MODID + "_" + name);
		setTextureName(TMRCore.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
