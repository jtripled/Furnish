package com.jtripled.furnish;

import com.jtripled.furnish.block.BlockChair;
import com.jtripled.furnish.block.BlockCoffeeTable;
import com.jtripled.furnish.block.BlockCouch;
import com.jtripled.furnish.block.BlockSimpleTable;
import com.jtripled.voxen.block.IBlockBase;
import com.jtripled.voxen.mod.RegistrationHandler;
import com.jtripled.voxen.mod.Registry;
import net.minecraft.block.material.Material;

/**
 *
 * @author jtripled
 */
public class FurnishRegistry implements Registry
{
    public static final IBlockBase ACACIA_TABLE = new BlockSimpleTable("acacia_table", Material.WOOD);
    public static final IBlockBase BIRCH_TABLE = new BlockSimpleTable("birch_table", Material.WOOD);
    public static final IBlockBase BRICK_TABLE = new BlockSimpleTable("brick_table", Material.ROCK);
    public static final IBlockBase COBBLESTONE_TABLE = new BlockSimpleTable("cobblestone_table", Material.ROCK);
    public static final IBlockBase DARK_OAK_TABLE = new BlockSimpleTable("dark_oak_table", Material.WOOD);
    public static final IBlockBase JUNGLE_TABLE = new BlockSimpleTable("jungle_table", Material.WOOD);
    public static final IBlockBase NETHER_BRICK_TABLE = new BlockSimpleTable("nether_brick_table", Material.ROCK);
    public static final IBlockBase OAK_TABLE = new BlockSimpleTable("oak_table", Material.WOOD);
    public static final IBlockBase PURPUR_TABLE = new BlockSimpleTable("purpur_table", Material.ROCK);
    public static final IBlockBase QUARTZ_TABLE = new BlockSimpleTable("quartz_table", Material.ROCK);
    public static final IBlockBase RED_SANDSTONE_TABLE = new BlockSimpleTable("red_sandstone_table", Material.ROCK);
    public static final IBlockBase SANDSTONE_TABLE = new BlockSimpleTable("sandstone_table", Material.ROCK);
    public static final IBlockBase SPRUCE_TABLE = new BlockSimpleTable("spruce_table", Material.WOOD);
    public static final IBlockBase STONE_BRICK_TABLE = new BlockSimpleTable("stone_brick_table", Material.ROCK);
    
    public static final IBlockBase ACACIA_COFFEE_TABLE = new BlockCoffeeTable("acacia_coffee_table", Material.WOOD);
    public static final IBlockBase BIRCH_COFFEE_TABLE = new BlockCoffeeTable("birch_coffee_table", Material.WOOD);
    public static final IBlockBase BRICK_COFFEE_TABLE = new BlockCoffeeTable("brick_coffee_table", Material.ROCK);
    public static final IBlockBase COBBLESTONE_COFFEE_TABLE = new BlockCoffeeTable("cobblestone_coffee_table", Material.ROCK);
    public static final IBlockBase DARK_OAK_COFFEE_TABLE = new BlockCoffeeTable("dark_oak_coffee_table", Material.WOOD);
    public static final IBlockBase JUNGLE_COFFEE_TABLE = new BlockCoffeeTable("jungle_coffee_table", Material.WOOD);
    public static final IBlockBase NETHER_BRICK_COFFEE_TABLE = new BlockCoffeeTable("nether_brick_coffee_table", Material.ROCK);
    public static final IBlockBase OAK_COFFEE_TABLE = new BlockCoffeeTable("oak_coffee_table", Material.WOOD);
    public static final IBlockBase PURPUR_COFFEE_TABLE = new BlockCoffeeTable("purpur_coffee_table", Material.ROCK);
    public static final IBlockBase QUARTZ_COFFEE_TABLE = new BlockCoffeeTable("quartz_coffee_table", Material.ROCK);
    public static final IBlockBase RED_SANDSTONE_COFFEE_TABLE = new BlockCoffeeTable("red_sandstone_coffee_table", Material.ROCK);
    public static final IBlockBase SANDSTONE_COFFEE_TABLE = new BlockCoffeeTable("sandstone_coffee_table", Material.ROCK);
    public static final IBlockBase SPRUCE_COFFEE_TABLE = new BlockCoffeeTable("spruce_coffee_table", Material.WOOD);
    public static final IBlockBase STONE_BRICK_COFFEE_TABLE = new BlockCoffeeTable("stone_brick_coffee_table", Material.ROCK);
    
    public static final IBlockBase ACACIA_CHAIR = new BlockChair("acacia_chair", Material.WOOD);
    public static final IBlockBase BIRCH_CHAIR = new BlockChair("birch_chair", Material.WOOD);
    public static final IBlockBase BRICK_CHAIR = new BlockChair("brick_chair", Material.ROCK);
    public static final IBlockBase COBBLESTONE_CHAIR = new BlockChair("cobblestone_chair", Material.ROCK);
    public static final IBlockBase DARK_OAK_CHAIR = new BlockChair("dark_oak_chair", Material.WOOD);
    public static final IBlockBase JUNGLE_CHAIR = new BlockChair("jungle_chair", Material.WOOD);
    public static final IBlockBase NETHER_BRICK_CHAIR = new BlockChair("nether_brick_chair", Material.ROCK);
    public static final IBlockBase OAK_CHAIR = new BlockChair("oak_chair", Material.WOOD);
    public static final IBlockBase PURPUR_CHAIR = new BlockChair("purpur_chair", Material.ROCK);
    public static final IBlockBase QUARTZ_CHAIR = new BlockChair("quartz_chair", Material.ROCK);
    public static final IBlockBase RED_SANDSTONE_CHAIR = new BlockChair("red_sandstone_chair", Material.ROCK);
    public static final IBlockBase SANDSTONE_CHAIR = new BlockChair("sandstone_chair", Material.ROCK);
    public static final IBlockBase SPRUCE_CHAIR = new BlockChair("spruce_chair", Material.WOOD);
    public static final IBlockBase STONE_BRICK_CHAIR = new BlockChair("stone_brick_chair", Material.ROCK);
    
    public static final IBlockBase ACACIA_COUCH = new BlockCouch("acacia_couch", Material.WOOD);
    public static final IBlockBase BIRCH_COUCH = new BlockCouch("birch_couch", Material.WOOD);
    public static final IBlockBase BRICK_COUCH = new BlockCouch("brick_couch", Material.ROCK);
    public static final IBlockBase COBBLESTONE_COUCH = new BlockCouch("cobblestone_couch", Material.ROCK);
    public static final IBlockBase DARK_OAK_COUCH = new BlockCouch("dark_oak_couch", Material.WOOD);
    public static final IBlockBase JUNGLE_COUCH = new BlockCouch("jungle_couch", Material.WOOD);
    public static final IBlockBase NETHER_BRICK_COUCH = new BlockCouch("nether_brick_couch", Material.ROCK);
    public static final IBlockBase OAK_COUCH = new BlockCouch("oak_couch", Material.WOOD);
    public static final IBlockBase PURPUR_COUCH = new BlockCouch("purpur_couch", Material.ROCK);
    public static final IBlockBase QUARTZ_COUCH = new BlockCouch("quartz_couch", Material.ROCK);
    public static final IBlockBase RED_SANDSTONE_COUCH = new BlockCouch("red_sandstone_couch", Material.ROCK);
    public static final IBlockBase SANDSTONE_COUCH = new BlockCouch("sandstone_couch", Material.ROCK);
    public static final IBlockBase SPRUCE_COUCH = new BlockCouch("spruce_couch", Material.WOOD);
    public static final IBlockBase STONE_BRICK_COUCH = new BlockCouch("stone_brick_couch", Material.ROCK);
    
    @Override
    public void onRegisterBlocks(RegistrationHandler handler)
    {
        handler.registerBlock(ACACIA_TABLE);
        handler.registerBlock(BIRCH_TABLE);
        handler.registerBlock(BRICK_TABLE);
        handler.registerBlock(COBBLESTONE_TABLE);
        handler.registerBlock(DARK_OAK_TABLE);
        handler.registerBlock(JUNGLE_TABLE);
        handler.registerBlock(NETHER_BRICK_TABLE);
        handler.registerBlock(OAK_TABLE);
        handler.registerBlock(PURPUR_TABLE);
        handler.registerBlock(QUARTZ_TABLE);
        handler.registerBlock(RED_SANDSTONE_TABLE);
        handler.registerBlock(SANDSTONE_TABLE);
        handler.registerBlock(SPRUCE_TABLE);
        handler.registerBlock(STONE_BRICK_TABLE);
        
        handler.registerBlock(ACACIA_COFFEE_TABLE);
        handler.registerBlock(BIRCH_COFFEE_TABLE);
        handler.registerBlock(BRICK_COFFEE_TABLE);
        handler.registerBlock(COBBLESTONE_COFFEE_TABLE);
        handler.registerBlock(DARK_OAK_COFFEE_TABLE);
        handler.registerBlock(JUNGLE_COFFEE_TABLE);
        handler.registerBlock(NETHER_BRICK_COFFEE_TABLE);
        handler.registerBlock(OAK_COFFEE_TABLE);
        handler.registerBlock(PURPUR_COFFEE_TABLE);
        handler.registerBlock(QUARTZ_COFFEE_TABLE);
        handler.registerBlock(RED_SANDSTONE_COFFEE_TABLE);
        handler.registerBlock(SANDSTONE_COFFEE_TABLE);
        handler.registerBlock(SPRUCE_COFFEE_TABLE);
        handler.registerBlock(STONE_BRICK_COFFEE_TABLE);
        
        handler.registerBlock(ACACIA_CHAIR);
        handler.registerBlock(BIRCH_CHAIR);
        handler.registerBlock(BRICK_CHAIR);
        handler.registerBlock(COBBLESTONE_CHAIR);
        handler.registerBlock(DARK_OAK_CHAIR);
        handler.registerBlock(JUNGLE_CHAIR);
        handler.registerBlock(NETHER_BRICK_CHAIR);
        handler.registerBlock(OAK_CHAIR);
        handler.registerBlock(PURPUR_CHAIR);
        handler.registerBlock(QUARTZ_CHAIR);
        handler.registerBlock(RED_SANDSTONE_CHAIR);
        handler.registerBlock(SANDSTONE_CHAIR);
        handler.registerBlock(SPRUCE_CHAIR);
        handler.registerBlock(STONE_BRICK_CHAIR);
        
        handler.registerBlock(ACACIA_COUCH);
        handler.registerBlock(BIRCH_COUCH);
        handler.registerBlock(BRICK_COUCH);
        handler.registerBlock(COBBLESTONE_COUCH);
        handler.registerBlock(DARK_OAK_COUCH);
        handler.registerBlock(JUNGLE_COUCH);
        handler.registerBlock(NETHER_BRICK_COUCH);
        handler.registerBlock(OAK_COUCH);
        handler.registerBlock(PURPUR_COUCH);
        handler.registerBlock(QUARTZ_COUCH);
        handler.registerBlock(RED_SANDSTONE_COUCH);
        handler.registerBlock(SANDSTONE_COUCH);
        handler.registerBlock(SPRUCE_COUCH);
        handler.registerBlock(STONE_BRICK_COUCH);
    }
}
