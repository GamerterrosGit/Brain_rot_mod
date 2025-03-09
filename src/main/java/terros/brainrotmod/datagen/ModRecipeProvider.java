package terros.brainrotmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import terros.brainrotmod.block.ModBlocks;
import terros.brainrotmod.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                List<ItemConvertible> CHEESE_SMELTABLES = List.of(ModBlocks.CHEESE_ORE_BLOCK, ModBlocks.DEEPSLATE_CHEESE_ORE_BLOCK);

                offerSmelting(CHEESE_SMELTABLES, RecipeCategory.FOOD, ModItems.CHEESE, 0.25f, 200, "brainrot_items");
                offerBlasting(CHEESE_SMELTABLES, RecipeCategory.FOOD, ModItems.CHEESE, 0.25f, 100, "brainrot_items");
                offerSmelting(List.of(ModItems.CHEESE), RecipeCategory.FOOD, ModItems.DRIPPY_CHEESE, 0.25f, 100, "brainrot_items");

                offerReversibleCompactingRecipes(RecipeCategory.FOOD, ModItems.CHEESE, RecipeCategory.DECORATIONS, ModBlocks.CHEESE_BLOCK);

                createShaped(RecipeCategory.MISC, ModItems.FEASTABLES)
                        .input('A', Items.MILK_BUCKET)
                        .input('B', Items.SUGAR)
                        .input('C', Items.COCOA_BEANS)
                        .pattern("BBB")
                        .pattern("CAC")
                        .pattern("CCC")
                        .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModItems.LUNCHLY)
                        .input('A', ModItems.DRIPPY_CHEESE)
                        .input('B', ModItems.PRIME)
                        .input('C', ModItems.FEASTABLES)
                        .input('E', Items.PAPER)
                        .pattern("EEE")
                        .pattern("BAC")
                        .pattern("EEE")
                        .criterion(hasItem(ModItems.PRIME), conditionsFromItem(ModItems.PRIME))
                        .criterion(hasItem(ModItems.FEASTABLES), conditionsFromItem(ModItems.FEASTABLES))
                        .criterion(hasItem(ModItems.DRIPPY_CHEESE), conditionsFromItem(ModItems.DRIPPY_CHEESE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.BRAINROT_HELMET)
                        .input('A', Items.NETHERITE_HELMET)
                        .input('B', ModItems.LUNCHLY)
                        .pattern("AB")
                        .criterion(hasItem(ModItems.LUNCHLY), conditionsFromItem(ModItems.LUNCHLY))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModItems.BRAINROT_CHESTPLATE)
                        .input('A', Items.NETHERITE_CHESTPLATE)
                        .input('B', ModItems.LUNCHLY)
                        .pattern("AB")
                        .criterion(hasItem(ModItems.LUNCHLY), conditionsFromItem(ModItems.LUNCHLY))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.BRAINROT_LEGGINGS)
                        .input('A', Items.NETHERITE_LEGGINGS)
                        .input('B', ModItems.LUNCHLY)
                        .pattern("AB")
                        .criterion(hasItem(ModItems.LUNCHLY), conditionsFromItem(ModItems.LUNCHLY))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModItems.BRAINROT_BOOTS)
                        .input('A', Items.NETHERITE_BOOTS)
                        .input('B', ModItems.LUNCHLY)
                        .pattern("AB")
                        .criterion(hasItem(ModItems.LUNCHLY), conditionsFromItem(ModItems.LUNCHLY))
                        .offerTo(exporter);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHEESE_SLAB, ModBlocks.CHEESE_BLOCK);
            }
        };
    }

    @Override
    public String getName() {
        return "My Recipe";
    }
}
