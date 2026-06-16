package nl.zilenora.dimensional_refining.registration.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import nl.zilenora.dimensional_refining.registration.ModBlocks;

public class ResonanceFrame {
    public static final DeferredBlock<Block> PRIMIRIVE = ModBlocks.BLOCKS.registerSimpleBlock(
            "primitive_resonance_frame",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .strength(2.0f, 6.0f)
                    .requiresCorrectToolForDrops()
    );

    private ResonanceFrame() {

    }

    public static void register() {
        // empty, but needed to trigger statics to be created
    }
}
