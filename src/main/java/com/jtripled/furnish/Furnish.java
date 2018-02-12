package com.jtripled.furnish;

import com.jtripled.voxen.mod.ModBase;
import com.jtripled.voxen.mod.Registry;
import com.jtripled.voxen.network.Network;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 *
 * @author jtripled
 */
@Mod(modid = Furnish.ID, name = Furnish.NAME, version = Furnish.VERSION, dependencies = Furnish.DEPENDS)
@Mod.EventBusSubscriber
public class Furnish extends ModBase
{
    public static final String ID = "furnish";
    public static final String NAME = "Furnish";
    public static final String VERSION = "1.0";
    public static final String DEPENDS = "required-after:voxen";
    
    @Mod.Instance(Furnish.ID)
    public static Furnish INSTANCE;
    
    public static Registry REGISTRY;

    @Override
    public String getID()
    {
        return ID;
    }

    @Override
    public String getName()
    {
        return NAME;
    }

    @Override
    public String getVersion()
    {
        return VERSION;
    }
    
    @Override
    public Registry getRegistry()
    {
        return REGISTRY;
    }
    
    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event)
    {
        REGISTRY = new FurnishRegistry();
        preInit(event);
    }
    
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event)
    {
        init(event);
    }
    
    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent event)
    {
        postInit(event);
    }
}
