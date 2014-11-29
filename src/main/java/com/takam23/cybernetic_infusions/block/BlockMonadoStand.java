package com.takam23.cybernetic_infusions.block;

import com.takam23.cybernetic_infusions.creativeTab.CreativeTabCI;
import com.takam23.cybernetic_infusions.reference.Names;

import net.minecraft.block.material.Material;

public class BlockMonadoStand extends BlockCI {
	public BlockMonadoStand() {
		super();
		this.setBlockName(Names.Blocks.MONADO_STAND);
		this.setCreativeTab(CreativeTabCI.CI_TAB);
	}
}
