package terros.brainrotmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import terros.brainrotmod.BrainRotMod;

public class ModBlocks {

    public static final Block CHEESE_BLOCK = registerBlock("cheese_block", AbstractBlock.Settings.create()
            .strength(0.1f)
            .sounds(BlockSoundGroup.POWDER_SNOW)
    );
    public static final Block CHEESE_ORE_BLOCK = registerBlock("cheese_ore_block", AbstractBlock.Settings.create()
            .strength(1f)
            .sounds(BlockSoundGroup.NETHER_GOLD_ORE)
            .requiresTool()
    );
    public static final Block DEEPSLATE_CHEESE_ORE_BLOCK = registerBlock("deepslate_cheese_ore_block", AbstractBlock.Settings.create()
            .strength(1f)
            .sounds(BlockSoundGroup.DEEPSLATE)
            .requiresTool()
    );
    public static final Block CHEESE_SLAB = registerSlabBlock("cheese_slab", AbstractBlock.Settings.create()
            .strength(0.1f)
            .sounds(BlockSoundGroup.POWDER_SNOW)
    );

    private static Block registerSlabBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BrainRotMod.MOD_ID, name));
        Block block = new SlabBlock(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BrainRotMod.MOD_ID, name));
        Block block = new Block(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BrainRotMod.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);
    }
    public static void registerModBlocks() {
        BrainRotMod.LOGGER.info("Registering Mod Blocks for " + BrainRotMod.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
//            entries.add(ModBlocks.CHEESE_BLOCK);
//        });
    }
}
