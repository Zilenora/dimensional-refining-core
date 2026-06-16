package nl.zilenora.dimensional_refining.registration;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import nl.zilenora.dimensional_refining.DimensionalRefining;
import nl.zilenora.dimensional_refining.registration.blocks.ResonanceFrame;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DimensionalRefining.MODID);

    static {
        ResonanceFrame.register();
    }

    private ModBlocks() {

    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
