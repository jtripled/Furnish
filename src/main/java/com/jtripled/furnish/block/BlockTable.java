package com.jtripled.furnish.block;

import com.jtripled.voxen.block.BlockBase;
import com.jtripled.voxen.block.IBlockConnectable;
import com.jtripled.voxen.util.Tab;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 *
 * @author jtripled
 */
public class BlockTable extends BlockBase implements IBlockConnectable.Horizontal
{
    public BlockTable(String name, Material material)
    {
        super(name, material);
        this.setTab(Tab.DECORATION);
        this.setItem();
        this.setFullCube(false);
        this.setOpaque(false);
        this.setBoundingBox(0.0d, 0.875d, 0.0d, 1.0d, 1.0d, 1.0d);
    }

    @Override
    public boolean canConnect(BlockPos pos, IBlockState state, IBlockAccess world, BlockPos otherPos, IBlockState otherState, EnumFacing face)
    {
        return otherState.getBlock() instanceof BlockTable;
    }
}
