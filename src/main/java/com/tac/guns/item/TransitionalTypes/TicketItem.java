package com.tac.guns.item.TransitionalTypes;

import com.tac.guns.GunMod;
import com.tac.guns.item.MiscItem;
import com.tac.guns.util.Process;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class TicketItem extends MiscItem {

    public TicketItem() {
        this(properties -> properties);
    }

    public TicketItem(Process<Properties> properties) {
        super(properties.process(new Properties().maxStackSize(1).group(GunMod.GROUP)));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        tooltip.add(new TranslationTextComponent("info.tac.gun_ticket"));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
