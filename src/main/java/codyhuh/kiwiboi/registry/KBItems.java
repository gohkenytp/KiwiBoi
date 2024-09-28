package codyhuh.kiwiboi.registry;

import codyhuh.kiwiboi.KiwiBoi;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class KBItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, KiwiBoi.MOD_ID);

    public static final Supplier<Item> KIWI_SPAWN_EGG = ITEMS.register("kiwi_spawn_egg", () -> new DeferredSpawnEggItem(KBEntities.KIWI, 0x814a31, 0x543628, new Item.Properties()));
    public static final Supplier<Item> KIWICAKE = ITEMS.register("kiwicake", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().fast().saturationModifier(0.4F).nutrition(6).build())));
}
