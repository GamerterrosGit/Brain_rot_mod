package terros.brainrotmod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import terros.brainrotmod.block.ModBlocks;
import terros.brainrotmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool cheeseBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHEESE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_CHEESE_ORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHEESE_ORE_BLOCK);

        cheeseBlockPool.slab(ModBlocks.CHEESE_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PRIME, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRIPPY_CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FEASTABLES, Models.GENERATED);

    }
}
