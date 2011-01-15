package org.bukkit.craftbukkit;

import org.bukkit.craftbukkit.entity.CraftMinecart;
import net.minecraft.server.EntityMinecart;
import org.bukkit.entity.PoweredMinecart;

/**
 * A powered minecart.
 * 
 * @author sk89q
 */
public class CraftPoweredMinecart extends CraftMinecart
        implements PoweredMinecart {
    public CraftPoweredMinecart(CraftServer server, EntityMinecart entity) {
        super(server, entity);
    }

}
