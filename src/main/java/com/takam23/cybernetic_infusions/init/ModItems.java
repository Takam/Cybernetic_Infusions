package com.takam23.cybernetic_infusions.init;

import net.minecraft.item.ItemNameTag;
import net.minecraftforge.oredict.OreDictionary;

import com.takam23.cybernetic_infusions.item.*;
import com.takam23.cybernetic_infusions.reference.Names;
import com.takam23.cybernetic_infusions.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final ItemCI mundaneDisk = new ItemMundaneDisk();
	public static final ItemCI crudeSilver = new ItemCrudeSilver();
	public static final ItemCI cyberinfusedBook = new ItemCyberinfusedBook();
	public static final ItemCI cyberIngot = new ItemCyberIngot();
	public static final ItemCI infusedIngot = new ItemInfusedIngot();
	public static final ItemCI laserTracker = new ItemLaserTracker();
	public static final ItemCI nanobotShell = new ItemNanobotShell();
	
	public static final ItemCI chaoticEssence = new ItemChaoticEssence();
	public static final ItemCI crudeEssence = new ItemCrudeEssence();
	public static final ItemCI lifeEssence = new ItemLifeEssence();
	public static final ItemCI pureEssence = new ItemPureEssence();
	public static final ItemCI soulEssence = new ItemSoulEssence();
	
	public static final ItemBasicMonado basicMonado = new ItemBasicMonado();
	
	public static void init() {
		GameRegistry.registerItem(mundaneDisk, Names.Items.MUNDANE_DISK);
		GameRegistry.registerItem(crudeSilver, Names.Items.CRUDE_SILVER);
		GameRegistry.registerItem(cyberinfusedBook, Names.Items.CYBER_BOOK);
		GameRegistry.registerItem(cyberIngot, Names.Items.CYBER_INGOT);
		GameRegistry.registerItem(infusedIngot, Names.Items.INFUSED_INGOT);
		GameRegistry.registerItem(laserTracker, Names.Items.LASER_TRACKER);
		GameRegistry.registerItem(nanobotShell, Names.Items.NANOBOT_SHELL);
		
		GameRegistry.registerItem(crudeEssence, Names.Essence.CRUDE_ESSENCE);
		GameRegistry.registerItem(pureEssence, Names.Essence.PURE_ESSENCE);
		GameRegistry.registerItem(chaoticEssence, Names.Essence.CHAOTIC_ESSENCE);
		GameRegistry.registerItem(lifeEssence, Names.Essence.LIFE_ESSENCE);
		GameRegistry.registerItem(soulEssence, Names.Essence.SOUL_ESSENCE);
		
		GameRegistry.registerItem(basicMonado, Names.Weapons.BASIC_SWORD);
		
		OreDictionary.registerOre("ingotSilver", ModItems.crudeSilver);
	}
}
