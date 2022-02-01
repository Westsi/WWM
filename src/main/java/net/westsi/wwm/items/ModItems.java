package net.westsi.wwm.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.westsi.wwm.WWM;
import net.westsi.wwm.guns.ModGunItem;

public class ModItems {


    public static final Item PISTOL = registerItem("pistol",
            new ModGunItem(new FabricItemSettings().fireproof().group(ItemGroup.MISC)));

    public static final Item TEST_AMMO = registerItem("testammo",
            new Item(new FabricItemSettings().fireproof().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(WWM.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + WWM.MOD_ID);
    }

}
