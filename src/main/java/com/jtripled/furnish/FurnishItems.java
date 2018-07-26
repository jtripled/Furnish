package com.jtripled.furnish;

import com.jtripled.furnish.item.FurnishItemBlock;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 *
 * @author jtripled
 */
@Mod.EventBusSubscriber
public class FurnishItems
{
    public static final Item ACACIA_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.ACACIA_CHAIR);
    public static final Item ACACIA_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.ACACIA_COFFEE_TABLE);
    public static final Item ACACIA_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.ACACIA_COUCH);
    public static final Item ACACIA_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.ACACIA_TABLE);
    
    public static final Item ANDESITE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.ANDESITE_CHAIR);
    public static final Item ANDESITE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.ANDESITE_COFFEE_TABLE);
    public static final Item ANDESITE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.ANDESITE_COUCH);
    public static final Item ANDESITE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.ANDESITE_TABLE);
    
    public static final Item BIRCH_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BIRCH_CHAIR);
    public static final Item BIRCH_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BIRCH_COFFEE_TABLE);
    public static final Item BIRCH_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BIRCH_COUCH);
    public static final Item BIRCH_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BIRCH_TABLE);
    
    public static final Item BONE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BONE_CHAIR);
    public static final Item BONE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BONE_COFFEE_TABLE);
    public static final Item BONE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BONE_COUCH);
    public static final Item BONE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BONE_TABLE);
    
    public static final Item BRICK_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BRICK_CHAIR);
    public static final Item BRICK_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BRICK_COFFEE_TABLE);
    public static final Item BRICK_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BRICK_COUCH);
    public static final Item BRICK_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BRICK_TABLE);
    
    public static final Item COBBLESTONE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.COBBLESTONE_CHAIR);
    public static final Item COBBLESTONE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.COBBLESTONE_COFFEE_TABLE);
    public static final Item COBBLESTONE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.COBBLESTONE_COUCH);
    public static final Item COBBLESTONE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.COBBLESTONE_TABLE);
    
    public static final Item DARK_OAK_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.DARK_OAK_CHAIR);
    public static final Item DARK_OAK_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.DARK_OAK_COFFEE_TABLE);
    public static final Item DARK_OAK_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.DARK_OAK_COUCH);
    public static final Item DARK_OAK_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.DARK_OAK_TABLE);
    
    public static final Item DARK_PRISMARINE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.DARK_PRISMARINE_CHAIR);
    public static final Item DARK_PRISMARINE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.DARK_PRISMARINE_COFFEE_TABLE);
    public static final Item DARK_PRISMARINE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.DARK_PRISMARINE_COUCH);
    public static final Item DARK_PRISMARINE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.DARK_PRISMARINE_TABLE);
    
    public static final Item DIAMOND_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.DIAMOND_CHAIR);
    public static final Item DIAMOND_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.DIAMOND_COFFEE_TABLE);
    public static final Item DIAMOND_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.DIAMOND_COUCH);
    public static final Item DIAMOND_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.DIAMOND_TABLE);
    
    public static final Item DIORITE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.DIORITE_CHAIR);
    public static final Item DIORITE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.DIORITE_COFFEE_TABLE);
    public static final Item DIORITE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.DIORITE_COUCH);
    public static final Item DIORITE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.DIORITE_TABLE);
    
    public static final Item EMERALD_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.EMERALD_CHAIR);
    public static final Item EMERALD_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.EMERALD_COFFEE_TABLE);
    public static final Item EMERALD_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.EMERALD_COUCH);
    public static final Item EMERALD_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.EMERALD_TABLE);
    
    public static final Item END_STONE_BRICK_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.END_STONE_BRICK_CHAIR);
    public static final Item END_STONE_BRICK_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.END_STONE_BRICK_COFFEE_TABLE);
    public static final Item END_STONE_BRICK_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.END_STONE_BRICK_COUCH);
    public static final Item END_STONE_BRICK_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.END_STONE_BRICK_TABLE);
    
    public static final Item GOLD_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.GOLD_CHAIR);
    public static final Item GOLD_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.GOLD_COFFEE_TABLE);
    public static final Item GOLD_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.GOLD_COUCH);
    public static final Item GOLD_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.GOLD_TABLE);
    
    public static final Item GRANITE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.GRANITE_CHAIR);
    public static final Item GRANITE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.GRANITE_COFFEE_TABLE);
    public static final Item GRANITE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.GRANITE_COUCH);
    public static final Item GRANITE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.GRANITE_TABLE);
    
    public static final Item IRON_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.IRON_CHAIR);
    public static final Item IRON_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.IRON_COFFEE_TABLE);
    public static final Item IRON_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.IRON_COUCH);
    public static final Item IRON_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.IRON_TABLE);
    
    public static final Item JUNGLE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.JUNGLE_CHAIR);
    public static final Item JUNGLE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.JUNGLE_COFFEE_TABLE);
    public static final Item JUNGLE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.JUNGLE_COUCH);
    public static final Item JUNGLE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.JUNGLE_TABLE);
    
    public static final Item LAPIS_LAZULI_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.LAPIS_LAZULI_CHAIR);
    public static final Item LAPIS_LAZULI_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.LAPIS_LAZULI_COFFEE_TABLE);
    public static final Item LAPIS_LAZULI_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.LAPIS_LAZULI_COUCH);
    public static final Item LAPIS_LAZULI_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.LAPIS_LAZULI_TABLE);
    
    public static final Item MOSS_STONE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.MOSS_STONE_CHAIR);
    public static final Item MOSS_STONE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.MOSS_STONE_COFFEE_TABLE);
    public static final Item MOSS_STONE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.MOSS_STONE_COUCH);
    public static final Item MOSS_STONE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.MOSS_STONE_TABLE);
    
    public static final Item NETHER_BRICK_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.NETHER_BRICK_CHAIR);
    public static final Item NETHER_BRICK_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.NETHER_BRICK_COFFEE_TABLE);
    public static final Item NETHER_BRICK_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.NETHER_BRICK_COUCH);
    public static final Item NETHER_BRICK_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.NETHER_BRICK_TABLE);
    
    public static final Item OAK_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.OAK_CHAIR);
    public static final Item OAK_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.OAK_COFFEE_TABLE);
    public static final Item OAK_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.OAK_COUCH);
    public static final Item OAK_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.OAK_TABLE);
    
    public static final Item OBSIDIAN_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.OBSIDIAN_CHAIR);
    public static final Item OBSIDIAN_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.OBSIDIAN_COFFEE_TABLE);
    public static final Item OBSIDIAN_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.OBSIDIAN_COUCH);
    public static final Item OBSIDIAN_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.OBSIDIAN_TABLE);
    
    public static final Item POLISHED_ANDESITE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.POLISHED_ANDESITE_CHAIR);
    public static final Item POLISHED_ANDESITE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.POLISHED_ANDESITE_COFFEE_TABLE);
    public static final Item POLISHED_ANDESITE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.POLISHED_ANDESITE_COUCH);
    public static final Item POLISHED_ANDESITE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.POLISHED_ANDESITE_TABLE);
    
    public static final Item POLISHED_DIORITE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.POLISHED_DIORITE_CHAIR);
    public static final Item POLISHED_DIORITE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.POLISHED_DIORITE_COFFEE_TABLE);
    public static final Item POLISHED_DIORITE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.POLISHED_DIORITE_COUCH);
    public static final Item POLISHED_DIORITE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.POLISHED_DIORITE_TABLE);
    
    public static final Item POLISHED_GRANITE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.POLISHED_GRANITE_CHAIR);
    public static final Item POLISHED_GRANITE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.POLISHED_GRANITE_COFFEE_TABLE);
    public static final Item POLISHED_GRANITE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.POLISHED_GRANITE_COUCH);
    public static final Item POLISHED_GRANITE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.POLISHED_GRANITE_TABLE);
    
    public static final Item PRISMARINE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.PRISMARINE_CHAIR);
    public static final Item PRISMARINE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.PRISMARINE_COFFEE_TABLE);
    public static final Item PRISMARINE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.PRISMARINE_COUCH);
    public static final Item PRISMARINE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.PRISMARINE_TABLE);
    
    public static final Item PRISMARINE_BRICK_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.PRISMARINE_BRICK_CHAIR);
    public static final Item PRISMARINE_BRICK_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.PRISMARINE_BRICK_COFFEE_TABLE);
    public static final Item PRISMARINE_BRICK_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.PRISMARINE_BRICK_COUCH);
    public static final Item PRISMARINE_BRICK_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.PRISMARINE_BRICK_TABLE);
    
    public static final Item PURPUR_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.PURPUR_CHAIR);
    public static final Item PURPUR_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.PURPUR_COFFEE_TABLE);
    public static final Item PURPUR_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.PURPUR_COUCH);
    public static final Item PURPUR_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.PURPUR_TABLE);
    
    public static final Item QUARTZ_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.QUARTZ_CHAIR);
    public static final Item QUARTZ_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.QUARTZ_COFFEE_TABLE);
    public static final Item QUARTZ_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.QUARTZ_COUCH);
    public static final Item QUARTZ_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.QUARTZ_TABLE);
    
    public static final Item RED_NETHER_BRICK_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.RED_NETHER_BRICK_CHAIR);
    public static final Item RED_NETHER_BRICK_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.RED_NETHER_BRICK_COFFEE_TABLE);
    public static final Item RED_NETHER_BRICK_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.RED_NETHER_BRICK_COUCH);
    public static final Item RED_NETHER_BRICK_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.RED_NETHER_BRICK_TABLE);
    
    public static final Item RED_SANDSTONE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.RED_SANDSTONE_CHAIR);
    public static final Item RED_SANDSTONE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.RED_SANDSTONE_COFFEE_TABLE);
    public static final Item RED_SANDSTONE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.RED_SANDSTONE_COUCH);
    public static final Item RED_SANDSTONE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.RED_SANDSTONE_TABLE);
    
    public static final Item REDSTONE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.REDSTONE_CHAIR);
    public static final Item REDSTONE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.REDSTONE_COFFEE_TABLE);
    public static final Item REDSTONE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.REDSTONE_COUCH);
    public static final Item REDSTONE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.REDSTONE_TABLE);
    
    public static final Item SANDSTONE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.SANDSTONE_CHAIR);
    public static final Item SANDSTONE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.SANDSTONE_COFFEE_TABLE);
    public static final Item SANDSTONE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.SANDSTONE_COUCH);
    public static final Item SANDSTONE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.SANDSTONE_TABLE);
    
    public static final Item SPRUCE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.SPRUCE_CHAIR);
    public static final Item SPRUCE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.SPRUCE_COFFEE_TABLE);
    public static final Item SPRUCE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.SPRUCE_COUCH);
    public static final Item SPRUCE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.SPRUCE_TABLE);
    
    public static final Item STONE_BRICK_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.STONE_BRICK_CHAIR);
    public static final Item STONE_BRICK_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.STONE_BRICK_COFFEE_TABLE);
    public static final Item STONE_BRICK_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.STONE_BRICK_COUCH);
    public static final Item STONE_BRICK_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.STONE_BRICK_TABLE);
    
    public static final Item STONE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.STONE_CHAIR);
    public static final Item STONE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.STONE_COFFEE_TABLE);
    public static final Item STONE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.STONE_COUCH);
    public static final Item STONE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.STONE_TABLE);
    
    public static boolean BOP_LOADED = false;
    
    public static Item BOP_CHERRY_CHAIR_ITEM;
    public static Item BOP_CHERRY_COFFEE_TABLE_ITEM;
    public static Item BOP_CHERRY_COUCH_ITEM;
    public static Item BOP_CHERRY_TABLE_ITEM;
    
    public static Item BOP_EBONY_CHAIR_ITEM;
    public static Item BOP_EBONY_COFFEE_TABLE_ITEM;
    public static Item BOP_EBONY_COUCH_ITEM;
    public static Item BOP_EBONY_TABLE_ITEM;
    
    public static Item BOP_ETHEREAL_CHAIR_ITEM;
    public static Item BOP_ETHEREAL_COFFEE_TABLE_ITEM;
    public static Item BOP_ETHEREAL_COUCH_ITEM;
    public static Item BOP_ETHEREAL_TABLE_ITEM;
    
    public static Item BOP_EUCALYPTUS_CHAIR_ITEM;
    public static Item BOP_EUCALYPTUS_COFFEE_TABLE_ITEM;
    public static Item BOP_EUCALYPTUS_COUCH_ITEM;
    public static Item BOP_EUCALYPTUS_TABLE_ITEM;
    
    public static Item BOP_FIR_CHAIR_ITEM;
    public static Item BOP_FIR_COFFEE_TABLE_ITEM;
    public static Item BOP_FIR_COUCH_ITEM;
    public static Item BOP_FIR_TABLE_ITEM;
    
    public static Item BOP_HELLBARK_CHAIR_ITEM;
    public static Item BOP_HELLBARK_COFFEE_TABLE_ITEM;
    public static Item BOP_HELLBARK_COUCH_ITEM;
    public static Item BOP_HELLBARK_TABLE_ITEM;
    
    public static Item BOP_JACARANDA_CHAIR_ITEM;
    public static Item BOP_JACARANDA_COFFEE_TABLE_ITEM;
    public static Item BOP_JACARANDA_COUCH_ITEM;
    public static Item BOP_JACARANDA_TABLE_ITEM;
    
    public static Item BOP_MAGIC_CHAIR_ITEM;
    public static Item BOP_MAGIC_COFFEE_TABLE_ITEM;
    public static Item BOP_MAGIC_COUCH_ITEM;
    public static Item BOP_MAGIC_TABLE_ITEM;
    
    public static Item BOP_MAHOGANY_CHAIR_ITEM;
    public static Item BOP_MAHOGANY_COFFEE_TABLE_ITEM;
    public static Item BOP_MAHOGANY_COUCH_ITEM;
    public static Item BOP_MAHOGANY_TABLE_ITEM;
    
    public static Item BOP_MANGROVE_CHAIR_ITEM;
    public static Item BOP_MANGROVE_COFFEE_TABLE_ITEM;
    public static Item BOP_MANGROVE_COUCH_ITEM;
    public static Item BOP_MANGROVE_TABLE_ITEM;
    
    public static Item BOP_PALM_CHAIR_ITEM;
    public static Item BOP_PALM_COFFEE_TABLE_ITEM;
    public static Item BOP_PALM_COUCH_ITEM;
    public static Item BOP_PALM_TABLE_ITEM;
    
    public static Item BOP_PINE_CHAIR_ITEM;
    public static Item BOP_PINE_COFFEE_TABLE_ITEM;
    public static Item BOP_PINE_COUCH_ITEM;
    public static Item BOP_PINE_TABLE_ITEM;
    
    public static Item BOP_REDWOOD_CHAIR_ITEM;
    public static Item BOP_REDWOOD_COFFEE_TABLE_ITEM;
    public static Item BOP_REDWOOD_COUCH_ITEM;
    public static Item BOP_REDWOOD_TABLE_ITEM;
    
    public static Item BOP_SACRED_OAK_CHAIR_ITEM;
    public static Item BOP_SACRED_OAK_COFFEE_TABLE_ITEM;
    public static Item BOP_SACRED_OAK_COUCH_ITEM;
    public static Item BOP_SACRED_OAK_TABLE_ITEM;
    
    public static Item BOP_UMBRAN_CHAIR_ITEM;
    public static Item BOP_UMBRAN_COFFEE_TABLE_ITEM;
    public static Item BOP_UMBRAN_COUCH_ITEM;
    public static Item BOP_UMBRAN_TABLE_ITEM;
    
    public static Item BOP_WILLOW_CHAIR_ITEM;
    public static Item BOP_WILLOW_COFFEE_TABLE_ITEM;
    public static Item BOP_WILLOW_COUCH_ITEM;
    public static Item BOP_WILLOW_TABLE_ITEM;
    
    public static Item BOP_BAMBOO_CHAIR_ITEM;
    public static Item BOP_BAMBOO_COFFEE_TABLE_ITEM;
    public static Item BOP_BAMBOO_COUCH_ITEM;
    public static Item BOP_BAMBOO_TABLE_ITEM;
    
    public static Item BOP_MUD_BRICK_CHAIR_ITEM;
    public static Item BOP_MUD_BRICK_COFFEE_TABLE_ITEM;
    public static Item BOP_MUD_BRICK_COUCH_ITEM;
    public static Item BOP_MUD_BRICK_TABLE_ITEM;
    
    public static Item BOP_WHITE_SANDSTONE_CHAIR_ITEM;
    public static Item BOP_WHITE_SANDSTONE_COFFEE_TABLE_ITEM;
    public static Item BOP_WHITE_SANDSTONE_COUCH_ITEM;
    public static Item BOP_WHITE_SANDSTONE_TABLE_ITEM;
    
    public static Item BOP_AMETHYST_CHAIR_ITEM;
    public static Item BOP_AMETHYST_COFFEE_TABLE_ITEM;
    public static Item BOP_AMETHYST_COUCH_ITEM;
    public static Item BOP_AMETHYST_TABLE_ITEM;
    
    public static Item BOP_RUBY_CHAIR_ITEM;
    public static Item BOP_RUBY_COFFEE_TABLE_ITEM;
    public static Item BOP_RUBY_COUCH_ITEM;
    public static Item BOP_RUBY_TABLE_ITEM;
    
    public static Item BOP_PERIDOT_CHAIR_ITEM;
    public static Item BOP_PERIDOT_COFFEE_TABLE_ITEM;
    public static Item BOP_PERIDOT_COUCH_ITEM;
    public static Item BOP_PERIDOT_TABLE_ITEM;
    
    public static Item BOP_TOPAZ_CHAIR_ITEM;
    public static Item BOP_TOPAZ_COFFEE_TABLE_ITEM;
    public static Item BOP_TOPAZ_COUCH_ITEM;
    public static Item BOP_TOPAZ_TABLE_ITEM;
    
    public static Item BOP_TANZANITE_CHAIR_ITEM;
    public static Item BOP_TANZANITE_COFFEE_TABLE_ITEM;
    public static Item BOP_TANZANITE_COUCH_ITEM;
    public static Item BOP_TANZANITE_TABLE_ITEM;
    
    public static Item BOP_MALACHITE_CHAIR_ITEM;
    public static Item BOP_MALACHITE_COFFEE_TABLE_ITEM;
    public static Item BOP_MALACHITE_COUCH_ITEM;
    public static Item BOP_MALACHITE_TABLE_ITEM;
    
    public static Item BOP_SAPPHIRE_CHAIR_ITEM;
    public static Item BOP_SAPPHIRE_COFFEE_TABLE_ITEM;
    public static Item BOP_SAPPHIRE_COUCH_ITEM;
    public static Item BOP_SAPPHIRE_TABLE_ITEM;
    
    public static Item BOP_AMBER_CHAIR_ITEM;
    public static Item BOP_AMBER_COFFEE_TABLE_ITEM;
    public static Item BOP_AMBER_COUCH_ITEM;
    public static Item BOP_AMBER_TABLE_ITEM;
    
    public static Item BOP_FLESH_CHAIR_ITEM;
    public static Item BOP_FLESH_COFFEE_TABLE_ITEM;
    public static Item BOP_FLESH_COUCH_ITEM;
    public static Item BOP_FLESH_TABLE_ITEM;
    
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event)
    {
        Furnish.getProxy().registerItem(event, ACACIA_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, ACACIA_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, ACACIA_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, ACACIA_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, ANDESITE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, ANDESITE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, ANDESITE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, ANDESITE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, BIRCH_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, BIRCH_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, BIRCH_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, BIRCH_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, BONE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, BONE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, BONE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, BONE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, BRICK_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, BRICK_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, BRICK_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, BRICK_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, COBBLESTONE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, COBBLESTONE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, COBBLESTONE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, COBBLESTONE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, DARK_OAK_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, DARK_OAK_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, DARK_OAK_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, DARK_OAK_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, DARK_PRISMARINE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, DARK_PRISMARINE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, DARK_PRISMARINE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, DARK_PRISMARINE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, DIAMOND_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, DIAMOND_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, DIAMOND_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, DIAMOND_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, DIORITE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, DIORITE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, DIORITE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, DIORITE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, EMERALD_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, EMERALD_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, EMERALD_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, EMERALD_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, END_STONE_BRICK_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, END_STONE_BRICK_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, END_STONE_BRICK_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, END_STONE_BRICK_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, GOLD_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, GOLD_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, GOLD_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, GOLD_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, GRANITE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, GRANITE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, GRANITE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, GRANITE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, IRON_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, IRON_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, IRON_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, IRON_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, JUNGLE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, JUNGLE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, JUNGLE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, JUNGLE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, LAPIS_LAZULI_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, LAPIS_LAZULI_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, LAPIS_LAZULI_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, LAPIS_LAZULI_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, MOSS_STONE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, MOSS_STONE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, MOSS_STONE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, MOSS_STONE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, NETHER_BRICK_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, NETHER_BRICK_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, NETHER_BRICK_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, NETHER_BRICK_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, OAK_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, OAK_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, OAK_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, OAK_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, OBSIDIAN_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, OBSIDIAN_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, OBSIDIAN_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, OBSIDIAN_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, POLISHED_ANDESITE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, POLISHED_ANDESITE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, POLISHED_ANDESITE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, POLISHED_ANDESITE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, POLISHED_DIORITE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, POLISHED_DIORITE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, POLISHED_DIORITE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, POLISHED_DIORITE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, POLISHED_GRANITE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, POLISHED_GRANITE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, POLISHED_GRANITE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, POLISHED_GRANITE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, PRISMARINE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, PRISMARINE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, PRISMARINE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, PRISMARINE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, PRISMARINE_BRICK_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, PRISMARINE_BRICK_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, PRISMARINE_BRICK_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, PRISMARINE_BRICK_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, PURPUR_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, PURPUR_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, PURPUR_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, PURPUR_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, QUARTZ_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, QUARTZ_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, QUARTZ_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, QUARTZ_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, RED_NETHER_BRICK_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, RED_NETHER_BRICK_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, RED_NETHER_BRICK_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, RED_NETHER_BRICK_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, RED_SANDSTONE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, RED_SANDSTONE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, RED_SANDSTONE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, RED_SANDSTONE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, REDSTONE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, REDSTONE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, REDSTONE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, REDSTONE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, SANDSTONE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, SANDSTONE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, SANDSTONE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, SANDSTONE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, SPRUCE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, SPRUCE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, SPRUCE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, SPRUCE_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, STONE_BRICK_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, STONE_BRICK_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, STONE_BRICK_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, STONE_BRICK_TABLE_ITEM);
        
        Furnish.getProxy().registerItem(event, STONE_CHAIR_ITEM);
        Furnish.getProxy().registerItem(event, STONE_COFFEE_TABLE_ITEM);
        Furnish.getProxy().registerItem(event, STONE_COUCH_ITEM);
        Furnish.getProxy().registerItem(event, STONE_TABLE_ITEM);
        
        if (Loader.isModLoaded("biomesoplenty"))
        {
            BOP_CHERRY_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_CHERRY_CHAIR);
            BOP_CHERRY_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_CHERRY_COFFEE_TABLE);
            BOP_CHERRY_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_CHERRY_COUCH);
            BOP_CHERRY_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_CHERRY_TABLE);
            
            BOP_EBONY_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_EBONY_CHAIR);
            BOP_EBONY_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_EBONY_COFFEE_TABLE);
            BOP_EBONY_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_EBONY_COUCH);
            BOP_EBONY_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_EBONY_TABLE);
            
            BOP_ETHEREAL_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_ETHEREAL_CHAIR);
            BOP_ETHEREAL_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_ETHEREAL_COFFEE_TABLE);
            BOP_ETHEREAL_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_ETHEREAL_COUCH);
            BOP_ETHEREAL_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_ETHEREAL_TABLE);
            
            BOP_EUCALYPTUS_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_EUCALYPTUS_CHAIR);
            BOP_EUCALYPTUS_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_EUCALYPTUS_COFFEE_TABLE);
            BOP_EUCALYPTUS_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_EUCALYPTUS_COUCH);
            BOP_EUCALYPTUS_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_EUCALYPTUS_TABLE);
            
            BOP_FIR_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_FIR_CHAIR);
            BOP_FIR_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_FIR_COFFEE_TABLE);
            BOP_FIR_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_FIR_COUCH);
            BOP_FIR_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_FIR_TABLE);
            
            BOP_HELLBARK_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_HELLBARK_CHAIR);
            BOP_HELLBARK_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_HELLBARK_COFFEE_TABLE);
            BOP_HELLBARK_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_HELLBARK_COUCH);
            BOP_HELLBARK_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_HELLBARK_TABLE);
            
            BOP_JACARANDA_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_JACARANDA_CHAIR);
            BOP_JACARANDA_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_JACARANDA_COFFEE_TABLE);
            BOP_JACARANDA_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_JACARANDA_COUCH);
            BOP_JACARANDA_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_JACARANDA_TABLE);
            
            BOP_MAGIC_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MAGIC_CHAIR);
            BOP_MAGIC_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MAGIC_COFFEE_TABLE);
            BOP_MAGIC_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MAGIC_COUCH);
            BOP_MAGIC_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MAGIC_TABLE);
            
            BOP_MAHOGANY_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MAHOGANY_CHAIR);
            BOP_MAHOGANY_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MAHOGANY_COFFEE_TABLE);
            BOP_MAHOGANY_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MAHOGANY_COUCH);
            BOP_MAHOGANY_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MAHOGANY_TABLE);
            
            BOP_MANGROVE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MANGROVE_CHAIR);
            BOP_MANGROVE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MANGROVE_COFFEE_TABLE);
            BOP_MANGROVE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MANGROVE_COUCH);
            BOP_MANGROVE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MANGROVE_TABLE);
            
            BOP_PALM_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_PALM_CHAIR);
            BOP_PALM_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_PALM_COFFEE_TABLE);
            BOP_PALM_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_PALM_COUCH);
            BOP_PALM_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_PALM_TABLE);
            
            BOP_PINE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_PINE_CHAIR);
            BOP_PINE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_PINE_COFFEE_TABLE);
            BOP_PINE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_PINE_COUCH);
            BOP_PINE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_PINE_TABLE);
            
            BOP_REDWOOD_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_REDWOOD_CHAIR);
            BOP_REDWOOD_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_REDWOOD_COFFEE_TABLE);
            BOP_REDWOOD_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_REDWOOD_COUCH);
            BOP_REDWOOD_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_REDWOOD_TABLE);
            
            BOP_SACRED_OAK_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_SACRED_OAK_CHAIR);
            BOP_SACRED_OAK_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_SACRED_OAK_COFFEE_TABLE);
            BOP_SACRED_OAK_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_SACRED_OAK_COUCH);
            BOP_SACRED_OAK_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_SACRED_OAK_TABLE);
            
            BOP_UMBRAN_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_UMBRAN_CHAIR);
            BOP_UMBRAN_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_UMBRAN_COFFEE_TABLE);
            BOP_UMBRAN_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_UMBRAN_COUCH);
            BOP_UMBRAN_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_UMBRAN_TABLE);
            
            BOP_WILLOW_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_WILLOW_CHAIR);
            BOP_WILLOW_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_WILLOW_COFFEE_TABLE);
            BOP_WILLOW_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_WILLOW_COUCH);
            BOP_WILLOW_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_WILLOW_TABLE);
            
            BOP_BAMBOO_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_BAMBOO_CHAIR);
            BOP_BAMBOO_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_BAMBOO_COFFEE_TABLE);
            BOP_BAMBOO_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_BAMBOO_COUCH);
            BOP_BAMBOO_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_BAMBOO_TABLE);
            
            BOP_MUD_BRICK_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MUD_BRICK_CHAIR);
            BOP_MUD_BRICK_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MUD_BRICK_COFFEE_TABLE);
            BOP_MUD_BRICK_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MUD_BRICK_COUCH);
            BOP_MUD_BRICK_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MUD_BRICK_TABLE);
            
            BOP_WHITE_SANDSTONE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_WHITE_SANDSTONE_CHAIR);
            BOP_WHITE_SANDSTONE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_WHITE_SANDSTONE_COFFEE_TABLE);
            BOP_WHITE_SANDSTONE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_WHITE_SANDSTONE_COUCH);
            BOP_WHITE_SANDSTONE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_WHITE_SANDSTONE_TABLE);
            
            BOP_AMETHYST_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_AMETHYST_CHAIR);
            BOP_AMETHYST_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_AMETHYST_COFFEE_TABLE);
            BOP_AMETHYST_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_AMETHYST_COUCH);
            BOP_AMETHYST_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_AMETHYST_TABLE);
            
            BOP_RUBY_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_RUBY_CHAIR);
            BOP_RUBY_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_RUBY_COFFEE_TABLE);
            BOP_RUBY_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_RUBY_COUCH);
            BOP_RUBY_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_RUBY_TABLE);
            
            BOP_PERIDOT_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_PERIDOT_CHAIR);
            BOP_PERIDOT_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_PERIDOT_COFFEE_TABLE);
            BOP_PERIDOT_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_PERIDOT_COUCH);
            BOP_PERIDOT_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_PERIDOT_TABLE);
            
            BOP_TOPAZ_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_TOPAZ_CHAIR);
            BOP_TOPAZ_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_TOPAZ_COFFEE_TABLE);
            BOP_TOPAZ_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_TOPAZ_COUCH);
            BOP_TOPAZ_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_TOPAZ_TABLE);
            
            BOP_TANZANITE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_TANZANITE_CHAIR);
            BOP_TANZANITE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_TANZANITE_COFFEE_TABLE);
            BOP_TANZANITE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_TANZANITE_COUCH);
            BOP_TANZANITE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_TANZANITE_TABLE);
            
            BOP_MALACHITE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MALACHITE_CHAIR);
            BOP_MALACHITE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MALACHITE_COFFEE_TABLE);
            BOP_MALACHITE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MALACHITE_COUCH);
            BOP_MALACHITE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_MALACHITE_TABLE);
            
            BOP_SAPPHIRE_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_SAPPHIRE_CHAIR);
            BOP_SAPPHIRE_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_SAPPHIRE_COFFEE_TABLE);
            BOP_SAPPHIRE_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_SAPPHIRE_COUCH);
            BOP_SAPPHIRE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_SAPPHIRE_TABLE);
            
            BOP_AMBER_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_AMBER_CHAIR);
            BOP_AMBER_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_AMBER_COFFEE_TABLE);
            BOP_AMBER_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_AMBER_COUCH);
            BOP_AMBER_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_AMBER_TABLE);
            
            BOP_FLESH_CHAIR_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_FLESH_CHAIR);
            BOP_FLESH_COFFEE_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_FLESH_COFFEE_TABLE);
            BOP_FLESH_COUCH_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_FLESH_COUCH);
            BOP_FLESH_TABLE_ITEM = new FurnishItemBlock(FurnishBlocks.BOP_FLESH_TABLE);
            
            Furnish.getProxy().registerItem(event, BOP_CHERRY_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_CHERRY_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_CHERRY_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_CHERRY_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_EBONY_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_EBONY_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_EBONY_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_EBONY_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_ETHEREAL_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_ETHEREAL_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_ETHEREAL_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_ETHEREAL_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_EUCALYPTUS_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_EUCALYPTUS_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_EUCALYPTUS_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_EUCALYPTUS_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_FIR_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_FIR_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_FIR_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_FIR_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_HELLBARK_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_HELLBARK_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_HELLBARK_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_HELLBARK_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_JACARANDA_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_JACARANDA_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_JACARANDA_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_JACARANDA_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_MAGIC_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_MAGIC_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_MAGIC_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_MAGIC_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_MAHOGANY_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_MAHOGANY_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_MAHOGANY_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_MAHOGANY_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_MANGROVE_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_MANGROVE_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_MANGROVE_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_MANGROVE_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_PALM_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_PALM_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_PALM_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_PALM_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_PINE_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_PINE_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_PINE_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_PINE_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_REDWOOD_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_REDWOOD_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_REDWOOD_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_REDWOOD_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_SACRED_OAK_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_SACRED_OAK_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_SACRED_OAK_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_SACRED_OAK_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_UMBRAN_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_UMBRAN_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_UMBRAN_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_UMBRAN_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_WILLOW_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_WILLOW_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_WILLOW_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_WILLOW_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_BAMBOO_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_BAMBOO_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_BAMBOO_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_BAMBOO_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_MUD_BRICK_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_MUD_BRICK_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_MUD_BRICK_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_MUD_BRICK_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_WHITE_SANDSTONE_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_WHITE_SANDSTONE_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_WHITE_SANDSTONE_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_WHITE_SANDSTONE_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_AMETHYST_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_AMETHYST_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_AMETHYST_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_AMETHYST_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_RUBY_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_RUBY_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_RUBY_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_RUBY_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_PERIDOT_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_PERIDOT_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_PERIDOT_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_PERIDOT_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_TOPAZ_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_TOPAZ_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_TOPAZ_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_TOPAZ_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_TANZANITE_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_TANZANITE_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_TANZANITE_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_TANZANITE_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_MALACHITE_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_MALACHITE_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_MALACHITE_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_MALACHITE_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_SAPPHIRE_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_SAPPHIRE_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_SAPPHIRE_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_SAPPHIRE_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_AMBER_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_AMBER_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_AMBER_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_AMBER_TABLE_ITEM);
            
            Furnish.getProxy().registerItem(event, BOP_FLESH_CHAIR_ITEM);
            Furnish.getProxy().registerItem(event, BOP_FLESH_COFFEE_TABLE_ITEM);
            Furnish.getProxy().registerItem(event, BOP_FLESH_COUCH_ITEM);
            Furnish.getProxy().registerItem(event, BOP_FLESH_TABLE_ITEM);
        }
    }
}
