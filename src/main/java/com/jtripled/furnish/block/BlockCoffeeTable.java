package com.jtripled.furnish.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 *
 * @author jtripled
 */
public class BlockCoffeeTable extends BlockTable
{
    public static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0d, 0.0d, 0.0d, 1.0d, 0.5625d, 1.0d);
    
    public BlockCoffeeTable(String name, Material material)
    {
        super(name, material);
    }
    
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return BOUNDING_BOX;
    }
    
    @Override
    public boolean canConnect(IBlockAccess world, IBlockState state, IBlockState otherState)
    {
        return otherState.getBlock() instanceof BlockCoffeeTable;
    }
}
