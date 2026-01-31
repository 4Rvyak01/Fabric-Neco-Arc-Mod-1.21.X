package net.fourrvyak.necoarcmod.item;

import net.fourrvyak.necoarcmod.NecoArcMod;
import net.fourrvyak.necoarcmod.item.custom.NecoArcJointItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_NECO_ARC = registerItems("raw_neco-arc", new Item(new Item.Settings()));
    public static final Item NECO_ARC_INGOT = registerItems("neco-arc_ingot", new Item(new Item.Settings()));
    public static final Item NECO_ARC_JOINT = registerItems("neco-arc_joint", new NecoArcJointItem(new Item.Settings().maxCount(16)));

    private static Item registerItems(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(NecoArcMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        NecoArcMod.LOGGER.info("Registering Mod Items for " + NecoArcMod.MOD_ID);
    }
}
