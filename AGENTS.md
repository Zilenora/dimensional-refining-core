# Agent Notes

## Project

Dimensional Refining is a Minecraft 1.21.1 NeoForge mod using Java 21.

- Mod id: `dimensional_refining`
- Main mod class: `src/main/java/nl/zilenora/dimensional_refining/DimensionalRefining.java`
- Java registration package: `src/main/java/nl/zilenora/dimensional_refining/registration`
- Resource namespace: `src/main/resources/assets/dimensional_refining`
- Data namespace: `src/main/resources/data/dimensional_refining`

## Current Block Pattern

Blocks are configured manually. When adding a decorative block, check or update:

- Java block registration in `registration/blocks`
- `ModBlocks` static initializer so the block class is loaded
- Block item registration and creative tab ordering in `registration/items/BlockItems.java`
- Localization in `assets/dimensional_refining/lang/en_us.json`
- Blockstate JSON in `assets/dimensional_refining/blockstates`
- Block model JSON in `assets/dimensional_refining/models/block`
- Item model JSON in `assets/dimensional_refining/models/item`
- Texture PNG in `assets/dimensional_refining/textures/block`
- Loot table in `data/dimensional_refining/loot_table/blocks`
- Recipe in `data/dimensional_refining/recipe`
- Mining tags in `data/minecraft/tags/block`

The current simple block model style is `minecraft:block/cube_all`.

## Configured Blocks

The current tiered decorative components are:

- `primitive_resonance_frame`
- `overworld_resonance_frame`
- `nether_resonance_frame`
- `end_resonance_frame`
- `primitive_resonance_conduit`
- `overworld_resonance_conduit`
- `nether_resonance_conduit`
- `end_resonance_conduit`
- `primitive_matter_containment_vessel`
- `overworld_matter_containment_vessel`
- `nether_matter_containment_vessel`
- `end_matter_containment_vessel`

## Conventions And Notes

- Existing tier order is primitive, overworld, nether, end.
- Primitive recipes are normal shaped crafting recipes.
- Higher-tier recipes are currently placeholder JSON until the custom infusion recipe type exists.
- Tool tags currently use stone tier for primitive/overworld, iron tier for nether, and diamond tier for end.
- Some existing constants use the misspelling `PRIMIRIVE`; avoid spreading that typo into new code unless compatibility requires it.
