package codyhuh.kiwiboi.client;

import codyhuh.kiwiboi.KiwiBoi;
import codyhuh.kiwiboi.client.render.KiwiRenderer;
import codyhuh.kiwiboi.registry.KBEntities;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = KiwiBoi.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ClientEvents {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        EntityRenderers.register(KBEntities.KIWI.get(), KiwiRenderer::new);
    }
}
