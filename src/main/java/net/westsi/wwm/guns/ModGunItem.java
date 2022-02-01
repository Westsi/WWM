package net.westsi.wwm.guns;

import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;

public class ModGunItem extends BowItem {
    public ModGunItem(Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 20;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.CROSSBOW;
    }
}
