package com.rithsagea.me;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.creativetab.CreativeTabs;

import com.google.common.collect.Sets;

public class ItemMechaSphax extends ItemTool 
{
	@SuppressWarnings("rawtypes")
	private static Set blocks = Sets.newHashSet(new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium, Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin});
	
	public ItemMechaSphax(ToolMaterial material, String name) 
	{
		super(3, material, blocks);
		setUnlocalizedName(TMR_Core.MODID + "_" + name);
		setTextureName(TMR_Core.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
	
	@Override
	public boolean func_150897_b(Block p_150897_1_)
        {
        	return p_150897_1_ == Blocks.snow_layer ? true : p_150897_1_ == Blocks.snow;
        }
	
	@Override
	public float func_150893_a(ItemStack p_150893_1_, Block p_150893_2_)
    	{
      		return p_150893_2_.getMaterial() != Material.wood && p_150893_2_.getMaterial() != Material.plants && p_150893_2_.getMaterial() != Material.vine ? super.func_150893_a(p_150893_1_, p_150893_2_) : this.efficiencyOnProperMaterial;
    	}
}