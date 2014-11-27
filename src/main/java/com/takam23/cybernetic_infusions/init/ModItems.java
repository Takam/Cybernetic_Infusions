package com.takam23.cybernetic_infusions.init;

import com.takam23.cybernetic_infusions.item.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static final ItemCI mundaneDisk = new ItemMundaneDisk();
	
	public static void init() {
		GameRegistry.registerItem(mundaneDisk, "mundaneDisk");
	}
}
