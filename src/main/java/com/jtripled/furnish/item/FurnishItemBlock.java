package com.jtripled.furnish.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

/**
 *
 * @author jtripled
 */
public class FurnishItemBlock extends ItemBlock
{
    public FurnishItemBlock(Block block)
    {
        super(block);
        this.setUnlocalizedName(block.getUnlocalizedName());
        this.setRegistryName(block.getRegistryName());
    }
}
