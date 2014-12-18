package com.takam23.cybernetic_infusions.util;

import com.takam23.cybernetic_infusions.reference.Reference;

import net.minecraft.util.ResourceLocation;

public class ResourceLocationHelper {
	public static ResourceLocation getRescourceLocation(String modId, String path) {
		return new ResourceLocation(modId, path);
	}
	public static ResourceLocation getRescourceLocation(String path) {
		return new ResourceLocation(Reference.MOD_ID.toLowerCase(), path);
	}
}
