package terros.brainrotmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import terros.brainrotmod.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CHEESE_BLOCK);
        addDrop(ModBlocks.CHEESE_SLAB, slabDrops(ModBlocks.CHEESE_SLAB));

        addDrop(ModBlocks.CHEESE_ORE_BLOCK);
        addDrop(ModBlocks.DEEPSLATE_CHEESE_ORE_BLOCK);
    }
}
