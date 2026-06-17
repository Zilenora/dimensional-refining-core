package nl.zilenora.dimensional_refining.registration;

import nl.zilenora.dimensional_refining.DimensionalRefining;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import nl.zilenora.dimensional_refining.registration.items.BlockItems;

public final class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DimensionalRefining.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DIMENSIONAL_REFINING_TAB =
            CREATIVE_MODE_TABS.register("dimensional_refining_tab",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup.dimensional_refining"))
                            .icon(() -> BlockItems.PRIMITIVE_RESONANCE_FRAME.get().getDefaultInstance())
                            .displayItems((parameters, output) -> {
                                ModItems.addToCreativeTab(output);
                            })
                            .build());

    private ModCreativeTabs() {
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}