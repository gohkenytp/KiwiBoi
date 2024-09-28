package codyhuh.kiwiboi;

import codyhuh.kiwiboi.common.entities.Kiwi;
import codyhuh.kiwiboi.registry.KBEntities;
import codyhuh.kiwiboi.registry.KBItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@Mod(KiwiBoi.MOD_ID)
public class KiwiBoi {
    public static final String MOD_ID = "kiwiboi";

    public KiwiBoi(ModContainer container, IEventBus bus) {
        IEventBus forgeBus = NeoForge.EVENT_BUS;

        KBItems.ITEMS.register(bus);
        KBEntities.ENTITIES.register(bus);

        bus.addListener(this::registerAttributes);
        bus.addListener(this::populateTabs);
    }

    private void registerAttributes(EntityAttributeCreationEvent e) {
        e.put(KBEntities.KIWI.get(), Kiwi.createMobAttributes().build());
    }

    private void populateTabs(BuildCreativeModeTabContentsEvent e) {
        if (e.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            e.accept(KBItems.KIWI_SPAWN_EGG.get());
        }
        if (e.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            e.accept(KBItems.KIWICAKE.get());
        }
    }

}
