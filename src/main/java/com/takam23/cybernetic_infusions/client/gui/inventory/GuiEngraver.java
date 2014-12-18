package com.takam23.cybernetic_infusions.client.gui.inventory;


import org.lwjgl.opengl.GL11;

import net.minecraft.entity.player.InventoryPlayer;

import com.takam23.cybernetic_infusions.inventory.ContainerEngraver;
import com.takam23.cybernetic_infusions.reference.Textures;
import com.takam23.cybernetic_infusions.tileentity.TileEntityEngraver;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiEngraver extends GuiCI {
	private TileEntityEngraver engraver;
	
	public GuiEngraver(InventoryPlayer inventory, TileEntityEngraver engraver) {
		super(new ContainerEngraver(inventory, engraver));
		ySize = 176;
		this.engraver = engraver;
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float opacity, int x, int y) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		
		this.mc.getTextureManager().bindTexture(Textures.Gui.Engraver);
		
		int xStart = (width - xSize) / 2;
		int yStart = (height - ySize) / 2;
		this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
	}
}
