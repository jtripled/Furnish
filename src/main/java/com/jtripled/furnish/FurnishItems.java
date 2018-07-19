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
        if (Loader.isModLoaded("biomesoplenty"))
        {
            BOP_LOADED = true;
            
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
        }
        
        event.getRegistry().register(ACACIA_CHAIR_ITEM);
        event.getRegistry().register(ACACIA_COFFEE_TABLE_ITEM);
        event.getRegistry().register(ACACIA_COUCH_ITEM);
        event.getRegistry().register(ACACIA_TABLE_ITEM);
        
        event.getRegistry().register(ANDESITE_CHAIR_ITEM);
        event.getRegistry().register(ANDESITE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(ANDESITE_COUCH_ITEM);
        event.getRegistry().register(ANDESITE_TABLE_ITEM);
        
        event.getRegistry().register(BIRCH_CHAIR_ITEM);
        event.getRegistry().register(BIRCH_COFFEE_TABLE_ITEM);
        event.getRegistry().register(BIRCH_COUCH_ITEM);
        event.getRegistry().register(BIRCH_TABLE_ITEM);
        
        event.getRegistry().register(BONE_CHAIR_ITEM);
        event.getRegistry().register(BONE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(BONE_COUCH_ITEM);
        event.getRegistry().register(BONE_TABLE_ITEM);
        
        event.getRegistry().register(BRICK_CHAIR_ITEM);
        event.getRegistry().register(BRICK_COFFEE_TABLE_ITEM);
        event.getRegistry().register(BRICK_COUCH_ITEM);
        event.getRegistry().register(BRICK_TABLE_ITEM);
        
        event.getRegistry().register(COBBLESTONE_CHAIR_ITEM);
        event.getRegistry().register(COBBLESTONE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(COBBLESTONE_COUCH_ITEM);
        event.getRegistry().register(COBBLESTONE_TABLE_ITEM);
        
        event.getRegistry().register(DARK_OAK_CHAIR_ITEM);
        event.getRegistry().register(DARK_OAK_COFFEE_TABLE_ITEM);
        event.getRegistry().register(DARK_OAK_COUCH_ITEM);
        event.getRegistry().register(DARK_OAK_TABLE_ITEM);
        
        event.getRegistry().register(DARK_PRISMARINE_CHAIR_ITEM);
        event.getRegistry().register(DARK_PRISMARINE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(DARK_PRISMARINE_COUCH_ITEM);
        event.getRegistry().register(DARK_PRISMARINE_TABLE_ITEM);
        
        event.getRegistry().register(DIAMOND_CHAIR_ITEM);
        event.getRegistry().register(DIAMOND_COFFEE_TABLE_ITEM);
        event.getRegistry().register(DIAMOND_COUCH_ITEM);
        event.getRegistry().register(DIAMOND_TABLE_ITEM);
        
        event.getRegistry().register(DIORITE_CHAIR_ITEM);
        event.getRegistry().register(DIORITE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(DIORITE_COUCH_ITEM);
        event.getRegistry().register(DIORITE_TABLE_ITEM);
        
        event.getRegistry().register(EMERALD_CHAIR_ITEM);
        event.getRegistry().register(EMERALD_COFFEE_TABLE_ITEM);
        event.getRegistry().register(EMERALD_COUCH_ITEM);
        event.getRegistry().register(EMERALD_TABLE_ITEM);
        
        event.getRegistry().register(END_STONE_BRICK_CHAIR_ITEM);
        event.getRegistry().register(END_STONE_BRICK_COFFEE_TABLE_ITEM);
        event.getRegistry().register(END_STONE_BRICK_COUCH_ITEM);
        event.getRegistry().register(END_STONE_BRICK_TABLE_ITEM);
        
        event.getRegistry().register(GOLD_CHAIR_ITEM);
        event.getRegistry().register(GOLD_COFFEE_TABLE_ITEM);
        event.getRegistry().register(GOLD_COUCH_ITEM);
        event.getRegistry().register(GOLD_TABLE_ITEM);
        
        event.getRegistry().register(GRANITE_CHAIR_ITEM);
        event.getRegistry().register(GRANITE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(GRANITE_COUCH_ITEM);
        event.getRegistry().register(GRANITE_TABLE_ITEM);
        
        event.getRegistry().register(IRON_CHAIR_ITEM);
        event.getRegistry().register(IRON_COFFEE_TABLE_ITEM);
        event.getRegistry().register(IRON_COUCH_ITEM);
        event.getRegistry().register(IRON_TABLE_ITEM);
        
        event.getRegistry().register(JUNGLE_CHAIR_ITEM);
        event.getRegistry().register(JUNGLE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(JUNGLE_COUCH_ITEM);
        event.getRegistry().register(JUNGLE_TABLE_ITEM);
        
        event.getRegistry().register(LAPIS_LAZULI_CHAIR_ITEM);
        event.getRegistry().register(LAPIS_LAZULI_COFFEE_TABLE_ITEM);
        event.getRegistry().register(LAPIS_LAZULI_COUCH_ITEM);
        event.getRegistry().register(LAPIS_LAZULI_TABLE_ITEM);
        
        event.getRegistry().register(MOSS_STONE_CHAIR_ITEM);
        event.getRegistry().register(MOSS_STONE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(MOSS_STONE_COUCH_ITEM);
        event.getRegistry().register(MOSS_STONE_TABLE_ITEM);
        
        event.getRegistry().register(NETHER_BRICK_CHAIR_ITEM);
        event.getRegistry().register(NETHER_BRICK_COFFEE_TABLE_ITEM);
        event.getRegistry().register(NETHER_BRICK_COUCH_ITEM);
        event.getRegistry().register(NETHER_BRICK_TABLE_ITEM);
        
        event.getRegistry().register(OAK_CHAIR_ITEM);
        event.getRegistry().register(OAK_COFFEE_TABLE_ITEM);
        event.getRegistry().register(OAK_COUCH_ITEM);
        event.getRegistry().register(OAK_TABLE_ITEM);
        
        event.getRegistry().register(OBSIDIAN_CHAIR_ITEM);
        event.getRegistry().register(OBSIDIAN_COFFEE_TABLE_ITEM);
        event.getRegistry().register(OBSIDIAN_COUCH_ITEM);
        event.getRegistry().register(OBSIDIAN_TABLE_ITEM);
        
        event.getRegistry().register(POLISHED_ANDESITE_CHAIR_ITEM);
        event.getRegistry().register(POLISHED_ANDESITE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(POLISHED_ANDESITE_COUCH_ITEM);
        event.getRegistry().register(POLISHED_ANDESITE_TABLE_ITEM);
        
        event.getRegistry().register(POLISHED_DIORITE_CHAIR_ITEM);
        event.getRegistry().register(POLISHED_DIORITE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(POLISHED_DIORITE_COUCH_ITEM);
        event.getRegistry().register(POLISHED_DIORITE_TABLE_ITEM);
        
        event.getRegistry().register(POLISHED_GRANITE_CHAIR_ITEM);
        event.getRegistry().register(POLISHED_GRANITE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(POLISHED_GRANITE_COUCH_ITEM);
        event.getRegistry().register(POLISHED_GRANITE_TABLE_ITEM);
        
        event.getRegistry().register(PRISMARINE_CHAIR_ITEM);
        event.getRegistry().register(PRISMARINE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(PRISMARINE_COUCH_ITEM);
        event.getRegistry().register(PRISMARINE_TABLE_ITEM);
        
        event.getRegistry().register(PRISMARINE_BRICK_CHAIR_ITEM);
        event.getRegistry().register(PRISMARINE_BRICK_COFFEE_TABLE_ITEM);
        event.getRegistry().register(PRISMARINE_BRICK_COUCH_ITEM);
        event.getRegistry().register(PRISMARINE_BRICK_TABLE_ITEM);
        
        event.getRegistry().register(PURPUR_CHAIR_ITEM);
        event.getRegistry().register(PURPUR_COFFEE_TABLE_ITEM);
        event.getRegistry().register(PURPUR_COUCH_ITEM);
        event.getRegistry().register(PURPUR_TABLE_ITEM);
        
        event.getRegistry().register(QUARTZ_CHAIR_ITEM);
        event.getRegistry().register(QUARTZ_COFFEE_TABLE_ITEM);
        event.getRegistry().register(QUARTZ_COUCH_ITEM);
        event.getRegistry().register(QUARTZ_TABLE_ITEM);
        
        event.getRegistry().register(RED_NETHER_BRICK_CHAIR_ITEM);
        event.getRegistry().register(RED_NETHER_BRICK_COFFEE_TABLE_ITEM);
        event.getRegistry().register(RED_NETHER_BRICK_COUCH_ITEM);
        event.getRegistry().register(RED_NETHER_BRICK_TABLE_ITEM);
        
        event.getRegistry().register(RED_SANDSTONE_CHAIR_ITEM);
        event.getRegistry().register(RED_SANDSTONE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(RED_SANDSTONE_COUCH_ITEM);
        event.getRegistry().register(RED_SANDSTONE_TABLE_ITEM);
        
        event.getRegistry().register(REDSTONE_CHAIR_ITEM);
        event.getRegistry().register(REDSTONE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(REDSTONE_COUCH_ITEM);
        event.getRegistry().register(REDSTONE_TABLE_ITEM);
        
        event.getRegistry().register(SANDSTONE_CHAIR_ITEM);
        event.getRegistry().register(SANDSTONE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(SANDSTONE_COUCH_ITEM);
        event.getRegistry().register(SANDSTONE_TABLE_ITEM);
        
        event.getRegistry().register(SPRUCE_CHAIR_ITEM);
        event.getRegistry().register(SPRUCE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(SPRUCE_COUCH_ITEM);
        event.getRegistry().register(SPRUCE_TABLE_ITEM);
        
        event.getRegistry().register(STONE_BRICK_CHAIR_ITEM);
        event.getRegistry().register(STONE_BRICK_COFFEE_TABLE_ITEM);
        event.getRegistry().register(STONE_BRICK_COUCH_ITEM);
        event.getRegistry().register(STONE_BRICK_TABLE_ITEM);
        
        event.getRegistry().register(STONE_CHAIR_ITEM);
        event.getRegistry().register(STONE_COFFEE_TABLE_ITEM);
        event.getRegistry().register(STONE_COUCH_ITEM);
        event.getRegistry().register(STONE_TABLE_ITEM);
        
        Furnish.getProxy().registerItemRenderer(ACACIA_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(ACACIA_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(ACACIA_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(ACACIA_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(ANDESITE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(ANDESITE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(ANDESITE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(ANDESITE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(BIRCH_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(BIRCH_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(BIRCH_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(BIRCH_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(BONE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(BONE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(BONE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(BONE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(BRICK_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(BRICK_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(BRICK_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(BRICK_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(COBBLESTONE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(COBBLESTONE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(COBBLESTONE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(COBBLESTONE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(DARK_OAK_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(DARK_OAK_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(DARK_OAK_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(DARK_OAK_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(DARK_PRISMARINE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(DARK_PRISMARINE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(DARK_PRISMARINE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(DARK_PRISMARINE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(DIAMOND_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(DIAMOND_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(DIAMOND_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(DIAMOND_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(DIORITE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(DIORITE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(DIORITE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(DIORITE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(EMERALD_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(EMERALD_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(EMERALD_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(EMERALD_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(END_STONE_BRICK_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(END_STONE_BRICK_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(END_STONE_BRICK_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(END_STONE_BRICK_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(GOLD_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(GOLD_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(GOLD_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(GOLD_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(GRANITE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(GRANITE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(GRANITE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(GRANITE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(IRON_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(IRON_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(IRON_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(IRON_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(JUNGLE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(JUNGLE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(JUNGLE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(JUNGLE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(LAPIS_LAZULI_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(LAPIS_LAZULI_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(LAPIS_LAZULI_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(LAPIS_LAZULI_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(MOSS_STONE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(MOSS_STONE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(MOSS_STONE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(MOSS_STONE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(NETHER_BRICK_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(NETHER_BRICK_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(NETHER_BRICK_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(NETHER_BRICK_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(OAK_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(OAK_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(OAK_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(OAK_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(OBSIDIAN_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(OBSIDIAN_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(OBSIDIAN_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(OBSIDIAN_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(POLISHED_ANDESITE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(POLISHED_ANDESITE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(POLISHED_ANDESITE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(POLISHED_ANDESITE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(POLISHED_DIORITE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(POLISHED_DIORITE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(POLISHED_DIORITE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(POLISHED_DIORITE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(POLISHED_GRANITE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(POLISHED_GRANITE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(POLISHED_GRANITE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(POLISHED_GRANITE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(PRISMARINE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(PRISMARINE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(PRISMARINE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(PRISMARINE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(PRISMARINE_BRICK_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(PRISMARINE_BRICK_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(PRISMARINE_BRICK_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(PRISMARINE_BRICK_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(PURPUR_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(PURPUR_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(PURPUR_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(PURPUR_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(QUARTZ_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(QUARTZ_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(QUARTZ_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(QUARTZ_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(RED_NETHER_BRICK_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(RED_NETHER_BRICK_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(RED_NETHER_BRICK_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(RED_NETHER_BRICK_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(RED_SANDSTONE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(RED_SANDSTONE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(RED_SANDSTONE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(RED_SANDSTONE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(REDSTONE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(REDSTONE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(REDSTONE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(REDSTONE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(SANDSTONE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(SANDSTONE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(SANDSTONE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(SANDSTONE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(SPRUCE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(SPRUCE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(SPRUCE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(SPRUCE_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(STONE_BRICK_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(STONE_BRICK_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(STONE_BRICK_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(STONE_BRICK_TABLE_ITEM, "normal");
        
        Furnish.getProxy().registerItemRenderer(STONE_CHAIR_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(STONE_COFFEE_TABLE_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(STONE_COUCH_ITEM, "normal");
        Furnish.getProxy().registerItemRenderer(STONE_TABLE_ITEM, "normal");
        
        if (BOP_LOADED)
        {
            event.getRegistry().register(BOP_CHERRY_CHAIR_ITEM);
            event.getRegistry().register(BOP_CHERRY_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_CHERRY_COUCH_ITEM);
            event.getRegistry().register(BOP_CHERRY_TABLE_ITEM);
            
            event.getRegistry().register(BOP_EBONY_CHAIR_ITEM);
            event.getRegistry().register(BOP_EBONY_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_EBONY_COUCH_ITEM);
            event.getRegistry().register(BOP_EBONY_TABLE_ITEM);
            
            event.getRegistry().register(BOP_ETHEREAL_CHAIR_ITEM);
            event.getRegistry().register(BOP_ETHEREAL_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_ETHEREAL_COUCH_ITEM);
            event.getRegistry().register(BOP_ETHEREAL_TABLE_ITEM);
            
            event.getRegistry().register(BOP_EUCALYPTUS_CHAIR_ITEM);
            event.getRegistry().register(BOP_EUCALYPTUS_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_EUCALYPTUS_COUCH_ITEM);
            event.getRegistry().register(BOP_EUCALYPTUS_TABLE_ITEM);
            
            event.getRegistry().register(BOP_FIR_CHAIR_ITEM);
            event.getRegistry().register(BOP_FIR_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_FIR_COUCH_ITEM);
            event.getRegistry().register(BOP_FIR_TABLE_ITEM);
            
            event.getRegistry().register(BOP_HELLBARK_CHAIR_ITEM);
            event.getRegistry().register(BOP_HELLBARK_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_HELLBARK_COUCH_ITEM);
            event.getRegistry().register(BOP_HELLBARK_TABLE_ITEM);
            
            event.getRegistry().register(BOP_JACARANDA_CHAIR_ITEM);
            event.getRegistry().register(BOP_JACARANDA_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_JACARANDA_COUCH_ITEM);
            event.getRegistry().register(BOP_JACARANDA_TABLE_ITEM);
            
            event.getRegistry().register(BOP_MAGIC_CHAIR_ITEM);
            event.getRegistry().register(BOP_MAGIC_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_MAGIC_COUCH_ITEM);
            event.getRegistry().register(BOP_MAGIC_TABLE_ITEM);
            
            event.getRegistry().register(BOP_MAHOGANY_CHAIR_ITEM);
            event.getRegistry().register(BOP_MAHOGANY_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_MAHOGANY_COUCH_ITEM);
            event.getRegistry().register(BOP_MAHOGANY_TABLE_ITEM);
            
            event.getRegistry().register(BOP_MANGROVE_CHAIR_ITEM);
            event.getRegistry().register(BOP_MANGROVE_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_MANGROVE_COUCH_ITEM);
            event.getRegistry().register(BOP_MANGROVE_TABLE_ITEM);
            
            event.getRegistry().register(BOP_PALM_CHAIR_ITEM);
            event.getRegistry().register(BOP_PALM_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_PALM_COUCH_ITEM);
            event.getRegistry().register(BOP_PALM_TABLE_ITEM);
            
            event.getRegistry().register(BOP_PINE_CHAIR_ITEM);
            event.getRegistry().register(BOP_PINE_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_PINE_COUCH_ITEM);
            event.getRegistry().register(BOP_PINE_TABLE_ITEM);
            
            event.getRegistry().register(BOP_REDWOOD_CHAIR_ITEM);
            event.getRegistry().register(BOP_REDWOOD_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_REDWOOD_COUCH_ITEM);
            event.getRegistry().register(BOP_REDWOOD_TABLE_ITEM);
            
            event.getRegistry().register(BOP_SACRED_OAK_CHAIR_ITEM);
            event.getRegistry().register(BOP_SACRED_OAK_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_SACRED_OAK_COUCH_ITEM);
            event.getRegistry().register(BOP_SACRED_OAK_TABLE_ITEM);
            
            event.getRegistry().register(BOP_UMBRAN_CHAIR_ITEM);
            event.getRegistry().register(BOP_UMBRAN_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_UMBRAN_COUCH_ITEM);
            event.getRegistry().register(BOP_UMBRAN_TABLE_ITEM);
            
            event.getRegistry().register(BOP_WILLOW_CHAIR_ITEM);
            event.getRegistry().register(BOP_WILLOW_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_WILLOW_COUCH_ITEM);
            event.getRegistry().register(BOP_WILLOW_TABLE_ITEM);
            
            event.getRegistry().register(BOP_BAMBOO_CHAIR_ITEM);
            event.getRegistry().register(BOP_BAMBOO_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_BAMBOO_COUCH_ITEM);
            event.getRegistry().register(BOP_BAMBOO_TABLE_ITEM);
            
            event.getRegistry().register(BOP_MUD_BRICK_CHAIR_ITEM);
            event.getRegistry().register(BOP_MUD_BRICK_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_MUD_BRICK_COUCH_ITEM);
            event.getRegistry().register(BOP_MUD_BRICK_TABLE_ITEM);
            
            event.getRegistry().register(BOP_WHITE_SANDSTONE_CHAIR_ITEM);
            event.getRegistry().register(BOP_WHITE_SANDSTONE_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_WHITE_SANDSTONE_COUCH_ITEM);
            event.getRegistry().register(BOP_WHITE_SANDSTONE_TABLE_ITEM);
            
            event.getRegistry().register(BOP_AMETHYST_CHAIR_ITEM);
            event.getRegistry().register(BOP_AMETHYST_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_AMETHYST_COUCH_ITEM);
            event.getRegistry().register(BOP_AMETHYST_TABLE_ITEM);
            
            event.getRegistry().register(BOP_RUBY_CHAIR_ITEM);
            event.getRegistry().register(BOP_RUBY_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_RUBY_COUCH_ITEM);
            event.getRegistry().register(BOP_RUBY_TABLE_ITEM);
            
            event.getRegistry().register(BOP_PERIDOT_CHAIR_ITEM);
            event.getRegistry().register(BOP_PERIDOT_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_PERIDOT_COUCH_ITEM);
            event.getRegistry().register(BOP_PERIDOT_TABLE_ITEM);
            
            event.getRegistry().register(BOP_TOPAZ_CHAIR_ITEM);
            event.getRegistry().register(BOP_TOPAZ_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_TOPAZ_COUCH_ITEM);
            event.getRegistry().register(BOP_TOPAZ_TABLE_ITEM);
            
            event.getRegistry().register(BOP_TANZANITE_CHAIR_ITEM);
            event.getRegistry().register(BOP_TANZANITE_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_TANZANITE_COUCH_ITEM);
            event.getRegistry().register(BOP_TANZANITE_TABLE_ITEM);
            
            event.getRegistry().register(BOP_MALACHITE_CHAIR_ITEM);
            event.getRegistry().register(BOP_MALACHITE_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_MALACHITE_COUCH_ITEM);
            event.getRegistry().register(BOP_MALACHITE_TABLE_ITEM);
            
            event.getRegistry().register(BOP_SAPPHIRE_CHAIR_ITEM);
            event.getRegistry().register(BOP_SAPPHIRE_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_SAPPHIRE_COUCH_ITEM);
            event.getRegistry().register(BOP_SAPPHIRE_TABLE_ITEM);
            
            event.getRegistry().register(BOP_AMBER_CHAIR_ITEM);
            event.getRegistry().register(BOP_AMBER_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_AMBER_COUCH_ITEM);
            event.getRegistry().register(BOP_AMBER_TABLE_ITEM);
            
            event.getRegistry().register(BOP_FLESH_CHAIR_ITEM);
            event.getRegistry().register(BOP_FLESH_COFFEE_TABLE_ITEM);
            event.getRegistry().register(BOP_FLESH_COUCH_ITEM);
            event.getRegistry().register(BOP_FLESH_TABLE_ITEM);
            
            Furnish.getProxy().registerItemRenderer(BOP_CHERRY_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_CHERRY_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_CHERRY_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_CHERRY_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_EBONY_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_EBONY_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_EBONY_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_EBONY_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_ETHEREAL_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_ETHEREAL_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_ETHEREAL_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_ETHEREAL_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_EUCALYPTUS_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_EUCALYPTUS_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_EUCALYPTUS_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_EUCALYPTUS_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_FIR_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_FIR_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_FIR_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_FIR_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_HELLBARK_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_HELLBARK_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_HELLBARK_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_HELLBARK_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_JACARANDA_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_JACARANDA_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_JACARANDA_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_JACARANDA_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_MAGIC_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_MAGIC_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_MAGIC_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_MAGIC_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_MAHOGANY_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_MAHOGANY_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_MAHOGANY_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_MAHOGANY_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_MANGROVE_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_MANGROVE_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_MANGROVE_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_MANGROVE_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_PALM_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_PALM_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_PALM_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_PALM_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_PINE_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_PINE_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_PINE_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_PINE_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_REDWOOD_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_REDWOOD_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_REDWOOD_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_REDWOOD_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_SACRED_OAK_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_SACRED_OAK_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_SACRED_OAK_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_SACRED_OAK_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_UMBRAN_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_UMBRAN_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_UMBRAN_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_UMBRAN_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_WILLOW_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_WILLOW_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_WILLOW_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_WILLOW_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_BAMBOO_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_BAMBOO_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_BAMBOO_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_BAMBOO_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_MUD_BRICK_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_MUD_BRICK_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_MUD_BRICK_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_MUD_BRICK_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_WHITE_SANDSTONE_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_WHITE_SANDSTONE_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_WHITE_SANDSTONE_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_WHITE_SANDSTONE_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_AMETHYST_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_AMETHYST_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_AMETHYST_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_AMETHYST_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_RUBY_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_RUBY_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_RUBY_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_RUBY_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_PERIDOT_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_PERIDOT_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_PERIDOT_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_PERIDOT_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_TOPAZ_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_TOPAZ_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_TOPAZ_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_TOPAZ_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_TANZANITE_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_TANZANITE_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_TANZANITE_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_TANZANITE_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_MALACHITE_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_MALACHITE_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_MALACHITE_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_MALACHITE_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_SAPPHIRE_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_SAPPHIRE_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_SAPPHIRE_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_SAPPHIRE_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_AMBER_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_AMBER_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_AMBER_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_AMBER_TABLE_ITEM, "normal");
            
            Furnish.getProxy().registerItemRenderer(BOP_FLESH_CHAIR_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_FLESH_COFFEE_TABLE_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_FLESH_COUCH_ITEM, "normal");
            Furnish.getProxy().registerItemRenderer(BOP_FLESH_TABLE_ITEM, "normal");
        }
    }
}
