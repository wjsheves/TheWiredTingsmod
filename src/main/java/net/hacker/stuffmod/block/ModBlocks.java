package net.hacker.stuffmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hacker.stuffmod.StuffMod;
import net.hacker.stuffmod.block.custom.EEEEMEDALIEANBLOCK;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block EEEE_BLOCK = registerBlock("eeee_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block EEEE_ORE = registerBlock("eeee_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block DEEPSLATE_EEEE_ORE = registerBlock("deepslate_eeee_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final Block EEEE_INGOT_BLOCK = registerBlock("eeee_ingot_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));

    public static final Block EEEE_MEDALIEAN_BLOCK = registerBlock("eeee_medaliean_block",
            new EEEEMEDALIEANBLOCK(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(StuffMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(StuffMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        StuffMod.LOGGER.info("Registering Mod Blocks For " + StuffMod.MOD_ID);
    }
}
