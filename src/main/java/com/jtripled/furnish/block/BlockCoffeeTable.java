package com.jtripled.furnish.block;

import com.jtripled.voxen.block.BlockBase;
import com.jtripled.voxen.block.IBlockConnect;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;

/**
 *
 * @author jtripled
 */
public class BlockCoffeeTable extends BlockBase implements IBlockConnect.Horizontal
{
    public BlockCoffeeTable(String name, Material material)
    {
        super(name, material);
        this.setTab(CreativeTabs.DECORATIONS);
        this.setItem();
        this.setFullCube(false);
        this.setOpaque(false);
        this.setBoundingBox(0.0d, 0.0d, 0.0d, 1.0d, 0.5625d, 1.0d);
    }
    
    @Override
    public boolean canConnect(IBlockState state, IBlockAccess world, IBlockState otherState, EnumFacing face)
    {
        return otherState.getBlock() instanceof BlockCoffeeTable;
    }
}
