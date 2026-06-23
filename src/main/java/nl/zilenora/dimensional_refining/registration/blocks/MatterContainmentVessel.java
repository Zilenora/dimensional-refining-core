package nl.zilenora.dimensional_refining.registration.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import nl.zilenora.dimensional_refining.registration.ModBlocks;

public class MatterContainmentVessel {
    public static final DeferredBlock<Block> PRIMITIVE = ModBlocks.BLOCKS.registerSimpleBlock(
            "primitive_matter_containment_vessel",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .strength(1.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
    );

    public static final DeferredBlock<Block> OVERWORLD = ModBlocks.BLOCKS.registerSimpleBlock(
            "overworld_matter_containment_vessel",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .strength(1.5f, 8.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
    );
    // TODO: Infusion recipe

    public static final DeferredBlock<Block> NETHER = ModBlocks.BLOCKS.registerSimpleBlock(
            "nether_matter_containment_vessel",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .strength(2.0f, 10.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
    );
    // TODO: Infusion recipe

    public static final DeferredBlock<Block> END = ModBlocks.BLOCKS.registerSimpleBlock(
            "end_matter_containment_vessel",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .strength(2.5f, 12.0f)
                    .sound(SoundType.GLASS)
                    .requiresCorrectToolForDrops()
    );
    // TODO: Infusion recipe

    private MatterContainmentVessel() {

    }

    public static void register() {
        // empty, but needed to trigger statics to be created
    }
}
