package terros.brainrotmod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Model;
import net.minecraft.client.data.Models;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import terros.brainrotmod.BrainRotMod;
import terros.brainrotmod.block.ModBlocks;
import terros.brainrotmod.item.ModItems;

import java.util.Optional;

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
        itemModelGenerator.register(ModItems.WHITE_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUNCHLY, Models.GENERATED);

        itemModelGenerator.registerArmor(ModItems.BRAINROT_HELMET, RegistryKey.of(RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")), Identifier.of(BrainRotMod.MOD_ID, "lunchly")),
                "helmet", false);
        itemModelGenerator.registerArmor(ModItems.BRAINROT_CHESTPLATE, RegistryKey.of(RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")), Identifier.of(BrainRotMod.MOD_ID, "lunchly")),
                "chestplate", false);
        itemModelGenerator.registerArmor(ModItems.BRAINROT_LEGGINGS, RegistryKey.of(RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")), Identifier.of(BrainRotMod.MOD_ID, "lunchly")),
                "leggings", false);
        itemModelGenerator.registerArmor(ModItems.BRAINROT_BOOTS, RegistryKey.of(RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")), Identifier.of(BrainRotMod.MOD_ID, "lunchly")),
                "boots", false);

        itemModelGenerator.register(ModItems.WALTER_SPAWN_EGG, new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
    }
}
