package com.jtripled.furnish.block;

import com.jtripled.voxen.block.BlockBase;
import com.jtripled.voxen.block.IBlockFacing;
import com.jtripled.voxen.block.IBlockSittable;
import com.jtripled.voxen.block.IBlockSittable.EntitySittableBlock;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import static net.minecraft.util.EnumFacing.NORTH;
import static net.minecraft.util.EnumFacing.SOUTH;
import static net.minecraft.util.EnumFacing.WEST;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 *
 * @author jtripled
 */
public class BlockChair extends BlockBase implements IBlockSittable, IBlockFacing.Horizontal
{
    private static final AxisAlignedBB BB_NORTH = new AxisAlignedBB(0.0625d, 0.625d, 0.0625d, 0.9375d, 1.25d,  0.1875d);
    private static final AxisAlignedBB BB_EAST =  new AxisAlignedBB(0.8750d, 0.625d, 0.0625d, 0.9375d, 1.25d,  0.9375d);
    private static final AxisAlignedBB BB_SOUTH = new AxisAlignedBB(0.0625d, 0.625d, 0.8125d, 0.9375d, 1.25d,  0.9375d);
    private static final AxisAlignedBB BB_WEST =  new AxisAlignedBB(0.0625d, 0.625d, 0.0625d, 0.1875d, 1.25d,  0.9375d);
    
    public BlockChair(String name, Material material)
    {
        super(name, material);
        this.setTab(CreativeTabs.DECORATIONS);
        this.setItem();
        this.setFullCube(false);
        this.setOpaque(false);
        this.setBoundingBox(0.0625d, 0.0d, 0.0625d, 0.9375d, 0.625d, 0.9375d);
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
            switch(state.getValue(FACING)) 
            {
                case NORTH: Block.addCollisionBoxToList(pos, entityBox, collidingBoxes, BB_NORTH); break;
                case SOUTH: Block.addCollisionBoxToList(pos, entityBox, collidingBoxes, BB_SOUTH); break;
                case WEST: Block.addCollisionBoxToList(pos, entityBox, collidingBoxes, BB_WEST); break;
                default: Block.addCollisionBoxToList(pos, entityBox, collidingBoxes, BB_EAST); break;
            }
        }
    }
}
