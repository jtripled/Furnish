package com.jtripled.furnish.proxy;

import com.jtripled.furnish.Furnish;
import com.jtripled.furnish.entity.EntitySeat;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 *
 * @author jtripled
 */
public class Proxy
{
    public void onPreInit(FMLPreInitializationEvent event)
    {
        
    }
    
    public void onInit(FMLInitializationEvent event)
    {
        EntityRegistry.registerModEntity(new ResourceLocation("furnish:seat"), EntitySeat.class, "Seat", 0, Furnish.getInstance(), 80, 1, false);
    }
    
    public void onPostInit(FMLPostInitializationEvent event)
    {
        
    }
    
    public String localize(String unlocalized, Object... args)
    {
        return null;
    }
    
    public void registerItem(RegistryEvent.Register<Item> event, Item item)
    {
        event.getRegistry().register(item);
    }
    
    public void registerBlock(RegistryEvent.Register<Block> event, Block block)
    {
        registerBlock(event, block, null);
    }
    
    public void registerBlock(RegistryEvent.Register<Block> event, Block block, Class<? extends TileEntity> tileClass, IProperty... ignoredProperties)
    {
        event.getRegistry().register(block);
        if (tileClass != null)
            GameRegistry.registerTileEntity(tileClass, block.getRegistryName());
    }
}
