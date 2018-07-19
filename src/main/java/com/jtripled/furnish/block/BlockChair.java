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
public final class BlockChair extends Block
{
    private static final AxisAlignedBB BOX = new AxisAlignedBB(0.0625d, 0.0d, 0.0625d, 0.9375d, 0.625d, 0.9375d);
    
    public static final PropertyDirection FACING = PropertyDirection.create("facing", (EnumFacing face) -> { return face != EnumFacing.UP && face != EnumFacing.DOWN; });
    
    private final Item item;
    
    public BlockChair(String name, Material material)
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
}
