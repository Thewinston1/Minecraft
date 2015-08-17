package com.wuppy.samsmod;

import com.wuppy.samsmod.SamsMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSamGeneric extends Item 
{
	public ItemSamGeneric(String name) {
		setUnlocalizedName(SamsMod.MODID + "_" + name);
		setTextureName(SamsMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
