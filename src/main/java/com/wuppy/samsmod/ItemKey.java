package com.wuppy.samsmod;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import akka.io.Tcp.Register;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemKey extends Item {
	
	private String[] name = {"grey", "red"};
	
	public ItemKey() {
		setUnlocalizedName(SamsMod.MODID + "_" + "key");
		setHasSubtypes(true);
		setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		int metadata = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
		return super.getUnlocalizedName() + "." + name[metadata];
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		icons = new IIcon[name.length];
		
		for(int i = 0; i < icons.length; i++)
		{
			icons[i] = par1IconRegister.registerIcon(SamsMod.MODID + ":" + name[i] + "Key");
		}
	}
}
