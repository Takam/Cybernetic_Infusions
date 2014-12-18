package com.takam23.cybernetic_infusions.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityCI extends TileEntity {
	
	protected ForgeDirection orientation;
	protected byte state;
	protected String customName;
	protected String owner;
	public TileEntityCI() {
		orientation = ForgeDirection.SOUTH;
		state = 0;
		customName = "";
		owner = "";
	}
	
	public ForgeDirection getOrientation() {
		return orientation;
	}
	
	public void setOrientation(ForgeDirection direction) {
		this.orientation = direction;
	}
	
	public void setOrientation(int direction) {
		this.orientation = ForgeDirection.getOrientation(direction);
	}
	
	public short getState() {
		return state;
	}
	
	public void setState(byte state) {
		this.state = state;
	}
	
	public String getCustomName() {
		return customName;
	}
	
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	
	public String setOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
}
