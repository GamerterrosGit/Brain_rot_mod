package terros.brainrotmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnLocationTypes;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.WanderingTraderEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;
import terros.brainrotmod.entity.ModEntities;
import terros.brainrotmod.entity.client.WalterModel;
import terros.brainrotmod.entity.custom.WalterEntity;

public class ModEntitySpawns {
    public static void addSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.DESERT),
                SpawnGroup.CREATURE, ModEntities.WALTER, 700, 10, 20);
        SpawnRestriction.register(ModEntities.WALTER, SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, WalterEntity::isValidNaturalSpawn);
    }
}
