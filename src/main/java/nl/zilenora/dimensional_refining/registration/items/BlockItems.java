package nl.zilenora.dimensional_refining.registration.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredItem;
import nl.zilenora.dimensional_refining.registration.ModItems;
import nl.zilenora.dimensional_refining.registration.blocks.ResonanceFrame;

public class BlockItems {
    public static final DeferredItem<BlockItem> PRIMITIVE_RESONANCE_FRAME = ModItems.ITEMS.registerSimpleBlockItem(
            "primitive_resonance_frame",
            ResonanceFrame.PRIMIRIVE
            );

    private BlockItems() {}

    public static void register() {
        // empty, but needed to trigger statics to be created
    }

    public static void addToCreativeTab(CreativeModeTab.Output output) {
        output.accept(PRIMITIVE_RESONANCE_FRAME.get());
    }
}
