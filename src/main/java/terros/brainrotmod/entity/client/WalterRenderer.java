package terros.brainrotmod.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import terros.brainrotmod.BrainRotMod;
import terros.brainrotmod.entity.custom.WalterEntity;

public class WalterRenderer extends LivingEntityRenderer<WalterEntity,WalterEntityRenderState, WalterModel<WalterEntity>> {

    public WalterRenderer(EntityRendererFactory.Context context, EntityModel entityModel, float f) {
        super(context, new WalterModel<>(context.getPart(WalterModel.WALTER)), 0.75f);
    }

    @Override
    public WalterEntityRenderState createRenderState() {
        return null;
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
