package com.takam23.cybernetic_infusions.client.gui.inventory;

import com.takam23.cybernetic_infusions.util.ResourceLocationHelper;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiCI extends GuiContainer {

	protected ResourceLocation guiTexture;
	
	public GuiCI(Container container) {
		super(container);
	}
	
	public GuiCI(Container container, String texture) {
		this(container, ResourceLocationHelper.getRescourceLocation(texture));
	}

	public GuiCI(Container container, ResourceLocation guiTexture) {
		super(container);
		this.guiTexture = guiTexture;
	}
	
	@Override
	public void initGui() {
		super.initGui();
	}
	
	@Override
	public void drawScreen(int x, int y, float particleTick) {
		super.drawScreen(x, y, particleTick);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int x, int y) {
		super.drawGuiContainerForegroundLayer(x, y);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float particleTick, int x, int y) {
		
	}
	
	@Override
    protected void keyTyped(char characterTyped, int keyPressed)
    {

    }

    @Override
    public void handleMouseInput()
    {

    }

    @Override
    protected void mouseClicked(int mX, int mY, int mouseButton)
    {

    }

    @Override
    protected void mouseMovedOrUp(int mX, int mY, int mouseButton)
    {

    }

    @Override
    protected void mouseClickMove(int mX, int mY, int lastClick, long timeSinceClick)
    {

    }
}
