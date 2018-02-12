package com.jtripled.furnish.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.IBlockAccess;

/**
 *
 * @author jtripled
 */
public class BlockSimpleTable extends BlockTable
{
    public BlockSimpleTable(String name, Material material)
    {
        super(name, material);
    }
    
    @Override
    public boolean canConnect(IBlockAccess world, IBlockState state, IBlockState otherState)
    {
        return otherState.getBlock() instanceof BlockSimpleTable;
    }
}
