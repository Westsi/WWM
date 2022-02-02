package net.westsi.wwm;

import net.fabricmc.api.ModInitializer;
import net.westsi.wwm.blocks.ModBlocks;
import net.westsi.wwm.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WWM implements ModInitializer {
	public static final String MOD_ID = "wwm";
	public static final Logger LOGGER = LoggerFactory.getLogger("wwmlog");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
