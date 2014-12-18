package com.takam23.cybernetic_infusions.init;

import com.takam23.cybernetic_infusions.reference.Names;
import com.takam23.cybernetic_infusions.tileentity.TileEntityEngraver;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntities {
	public static void init() {
		GameRegistry.registerTileEntityWithAlternatives(TileEntityEngraver.class, Names.Blocks.ENGRAVER, "tile." + Names.Blocks.ENGRAVER);
	}
}
