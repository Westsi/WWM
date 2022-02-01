package net.westsi.wwm.guns;

import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.Tag;
import net.minecraft.util.UseAction;
import net.westsi.wwm.items.ModItems;

import java.util.function.Predicate;

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

    @Override
    public int getRange() {
        return 1000;
    }
    }

