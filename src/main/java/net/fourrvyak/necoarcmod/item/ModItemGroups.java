package net.fourrvyak.necoarcmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fourrvyak.necoarcmod.NecoArcMod;
import net.fourrvyak.necoarcmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(NecoArcMod.MOD_ID, "neco-arc_mod"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.NECO_ARC_INGOT))
                    .displayName(Text.translatable("itemgroup.neco-arc-mod.neco-arc_mod"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_NECO_ARC);
                        entries.add(ModItems.NECO_ARC_INGOT);
                        entries.add(ModBlocks.NECO_ARC_ORE);
                        entries.add(ModBlocks.NECO_ARC_BLOCK);
                        entries.add(ModItems.NECO_ARC_JOINT);
                    }).build());

    public static void registerItemGroups() {
        NecoArcMod.LOGGER.info("Registering Item Groups for " + NecoArcMod.MOD_ID);
    }
}