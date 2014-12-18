package com.takam23.cybernetic_infusions.block;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.takam23.cybernetic_infusions.Cybernetic_Infusions;
import com.takam23.cybernetic_infusions.reference.GUIs;
import com.takam23.cybernetic_infusions.reference.Names;
import com.takam23.cybernetic_infusions.reference.Reference;
import com.takam23.cybernetic_infusions.reference.Textures.Gui;
import com.takam23.cybernetic_infusions.tileentity.TileEntityEngraver;

public class BlockEngraver extends BlockCI implements ITileEntityProvider {
	public BlockEngraver() {
		super();
		this.setBlockName(Names.Blocks.ENGRAVER);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metaData) {
		return new TileEntityEngraver();
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return true;
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		if(player.isSneaking()) {
			return false;
		} else {
			if(!world.isRemote) {
				if(world.getTileEntity(x, y, z) instanceof TileEntityEngraver) {
					player.openGui(Cybernetic_Infusions.instance, GUIs.ENGRAVER.ordinal(), world, x, y, z);
				}
			}
			return true;
		}
	}
}
