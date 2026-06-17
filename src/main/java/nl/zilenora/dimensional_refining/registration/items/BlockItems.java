package nl.zilenora.dimensional_refining.registration.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredItem;
import nl.zilenora.dimensional_refining.registration.ModItems;
import nl.zilenora.dimensional_refining.registration.blocks.ResonanceConduit;
import nl.zilenora.dimensional_refining.registration.blocks.ResonanceFrame;

public class BlockItems {
//    Frames
    public static final DeferredItem<BlockItem> PRIMITIVE_RESONANCE_FRAME = ModItems.ITEMS.registerSimpleBlockItem(
            "primitive_resonance_frame",
            ResonanceFrame.PRIMIRIVE
            );

    public static final DeferredItem<BlockItem> OVERWORLD_RESONANCE_FRAME = ModItems.ITEMS.registerSimpleBlockItem(
            "overworld_resonance_frame",
            ResonanceFrame.OVERWORLD
    );

    public static final DeferredItem<BlockItem> NETHER_RESONANCE_FRAME = ModItems.ITEMS.registerSimpleBlockItem(
            "nether_resonance_frame",
            ResonanceFrame.NETHER
    );

    public static final DeferredItem<BlockItem> END_RESONANCE_FRAME = ModItems.ITEMS.registerSimpleBlockItem(
            "end_resonance_frame",
            ResonanceFrame.END
    );

//    Conduits
    public static final DeferredItem<BlockItem> PRIMITIVE_RESONANCE_CONDUIT = ModItems.ITEMS.registerSimpleBlockItem(
            "primitive_resonance_conduit",
            ResonanceConduit.PRIMIRIVE
    );

    public static final DeferredItem<BlockItem> OVERWORLD_RESONANCE_CONDUIT = ModItems.ITEMS.registerSimpleBlockItem(
            "overworld_resonance_conduit",
            ResonanceConduit.OVERWORLD
    );

    public static final DeferredItem<BlockItem> NETHER_RESONANCE_CONDUIT = ModItems.ITEMS.registerSimpleBlockItem(
            "nether_resonance_conduit",
            ResonanceConduit.NETHER
    );

    public static final DeferredItem<BlockItem> END_RESONANCE_CONDUIT = ModItems.ITEMS.registerSimpleBlockItem(
            "end_resonance_conduit",
            ResonanceConduit.END
    );

    private BlockItems() {}

    public static void register() {
        // empty, but needed to trigger statics to be created
    }

    public static void addToCreativeTab(CreativeModeTab.Output output) {
        // Frames
        output.accept(PRIMITIVE_RESONANCE_FRAME.get());
        output.accept(OVERWORLD_RESONANCE_FRAME.get());
        output.accept(NETHER_RESONANCE_FRAME.get());
        output.accept(END_RESONANCE_FRAME.get());

        // Conduits
        output.accept(PRIMITIVE_RESONANCE_CONDUIT.get());
        output.accept(OVERWORLD_RESONANCE_CONDUIT.get());
        output.accept(NETHER_RESONANCE_CONDUIT.get());
        output.accept(END_RESONANCE_CONDUIT.get());
    }
}
