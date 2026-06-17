package nl.zilenora.dimensional_refining.registration.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import nl.zilenora.dimensional_refining.registration.ModBlocks;

public class ResonanceConduit {
    public static final DeferredBlock<Block> PRIMIRIVE = ModBlocks.BLOCKS.registerSimpleBlock(
            "primitive_resonance_conduit",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .strength(2.0f, 6.0f)
                    .requiresCorrectToolForDrops()
    );

    public static final DeferredBlock<Block> OVERWORLD = ModBlocks.BLOCKS.registerSimpleBlock(
            "overworld_resonance_conduit",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .strength(2.0f, 8.0f)
                    .requiresCorrectToolForDrops()
    );
    // TODO: Infusion recipe

    public static final DeferredBlock<Block> NETHER = ModBlocks.BLOCKS.registerSimpleBlock(
            "nether_resonance_conduit",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
    );
    // TODO: Infusion recipe

    public static final DeferredBlock<Block> END = ModBlocks.BLOCKS.registerSimpleBlock(
            "end_resonance_conduit",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .strength(2.5f, 12.0f)
                    .requiresCorrectToolForDrops()
    );
    // TODO: Infusion recipe

    private ResonanceConduit() {

    }

    public static void register() {
        // empty, but needed to trigger statics to be created
    }
}
