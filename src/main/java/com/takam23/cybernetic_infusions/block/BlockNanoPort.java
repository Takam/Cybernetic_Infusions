package com.takam23.cybernetic_infusions.block;

import com.takam23.cybernetic_infusions.creativeTab.CreativeTabCI;
import com.takam23.cybernetic_infusions.reference.Names;

import net.minecraft.block.material.Material;

public class BlockNanoPort extends BlockCI {
	public BlockNanoPort() {
		super();
		this.setBlockName(Names.Nano.PORT_NANO);
		this.setCreativeTab(CreativeTabCI.CI_TAB);
	}
}
