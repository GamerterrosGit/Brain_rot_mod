package terros.brainrotmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terros.brainrotmod.block.ModBlocks;
import terros.brainrotmod.entity.ModEntities;
import terros.brainrotmod.entity.custom.WalterEntity;
import terros.brainrotmod.item.ModItemGroups;
import terros.brainrotmod.item.ModItems;
import terros.brainrotmod.util.ModTags;
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

		FabricDefaultAttributeRegistry.register(ModEntities.WALTER, WalterEntity.createAttributes());

	}
}