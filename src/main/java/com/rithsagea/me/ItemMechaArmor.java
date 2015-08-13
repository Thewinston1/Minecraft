package com.rithsagea.me;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMechaArmor extends ItemArmor {
	public ItemMechaArmor(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		setUnlocalizedName(TMR_Core.MODID + "_" + name);
		setTextureName(TMR_Core.MODID + ":" + name);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if (stack.getItem() == TMR_Core.mechahelmet || stack.getItem() == TMR_Core.mechachest || stack.getItem() == TMR_Core.mechaboots) 
		{
			return TMR_Core.MODID + ":models/armor/samarmor1.png";
		}
		else if(stack.getItem() == TMR_Core.mechaleggings)
		{
			return TMR_Core.MODID + ":models/armor/samarmor2.png";
		}
		else
		{
			System.out.println("Invalid Item");
			return null;
		}
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if(itemStack.getItem().getUnlocalizedName() == "samhelmet")
		{
			if(player.isInWater())
			{
				player.setAir(20);
			}
		}
	}
}
