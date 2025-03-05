package terros.brainrotmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.WanderingTraderEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import terros.brainrotmod.entity.ModEntities;
import terros.brainrotmod.entity.client.WalterEntityRenderState;
import terros.brainrotmod.entity.client.WalterModel;
import terros.brainrotmod.entity.client.WalterRenderer;
import terros.brainrotmod.entity.custom.WalterEntity;

public class BrainRotModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(WalterModel.WALTER, WalterModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.WALTER, WalterRenderer::new);
    }
}
