package com.jtripled.furnish.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 *
 * @author jtripled
 */
public class BlockCounter extends BlockTable
{
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    
    public BlockCounter(String name, Material material)
    {
        super(name, material);
        this.setDefaultState(this.getDefaultState().withProperty(FACING, EnumFacing.NORTH));
    }
    
    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        IBlockState state = this.getDefaultState();
        state = state.withProperty(FACING, placer.getHorizontalFacing());
        return state;
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {FACING, BlockTable.NORTH, BlockTable.EAST, BlockTable.SOUTH, BlockTable.WEST});
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getFront(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((EnumFacing) state.getValue(FACING)).getIndex();
    }
    
    @Override
    public boolean canConnect(IBlockAccess world, IBlockState state, IBlockState otherState)
    {
        return otherState.getBlock() instanceof BlockCounter;
    }
}
