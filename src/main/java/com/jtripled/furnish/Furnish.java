package com.jtripled.furnish;

import com.jtripled.furnish.proxy.Proxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 *
 * @author jtripled
 */
@Mod(modid = Furnish.ID, name = Furnish.NAME, version = Furnish.VERSION, dependencies = Furnish.DEPENDS)
@Mod.EventBusSubscriber
public class Furnish
{
    public static final String ID = "furnish";
    public static final String NAME = "Furnish";
    public static final String VERSION = "1.0";
    public static final String DEPENDS = "after:biomesoplenty";
    
    @Mod.Instance(ID)
    public static Furnish INSTANCE;
    
    @SidedProxy(serverSide = "com.jtripled." + ID + ".proxy.ProxyServer", clientSide = "com.jtripled." + ID + ".proxy.ProxyClient")
    public static Proxy PROXY;
    
    public static Furnish getInstance()
    {
        return INSTANCE;
    }

    public static String getID()
    {
        return ID;
    }

    public static String getName()
    {
        return NAME;
    }

    public static String getVersion()
    {
        return VERSION;
    }
    
    public static Proxy getProxy()
    {
        return PROXY;
    }
    
    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event)
    {
        
    }
    
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event)
    {
        
    }
    
    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent event)
    {
        
    }
}
