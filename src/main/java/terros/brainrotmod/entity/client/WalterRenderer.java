package terros.brainrotmod.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.HeadFeatureRenderer;
import net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import terros.brainrotmod.BrainRotMod;
import terros.brainrotmod.entity.custom.WalterEntity;

@Environment(EnvType.CLIENT)
public class WalterRenderer extends MobEntityRenderer<WalterEntity, WalterEntityRenderState, WalterModel<WalterEntity>> {

    public WalterRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new WalterModel<>(ctx.getPart(WalterModel.WALTER)), 0.75f);
    }

    @Override
    public WalterEntityRenderState createRenderState() {
        return new WalterEntityRenderState();
    }

    @Override
    public Identifier getTexture(WalterEntityRenderState state) {
        return Identifier.of(BrainRotMod.MOD_ID, "textures/entity/walter/walter.png");
    }

    @Override
    public void render(WalterEntityRenderState livingEntityRenderState, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.scale(1f,1f,1f);
        super.render(livingEntityRenderState, matrixStack, vertexConsumerProvider, i);
    }
}
