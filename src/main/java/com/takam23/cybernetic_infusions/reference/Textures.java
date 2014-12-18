package com.takam23.cybernetic_infusions.reference;

import com.takam23.cybernetic_infusions.util.ResourceLocationHelper;

import net.minecraft.util.ResourceLocation;

public class Textures {
	public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";
	
	public static final class Gui {
		private static final String GUI_SHEET_LOCATION = "textures/gui/";
		public static final ResourceLocation Engraver = ResourceLocationHelper.getRescourceLocation(GUI_SHEET_LOCATION + "engraver_gui.png");
	}
}
