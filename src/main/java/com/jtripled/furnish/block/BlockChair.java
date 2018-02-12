package com.jtripled.furnish.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 *
 * @author jtripled
 */
public class BlockChair extends BlockSittable
{
    public static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0625d, 0.0d, 0.0625d, 0.9375d, 1.25d, 0.9375d);
    public static final double SEAT_HEIGHT = 0.4375d;
    
    public BlockChair(String name, Material material)
    {
        super(name, material);
        this.setTab(CreativeTabs.DECORATIONS);
        this.setItem();
        this.setFullCube(false);
        this.setOpaque(false);
    }
    
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return BOUNDING_BOX;
    }

    @Override
    public double getSeatHeight()
    {
        return SEAT_HEIGHT;
    }
}
