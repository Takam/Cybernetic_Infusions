package com.takam23.cybernetic_infusions.init;

import com.takam23.cybernetic_infusions.block.*;
import com.takam23.cybernetic_infusions.reference.Names;
import com.takam23.cybernetic_infusions.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	public static final BlockCI monadoStand = new BlockMonadoStand();
	public static final BlockCI intercharger = new BlockInterCharger();
	public static final BlockCI storageCube = new BlockStorageCube();
	public static final BlockCI engraver = new BlockEngraver();
	public static final BlockCI nanoArmour = new BlockNanoArmour();
	public static final BlockCI nanoAttack = new BlockNanoAttack();
	public static final BlockCI nanoCarry = new BlockNanoCarry();
	public static final BlockCI nanoPort = new BlockNanoPort();
	public static final BlockCI nanoPrint = new BlockNanoPrint();
	
	public static void init() {
		GameRegistry.registerBlock(monadoStand, Names.Blocks.MONADO_STAND);
		GameRegistry.registerBlock(intercharger, Names.Blocks.INTERCHARGER);
		GameRegistry.registerBlock(storageCube, Names.Blocks.STORAGE_CUBE);
		GameRegistry.registerBlock(engraver, Names.Blocks.ENGRAVER);
		GameRegistry.registerBlock(nanoArmour, Names.Nano.ARMOUR_NANO);
		GameRegistry.registerBlock(nanoAttack, Names.Nano.ATTACK_NANO);
		GameRegistry.registerBlock(nanoCarry, Names.Nano.CARRY_NANO);
		GameRegistry.registerBlock(nanoPort, Names.Nano.PORT_NANO);
		GameRegistry.registerBlock(nanoPrint, Names.Nano.PRINT_NANO);
	}
}
