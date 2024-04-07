package net.hacker.stuffmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hacker.stuffmod.StuffMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup EEEE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(StuffMod.MOD_ID, "eeee"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eeee"))
                    .icon(() -> new ItemStack(ModItems.EEEE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.EEEE);


                    }).build());

    public static void registerItemgroups () {
        StuffMod.LOGGER.info("Registering itemgroups for " + StuffMod.MOD_ID);
    }
}
