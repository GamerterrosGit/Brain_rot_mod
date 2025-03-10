package terros.brainrotmod.item;

import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import terros.brainrotmod.BrainRotMod;
import terros.brainrotmod.entity.ModEntities;
import terros.brainrotmod.item.custom.PrimeItem;

public class ModItems {


    //FOOD ITEMS
    public static final Item CHEESE =registerItem("cheese", new Item.Settings().food(ModFoodComponents.CHEESE));
    public static final Item FEASTABLES = registerItem("feastables", new Item.Settings().food(ModFoodComponents.FEASTABLES));
    public static final Item WHITE_POWDER = registerItem("white_powder", new Item.Settings().food(ModFoodComponents.WHITE_POWDER));

    //ITEMS
    public static final Item DRIPPY_CHEESE=registerItem("drippy_cheese", new Item.Settings());
    public static final Item LUNCHLY=registerItem("lunchly", new Item.Settings());

    //CUSTOM ITEMS/ DRINKS
    public static final Item PRIME = registerCustomItem("prime", new PrimeItem(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BrainRotMod.MOD_ID,"prime")))
            .maxCount(1)
            .food(FoodComponents.HONEY_BOTTLE, ConsumableComponents.DRINK)
    ));
    public static final Item WALTER_SPAWN_EGG = registerCustomItem("walter_spawn_egg", new SpawnEggItem(ModEntities.WALTER, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BrainRotMod.MOD_ID,"walter_spawn_egg"))))
    );


    public static final Item BRAINROT_HELMET = registerCustomItem("brainrot_helmet", new ArmorItem(ModArmorMaterials.BRAINROT_ARMOR_MATERIAL, EquipmentType.HELMET, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BrainRotMod.MOD_ID,"brainrot_helmet"))))
    );
    public static final Item  BRAINROT_CHESTPLATE= registerCustomItem("brainrot_chestplate", new ArmorItem(ModArmorMaterials.BRAINROT_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BrainRotMod.MOD_ID,"brainrot_chestplate"))))
    );
    public static final Item BRAINROT_LEGGINGS = registerCustomItem("brainrot_leggings", new ArmorItem(ModArmorMaterials.BRAINROT_ARMOR_MATERIAL, EquipmentType.LEGGINGS, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BrainRotMod.MOD_ID,"brainrot_leggings"))))
    );
    public static final Item BRAINROT_BOOTS = registerCustomItem("brainrot_boots", new ArmorItem(ModArmorMaterials.BRAINROT_ARMOR_MATERIAL, EquipmentType.BOOTS, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BrainRotMod.MOD_ID,"brainrot_boots"))))
    );






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
