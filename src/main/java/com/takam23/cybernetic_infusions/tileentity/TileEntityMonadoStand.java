package com.takam23.cybernetic_infusions.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class TileEntityMonadoStand extends TileEntityCI implements IInventory {
	
	public static final int INVENTORY_SLOT = 9;
	public static final int SWORD_INVENTORY_INDEX = 0;
	public static final int PMAIN_INVENTORY_INDEX = 1;
	public static final int SMAIN_INVENTORY_INDEX = 2;
	public static final int TMAIN_INVENTORY_INDEX = 3;
	public static final int FMAIN_INVENTORY_INDEX = 4;
	public static final int PMODIFIER_INVENTORY_INDEX = 5;
	public static final int SMODIFIER_INVENTORY_INDEX = 6;
	public static final int TMODIFIER_INVENTORY_INDEX = 7;
	public static final int FMODIFIER_INVENTORY_INDEX = 8;
	
	public ItemStack[] inventory;

	public TileEntityMonadoStand() {
		inventory = new ItemStack[INVENTORY_SLOT];
	}
	
	public String returnUpgrade(ItemStack itemstack, int index) {
		if(index >= 0 && index < 5) {
			
		}
		return itemstack.toString();
	}
	
	@Override
	public int getSizeInventory() {
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int p_70301_1_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getInventoryName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasCustomInventoryName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getInventoryStackLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void openInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
		// TODO Auto-generated method stub
		return false;
	}
}
