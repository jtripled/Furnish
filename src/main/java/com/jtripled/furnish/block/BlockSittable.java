package com.jtripled.furnish.block;

import com.jtripled.furnish.Furnish;
import com.jtripled.furnish.util.SittableUtil;
import com.jtripled.voxen.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 *
 * @author jtripled
 */
public abstract class BlockSittable extends BlockHorizontal
{
    public BlockSittable(String name, Material material)
    {
        super(Furnish.INSTANCE, name, material);
    }
    
    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (SittableUtil.sitOnBlock(world, pos.getX(), pos.getY(), pos.getZ(), player, getSeatHeight()))
        {
            world.updateComparatorOutputLevel(pos, this);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean hasComparatorInputOverride(IBlockState state)
    {
        return true;
    }
    
    @Override
    public int getComparatorInputOverride(IBlockState state, World world, BlockPos pos)
    {
        return SittableUtil.isSomeoneSitting(world, pos.getX(), pos.getY(), pos.getZ()) ? 1 : 0;
    }
    
    public abstract double getSeatHeight();
}
