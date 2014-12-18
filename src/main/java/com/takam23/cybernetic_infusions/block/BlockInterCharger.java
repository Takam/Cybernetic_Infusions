package com.takam23.cybernetic_infusions.block;

import com.takam23.cybernetic_infusions.creativeTab.CreativeTabCI;
import com.takam23.cybernetic_infusions.reference.Names;

import net.minecraft.block.material.Material;

public class BlockInterCharger extends BlockCI {
	public BlockInterCharger() {
		super(Material.anvil);
		this.setBlockName(Names.Blocks.INTERCHARGER);
	}
}
