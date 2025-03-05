package terros.brainrotmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.client.tutorial.TutorialManager;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import terros.brainrotmod.BrainRotMod;
import terros.brainrotmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup BRAIN_ROT_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(BrainRotMod.MOD_ID, "brainrot_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.PRIME))
                    .displayName(Text.translatable("itemgroup.brainrotmod.brainrot_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CHEESE_BLOCK);
                        entries.add(ModBlocks.CHEESE_SLAB);
                        entries.add(ModBlocks.CHEESE_ORE_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_CHEESE_ORE_BLOCK);
                        entries.add(ModItems.DRIPPY_CHEESE);
                        entries.add(ModItems.CHEESE);
                        entries.add(ModItems.FEASTABLES);
                        entries.add(ModItems.PRIME);

                        entries.add(ModItems.WALTER_SPAWN_EGG);
                    })
            .build());

    public static void registerItemGroups() {
        BrainRotMod.LOGGER.info("Registering Item Groups for " + BrainRotMod.MOD_ID);
    }
}
