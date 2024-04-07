package net.hacker.stuffmod;

import net.fabricmc.api.ModInitializer;

import net.hacker.stuffmod.item.ModItemGroups;
import net.hacker.stuffmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StuffMod implements ModInitializer {
    public static final String MOD_ID = "stuffmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemgroups();
	}
}