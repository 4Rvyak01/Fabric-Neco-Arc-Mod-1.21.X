package net.fourrvyak.necoarcmod;

import net.fabricmc.api.ModInitializer;

import net.fourrvyak.necoarcmod.block.ModBlocks;
import net.fourrvyak.necoarcmod.item.ModItemGroups;
import net.fourrvyak.necoarcmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NecoArcMod implements ModInitializer {
	public static final String MOD_ID = "neco-arc-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerMopBlocks();
		ModItemGroups.registerItemGroups();
	}
}