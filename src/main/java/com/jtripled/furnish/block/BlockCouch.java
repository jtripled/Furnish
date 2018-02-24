package com.jtripled.furnish.block;

import com.jtripled.voxen.block.BlockBase;
import com.jtripled.voxen.block.IBlockFacing;
import com.jtripled.voxen.block.IBlockSittable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 *
 * @author jtripled
 */
public class BlockCouch extends BlockBase implements IBlockSittable, IBlockFacing.Horizontal
{
    public BlockCouch(String name, Material material)
    {
        super(name, material);
        this.setTab(CreativeTabs.DECORATIONS);
        this.setItem();
        this.setFullCube(false);
        this.setOpaque(false);
    }

    @Override
    public double getSeatHeight(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return 0.4375d;
    }

    /*@Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {TYPE, FACING});
    }
    
    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return state.withProperty(TYPE, getType(state, world, pos));
    }
    
    public static BlockCouch.Type getType(IBlockState p_185706_0_, IBlockAccess p_185706_1_, BlockPos p_185706_2_)
    {
        EnumFacing enumfacing = (EnumFacing)p_185706_0_.getValue(FACING);
        IBlockState iblockstate = p_185706_1_.getBlockState(p_185706_2_.offset(enumfacing));

        if (isBlockCouch(iblockstate))
        {
            EnumFacing enumfacing1 = (EnumFacing)iblockstate.getValue(FACING);

            if (enumfacing1.getAxis() != ((EnumFacing)p_185706_0_.getValue(FACING)).getAxis() && isDifferentCouch(p_185706_0_, p_185706_1_, p_185706_2_, enumfacing1.getOpposite()))
            {
                if (enumfacing1 == enumfacing.rotateYCCW())
                {
                    return BlockCouch.Type.CORNER_LEFT;
                }

                return BlockCouch.Type.CORNER_RIGHT;
            }
        }

        IBlockState iblockstate1 = p_185706_1_.getBlockState(p_185706_2_.offset(enumfacing.getOpposite()));

        if (isBlockCouch(iblockstate1))
        {
            EnumFacing enumfacing2 = (EnumFacing)iblockstate1.getValue(FACING);

            if (enumfacing2.getAxis() != ((EnumFacing)p_185706_0_.getValue(FACING)).getAxis() && isDifferentCouch(p_185706_0_, p_185706_1_, p_185706_2_, enumfacing2))
            {
                if (enumfacing2 == enumfacing.rotateYCCW())
                {
                    return BlockCouch.Type.CORNER_LEFT;
                }

                return BlockCouch.Type.CORNER_RIGHT;
            }
        }
        
        if (p_185706_1_.getBlockState(p_185706_2_.offset(enumfacing.rotateY())).getBlock() instanceof BlockCouch)
            if (p_185706_1_.getBlockState(p_185706_2_.offset(enumfacing.rotateYCCW())).getBlock() instanceof BlockCouch)
                return BlockCouch.Type.CENTER;
            else
                return BlockCouch.Type.LEFT;
        
        if (p_185706_1_.getBlockState(p_185706_2_.offset(enumfacing.rotateYCCW())).getBlock() instanceof BlockCouch)
            return BlockCouch.Type.RIGHT;
        
        return BlockCouch.Type.NONE;
    }

    private static boolean isDifferentCouch(IBlockState p_185704_0_, IBlockAccess p_185704_1_, BlockPos p_185704_2_, EnumFacing p_185704_3_)
    {
        IBlockState iblockstate = p_185704_1_.getBlockState(p_185704_2_.offset(p_185704_3_));
        return !isBlockCouch(iblockstate) || iblockstate.getValue(FACING) != p_185704_0_.getValue(FACING);
    }

    public static boolean isBlockCouch(IBlockState state)
    {
        return state.getBlock() instanceof BlockCouch;
    }
    
    public static enum Type implements IStringSerializable
    {
        NONE("none"),
        CENTER("center"),
        LEFT("left"),
        RIGHT("right"),
        CORNER_LEFT("corner_left"),
        CORNER_RIGHT("corner_right");
        
        private final String name;
        
        private Type(String name)
        {
            this.name = name;
        }
        
        @Override
        public String getName()
        {
            return this.name;
        }
    }*/
}
