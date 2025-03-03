package terros.brainrotmod.item.custom;
import static net.minecraft.item.Items.GLASS_BOTTLE;

import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.consume.UseAction;

public class PrimeItem extends Item {
    public PrimeItem(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
}
