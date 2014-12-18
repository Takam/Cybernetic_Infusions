package com.takam23.cybernetic_infusions.tileentity;

import com.takam23.cybernetic_infusions.reference.Names;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class TileEntityEngraver extends TileEntityCI implements IInventory {

	public static final int INVENTORY_SIZE = 4;
	public static final int PLAN_INVENTORY_INDEX = 0;
	public static final int INPUT_INVENTORY_INDEX = 1;
	public static final int PROCESSOR_INVENTORY_INDEX = 2;
	public static final int OUTPUT_INVENTORY_INDEX = 3;
	
	public int deviceBurnTIme;
	public int itemCookTime;
	
	private ItemStack[] inventory;
	
	public TileEntityEngraver() {
		inventory = new ItemStack[INVENTORY_SIZE];
	}
	@Override
	public int getSizeInventory() {
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int slotIndex) {
		return inventory[slotIndex];
	}

	@Override
	public ItemStack decrStackSize(int slotIndex, int decrementAmount) {
		ItemStack itemStack = getStackInSlot(slotIndex);
		if(itemStack != null) {
			if(itemStack.stackSize <= decrementAmount) {
				setInventorySlotContents(slotIndex, null);
			}
			else {
				itemStack = itemStack.splitStack(decrementAmount);
				if(itemStack.stackSize == 0) {
					setInventorySlotContents(slotIndex, null);
				}
			}
		}
		return itemStack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slotIndex) {
		ItemStack itemstack = getStackInSlot(slotIndex);
		if(itemstack != null) {
			setInventorySlotContents(slotIndex, null);
		}
		return itemstack;
	}

	@Override
	public void setInventorySlotContents(int slotIndex, ItemStack itemStack) {
		inventory[slotIndex] = itemStack;
		if(itemStack != null && itemStack.stackSize > getInventoryStackLimit()) {
			itemStack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public String getInventoryName() {
		return this.hasCustomInventoryName() ? this.getCustomName() : Names.Blocks.ENGRAVER;
	}

	@Override
	public boolean hasCustomInventoryName() {
		return this.hasCustomInventoryName();
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return true;
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
	public boolean isItemValidForSlot(int slotIndex, ItemStack itemStack) {
		return false;
	}
	
	public void writeToNBT(NBTTagCompound nbttagCompound) {
		super.writeToNBT(nbttagCompound);
		
		NBTTagList tagList = new NBTTagList();
		for(int currentIndex = 0; currentIndex < inventory.length; ++currentIndex) {
			if(inventory[currentIndex] != null) {
				NBTTagCompound tagCompound = new NBTTagCompound();
				tagCompound.setByte("Slot", (byte)currentIndex);
				inventory[currentIndex].writeToNBT(tagCompound);
				tagList.appendTag(tagCompound);
			}
		}
		nbttagCompound.setTag("Inventory",tagList);
	}
	
}
