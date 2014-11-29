package com.takam23.cybernetic_infusions.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import com.takam23.cybernetic_infusions.creativeTab.CreativeTabCI;
import com.takam23.cybernetic_infusions.reference.Materials;
import com.takam23.cybernetic_infusions.reference.Names;
import com.takam23.cybernetic_infusions.reference.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBasicMonado extends ItemSword {
	public ItemBasicMonado() {
		super(Materials.Tools.BASIC);
		this.setUnlocalizedName(Names.Weapons.BASIC_SWORD);
		this.setCreativeTab(CreativeTabCI.CI_TAB);
		this.maxStackSize = 1;
	}
	
	@Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
    	itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
