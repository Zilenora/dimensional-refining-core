package nl.zilenora.dimensional_refining.registration;

import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import nl.zilenora.dimensional_refining.DimensionalRefining;
import nl.zilenora.dimensional_refining.registration.items.BlockItems;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DimensionalRefining.MODID);

    static {
        BlockItems.register();
    }

    private ModItems() {}

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static void addToCreativeTab(CreativeModeTab.Output output) {
        BlockItems.addToCreativeTab(output);
    }
}
