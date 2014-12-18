package com.takam23.cybernetic_infusions.inventory;

import com.takam23.cybernetic_infusions.tileentity.TileEntityEngraver;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.tileentity.TileEntity;

public class ContainerEngraver extends ContainerCI {
	private TileEntity engraver = new TileEntityEngraver();
	private int lastItemTime;
	private int quality;
	
	public ContainerEngraver(InventoryPlayer inventory, TileEntityEngraver engraver) {
		this.engraver = engraver;
		
		this.addSlotToContainer(new Slot(engraver, TileEntityEngraver.INPUT_INVENTORY_INDEX, 39, 27));
		this.addSlotToContainer(new Slot(engraver, TileEntityEngraver.PROCESSOR_INVENTORY_INDEX,39, 71));
		this.addSlotToContainer(new Slot(engraver, TileEntityEngraver.PLAN_INVENTORY_INDEX, 115, 49));
		this.addSlotToContainer(new Slot(engraver, TileEntityEngraver.OUTPUT_INVENTORY_INDEX, 192, 49));
		
		for(int inventoryRow = 0; inventoryRow < PLAYER_INVENTORY_ROWS; ++inventoryRow) {
			for(int inventoryColumn = 0; inventoryColumn < PLAYER_INVENTORY_COLUMNS; ++inventoryColumn) {
				this.addSlotToContainer(new Slot(inventory, inventoryColumn + inventoryRow * 9 + 9, 7 + inventoryColumn * 27, 190 + inventoryRow * 27));
			}
		}
		
		for(int action = 0; action < 9; ++action) {
			this.addSlotToContainer(new Slot(inventory, action, 7 + action * 27, 221));
		}
	}
}
