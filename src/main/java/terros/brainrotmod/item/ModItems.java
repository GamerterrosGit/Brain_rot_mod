package terros.brainrotmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import terros.brainrotmod.BrainRotMod;

public class ModItems {

//    public static final Item PRIME = registerItem("prime", new Item(new Item.Settings()));
    public static final Item PRIME=registerItem("prime");
    public static final Item CHEESE=registerItem("cheese");
    public static final Item DRIPPY_CHEESE=registerItem("drippy_cheese");

    private static Item registerItem(String name) {
        return Registry.register(Registries.ITEM, Identifier.of(BrainRotMod.MOD_ID, name),new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BrainRotMod.MOD_ID,name)))));
    }
    public static void registerModItems() {
        BrainRotMod.LOGGER.info("Registering Mod Items for " + BrainRotMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PRIME);
            entries.add(CHEESE);
            entries.add(DRIPPY_CHEESE);
        });
    }
}
