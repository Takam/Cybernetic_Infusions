package com.takam23.cybernetic_infusions.creativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.takam23.cybernetic_infusions.init.ModItems;
import com.takam23.cybernetic_infusions.reference.Reference;

public class CreativeTabCI {
	public static final CreativeTabs CI_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		@Override
		public Item getTabIconItem() {
			return ModItems.basicMonado;
		}
	};
}
