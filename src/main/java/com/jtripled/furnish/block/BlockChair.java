package com.jtripled.furnish.block;

import com.jtripled.furnish.Furnish;
import com.jtripled.furnish.util.SittableUtil;
import com.jtripled.voxen.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 *
 * @author jtripled
 */
public class BlockChair extends BlockBase
{
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    
    public static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.1d, 0.0d, 0.1d, 0.9d, 1.2d, 0.9d);
    
    public BlockChair(String name, Material material)
    {
        super(Furnish.INSTANCE, name, material);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
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
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        IBlockState state = this.getDefaultState();
        state = state.withProperty(FACING, placer.getHorizontalFacing());
        return state;
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
        return ((EnumFacing) state.getValue(FACING)).getIndex();
    }
    
    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (SittableUtil.sitOnBlock(world, pos.getX(), pos.getY(), pos.getZ(), player, 0.4375d))
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
}