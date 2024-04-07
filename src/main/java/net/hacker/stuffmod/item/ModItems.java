package net.hacker.stuffmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hacker.stuffmod.StuffMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item EEEE = registerItem("eeee", new Item(new FabricItemSettings()));
    public static final Item EEEE_INGOT = registerItem("eeee_ingot", new Item(new FabricItemSettings()));

    private static void additemstoingredentgroup(FabricItemGroupEntries entries) {
        entries.add(EEEE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(StuffMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        StuffMod.LOGGER.info("registering mod items for " + StuffMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::additemstoingredentgroup);
    }
}
