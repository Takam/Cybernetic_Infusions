package com.takam23.cybernetic_infusions.handler;

import com.takam23.cybernetic_infusions.reference.Names;
import com.takam23.cybernetic_infusions.util.NBTHelper;

import net.minecraft.item.ItemStack;

public class DiskHandler {
	
	public int checkComplexUpgrade(int level, ItemStack itemStack) {
		
		int NBTlevel =  level;
		
		if(level != 0) {
			if(level >= 1) {
				for(int i = 0; i < Names.Enchantment.enchantments2.length; i++) {
					if(NBTHelper.hasTag(itemStack, Names.Enchantment.enchantments2[i])) {
						NBTlevel = NBTlevel--;
					}
				}
			} else {
				for(int i = 0; i < Names.Enchantment.enchantments1.length; i++) {
					if(NBTHelper.hasTag(itemStack, Names.Enchantment.enchantments1[i])) {
						NBTlevel = NBTlevel--;
					}
				}
			}
			return NBTlevel;
		}
		return 0;
	}
	public int checkComplexUpgrade(int level) {
		return level;
	}
}
