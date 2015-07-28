package com.rithsagea.me;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemOrb extends Item 
{
	public ItemOrb(String itemName)
	{
		setUnlocalizedName(TMR_Core.MODID+"_"+itemName);
		setTextureName(TMR_Core.MODID + ":"+itemName);
		setCreativeTab(CreativeTabs.tabMisc);
	}
}
