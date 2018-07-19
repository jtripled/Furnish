package com.jtripled.furnish.block;

import com.jtripled.furnish.Furnish;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 *
 * @author jtripled
 */
public final class BlockCouch extends Block
{
    private static final AxisAlignedBB BOX = new AxisAlignedBB(0.0625d, 0.0d, 0.0625d, 0.9375d, 0.625d, 0.9375d);
    
    public static final PropertyDirection FACING = PropertyDirection.create("facing", (EnumFacing face) -> { return face != EnumFacing.UP && face != EnumFacing.DOWN; });
    
    private final Item item;
    
    public BlockCouch(String name, Material material)
    {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(new ResourceLocation(Furnish.ID, name));
        this.setCreativeTab(CreativeTabs.DECORATIONS);
        this.setDefaultState(this.getDefaultState().withProperty(FACING, EnumFacing.NORTH));
        this.item = new ItemBlock(this).setUnlocalizedName(this.getUnlocalizedName()).setRegistryName(this.getRegistryName());
    }
    
    public Item getItem()
    {
        return item;
    }
    
    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing());
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {FACING});
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getFront(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return state.getValue(FACING).getIndex();
    }
    
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return BOX;
    }
    
    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
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
