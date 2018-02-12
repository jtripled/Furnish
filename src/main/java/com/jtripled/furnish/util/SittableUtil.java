package com.jtripled.furnish.util;

import com.jtripled.furnish.entity.EntitySittableBlock;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

/**
 *
 * @author jtripled
 */
public class SittableUtil
{
    public static boolean sitOnBlock(World world, double x, double y, double z, EntityPlayer player, double height)
    {
        if (!checkForExistingEntity(world, x, y, z, player))
        {
            EntitySittableBlock seat = new EntitySittableBlock(world, x, y, z, height);
            world.spawnEntity(seat);
            player.startRiding(seat);
        }
        return true;
    }

    public static boolean sitOnBlockWithRotationOffset(World world, double x, double y, double z, EntityPlayer player, double height, int metadata, double offset)
    {
        if ((!checkForExistingEntity(world, x, y, z, player)) && (!world.isRemote))
        {
            EntitySittableBlock seat = new EntitySittableBlock(world, x, y, z, height, metadata, offset);
            world.spawnEntity(seat);
            player.startRiding(seat);
        }
        return true;
    }

    public static boolean checkForExistingEntity(World world, double x, double y, double z, EntityPlayer player)
    {
        List<EntitySittableBlock> listEMB = world.getEntitiesWithinAABB(EntitySittableBlock.class, new AxisAlignedBB(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D).expand(1.0D, 1.0D, 1.0D));
        for (EntitySittableBlock mount : listEMB) {
            if ((mount.blockPosX == x) && (mount.blockPosY == y) && (mount.blockPosZ == z))
            {
                if (!mount.isBeingRidden()) {
                    player.startRiding(mount);
                }
                return true;
            }
        }
        return false;
    }

    public static boolean isSomeoneSitting(World world, double x, double y, double z)
    {
        List<EntitySittableBlock> listEMB = world.getEntitiesWithinAABB(EntitySittableBlock.class, new AxisAlignedBB(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D).expand(1.0D, 1.0D, 1.0D));
        for (EntitySittableBlock mount : listEMB) {
            if ((mount.blockPosX == x) && (mount.blockPosY == y) && (mount.blockPosZ == z)) {
                return mount.isBeingRidden();
            }
        }
        return false;
    }
}
