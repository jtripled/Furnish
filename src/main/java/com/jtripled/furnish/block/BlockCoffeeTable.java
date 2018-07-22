package com.jtripled.furnish.block;

import com.jtripled.furnish.Furnish;
import net.minecraft.block.Block;
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
public final class BlockCoffeeTable extends Block
{
    private static final AxisAlignedBB BOX = new AxisAlignedBB(0.0d, 0.4375d, 0.0d, 1.0d, 0.5625d, 1.0d);
    
    public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");

    public BlockCoffeeTable(String name, Material material)
    {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(Furnish.ID, name);
        this.setCreativeTab(CreativeTabs.DECORATIONS);
        this.setDefaultState(this.getDefaultState().withProperty(NORTH, false).withProperty(EAST, false).withProperty(SOUTH, false).withProperty(WEST, false));
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
        return state.withProperty(NORTH, canConnect(world.getBlockState(pos.north())))
                    .withProperty(EAST,  canConnect(world.getBlockState(pos.east())))
                    .withProperty(SOUTH, canConnect(world.getBlockState(pos.south())))
                    .withProperty(WEST,  canConnect(world.getBlockState(pos.west())));
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
    
    public static boolean canConnect(IBlockState otherState)
    {
        return otherState.getBlock() instanceof BlockCoffeeTable;
    }
}