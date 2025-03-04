package terros.brainrotmod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.ModelWithHead;
import net.minecraft.client.render.entity.state.VillagerEntityRenderState;
import net.minecraft.client.render.entity.state.WardenEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import terros.brainrotmod.BrainRotMod;
import terros.brainrotmod.entity.custom.WalterEntity;

public class WalterModel<T extends WalterEntity>  extends EntityModel<WalterEntityRenderState> {

    public static final EntityModelLayer WALTER = new EntityModelLayer(Identifier.of(BrainRotMod.MOD_ID, "walter"), "main");

    private final ModelPart walter;
    private final ModelPart head;
    public WalterModel(ModelPart root) {
        super(root);
        this.walter = root.getChild("walter");
        this.head = this.walter.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData walter = modelPartData.addChild("walter", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData body = walter.addChild("body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData head = walter.addChild("head", ModelPartBuilder.create().uv(32, 0).cuboid(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F))
                .uv(0, 0).cuboid(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData leftleg = walter.addChild("leftleg", ModelPartBuilder.create().uv(16, 48).cuboid(-0.1F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData righteg = walter.addChild("righteg", ModelPartBuilder.create().uv(0, 16).cuboid(-3.9F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData rightarm = walter.addChild("rightarm", ModelPartBuilder.create().uv(40, 16).cuboid(-8.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData leftarm = walter.addChild("leftarm", ModelPartBuilder.create().uv(32, 48).cuboid(4.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    public ModelPart getHead() {
        return walter;
    }
}
