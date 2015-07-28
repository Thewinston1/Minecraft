package com.rithsagea.me;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.creativetab.CreativeTabs;

public class ItemBerry extends ItemFood{
	public ItemBerry(int food, float saturation, boolean wolfFood, String name) {
		super(food, saturation, wolfFood);
		setUnlocalizedName(TMR_Core.MODID + "_" + name);
		setTextureName(TMR_Core.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabFood);
		setPotionEffect(Potion.moveSpeed.id, 15, 0, 1F);
		setAlwaysEdible();
	}
}
