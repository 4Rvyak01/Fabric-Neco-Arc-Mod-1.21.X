package net.fourrvyak.necoarcmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fourrvyak.necoarcmod.NecoArcMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_NECO_ARC = registerItems("raw_neco-arc", new Item(new Item.Settings()));
    public static final Item NECO_ARC_INGOT = registerItems("neco-arc_ingot", new Item(new Item.Settings()));

    private static Item registerItems(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(NecoArcMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        NecoArcMod.LOGGER.info("Registering Mod Items for " + NecoArcMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RAW_NECO_ARC);
            entries.add(NECO_ARC_INGOT);
        });
    }
}
