package com.jtripled.furnish.block;

import com.jtripled.furnish.Furnish;
import static com.jtripled.furnish.block.BlockChair.BOUNDING_BOX;
import com.jtripled.voxen.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 *
 * @author jtripled
 */
public class BlockCouch extends BlockHorizontal
{
    public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");
    
    public BlockCouch(String name, Material material)
    {
        super(Furnish.INSTANCE, name, material);
        this.setDefaultState(this.blockState.getBaseState().withProperty(NORTH, false).withProperty(EAST, false).withProperty(SOUTH, false).withProperty(WEST, false));
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
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {NORTH, EAST, SOUTH, WEST});
    }
    
    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState();
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return 0;
    }
    
    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return state.withProperty(NORTH, world.getBlockState(pos.north()).getBlock() instanceof BlockCouch)
             .withProperty(EAST, world.getBlockState(pos.east()).getBlock() instanceof BlockCouch)
             .withProperty(SOUTH, world.getBlockState(pos.south()).getBlock() instanceof BlockCouch)
             .withProperty(WEST, world.getBlockState(pos.west()).getBlock() instanceof BlockCouch);
    }
}
