package com.jtripled.furnish.block;

import com.jtripled.voxen.block.BlockSittableHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 *
 * @author jtripled
 */
public class BlockChair extends BlockSittableHorizontal
{
    public BlockChair(String name, Material material)
    {
        super(name, material);
        this.setTab(CreativeTabs.DECORATIONS);
        this.setItem();
        this.setFullCube(false);
        this.setOpaque(false);
        this.setBoundingBox(0.0625d, 0.0d, 0.0625d, 0.9375d, 1.25d, 0.9375d);
        this.setSeatHeight(0.4375d);
    }
    
    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        return false;
    }
}
