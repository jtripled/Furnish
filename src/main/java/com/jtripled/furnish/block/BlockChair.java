package com.jtripled.furnish.block;

import com.jtripled.voxen.block.BlockBase;
import com.jtripled.voxen.block.IBlockFaceable;
import com.jtripled.voxen.block.IBlockSittable;
import com.jtripled.voxen.block.IBlockSittable.EntitySittableBlock;
import com.jtripled.voxen.util.Tab;
import java.util.List;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 *
 * @author jtripled
 */
public class BlockChair extends BlockBase implements IBlockSittable, IBlockFaceable.Horizontal
{
    public BlockChair(String name, Material material)
    {
        super(name, material);
        this.setTab(Tab.DECORATION);
        this.setItem();
        this.setFullCube(false);
        this.setOpaque(false);
        this.setBoundingBox(0.0625d, 0.0d, 0.0625d, 0.9375d, 0.625d, 0.9375d);
        this.addCollisionBox(0.0625d, 0.625d, 0.0625d, 0.9375d, 1.25d, 0.1875d, (IBlockState state, IBlockAccess world, BlockPos pos) -> { return this.isFacingNorth(state); });
        this.addCollisionBox(0.8750d, 0.625d, 0.0625d, 0.9375d, 1.25d, 0.9375d, (IBlockState state, IBlockAccess world, BlockPos pos) -> { return this.isFacingEast(state); });
        this.addCollisionBox(0.0625d, 0.625d, 0.8125d, 0.9375d, 1.25d, 0.9375d, (IBlockState state, IBlockAccess world, BlockPos pos) -> { return this.isFacingSouth(state); });
        this.addCollisionBox(0.0625d, 0.625d, 0.0625d, 0.1875d, 1.25d, 0.9375d, (IBlockState state, IBlockAccess world, BlockPos pos) -> { return this.isFacingWest(state); });
    }

    @Override
    public double getSeatHeight(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return 0.4375d;
    }
    
    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185477_7_) 
    {
        if (!(entityIn instanceof EntitySittableBlock))
        {
            super.addCollisionBoxToList(state, worldIn, pos, entityBox, collidingBoxes, entityIn, p_185477_7_);
        }
    }
}
