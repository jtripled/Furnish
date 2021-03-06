package com.jtripled.furnish;

import com.jtripled.furnish.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 *
 * @author jtripled
 */
@Mod.EventBusSubscriber
public class FurnishBlocks
{
    public static final Block ACACIA_CHAIR = new BlockChair("acacia_chair", Material.WOOD);
    public static final Block ACACIA_COFFEE_TABLE = new BlockCoffeeTable("acacia_coffee_table", Material.WOOD);
    public static final Block ACACIA_COUCH = new BlockCouch("acacia_couch", Material.WOOD);
    public static final Block ACACIA_TABLE = new BlockTable("acacia_table", Material.WOOD);
    
    public static final Block ANDESITE_CHAIR = new BlockChair("andesite_chair", Material.ROCK);
    public static final Block ANDESITE_COFFEE_TABLE = new BlockCoffeeTable("andesite_coffee_table", Material.ROCK);
    public static final Block ANDESITE_COUCH = new BlockCouch("andesite_couch", Material.ROCK);
    public static final Block ANDESITE_TABLE = new BlockTable("andesite_table", Material.ROCK);
    
    public static final Block BIRCH_CHAIR = new BlockChair("birch_chair", Material.WOOD);
    public static final Block BIRCH_COFFEE_TABLE = new BlockCoffeeTable("birch_coffee_table", Material.WOOD);
    public static final Block BIRCH_COUCH = new BlockCouch("birch_couch", Material.WOOD);
    public static final Block BIRCH_TABLE = new BlockTable("birch_table", Material.WOOD);
    
    public static final Block BONE_CHAIR = new BlockChair("bone_chair", Material.ROCK);
    public static final Block BONE_COFFEE_TABLE = new BlockCoffeeTable("bone_coffee_table", Material.ROCK);
    public static final Block BONE_COUCH = new BlockCouch("bone_couch", Material.ROCK);
    public static final Block BONE_TABLE = new BlockTable("bone_table", Material.ROCK);
    
    public static final Block BRICK_CHAIR = new BlockChair("brick_chair", Material.ROCK);
    public static final Block BRICK_COFFEE_TABLE = new BlockCoffeeTable("brick_coffee_table", Material.ROCK);
    public static final Block BRICK_COUCH = new BlockCouch("brick_couch", Material.ROCK);
    public static final Block BRICK_TABLE = new BlockTable("brick_table", Material.ROCK);
    
    public static final Block COBBLESTONE_CHAIR = new BlockChair("cobblestone_chair", Material.ROCK);
    public static final Block COBBLESTONE_COFFEE_TABLE = new BlockCoffeeTable("cobblestone_coffee_table", Material.ROCK);
    public static final Block COBBLESTONE_COUCH = new BlockCouch("cobblestone_couch", Material.ROCK);
    public static final Block COBBLESTONE_TABLE = new BlockTable("cobblestone_table", Material.ROCK);
    
    public static final Block DARK_OAK_CHAIR = new BlockChair("dark_oak_chair", Material.WOOD);
    public static final Block DARK_OAK_COFFEE_TABLE = new BlockCoffeeTable("dark_oak_coffee_table", Material.WOOD);
    public static final Block DARK_OAK_COUCH = new BlockCouch("dark_oak_couch", Material.WOOD);
    public static final Block DARK_OAK_TABLE = new BlockTable("dark_oak_table", Material.WOOD);
    
    public static final Block DARK_PRISMARINE_CHAIR = new BlockChair("dark_prismarine_chair", Material.ROCK);
    public static final Block DARK_PRISMARINE_COFFEE_TABLE = new BlockCoffeeTable("dark_prismarine_coffee_table", Material.ROCK);
    public static final Block DARK_PRISMARINE_COUCH = new BlockCouch("dark_prismarine_couch", Material.ROCK);
    public static final Block DARK_PRISMARINE_TABLE = new BlockTable("dark_prismarine_table", Material.ROCK);
    
    public static final Block DIAMOND_CHAIR = new BlockChair("diamond_chair", Material.ROCK);
    public static final Block DIAMOND_COFFEE_TABLE = new BlockCoffeeTable("diamond_coffee_table", Material.ROCK);
    public static final Block DIAMOND_COUCH = new BlockCouch("diamond_couch", Material.ROCK);
    public static final Block DIAMOND_TABLE = new BlockTable("diamond_table", Material.ROCK);
    
    public static final Block DIORITE_CHAIR = new BlockChair("diorite_chair", Material.ROCK);
    public static final Block DIORITE_COFFEE_TABLE = new BlockCoffeeTable("diorite_coffee_table", Material.ROCK);
    public static final Block DIORITE_COUCH = new BlockCouch("diorite_couch", Material.ROCK);
    public static final Block DIORITE_TABLE = new BlockTable("diorite_table", Material.ROCK);
    
    public static final Block EMERALD_CHAIR = new BlockChair("emerald_chair", Material.ROCK);
    public static final Block EMERALD_COFFEE_TABLE = new BlockCoffeeTable("emerald_coffee_table", Material.ROCK);
    public static final Block EMERALD_COUCH = new BlockCouch("emerald_couch", Material.ROCK);
    public static final Block EMERALD_TABLE = new BlockTable("emerald_table", Material.ROCK);
    
    public static final Block END_STONE_BRICK_CHAIR = new BlockChair("end_stone_brick_chair", Material.ROCK);
    public static final Block END_STONE_BRICK_COFFEE_TABLE = new BlockCoffeeTable("end_stone_brick_coffee_table", Material.ROCK);
    public static final Block END_STONE_BRICK_COUCH = new BlockCouch("end_stone_brick_couch", Material.ROCK);
    public static final Block END_STONE_BRICK_TABLE = new BlockTable("end_stone_brick_table", Material.ROCK);
    
    public static final Block GOLD_CHAIR = new BlockChair("gold_chair", Material.IRON);
    public static final Block GOLD_COFFEE_TABLE = new BlockCoffeeTable("gold_coffee_table", Material.IRON);
    public static final Block GOLD_COUCH = new BlockCouch("gold_couch", Material.IRON);
    public static final Block GOLD_TABLE = new BlockTable("gold_table", Material.IRON);
    
    public static final Block GRANITE_CHAIR = new BlockChair("granite_chair", Material.ROCK);
    public static final Block GRANITE_COFFEE_TABLE = new BlockCoffeeTable("granite_coffee_table", Material.ROCK);
    public static final Block GRANITE_COUCH = new BlockCouch("granite_couch", Material.ROCK);
    public static final Block GRANITE_TABLE = new BlockTable("granite_table", Material.ROCK);
    
    public static final Block IRON_CHAIR = new BlockChair("iron_chair", Material.IRON);
    public static final Block IRON_COFFEE_TABLE = new BlockCoffeeTable("iron_coffee_table", Material.IRON);
    public static final Block IRON_COUCH = new BlockCouch("iron_couch", Material.IRON);
    public static final Block IRON_TABLE = new BlockTable("iron_table", Material.IRON);
    
    public static final Block JUNGLE_CHAIR = new BlockChair("jungle_chair", Material.WOOD);
    public static final Block JUNGLE_COFFEE_TABLE = new BlockCoffeeTable("jungle_coffee_table", Material.WOOD);
    public static final Block JUNGLE_COUCH = new BlockCouch("jungle_couch", Material.WOOD);
    public static final Block JUNGLE_TABLE = new BlockTable("jungle_table", Material.WOOD);
    
    public static final Block LAPIS_LAZULI_CHAIR = new BlockChair("lapis_lazuli_chair", Material.ROCK);
    public static final Block LAPIS_LAZULI_COFFEE_TABLE = new BlockCoffeeTable("lapis_lazuli_coffee_table", Material.ROCK);
    public static final Block LAPIS_LAZULI_COUCH = new BlockCouch("lapis_lazuli_couch", Material.ROCK);
    public static final Block LAPIS_LAZULI_TABLE = new BlockTable("lapis_lazuli_table", Material.ROCK);
    
    public static final Block MOSS_STONE_CHAIR = new BlockChair("moss_stone_chair", Material.ROCK);
    public static final Block MOSS_STONE_COFFEE_TABLE = new BlockCoffeeTable("moss_stone_coffee_table", Material.ROCK);
    public static final Block MOSS_STONE_COUCH = new BlockCouch("moss_stone_couch", Material.ROCK);
    public static final Block MOSS_STONE_TABLE = new BlockTable("moss_stone_table", Material.ROCK);
    
    public static final Block NETHER_BRICK_CHAIR = new BlockChair("nether_brick_chair", Material.ROCK);
    public static final Block NETHER_BRICK_COFFEE_TABLE = new BlockCoffeeTable("nether_brick_coffee_table", Material.ROCK);
    public static final Block NETHER_BRICK_COUCH = new BlockCouch("nether_brick_couch", Material.ROCK);
    public static final Block NETHER_BRICK_TABLE = new BlockTable("nether_brick_table", Material.ROCK);
    
    public static final Block OAK_CHAIR = new BlockChair("oak_chair", Material.WOOD);
    public static final Block OAK_COFFEE_TABLE = new BlockCoffeeTable("oak_coffee_table", Material.WOOD);
    public static final Block OAK_COUCH = new BlockCouch("oak_couch", Material.WOOD);
    public static final Block OAK_TABLE = new BlockTable("oak_table", Material.WOOD);
    
    public static final Block OBSIDIAN_CHAIR = new BlockChair("obsidian_chair", Material.ROCK);
    public static final Block OBSIDIAN_COFFEE_TABLE = new BlockCoffeeTable("obsidian_coffee_table", Material.ROCK);
    public static final Block OBSIDIAN_COUCH = new BlockCouch("obsidian_couch", Material.ROCK);
    public static final Block OBSIDIAN_TABLE = new BlockTable("obsidian_table", Material.ROCK);
    
    public static final Block POLISHED_ANDESITE_CHAIR = new BlockChair("polished_andesite_chair", Material.ROCK);
    public static final Block POLISHED_ANDESITE_COFFEE_TABLE = new BlockCoffeeTable("polished_andesite_coffee_table", Material.ROCK);
    public static final Block POLISHED_ANDESITE_COUCH = new BlockCouch("polished_andesite_couch", Material.ROCK);
    public static final Block POLISHED_ANDESITE_TABLE = new BlockTable("polished_andesite_table", Material.ROCK);
    
    public static final Block POLISHED_DIORITE_CHAIR = new BlockChair("polished_diorite_chair", Material.ROCK);
    public static final Block POLISHED_DIORITE_COFFEE_TABLE = new BlockCoffeeTable("polished_diorite_coffee_table", Material.ROCK);
    public static final Block POLISHED_DIORITE_COUCH = new BlockCouch("polished_diorite_couch", Material.ROCK);
    public static final Block POLISHED_DIORITE_TABLE = new BlockTable("polished_diorite_table", Material.ROCK);
    
    public static final Block POLISHED_GRANITE_CHAIR = new BlockChair("polished_granite_chair", Material.ROCK);
    public static final Block POLISHED_GRANITE_COFFEE_TABLE = new BlockCoffeeTable("polished_granite_coffee_table", Material.ROCK);
    public static final Block POLISHED_GRANITE_COUCH = new BlockCouch("polished_granite_couch", Material.ROCK);
    public static final Block POLISHED_GRANITE_TABLE = new BlockTable("polished_granite_table", Material.ROCK);
    
    public static final Block PRISMARINE_CHAIR = new BlockChair("prismarine_chair", Material.ROCK);
    public static final Block PRISMARINE_COFFEE_TABLE = new BlockCoffeeTable("prismarine_coffee_table", Material.ROCK);
    public static final Block PRISMARINE_COUCH = new BlockCouch("prismarine_couch", Material.ROCK);
    public static final Block PRISMARINE_TABLE = new BlockTable("prismarine_table", Material.ROCK);
    
    public static final Block PRISMARINE_BRICK_CHAIR = new BlockChair("prismarine_brick_chair", Material.ROCK);
    public static final Block PRISMARINE_BRICK_COFFEE_TABLE = new BlockCoffeeTable("prismarine_brick_coffee_table", Material.ROCK);
    public static final Block PRISMARINE_BRICK_COUCH = new BlockCouch("prismarine_brick_couch", Material.ROCK);
    public static final Block PRISMARINE_BRICK_TABLE = new BlockTable("prismarine_brick_table", Material.ROCK);
    
    public static final Block PURPUR_CHAIR = new BlockChair("purpur_chair", Material.ROCK);
    public static final Block PURPUR_COFFEE_TABLE = new BlockCoffeeTable("purpur_coffee_table", Material.ROCK);
    public static final Block PURPUR_COUCH = new BlockCouch("purpur_couch", Material.ROCK);
    public static final Block PURPUR_TABLE = new BlockTable("purpur_table", Material.ROCK);
    
    public static final Block QUARTZ_CHAIR = new BlockChair("quartz_chair", Material.ROCK);
    public static final Block QUARTZ_COFFEE_TABLE = new BlockCoffeeTable("quartz_coffee_table", Material.ROCK);
    public static final Block QUARTZ_COUCH = new BlockCouch("quartz_couch", Material.ROCK);
    public static final Block QUARTZ_TABLE = new BlockTable("quartz_table", Material.ROCK);
    
    public static final Block RED_NETHER_BRICK_CHAIR = new BlockChair("red_nether_brick_chair", Material.ROCK);
    public static final Block RED_NETHER_BRICK_COFFEE_TABLE = new BlockCoffeeTable("red_nether_brick_coffee_table", Material.ROCK);
    public static final Block RED_NETHER_BRICK_COUCH = new BlockCouch("red_nether_brick_couch", Material.ROCK);
    public static final Block RED_NETHER_BRICK_TABLE = new BlockTable("red_nether_brick_table", Material.ROCK);
    
    public static final Block RED_SANDSTONE_CHAIR = new BlockChair("red_sandstone_chair", Material.ROCK);
    public static final Block RED_SANDSTONE_COFFEE_TABLE = new BlockCoffeeTable("red_sandstone_coffee_table", Material.ROCK);
    public static final Block RED_SANDSTONE_COUCH = new BlockCouch("red_sandstone_couch", Material.ROCK);
    public static final Block RED_SANDSTONE_TABLE = new BlockTable("red_sandstone_table", Material.ROCK);
    
    public static final Block REDSTONE_CHAIR = new BlockChair("redstone_chair", Material.ROCK);
    public static final Block REDSTONE_COFFEE_TABLE = new BlockCoffeeTable("redstone_coffee_table", Material.ROCK);
    public static final Block REDSTONE_COUCH = new BlockCouch("redstone_couch", Material.ROCK);
    public static final Block REDSTONE_TABLE = new BlockTable("redstone_table", Material.ROCK);
    
    public static final Block SANDSTONE_CHAIR = new BlockChair("sandstone_chair", Material.ROCK);
    public static final Block SANDSTONE_COFFEE_TABLE = new BlockCoffeeTable("sandstone_coffee_table", Material.ROCK);
    public static final Block SANDSTONE_COUCH = new BlockCouch("sandstone_couch", Material.ROCK);
    public static final Block SANDSTONE_TABLE = new BlockTable("sandstone_table", Material.ROCK);
    
    public static final Block SPRUCE_CHAIR = new BlockChair("spruce_chair", Material.WOOD);
    public static final Block SPRUCE_COFFEE_TABLE = new BlockCoffeeTable("spruce_coffee_table", Material.WOOD);
    public static final Block SPRUCE_COUCH = new BlockCouch("spruce_couch", Material.WOOD);
    public static final Block SPRUCE_TABLE = new BlockTable("spruce_table", Material.WOOD);
    
    public static final Block STONE_BRICK_CHAIR = new BlockChair("stone_brick_chair", Material.ROCK);
    public static final Block STONE_BRICK_COFFEE_TABLE = new BlockCoffeeTable("stone_brick_coffee_table", Material.ROCK);
    public static final Block STONE_BRICK_COUCH = new BlockCouch("stone_brick_couch", Material.ROCK);
    public static final Block STONE_BRICK_TABLE = new BlockTable("stone_brick_table", Material.ROCK);
    
    public static final Block STONE_CHAIR = new BlockChair("stone_chair", Material.ROCK);
    public static final Block STONE_COFFEE_TABLE = new BlockCoffeeTable("stone_coffee_table", Material.ROCK);
    public static final Block STONE_COUCH = new BlockCouch("stone_couch", Material.ROCK);
    public static final Block STONE_TABLE = new BlockTable("stone_table", Material.ROCK);
    
    public static boolean BOP_LOADED = false;
    
    public static Block BOP_CHERRY_CHAIR;
    public static Block BOP_CHERRY_COFFEE_TABLE;
    public static Block BOP_CHERRY_COUCH;
    public static Block BOP_CHERRY_TABLE;
    
    public static Block BOP_EBONY_CHAIR;
    public static Block BOP_EBONY_COFFEE_TABLE;
    public static Block BOP_EBONY_COUCH;
    public static Block BOP_EBONY_TABLE;
    
    public static Block BOP_ETHEREAL_CHAIR;
    public static Block BOP_ETHEREAL_COFFEE_TABLE;
    public static Block BOP_ETHEREAL_COUCH;
    public static Block BOP_ETHEREAL_TABLE;
    
    public static Block BOP_EUCALYPTUS_CHAIR;
    public static Block BOP_EUCALYPTUS_COFFEE_TABLE;
    public static Block BOP_EUCALYPTUS_COUCH;
    public static Block BOP_EUCALYPTUS_TABLE;
    
    public static Block BOP_FIR_CHAIR;
    public static Block BOP_FIR_COFFEE_TABLE;
    public static Block BOP_FIR_COUCH;
    public static Block BOP_FIR_TABLE;
    
    public static Block BOP_HELLBARK_CHAIR;
    public static Block BOP_HELLBARK_COFFEE_TABLE;
    public static Block BOP_HELLBARK_COUCH;
    public static Block BOP_HELLBARK_TABLE;
    
    public static Block BOP_JACARANDA_CHAIR;
    public static Block BOP_JACARANDA_COFFEE_TABLE;
    public static Block BOP_JACARANDA_COUCH;
    public static Block BOP_JACARANDA_TABLE;
    
    public static Block BOP_MAGIC_CHAIR;
    public static Block BOP_MAGIC_COFFEE_TABLE;
    public static Block BOP_MAGIC_COUCH;
    public static Block BOP_MAGIC_TABLE;
    
    public static Block BOP_MAHOGANY_CHAIR;
    public static Block BOP_MAHOGANY_COFFEE_TABLE;
    public static Block BOP_MAHOGANY_COUCH;
    public static Block BOP_MAHOGANY_TABLE;
    
    public static Block BOP_MANGROVE_CHAIR;
    public static Block BOP_MANGROVE_COFFEE_TABLE;
    public static Block BOP_MANGROVE_COUCH;
    public static Block BOP_MANGROVE_TABLE;
    
    public static Block BOP_PALM_CHAIR;
    public static Block BOP_PALM_COFFEE_TABLE;
    public static Block BOP_PALM_COUCH;
    public static Block BOP_PALM_TABLE;
    
    public static Block BOP_PINE_CHAIR;
    public static Block BOP_PINE_COFFEE_TABLE;
    public static Block BOP_PINE_COUCH;
    public static Block BOP_PINE_TABLE;
    
    public static Block BOP_REDWOOD_CHAIR;
    public static Block BOP_REDWOOD_COFFEE_TABLE;
    public static Block BOP_REDWOOD_COUCH;
    public static Block BOP_REDWOOD_TABLE;
    
    public static Block BOP_SACRED_OAK_CHAIR;
    public static Block BOP_SACRED_OAK_COFFEE_TABLE;
    public static Block BOP_SACRED_OAK_COUCH;
    public static Block BOP_SACRED_OAK_TABLE;
    
    public static Block BOP_UMBRAN_CHAIR;
    public static Block BOP_UMBRAN_COFFEE_TABLE;
    public static Block BOP_UMBRAN_COUCH;
    public static Block BOP_UMBRAN_TABLE;
    
    public static Block BOP_WILLOW_CHAIR;
    public static Block BOP_WILLOW_COFFEE_TABLE;
    public static Block BOP_WILLOW_COUCH;
    public static Block BOP_WILLOW_TABLE;
    
    public static Block BOP_BAMBOO_CHAIR;
    public static Block BOP_BAMBOO_COFFEE_TABLE;
    public static Block BOP_BAMBOO_COUCH;
    public static Block BOP_BAMBOO_TABLE;
    
    public static Block BOP_MUD_BRICK_CHAIR;
    public static Block BOP_MUD_BRICK_COFFEE_TABLE;
    public static Block BOP_MUD_BRICK_COUCH;
    public static Block BOP_MUD_BRICK_TABLE;
    
    public static Block BOP_WHITE_SANDSTONE_CHAIR;
    public static Block BOP_WHITE_SANDSTONE_COFFEE_TABLE;
    public static Block BOP_WHITE_SANDSTONE_COUCH;
    public static Block BOP_WHITE_SANDSTONE_TABLE;
    
    public static Block BOP_AMETHYST_CHAIR;
    public static Block BOP_AMETHYST_COFFEE_TABLE;
    public static Block BOP_AMETHYST_COUCH;
    public static Block BOP_AMETHYST_TABLE;
    
    public static Block BOP_RUBY_CHAIR;
    public static Block BOP_RUBY_COFFEE_TABLE;
    public static Block BOP_RUBY_COUCH;
    public static Block BOP_RUBY_TABLE;
    
    public static Block BOP_PERIDOT_CHAIR;
    public static Block BOP_PERIDOT_COFFEE_TABLE;
    public static Block BOP_PERIDOT_COUCH;
    public static Block BOP_PERIDOT_TABLE;
    
    public static Block BOP_TOPAZ_CHAIR;
    public static Block BOP_TOPAZ_COFFEE_TABLE;
    public static Block BOP_TOPAZ_COUCH;
    public static Block BOP_TOPAZ_TABLE;
    
    public static Block BOP_TANZANITE_CHAIR;
    public static Block BOP_TANZANITE_COFFEE_TABLE;
    public static Block BOP_TANZANITE_COUCH;
    public static Block BOP_TANZANITE_TABLE;
    
    public static Block BOP_MALACHITE_CHAIR;
    public static Block BOP_MALACHITE_COFFEE_TABLE;
    public static Block BOP_MALACHITE_COUCH;
    public static Block BOP_MALACHITE_TABLE;
    
    public static Block BOP_SAPPHIRE_CHAIR;
    public static Block BOP_SAPPHIRE_COFFEE_TABLE;
    public static Block BOP_SAPPHIRE_COUCH;
    public static Block BOP_SAPPHIRE_TABLE;
    
    public static Block BOP_AMBER_CHAIR;
    public static Block BOP_AMBER_COFFEE_TABLE;
    public static Block BOP_AMBER_COUCH;
    public static Block BOP_AMBER_TABLE;
    
    public static Block BOP_FLESH_CHAIR;
    public static Block BOP_FLESH_COFFEE_TABLE;
    public static Block BOP_FLESH_COUCH;
    public static Block BOP_FLESH_TABLE;
    
    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event)
    {
        Furnish.getProxy().registerBlock(event, ACACIA_CHAIR);
        Furnish.getProxy().registerBlock(event, ACACIA_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, ACACIA_COUCH);
        Furnish.getProxy().registerBlock(event, ACACIA_TABLE);
        
        Furnish.getProxy().registerBlock(event, ANDESITE_CHAIR);
        Furnish.getProxy().registerBlock(event, ANDESITE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, ANDESITE_COUCH);
        Furnish.getProxy().registerBlock(event, ANDESITE_TABLE);
        
        Furnish.getProxy().registerBlock(event, BIRCH_CHAIR);
        Furnish.getProxy().registerBlock(event, BIRCH_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, BIRCH_COUCH);
        Furnish.getProxy().registerBlock(event, BIRCH_TABLE);
        
        Furnish.getProxy().registerBlock(event, BONE_CHAIR);
        Furnish.getProxy().registerBlock(event, BONE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, BONE_COUCH);
        Furnish.getProxy().registerBlock(event, BONE_TABLE);
        
        Furnish.getProxy().registerBlock(event, BRICK_CHAIR);
        Furnish.getProxy().registerBlock(event, BRICK_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, BRICK_COUCH);
        Furnish.getProxy().registerBlock(event, BRICK_TABLE);
        
        Furnish.getProxy().registerBlock(event, COBBLESTONE_CHAIR);
        Furnish.getProxy().registerBlock(event, COBBLESTONE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, COBBLESTONE_COUCH);
        Furnish.getProxy().registerBlock(event, COBBLESTONE_TABLE);
        
        Furnish.getProxy().registerBlock(event, DARK_OAK_CHAIR);
        Furnish.getProxy().registerBlock(event, DARK_OAK_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, DARK_OAK_COUCH);
        Furnish.getProxy().registerBlock(event, DARK_OAK_TABLE);
        
        Furnish.getProxy().registerBlock(event, DARK_PRISMARINE_CHAIR);
        Furnish.getProxy().registerBlock(event, DARK_PRISMARINE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, DARK_PRISMARINE_COUCH);
        Furnish.getProxy().registerBlock(event, DARK_PRISMARINE_TABLE);
        
        Furnish.getProxy().registerBlock(event, DIAMOND_CHAIR);
        Furnish.getProxy().registerBlock(event, DIAMOND_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, DIAMOND_COUCH);
        Furnish.getProxy().registerBlock(event, DIAMOND_TABLE);
        
        Furnish.getProxy().registerBlock(event, DIORITE_CHAIR);
        Furnish.getProxy().registerBlock(event, DIORITE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, DIORITE_COUCH);
        Furnish.getProxy().registerBlock(event, DIORITE_TABLE);
        
        Furnish.getProxy().registerBlock(event, EMERALD_CHAIR);
        Furnish.getProxy().registerBlock(event, EMERALD_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, EMERALD_COUCH);
        Furnish.getProxy().registerBlock(event, EMERALD_TABLE);
        
        Furnish.getProxy().registerBlock(event, END_STONE_BRICK_CHAIR);
        Furnish.getProxy().registerBlock(event, END_STONE_BRICK_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, END_STONE_BRICK_COUCH);
        Furnish.getProxy().registerBlock(event, END_STONE_BRICK_TABLE);
        
        Furnish.getProxy().registerBlock(event, GOLD_CHAIR);
        Furnish.getProxy().registerBlock(event, GOLD_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, GOLD_COUCH);
        Furnish.getProxy().registerBlock(event, GOLD_TABLE);
        
        Furnish.getProxy().registerBlock(event, GRANITE_CHAIR);
        Furnish.getProxy().registerBlock(event, GRANITE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, GRANITE_COUCH);
        Furnish.getProxy().registerBlock(event, GRANITE_TABLE);
        
        Furnish.getProxy().registerBlock(event, IRON_CHAIR);
        Furnish.getProxy().registerBlock(event, IRON_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, IRON_COUCH);
        Furnish.getProxy().registerBlock(event, IRON_TABLE);
        
        Furnish.getProxy().registerBlock(event, JUNGLE_CHAIR);
        Furnish.getProxy().registerBlock(event, JUNGLE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, JUNGLE_COUCH);
        Furnish.getProxy().registerBlock(event, JUNGLE_TABLE);
        
        Furnish.getProxy().registerBlock(event, LAPIS_LAZULI_CHAIR);
        Furnish.getProxy().registerBlock(event, LAPIS_LAZULI_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, LAPIS_LAZULI_COUCH);
        Furnish.getProxy().registerBlock(event, LAPIS_LAZULI_TABLE);
        
        Furnish.getProxy().registerBlock(event, MOSS_STONE_CHAIR);
        Furnish.getProxy().registerBlock(event, MOSS_STONE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, MOSS_STONE_COUCH);
        Furnish.getProxy().registerBlock(event, MOSS_STONE_TABLE);
        
        Furnish.getProxy().registerBlock(event, NETHER_BRICK_CHAIR);
        Furnish.getProxy().registerBlock(event, NETHER_BRICK_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, NETHER_BRICK_COUCH);
        Furnish.getProxy().registerBlock(event, NETHER_BRICK_TABLE);
        
        Furnish.getProxy().registerBlock(event, OAK_CHAIR);
        Furnish.getProxy().registerBlock(event, OAK_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, OAK_COUCH);
        Furnish.getProxy().registerBlock(event, OAK_TABLE);
        
        Furnish.getProxy().registerBlock(event, OBSIDIAN_CHAIR);
        Furnish.getProxy().registerBlock(event, OBSIDIAN_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, OBSIDIAN_COUCH);
        Furnish.getProxy().registerBlock(event, OBSIDIAN_TABLE);
        
        Furnish.getProxy().registerBlock(event, POLISHED_ANDESITE_CHAIR);
        Furnish.getProxy().registerBlock(event, POLISHED_ANDESITE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, POLISHED_ANDESITE_COUCH);
        Furnish.getProxy().registerBlock(event, POLISHED_ANDESITE_TABLE);
        
        Furnish.getProxy().registerBlock(event, POLISHED_DIORITE_CHAIR);
        Furnish.getProxy().registerBlock(event, POLISHED_DIORITE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, POLISHED_DIORITE_COUCH);
        Furnish.getProxy().registerBlock(event, POLISHED_DIORITE_TABLE);
        
        Furnish.getProxy().registerBlock(event, POLISHED_GRANITE_CHAIR);
        Furnish.getProxy().registerBlock(event, POLISHED_GRANITE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, POLISHED_GRANITE_COUCH);
        Furnish.getProxy().registerBlock(event, POLISHED_GRANITE_TABLE);
        
        Furnish.getProxy().registerBlock(event, PRISMARINE_CHAIR);
        Furnish.getProxy().registerBlock(event, PRISMARINE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, PRISMARINE_COUCH);
        Furnish.getProxy().registerBlock(event, PRISMARINE_TABLE);
        
        Furnish.getProxy().registerBlock(event, PRISMARINE_BRICK_CHAIR);
        Furnish.getProxy().registerBlock(event, PRISMARINE_BRICK_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, PRISMARINE_BRICK_COUCH);
        Furnish.getProxy().registerBlock(event, PRISMARINE_BRICK_TABLE);
        
        Furnish.getProxy().registerBlock(event, PURPUR_CHAIR);
        Furnish.getProxy().registerBlock(event, PURPUR_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, PURPUR_COUCH);
        Furnish.getProxy().registerBlock(event, PURPUR_TABLE);
        
        Furnish.getProxy().registerBlock(event, QUARTZ_CHAIR);
        Furnish.getProxy().registerBlock(event, QUARTZ_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, QUARTZ_COUCH);
        Furnish.getProxy().registerBlock(event, QUARTZ_TABLE);
        
        Furnish.getProxy().registerBlock(event, RED_NETHER_BRICK_CHAIR);
        Furnish.getProxy().registerBlock(event, RED_NETHER_BRICK_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, RED_NETHER_BRICK_COUCH);
        Furnish.getProxy().registerBlock(event, RED_NETHER_BRICK_TABLE);
        
        Furnish.getProxy().registerBlock(event, RED_SANDSTONE_CHAIR);
        Furnish.getProxy().registerBlock(event, RED_SANDSTONE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, RED_SANDSTONE_COUCH);
        Furnish.getProxy().registerBlock(event, RED_SANDSTONE_TABLE);
        
        Furnish.getProxy().registerBlock(event, REDSTONE_CHAIR);
        Furnish.getProxy().registerBlock(event, REDSTONE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, REDSTONE_COUCH);
        Furnish.getProxy().registerBlock(event, REDSTONE_TABLE);
        
        Furnish.getProxy().registerBlock(event, SANDSTONE_CHAIR);
        Furnish.getProxy().registerBlock(event, SANDSTONE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, SANDSTONE_COUCH);
        Furnish.getProxy().registerBlock(event, SANDSTONE_TABLE);
        
        Furnish.getProxy().registerBlock(event, SPRUCE_CHAIR);
        Furnish.getProxy().registerBlock(event, SPRUCE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, SPRUCE_COUCH);
        Furnish.getProxy().registerBlock(event, SPRUCE_TABLE);
        
        Furnish.getProxy().registerBlock(event, STONE_BRICK_CHAIR);
        Furnish.getProxy().registerBlock(event, STONE_BRICK_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, STONE_BRICK_COUCH);
        Furnish.getProxy().registerBlock(event, STONE_BRICK_TABLE);
        
        Furnish.getProxy().registerBlock(event, STONE_CHAIR);
        Furnish.getProxy().registerBlock(event, STONE_COFFEE_TABLE);
        Furnish.getProxy().registerBlock(event, STONE_COUCH);
        Furnish.getProxy().registerBlock(event, STONE_TABLE);
        
        if (Loader.isModLoaded("biomesoplenty"))
        {
            BOP_CHERRY_CHAIR = new BlockChair("cherry_chair", Material.WOOD);
            BOP_CHERRY_COFFEE_TABLE = new BlockCoffeeTable("cherry_coffee_table", Material.WOOD);
            BOP_CHERRY_COUCH = new BlockCouch("cherry_couch", Material.WOOD);
            BOP_CHERRY_TABLE = new BlockTable("cherry_table", Material.WOOD);
            
            BOP_EBONY_CHAIR = new BlockChair("ebony_chair", Material.WOOD);
            BOP_EBONY_COFFEE_TABLE = new BlockCoffeeTable("ebony_coffee_table", Material.WOOD);
            BOP_EBONY_COUCH = new BlockCouch("ebony_couch", Material.WOOD);
            BOP_EBONY_TABLE = new BlockTable("ebony_table", Material.WOOD);
            
            BOP_ETHEREAL_CHAIR = new BlockChair("ethereal_chair", Material.WOOD);
            BOP_ETHEREAL_COFFEE_TABLE = new BlockCoffeeTable("ethereal_coffee_table", Material.WOOD);
            BOP_ETHEREAL_COUCH = new BlockCouch("ethereal_couch", Material.WOOD);
            BOP_ETHEREAL_TABLE = new BlockTable("ethereal_table", Material.WOOD);
            
            BOP_EUCALYPTUS_CHAIR = new BlockChair("eucalyptus_chair", Material.WOOD);
            BOP_EUCALYPTUS_COFFEE_TABLE = new BlockCoffeeTable("eucalyptus_coffee_table", Material.WOOD);
            BOP_EUCALYPTUS_COUCH = new BlockCouch("eucalyptus_couch", Material.WOOD);
            BOP_EUCALYPTUS_TABLE = new BlockTable("eucalyptus_table", Material.WOOD);
            
            BOP_FIR_CHAIR = new BlockChair("fir_chair", Material.WOOD);
            BOP_FIR_COFFEE_TABLE = new BlockCoffeeTable("fir_coffee_table", Material.WOOD);
            BOP_FIR_COUCH = new BlockCouch("fir_couch", Material.WOOD);
            BOP_FIR_TABLE = new BlockTable("fir_table", Material.WOOD);
            
            BOP_HELLBARK_CHAIR = new BlockChair("hellbark_chair", Material.WOOD);
            BOP_HELLBARK_COFFEE_TABLE = new BlockCoffeeTable("hellbark_coffee_table", Material.WOOD);
            BOP_HELLBARK_COUCH = new BlockCouch("hellbark_couch", Material.WOOD);
            BOP_HELLBARK_TABLE = new BlockTable("hellbark_table", Material.WOOD);
            
            BOP_JACARANDA_CHAIR = new BlockChair("jacaranda_chair", Material.WOOD);
            BOP_JACARANDA_COFFEE_TABLE = new BlockCoffeeTable("jacaranda_coffee_table", Material.WOOD);
            BOP_JACARANDA_COUCH = new BlockCouch("jacaranda_couch", Material.WOOD);
            BOP_JACARANDA_TABLE = new BlockTable("jacaranda_table", Material.WOOD);
            
            BOP_MAGIC_CHAIR = new BlockChair("magic_chair", Material.WOOD);
            BOP_MAGIC_COFFEE_TABLE = new BlockCoffeeTable("magic_coffee_table", Material.WOOD);
            BOP_MAGIC_COUCH = new BlockCouch("magic_couch", Material.WOOD);
            BOP_MAGIC_TABLE = new BlockTable("magic_table", Material.WOOD);
            
            BOP_MAHOGANY_CHAIR = new BlockChair("mahogany_chair", Material.WOOD);
            BOP_MAHOGANY_COFFEE_TABLE = new BlockCoffeeTable("mahogany_coffee_table", Material.WOOD);
            BOP_MAHOGANY_COUCH = new BlockCouch("mahogany_couch", Material.WOOD);
            BOP_MAHOGANY_TABLE = new BlockTable("mahogany_table", Material.WOOD);
            
            BOP_MANGROVE_CHAIR = new BlockChair("mangrove_chair", Material.WOOD);
            BOP_MANGROVE_COFFEE_TABLE = new BlockCoffeeTable("mangrove_coffee_table", Material.WOOD);
            BOP_MANGROVE_COUCH = new BlockCouch("mangrove_couch", Material.WOOD);
            BOP_MANGROVE_TABLE = new BlockTable("mangrove_table", Material.WOOD);
            
            BOP_PALM_CHAIR = new BlockChair("palm_chair", Material.WOOD);
            BOP_PALM_COFFEE_TABLE = new BlockCoffeeTable("palm_coffee_table", Material.WOOD);
            BOP_PALM_COUCH = new BlockCouch("palm_couch", Material.WOOD);
            BOP_PALM_TABLE = new BlockTable("palm_table", Material.WOOD);
            
            BOP_PINE_CHAIR = new BlockChair("pine_chair", Material.WOOD);
            BOP_PINE_COFFEE_TABLE = new BlockCoffeeTable("pine_coffee_table", Material.WOOD);
            BOP_PINE_COUCH = new BlockCouch("pine_couch", Material.WOOD);
            BOP_PINE_TABLE = new BlockTable("pine_table", Material.WOOD);
            
            BOP_REDWOOD_CHAIR = new BlockChair("redwood_chair", Material.WOOD);
            BOP_REDWOOD_COFFEE_TABLE = new BlockCoffeeTable("redwood_coffee_table", Material.WOOD);
            BOP_REDWOOD_COUCH = new BlockCouch("redwood_couch", Material.WOOD);
            BOP_REDWOOD_TABLE = new BlockTable("redwood_table", Material.WOOD);
            
            BOP_SACRED_OAK_CHAIR = new BlockChair("sacred_oak_chair", Material.WOOD);
            BOP_SACRED_OAK_COFFEE_TABLE = new BlockCoffeeTable("sacred_oak_coffee_table", Material.WOOD);
            BOP_SACRED_OAK_COUCH = new BlockCouch("sacred_oak_couch", Material.WOOD);
            BOP_SACRED_OAK_TABLE = new BlockTable("sacred_oak_table", Material.WOOD);
            
            BOP_UMBRAN_CHAIR = new BlockChair("umbran_chair", Material.WOOD);
            BOP_UMBRAN_COFFEE_TABLE = new BlockCoffeeTable("umbran_coffee_table", Material.WOOD);
            BOP_UMBRAN_COUCH = new BlockCouch("umbran_couch", Material.WOOD);
            BOP_UMBRAN_TABLE = new BlockTable("umbran_table", Material.WOOD);
            
            BOP_WILLOW_CHAIR = new BlockChair("willow_chair", Material.WOOD);
            BOP_WILLOW_COFFEE_TABLE = new BlockCoffeeTable("willow_coffee_table", Material.WOOD);
            BOP_WILLOW_COUCH = new BlockCouch("willow_couch", Material.WOOD);
            BOP_WILLOW_TABLE = new BlockTable("willow_table", Material.WOOD);
            
            BOP_BAMBOO_CHAIR = new BlockChair("bamboo_chair", Material.WOOD);
            BOP_BAMBOO_COFFEE_TABLE = new BlockCoffeeTable("bamboo_coffee_table", Material.WOOD);
            BOP_BAMBOO_COUCH = new BlockCouch("bamboo_couch", Material.WOOD);
            BOP_BAMBOO_TABLE = new BlockTable("bamboo_table", Material.WOOD);
            
            BOP_MUD_BRICK_CHAIR = new BlockChair("mud_brick_chair", Material.ROCK);
            BOP_MUD_BRICK_COFFEE_TABLE = new BlockCoffeeTable("mud_brick_coffee_table", Material.ROCK);
            BOP_MUD_BRICK_COUCH = new BlockCouch("mud_brick_couch", Material.ROCK);
            BOP_MUD_BRICK_TABLE = new BlockTable("mud_brick_table", Material.ROCK);
            
            BOP_WHITE_SANDSTONE_CHAIR = new BlockChair("white_sandstone_chair", Material.ROCK);
            BOP_WHITE_SANDSTONE_COFFEE_TABLE = new BlockCoffeeTable("white_sandstone_coffee_table", Material.ROCK);
            BOP_WHITE_SANDSTONE_COUCH = new BlockCouch("white_sandstone_couch", Material.ROCK);
            BOP_WHITE_SANDSTONE_TABLE = new BlockTable("white_sandstone_table", Material.ROCK);
            
            BOP_AMETHYST_CHAIR = new BlockChair("amethyst_chair", Material.ROCK);
            BOP_AMETHYST_COFFEE_TABLE = new BlockCoffeeTable("amethyst_coffee_table", Material.ROCK);
            BOP_AMETHYST_COUCH = new BlockCouch("amethyst_couch", Material.ROCK);
            BOP_AMETHYST_TABLE = new BlockTable("amethyst_table", Material.ROCK);
            
            BOP_RUBY_CHAIR = new BlockChair("ruby_chair", Material.ROCK);
            BOP_RUBY_COFFEE_TABLE = new BlockCoffeeTable("ruby_coffee_table", Material.ROCK);
            BOP_RUBY_COUCH = new BlockCouch("ruby_couch", Material.ROCK);
            BOP_RUBY_TABLE = new BlockTable("ruby_table", Material.ROCK);
            
            BOP_PERIDOT_CHAIR = new BlockChair("peridot_chair", Material.ROCK);
            BOP_PERIDOT_COFFEE_TABLE = new BlockCoffeeTable("peridot_coffee_table", Material.ROCK);
            BOP_PERIDOT_COUCH = new BlockCouch("peridot_couch", Material.ROCK);
            BOP_PERIDOT_TABLE = new BlockTable("peridot_table", Material.ROCK);
            
            BOP_TOPAZ_CHAIR = new BlockChair("topaz_chair", Material.ROCK);
            BOP_TOPAZ_COFFEE_TABLE = new BlockCoffeeTable("topaz_coffee_table", Material.ROCK);
            BOP_TOPAZ_COUCH = new BlockCouch("topaz_couch", Material.ROCK);
            BOP_TOPAZ_TABLE = new BlockTable("topaz_table", Material.ROCK);
            
            BOP_TANZANITE_CHAIR = new BlockChair("tanzanite_chair", Material.ROCK);
            BOP_TANZANITE_COFFEE_TABLE = new BlockCoffeeTable("tanzanite_coffee_table", Material.ROCK);
            BOP_TANZANITE_COUCH = new BlockCouch("tanzanite_couch", Material.ROCK);
            BOP_TANZANITE_TABLE = new BlockTable("tanzanite_table", Material.ROCK);
            
            BOP_MALACHITE_CHAIR = new BlockChair("malachite_chair", Material.ROCK);
            BOP_MALACHITE_COFFEE_TABLE = new BlockCoffeeTable("malachite_coffee_table", Material.ROCK);
            BOP_MALACHITE_COUCH = new BlockCouch("malachite_couch", Material.ROCK);
            BOP_MALACHITE_TABLE = new BlockTable("malachite_table", Material.ROCK);
            
            BOP_SAPPHIRE_CHAIR = new BlockChair("sapphire_chair", Material.ROCK);
            BOP_SAPPHIRE_COFFEE_TABLE = new BlockCoffeeTable("sapphire_coffee_table", Material.ROCK);
            BOP_SAPPHIRE_COUCH = new BlockCouch("sapphire_couch", Material.ROCK);
            BOP_SAPPHIRE_TABLE = new BlockTable("sapphire_table", Material.ROCK);
            
            BOP_AMBER_CHAIR = new BlockChair("amber_chair", Material.ROCK);
            BOP_AMBER_COFFEE_TABLE = new BlockCoffeeTable("amber_coffee_table", Material.ROCK);
            BOP_AMBER_COUCH = new BlockCouch("amber_couch", Material.ROCK);
            BOP_AMBER_TABLE = new BlockTable("amber_table", Material.ROCK);
            
            BOP_FLESH_CHAIR = new BlockChair("flesh_chair", Material.SPONGE);
            BOP_FLESH_COFFEE_TABLE = new BlockCoffeeTable("flesh_coffee_table", Material.SPONGE);
            BOP_FLESH_COUCH = new BlockCouch("flesh_couch", Material.SPONGE);
            BOP_FLESH_TABLE = new BlockTable("flesh_table", Material.SPONGE);
            
            Furnish.getProxy().registerBlock(event, BOP_CHERRY_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_CHERRY_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_CHERRY_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_CHERRY_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_EBONY_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_EBONY_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_EBONY_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_EBONY_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_ETHEREAL_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_ETHEREAL_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_ETHEREAL_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_ETHEREAL_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_EUCALYPTUS_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_EUCALYPTUS_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_EUCALYPTUS_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_EUCALYPTUS_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_FIR_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_FIR_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_FIR_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_FIR_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_HELLBARK_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_HELLBARK_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_HELLBARK_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_HELLBARK_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_JACARANDA_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_JACARANDA_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_JACARANDA_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_JACARANDA_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_MAGIC_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_MAGIC_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_MAGIC_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_MAGIC_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_MAHOGANY_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_MAHOGANY_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_MAHOGANY_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_MAHOGANY_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_MANGROVE_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_MANGROVE_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_MANGROVE_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_MANGROVE_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_PALM_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_PALM_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_PALM_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_PALM_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_PINE_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_PINE_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_PINE_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_PINE_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_REDWOOD_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_REDWOOD_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_REDWOOD_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_REDWOOD_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_SACRED_OAK_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_SACRED_OAK_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_SACRED_OAK_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_SACRED_OAK_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_UMBRAN_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_UMBRAN_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_UMBRAN_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_UMBRAN_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_WILLOW_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_WILLOW_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_WILLOW_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_WILLOW_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_BAMBOO_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_BAMBOO_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_BAMBOO_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_BAMBOO_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_MUD_BRICK_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_MUD_BRICK_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_MUD_BRICK_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_MUD_BRICK_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_WHITE_SANDSTONE_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_WHITE_SANDSTONE_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_WHITE_SANDSTONE_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_WHITE_SANDSTONE_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_AMETHYST_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_AMETHYST_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_AMETHYST_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_AMETHYST_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_RUBY_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_RUBY_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_RUBY_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_RUBY_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_PERIDOT_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_PERIDOT_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_PERIDOT_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_PERIDOT_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_TOPAZ_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_TOPAZ_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_TOPAZ_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_TOPAZ_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_TANZANITE_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_TANZANITE_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_TANZANITE_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_TANZANITE_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_MALACHITE_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_MALACHITE_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_MALACHITE_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_MALACHITE_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_SAPPHIRE_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_SAPPHIRE_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_SAPPHIRE_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_SAPPHIRE_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_AMBER_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_AMBER_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_AMBER_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_AMBER_TABLE);
            
            Furnish.getProxy().registerBlock(event, BOP_FLESH_CHAIR);
            Furnish.getProxy().registerBlock(event, BOP_FLESH_COFFEE_TABLE);
            Furnish.getProxy().registerBlock(event, BOP_FLESH_COUCH);
            Furnish.getProxy().registerBlock(event, BOP_FLESH_TABLE);
        }
    }
}
