package terros.brainrotmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import terros.brainrotmod.item.ModItems;
import terros.brainrotmod.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.CHEESE)
                .add(ModItems.WHITE_POWDER)
                .add(ModItems.DRIPPY_CHEESE)
                .add(ModItems.PRIME)
                .add(ModItems.LUNCHLY)
                .add(ModItems.FEASTABLES);

        getOrCreateTagBuilder(ModTags.Items.BRAINROT_ARMOR)
                .add(ModItems.BRAINROT_HELMET)
                .add(ModItems.BRAINROT_CHESTPLATE)
                .add(ModItems.BRAINROT_LEGGINGS)
                .add(ModItems.BRAINROT_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BRAINROT_HELMET)
                .add(ModItems.BRAINROT_CHESTPLATE)
                .add(ModItems.BRAINROT_LEGGINGS)
                .add(ModItems.BRAINROT_BOOTS);

    }
}
