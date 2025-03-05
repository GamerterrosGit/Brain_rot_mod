package terros.brainrotmod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import terros.brainrotmod.BrainRotMod;
import terros.brainrotmod.entity.custom.WalterEntity;

public class ModEntities {
    public static final EntityType<WalterEntity> WALTER = Registry.register(Registries.ENTITY_TYPE, Identifier.of(BrainRotMod.MOD_ID, "walter"),
            EntityType.Builder.create(WalterEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1, 2f).build(RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(BrainRotMod.MOD_ID,"walter")))
            );


    public static void registerModEntities() {
        BrainRotMod.LOGGER.info("Registering Mod Entities for " + BrainRotMod.MOD_ID);
    }
}
