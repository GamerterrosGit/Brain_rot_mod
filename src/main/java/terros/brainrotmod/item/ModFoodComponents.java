package terros.brainrotmod.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent FEASTABLES = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.5f)
            .build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.1f)
            .build();
}
