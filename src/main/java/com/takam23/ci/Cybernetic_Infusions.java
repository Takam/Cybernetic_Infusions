package com.takam23.ci;

import com.takam23.ci.handler.ConfigurationHandler;
import com.takam23.ci.proxy.IProxy;
import com.takam23.ci.reference.Reference;
import com.takam23.ci.util.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY)
public class Cybernetic_Infusions {

	    @Mod.Instance(Reference.MOD_ID)
	    public static Cybernetic_Infusions instance;

	    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	    public static IProxy proxy;

	    @Mod.EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {
	        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
	    }

	    @Mod.EventHandler
	    public void init(FMLInitializationEvent event)
	    {

	    }

	    @Mod.EventHandler
	    public void postInit(FMLPostInitializationEvent event)
	    {
	        LogHelper.info("If there seems to be anything wrong, or you encounter an error, please report it so I can fix it.");
	    }
	}
