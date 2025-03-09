package terros.brainrotmod.item;

import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import terros.brainrotmod.BrainRotMod;
import terros.brainrotmod.util.ModTags;

import java.util.EnumMap;

public class ModArmorMaterials {
    public static final ArmorMaterial BRAINROT_ARMOR_MATERIAL = new ArmorMaterial(500, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 6);
        map.put(EquipmentType.LEGGINGS, 10);
        map.put(EquipmentType.CHESTPLATE, 12);
        map.put(EquipmentType.HELMET, 6);
        map.put(EquipmentType.BODY, 4);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0, 0, ModTags.Items.LUNCHLY_REPAIR,
            RegistryKey.of(RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")), Identifier.of(BrainRotMod.MOD_ID, "lunchly")));
}
