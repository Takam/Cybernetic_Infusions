package com.takam23.cybernetic_infusions.init;

import net.minecraft.init.*;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipies {
	public static void init() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mundaneDisk), " s ", "sgs", " s ", 'g', "blockGlass", 's', "ingotSilver"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.monadoStand), " s ", " s ", "lrl", 's', "ingotSilver", 'l', "ingotLead", 'r', "dustRedstone"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.basicMonado), "  s", " s ", "tm ", 's', "ingotSilver", 't', "stickWood", 'm', new ItemStack(ModItems.mundaneDisk)));
	}
}
