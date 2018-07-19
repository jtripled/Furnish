package com.jtripled.furnish;

import com.jtripled.furnish.block.BlockChair;
import com.jtripled.furnish.block.BlockCoffeeTable;
import com.jtripled.furnish.block.BlockCouch;
import com.jtripled.furnish.block.BlockTable;
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
    public static final Item ACACIA_CHAIR_ITEM = ((BlockChair) FurnishBlocks.ACACIA_CHAIR).getItem();
    public static final Item ACACIA_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.ACACIA_COFFEE_TABLE).getItem();
    public static final Item ACACIA_COUCH_ITEM = ((BlockCouch) FurnishBlocks.ACACIA_COUCH).getItem();
    public static final Item ACACIA_TABLE_ITEM = ((BlockTable) FurnishBlocks.ACACIA_TABLE).getItem();
    
    public static final Item ANDESITE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.ANDESITE_CHAIR).getItem();
    public static final Item ANDESITE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.ANDESITE_COFFEE_TABLE).getItem();
    public static final Item ANDESITE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.ANDESITE_COUCH).getItem();
    public static final Item ANDESITE_TABLE_ITEM = ((BlockTable) FurnishBlocks.ANDESITE_TABLE).getItem();
    
    public static final Item BIRCH_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BIRCH_CHAIR).getItem();
    public static final Item BIRCH_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BIRCH_COFFEE_TABLE).getItem();
    public static final Item BIRCH_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BIRCH_COUCH).getItem();
    public static final Item BIRCH_TABLE_ITEM = ((BlockTable) FurnishBlocks.BIRCH_TABLE).getItem();
    
    public static final Item BONE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BONE_CHAIR).getItem();
    public static final Item BONE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BONE_COFFEE_TABLE).getItem();
    public static final Item BONE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BONE_COUCH).getItem();
    public static final Item BONE_TABLE_ITEM = ((BlockTable) FurnishBlocks.BONE_TABLE).getItem();
    
    public static final Item BRICK_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BRICK_CHAIR).getItem();
    public static final Item BRICK_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BRICK_COFFEE_TABLE).getItem();
    public static final Item BRICK_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BRICK_COUCH).getItem();
    public static final Item BRICK_TABLE_ITEM = ((BlockTable) FurnishBlocks.BRICK_TABLE).getItem();
    
    public static final Item COBBLESTONE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.COBBLESTONE_CHAIR).getItem();
    public static final Item COBBLESTONE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.COBBLESTONE_COFFEE_TABLE).getItem();
    public static final Item COBBLESTONE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.COBBLESTONE_COUCH).getItem();
    public static final Item COBBLESTONE_TABLE_ITEM = ((BlockTable) FurnishBlocks.COBBLESTONE_TABLE).getItem();
    
    public static final Item DARK_OAK_CHAIR_ITEM = ((BlockChair) FurnishBlocks.DARK_OAK_CHAIR).getItem();
    public static final Item DARK_OAK_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.DARK_OAK_COFFEE_TABLE).getItem();
    public static final Item DARK_OAK_COUCH_ITEM = ((BlockCouch) FurnishBlocks.DARK_OAK_COUCH).getItem();
    public static final Item DARK_OAK_TABLE_ITEM = ((BlockTable) FurnishBlocks.DARK_OAK_TABLE).getItem();
    
    public static final Item DARK_PRISMARINE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.DARK_PRISMARINE_CHAIR).getItem();
    public static final Item DARK_PRISMARINE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.DARK_PRISMARINE_COFFEE_TABLE).getItem();
    public static final Item DARK_PRISMARINE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.DARK_PRISMARINE_COUCH).getItem();
    public static final Item DARK_PRISMARINE_TABLE_ITEM = ((BlockTable) FurnishBlocks.DARK_PRISMARINE_TABLE).getItem();
    
    public static final Item DIAMOND_CHAIR_ITEM = ((BlockChair) FurnishBlocks.DIAMOND_CHAIR).getItem();
    public static final Item DIAMOND_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.DIAMOND_COFFEE_TABLE).getItem();
    public static final Item DIAMOND_COUCH_ITEM = ((BlockCouch) FurnishBlocks.DIAMOND_COUCH).getItem();
    public static final Item DIAMOND_TABLE_ITEM = ((BlockTable) FurnishBlocks.DIAMOND_TABLE).getItem();
    
    public static final Item DIORITE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.DIORITE_CHAIR).getItem();
    public static final Item DIORITE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.DIORITE_COFFEE_TABLE).getItem();
    public static final Item DIORITE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.DIORITE_COUCH).getItem();
    public static final Item DIORITE_TABLE_ITEM = ((BlockTable) FurnishBlocks.DIORITE_TABLE).getItem();
    
    public static final Item EMERALD_CHAIR_ITEM = ((BlockChair) FurnishBlocks.EMERALD_CHAIR).getItem();
    public static final Item EMERALD_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.EMERALD_COFFEE_TABLE).getItem();
    public static final Item EMERALD_COUCH_ITEM = ((BlockCouch) FurnishBlocks.EMERALD_COUCH).getItem();
    public static final Item EMERALD_TABLE_ITEM = ((BlockTable) FurnishBlocks.EMERALD_TABLE).getItem();
    
    public static final Item END_STONE_BRICK_CHAIR_ITEM = ((BlockChair) FurnishBlocks.END_STONE_BRICK_CHAIR).getItem();
    public static final Item END_STONE_BRICK_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.END_STONE_BRICK_COFFEE_TABLE).getItem();
    public static final Item END_STONE_BRICK_COUCH_ITEM = ((BlockCouch) FurnishBlocks.END_STONE_BRICK_COUCH).getItem();
    public static final Item END_STONE_BRICK_TABLE_ITEM = ((BlockTable) FurnishBlocks.END_STONE_BRICK_TABLE).getItem();
    
    public static final Item GOLD_CHAIR_ITEM = ((BlockChair) FurnishBlocks.GOLD_CHAIR).getItem();
    public static final Item GOLD_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.GOLD_COFFEE_TABLE).getItem();
    public static final Item GOLD_COUCH_ITEM = ((BlockCouch) FurnishBlocks.GOLD_COUCH).getItem();
    public static final Item GOLD_TABLE_ITEM = ((BlockTable) FurnishBlocks.GOLD_TABLE).getItem();
    
    public static final Item GRANITE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.GRANITE_CHAIR).getItem();
    public static final Item GRANITE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.GRANITE_COFFEE_TABLE).getItem();
    public static final Item GRANITE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.GRANITE_COUCH).getItem();
    public static final Item GRANITE_TABLE_ITEM = ((BlockTable) FurnishBlocks.GRANITE_TABLE).getItem();
    
    public static final Item IRON_CHAIR_ITEM = ((BlockChair) FurnishBlocks.IRON_CHAIR).getItem();
    public static final Item IRON_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.IRON_COFFEE_TABLE).getItem();
    public static final Item IRON_COUCH_ITEM = ((BlockCouch) FurnishBlocks.IRON_COUCH).getItem();
    public static final Item IRON_TABLE_ITEM = ((BlockTable) FurnishBlocks.IRON_TABLE).getItem();
    
    public static final Item JUNGLE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.JUNGLE_CHAIR).getItem();
    public static final Item JUNGLE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.JUNGLE_COFFEE_TABLE).getItem();
    public static final Item JUNGLE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.JUNGLE_COUCH).getItem();
    public static final Item JUNGLE_TABLE_ITEM = ((BlockTable) FurnishBlocks.JUNGLE_TABLE).getItem();
    
    public static final Item LAPIS_LAZULI_CHAIR_ITEM = ((BlockChair) FurnishBlocks.LAPIS_LAZULI_CHAIR).getItem();
    public static final Item LAPIS_LAZULI_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.LAPIS_LAZULI_COFFEE_TABLE).getItem();
    public static final Item LAPIS_LAZULI_COUCH_ITEM = ((BlockCouch) FurnishBlocks.LAPIS_LAZULI_COUCH).getItem();
    public static final Item LAPIS_LAZULI_TABLE_ITEM = ((BlockTable) FurnishBlocks.LAPIS_LAZULI_TABLE).getItem();
    
    public static final Item MOSS_STONE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.MOSS_STONE_CHAIR).getItem();
    public static final Item MOSS_STONE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.MOSS_STONE_COFFEE_TABLE).getItem();
    public static final Item MOSS_STONE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.MOSS_STONE_COUCH).getItem();
    public static final Item MOSS_STONE_TABLE_ITEM = ((BlockTable) FurnishBlocks.MOSS_STONE_TABLE).getItem();
    
    public static final Item NETHER_BRICK_CHAIR_ITEM = ((BlockChair) FurnishBlocks.NETHER_BRICK_CHAIR).getItem();
    public static final Item NETHER_BRICK_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.NETHER_BRICK_COFFEE_TABLE).getItem();
    public static final Item NETHER_BRICK_COUCH_ITEM = ((BlockCouch) FurnishBlocks.NETHER_BRICK_COUCH).getItem();
    public static final Item NETHER_BRICK_TABLE_ITEM = ((BlockTable) FurnishBlocks.NETHER_BRICK_TABLE).getItem();
    
    public static final Item OAK_CHAIR_ITEM = ((BlockChair) FurnishBlocks.OAK_CHAIR).getItem();
    public static final Item OAK_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.OAK_COFFEE_TABLE).getItem();
    public static final Item OAK_COUCH_ITEM = ((BlockCouch) FurnishBlocks.OAK_COUCH).getItem();
    public static final Item OAK_TABLE_ITEM = ((BlockTable) FurnishBlocks.OAK_TABLE).getItem();
    
    public static final Item OBSIDIAN_CHAIR_ITEM = ((BlockChair) FurnishBlocks.OBSIDIAN_CHAIR).getItem();
    public static final Item OBSIDIAN_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.OBSIDIAN_COFFEE_TABLE).getItem();
    public static final Item OBSIDIAN_COUCH_ITEM = ((BlockCouch) FurnishBlocks.OBSIDIAN_COUCH).getItem();
    public static final Item OBSIDIAN_TABLE_ITEM = ((BlockTable) FurnishBlocks.OBSIDIAN_TABLE).getItem();
    
    public static final Item POLISHED_ANDESITE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.POLISHED_ANDESITE_CHAIR).getItem();
    public static final Item POLISHED_ANDESITE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.POLISHED_ANDESITE_COFFEE_TABLE).getItem();
    public static final Item POLISHED_ANDESITE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.POLISHED_ANDESITE_COUCH).getItem();
    public static final Item POLISHED_ANDESITE_TABLE_ITEM = ((BlockTable) FurnishBlocks.POLISHED_ANDESITE_TABLE).getItem();
    
    public static final Item POLISHED_DIORITE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.POLISHED_DIORITE_CHAIR).getItem();
    public static final Item POLISHED_DIORITE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.POLISHED_DIORITE_COFFEE_TABLE).getItem();
    public static final Item POLISHED_DIORITE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.POLISHED_DIORITE_COUCH).getItem();
    public static final Item POLISHED_DIORITE_TABLE_ITEM = ((BlockTable) FurnishBlocks.POLISHED_DIORITE_TABLE).getItem();
    
    public static final Item POLISHED_GRANITE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.POLISHED_GRANITE_CHAIR).getItem();
    public static final Item POLISHED_GRANITE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.POLISHED_GRANITE_COFFEE_TABLE).getItem();
    public static final Item POLISHED_GRANITE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.POLISHED_GRANITE_COUCH).getItem();
    public static final Item POLISHED_GRANITE_TABLE_ITEM = ((BlockTable) FurnishBlocks.POLISHED_GRANITE_TABLE).getItem();
    
    public static final Item PRISMARINE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.PRISMARINE_CHAIR).getItem();
    public static final Item PRISMARINE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.PRISMARINE_COFFEE_TABLE).getItem();
    public static final Item PRISMARINE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.PRISMARINE_COUCH).getItem();
    public static final Item PRISMARINE_TABLE_ITEM = ((BlockTable) FurnishBlocks.PRISMARINE_TABLE).getItem();
    
    public static final Item PRISMARINE_BRICK_CHAIR_ITEM = ((BlockChair) FurnishBlocks.PRISMARINE_BRICK_CHAIR).getItem();
    public static final Item PRISMARINE_BRICK_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.PRISMARINE_BRICK_COFFEE_TABLE).getItem();
    public static final Item PRISMARINE_BRICK_COUCH_ITEM = ((BlockCouch) FurnishBlocks.PRISMARINE_BRICK_COUCH).getItem();
    public static final Item PRISMARINE_BRICK_TABLE_ITEM = ((BlockTable) FurnishBlocks.PRISMARINE_BRICK_TABLE).getItem();
    
    public static final Item PURPUR_CHAIR_ITEM = ((BlockChair) FurnishBlocks.PURPUR_CHAIR).getItem();
    public static final Item PURPUR_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.PURPUR_COFFEE_TABLE).getItem();
    public static final Item PURPUR_COUCH_ITEM = ((BlockCouch) FurnishBlocks.PURPUR_COUCH).getItem();
    public static final Item PURPUR_TABLE_ITEM = ((BlockTable) FurnishBlocks.PURPUR_TABLE).getItem();
    
    public static final Item QUARTZ_CHAIR_ITEM = ((BlockChair) FurnishBlocks.QUARTZ_CHAIR).getItem();
    public static final Item QUARTZ_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.QUARTZ_COFFEE_TABLE).getItem();
    public static final Item QUARTZ_COUCH_ITEM = ((BlockCouch) FurnishBlocks.QUARTZ_COUCH).getItem();
    public static final Item QUARTZ_TABLE_ITEM = ((BlockTable) FurnishBlocks.QUARTZ_TABLE).getItem();
    
    public static final Item RED_NETHER_BRICK_CHAIR_ITEM = ((BlockChair) FurnishBlocks.RED_NETHER_BRICK_CHAIR).getItem();
    public static final Item RED_NETHER_BRICK_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.RED_NETHER_BRICK_COFFEE_TABLE).getItem();
    public static final Item RED_NETHER_BRICK_COUCH_ITEM = ((BlockCouch) FurnishBlocks.RED_NETHER_BRICK_COUCH).getItem();
    public static final Item RED_NETHER_BRICK_TABLE_ITEM = ((BlockTable) FurnishBlocks.RED_NETHER_BRICK_TABLE).getItem();
    
    public static final Item RED_SANDSTONE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.RED_SANDSTONE_CHAIR).getItem();
    public static final Item RED_SANDSTONE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.RED_SANDSTONE_COFFEE_TABLE).getItem();
    public static final Item RED_SANDSTONE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.RED_SANDSTONE_COUCH).getItem();
    public static final Item RED_SANDSTONE_TABLE_ITEM = ((BlockTable) FurnishBlocks.RED_SANDSTONE_TABLE).getItem();
    
    public static final Item REDSTONE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.REDSTONE_CHAIR).getItem();
    public static final Item REDSTONE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.REDSTONE_COFFEE_TABLE).getItem();
    public static final Item REDSTONE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.REDSTONE_COUCH).getItem();
    public static final Item REDSTONE_TABLE_ITEM = ((BlockTable) FurnishBlocks.REDSTONE_TABLE).getItem();
    
    public static final Item SANDSTONE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.SANDSTONE_CHAIR).getItem();
    public static final Item SANDSTONE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.SANDSTONE_COFFEE_TABLE).getItem();
    public static final Item SANDSTONE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.SANDSTONE_COUCH).getItem();
    public static final Item SANDSTONE_TABLE_ITEM = ((BlockTable) FurnishBlocks.SANDSTONE_TABLE).getItem();
    
    public static final Item SPRUCE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.SPRUCE_CHAIR).getItem();
    public static final Item SPRUCE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.SPRUCE_COFFEE_TABLE).getItem();
    public static final Item SPRUCE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.SPRUCE_COUCH).getItem();
    public static final Item SPRUCE_TABLE_ITEM = ((BlockTable) FurnishBlocks.SPRUCE_TABLE).getItem();
    
    public static final Item STONE_BRICK_CHAIR_ITEM = ((BlockChair) FurnishBlocks.STONE_BRICK_CHAIR).getItem();
    public static final Item STONE_BRICK_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.STONE_BRICK_COFFEE_TABLE).getItem();
    public static final Item STONE_BRICK_COUCH_ITEM = ((BlockCouch) FurnishBlocks.STONE_BRICK_COUCH).getItem();
    public static final Item STONE_BRICK_TABLE_ITEM = ((BlockTable) FurnishBlocks.STONE_BRICK_TABLE).getItem();
    
    public static final Item STONE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.STONE_CHAIR).getItem();
    public static final Item STONE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.STONE_COFFEE_TABLE).getItem();
    public static final Item STONE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.STONE_COUCH).getItem();
    public static final Item STONE_TABLE_ITEM = ((BlockTable) FurnishBlocks.STONE_TABLE).getItem();
    
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
            
            BOP_CHERRY_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_CHERRY_CHAIR).getItem();
            BOP_CHERRY_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_CHERRY_COFFEE_TABLE).getItem();
            BOP_CHERRY_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_CHERRY_COUCH).getItem();
            BOP_CHERRY_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_CHERRY_TABLE).getItem();
            
            BOP_EBONY_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_EBONY_CHAIR).getItem();
            BOP_EBONY_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_EBONY_COFFEE_TABLE).getItem();
            BOP_EBONY_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_EBONY_COUCH).getItem();
            BOP_EBONY_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_EBONY_TABLE).getItem();
            
            BOP_ETHEREAL_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_ETHEREAL_CHAIR).getItem();
            BOP_ETHEREAL_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_ETHEREAL_COFFEE_TABLE).getItem();
            BOP_ETHEREAL_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_ETHEREAL_COUCH).getItem();
            BOP_ETHEREAL_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_ETHEREAL_TABLE).getItem();
            
            BOP_EUCALYPTUS_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_EUCALYPTUS_CHAIR).getItem();
            BOP_EUCALYPTUS_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_EUCALYPTUS_COFFEE_TABLE).getItem();
            BOP_EUCALYPTUS_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_EUCALYPTUS_COUCH).getItem();
            BOP_EUCALYPTUS_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_EUCALYPTUS_TABLE).getItem();
            
            BOP_FIR_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_FIR_CHAIR).getItem();
            BOP_FIR_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_FIR_COFFEE_TABLE).getItem();
            BOP_FIR_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_FIR_COUCH).getItem();
            BOP_FIR_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_FIR_TABLE).getItem();
            
            BOP_HELLBARK_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_HELLBARK_CHAIR).getItem();
            BOP_HELLBARK_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_HELLBARK_COFFEE_TABLE).getItem();
            BOP_HELLBARK_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_HELLBARK_COUCH).getItem();
            BOP_HELLBARK_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_HELLBARK_TABLE).getItem();
            
            BOP_JACARANDA_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_JACARANDA_CHAIR).getItem();
            BOP_JACARANDA_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_JACARANDA_COFFEE_TABLE).getItem();
            BOP_JACARANDA_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_JACARANDA_COUCH).getItem();
            BOP_JACARANDA_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_JACARANDA_TABLE).getItem();
            
            BOP_MAGIC_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_MAGIC_CHAIR).getItem();
            BOP_MAGIC_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_MAGIC_COFFEE_TABLE).getItem();
            BOP_MAGIC_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_MAGIC_COUCH).getItem();
            BOP_MAGIC_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_MAGIC_TABLE).getItem();
            
            BOP_MAHOGANY_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_MAHOGANY_CHAIR).getItem();
            BOP_MAHOGANY_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_MAHOGANY_COFFEE_TABLE).getItem();
            BOP_MAHOGANY_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_MAHOGANY_COUCH).getItem();
            BOP_MAHOGANY_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_MAHOGANY_TABLE).getItem();
            
            BOP_MANGROVE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_MANGROVE_CHAIR).getItem();
            BOP_MANGROVE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_MANGROVE_COFFEE_TABLE).getItem();
            BOP_MANGROVE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_MANGROVE_COUCH).getItem();
            BOP_MANGROVE_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_MANGROVE_TABLE).getItem();
            
            BOP_PALM_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_PALM_CHAIR).getItem();
            BOP_PALM_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_PALM_COFFEE_TABLE).getItem();
            BOP_PALM_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_PALM_COUCH).getItem();
            BOP_PALM_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_PALM_TABLE).getItem();
            
            BOP_PINE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_PINE_CHAIR).getItem();
            BOP_PINE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_PINE_COFFEE_TABLE).getItem();
            BOP_PINE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_PINE_COUCH).getItem();
            BOP_PINE_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_PINE_TABLE).getItem();
            
            BOP_REDWOOD_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_REDWOOD_CHAIR).getItem();
            BOP_REDWOOD_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_REDWOOD_COFFEE_TABLE).getItem();
            BOP_REDWOOD_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_REDWOOD_COUCH).getItem();
            BOP_REDWOOD_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_REDWOOD_TABLE).getItem();
            
            BOP_SACRED_OAK_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_SACRED_OAK_CHAIR).getItem();
            BOP_SACRED_OAK_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_SACRED_OAK_COFFEE_TABLE).getItem();
            BOP_SACRED_OAK_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_SACRED_OAK_COUCH).getItem();
            BOP_SACRED_OAK_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_SACRED_OAK_TABLE).getItem();
            
            BOP_UMBRAN_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_UMBRAN_CHAIR).getItem();
            BOP_UMBRAN_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_UMBRAN_COFFEE_TABLE).getItem();
            BOP_UMBRAN_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_UMBRAN_COUCH).getItem();
            BOP_UMBRAN_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_UMBRAN_TABLE).getItem();
            
            BOP_WILLOW_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_WILLOW_CHAIR).getItem();
            BOP_WILLOW_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_WILLOW_COFFEE_TABLE).getItem();
            BOP_WILLOW_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_WILLOW_COUCH).getItem();
            BOP_WILLOW_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_WILLOW_TABLE).getItem();
            
            BOP_BAMBOO_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_BAMBOO_CHAIR).getItem();
            BOP_BAMBOO_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_BAMBOO_COFFEE_TABLE).getItem();
            BOP_BAMBOO_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_BAMBOO_COUCH).getItem();
            BOP_BAMBOO_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_BAMBOO_TABLE).getItem();
            
            BOP_MUD_BRICK_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_MUD_BRICK_CHAIR).getItem();
            BOP_MUD_BRICK_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_MUD_BRICK_COFFEE_TABLE).getItem();
            BOP_MUD_BRICK_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_MUD_BRICK_COUCH).getItem();
            BOP_MUD_BRICK_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_MUD_BRICK_TABLE).getItem();
            
            BOP_WHITE_SANDSTONE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_WHITE_SANDSTONE_CHAIR).getItem();
            BOP_WHITE_SANDSTONE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_WHITE_SANDSTONE_COFFEE_TABLE).getItem();
            BOP_WHITE_SANDSTONE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_WHITE_SANDSTONE_COUCH).getItem();
            BOP_WHITE_SANDSTONE_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_WHITE_SANDSTONE_TABLE).getItem();
            
            BOP_AMETHYST_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_AMETHYST_CHAIR).getItem();
            BOP_AMETHYST_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_AMETHYST_COFFEE_TABLE).getItem();
            BOP_AMETHYST_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_AMETHYST_COUCH).getItem();
            BOP_AMETHYST_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_AMETHYST_TABLE).getItem();
            
            BOP_RUBY_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_RUBY_CHAIR).getItem();
            BOP_RUBY_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_RUBY_COFFEE_TABLE).getItem();
            BOP_RUBY_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_RUBY_COUCH).getItem();
            BOP_RUBY_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_RUBY_TABLE).getItem();
            
            BOP_PERIDOT_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_PERIDOT_CHAIR).getItem();
            BOP_PERIDOT_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_PERIDOT_COFFEE_TABLE).getItem();
            BOP_PERIDOT_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_PERIDOT_COUCH).getItem();
            BOP_PERIDOT_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_PERIDOT_TABLE).getItem();
            
            BOP_TOPAZ_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_TOPAZ_CHAIR).getItem();
            BOP_TOPAZ_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_TOPAZ_COFFEE_TABLE).getItem();
            BOP_TOPAZ_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_TOPAZ_COUCH).getItem();
            BOP_TOPAZ_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_TOPAZ_TABLE).getItem();
            
            BOP_TANZANITE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_TANZANITE_CHAIR).getItem();
            BOP_TANZANITE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_TANZANITE_COFFEE_TABLE).getItem();
            BOP_TANZANITE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_TANZANITE_COUCH).getItem();
            BOP_TANZANITE_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_TANZANITE_TABLE).getItem();
            
            BOP_MALACHITE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_MALACHITE_CHAIR).getItem();
            BOP_MALACHITE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_MALACHITE_COFFEE_TABLE).getItem();
            BOP_MALACHITE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_MALACHITE_COUCH).getItem();
            BOP_MALACHITE_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_MALACHITE_TABLE).getItem();
            
            BOP_SAPPHIRE_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_SAPPHIRE_CHAIR).getItem();
            BOP_SAPPHIRE_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_SAPPHIRE_COFFEE_TABLE).getItem();
            BOP_SAPPHIRE_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_SAPPHIRE_COUCH).getItem();
            BOP_SAPPHIRE_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_SAPPHIRE_TABLE).getItem();
            
            BOP_AMBER_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_AMBER_CHAIR).getItem();
            BOP_AMBER_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_AMBER_COFFEE_TABLE).getItem();
            BOP_AMBER_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_AMBER_COUCH).getItem();
            BOP_AMBER_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_AMBER_TABLE).getItem();
            
            BOP_FLESH_CHAIR_ITEM = ((BlockChair) FurnishBlocks.BOP_FLESH_CHAIR).getItem();
            BOP_FLESH_COFFEE_TABLE_ITEM = ((BlockCoffeeTable) FurnishBlocks.BOP_FLESH_COFFEE_TABLE).getItem();
            BOP_FLESH_COUCH_ITEM = ((BlockCouch) FurnishBlocks.BOP_FLESH_COUCH).getItem();
            BOP_FLESH_TABLE_ITEM = ((BlockTable) FurnishBlocks.BOP_FLESH_TABLE).getItem();
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
