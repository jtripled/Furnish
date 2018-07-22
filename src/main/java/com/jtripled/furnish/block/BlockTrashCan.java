package com.jtripled.furnish.block;

import com.jtripled.furnish.Furnish;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 *
 * @author jtripled
 */
public final class BlockTrashCan extends Block
{
    public BlockTrashCan()
    {
        super(Material.IRON);
        this.setUnlocalizedName("trash_can");
        this.setRegistryName(Furnish.ID, "trash_can");
    }
}
