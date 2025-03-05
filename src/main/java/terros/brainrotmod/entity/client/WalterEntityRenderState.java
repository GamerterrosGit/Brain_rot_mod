package terros.brainrotmod.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.entity.AnimationState;
import net.minecraft.util.Identifier;

public class WalterEntityRenderState extends LivingEntityRenderState {
    public Identifier texture;
    private static final Identifier DEFAULT_TEXTURE = Identifier.of("textures/entity/walter/walter.png");
    public final AnimationState idleState = new AnimationState();
    public final AnimationState walkingState = new AnimationState();

    public WalterEntityRenderState(){
        this.texture = DEFAULT_TEXTURE;
    }

}
