package com.ethereal.rithsagea.TMRCore.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

import com.ethereal.rithsagea.TMRCore.TMRCore;

public class ItemBerry extends ItemFood {
	public ItemBerry(int food, float saturation, boolean wolfFood, String name) {
		super(food,saturation,wolfFood);
		setUnlocalizedName(TMRCore.MODID + "_" + name);
		setTextureName(TMRCore.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabFood);
		setPotionEffect(Potion.moveSpeed.id,15,0,1F);
		setAlwaysEdible();
	}
}
