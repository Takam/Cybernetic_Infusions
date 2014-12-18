package com.takam23.cybernetic_infusions.util;

import net.minecraft.item.ItemStack;

public class ItemHelper {
	public static ItemStack cloneItemStack (ItemStack itemstack, int stackSize) {
		ItemStack clonedItemStack = itemstack.copy();
		clonedItemStack.stackSize = stackSize;
		return clonedItemStack;
	}
}
