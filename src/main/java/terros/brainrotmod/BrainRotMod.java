package terros.brainrotmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terros.brainrotmod.block.ModBlocks;
import terros.brainrotmod.entity.ModEntities;
import terros.brainrotmod.item.ModItemGroups;
import terros.brainrotmod.item.ModItems;
import terros.brainrotmod.world.gen.ModWorldGeneration;

public class BrainRotMod implements ModInitializer {
	public static final String MOD_ID = "brainrotmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModWorldGeneration.generateModWorldGen();


		ModEntities.registerModEntities();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}