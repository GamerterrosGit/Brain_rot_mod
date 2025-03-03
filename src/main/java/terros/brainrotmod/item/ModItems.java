package terros.brainrotmod.item;

import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import terros.brainrotmod.BrainRotMod;
import terros.brainrotmod.item.custom.PrimeItem;

public class ModItems {


    //FOOD ITEMS
    public static final Item CHEESE=registerItem("cheese", new Item.Settings().food(ModFoodComponents.CHEESE));
    public static final Item FEASTABLES = registerItem("feastables", new Item.Settings().food(ModFoodComponents.FEASTABLES));

    //ITEMS
    public static final Item DRIPPY_CHEESE=registerItem("drippy_cheese", new Item.Settings());

    //CUSTOM ITEMS/ DRINKS
    public static final Item PRIME = registerCustomItem("prime", new PrimeItem(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BrainRotMod.MOD_ID,"prime")))
            .maxCount(1)
            .food(FoodComponents.HONEY_BOTTLE, ConsumableComponents.DRINK)
    ));







    //Register methods
    private static Item registerCustomItem(String name,Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BrainRotMod.MOD_ID, name), item);
    }

    private static Item registerItem(String name,Item.Settings ItemSettings) {
        return Registry.register(Registries.ITEM, Identifier.of(BrainRotMod.MOD_ID, name),new Item(ItemSettings.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BrainRotMod.MOD_ID,name)))));
    }
    public static void registerModItems() {
        BrainRotMod.LOGGER.info("Registering Mod Items for " + BrainRotMod.MOD_ID);

    }
}
