package com.tac.guns.item.attachment;

import com.tac.guns.item.attachment.impl.SideRail;

/**
 * An interface to turn an any item into a under barrel attachment. This is useful if your item
 * extends a custom item class otherwise {@link com.tac.guns.item.UnderBarrelItem} can be
 * used instead of this interface.
 * <p>
 * Author: Forked from MrCrayfish, continued by Timeless devs
 */
public interface ISideRail extends IAttachment<SideRail>
{
    /**
     * @return The type of this attachment
     */
    @Override
    default Type getType()
    {
        return Type.SIDE_RAIL;
    }
}
