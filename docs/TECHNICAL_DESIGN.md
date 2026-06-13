# Technical Design - Dimensional Refining

## Target Platform

The mod targets:

```text
Minecraft: 1.21.1
NeoForge: 21.1.233
Java: 21
Mod ID: dimensional_refining
```

Development environment:

- Linux
- IntelliJ IDEA
- Git
- Gradle / NeoGradle

---

## Platform Choice

Dimensional Refining will be built as a NeoForge mod.

NeoForge is the modding framework/API and mod loader used by the project. It is not the compiler.

Project stack:

```text
Minecraft Java
↓
NeoForge
↓
Java mod code
↓
Gradle / NeoGradle build
↓
Mod .jar
```

---

## Why NeoForge

NeoForge is a good fit because the mod requires:

- Custom blocks
- Block entities
- Custom fluids
- FE/RF-compatible energy
- Custom recipes
- Datapack-driven content
- Custom renderers
- Multiblock structures
- Modpack compatibility
- Tech-mod-style infrastructure

The mod is closer to a large tech mod than a lightweight content mod, making NeoForge a practical first target.

---

## Why Not Fabric First

Fabric is a valid modding ecosystem, but NeoForge is preferred for the first implementation because the design depends heavily on:

- Fluids
- Energy handling
- Machines
- Block entities
- Datapack-based recipes
- Compatibility with tech modpacks

Fabric support may be considered later, but it is not a first-version goal.

---

## Why Not CurseForge As The Platform

CurseForge is not the development platform.

CurseForge is used for:

- Mod distribution
- Modpacks
- Launcher integration

NeoForge is the framework the code is built against.

The mod may later be published on:

- CurseForge
- Modrinth
- GitHub Releases

---

## Repository

Suggested repository name:

```text
dimensional-refining
```

Suggested mod id:

```text
dimensional_refining
```

Suggested display name:

```text
Dimensional Refining
```

Suggested package namespace:

```text
com.zilenora.dimensional_refining
```

or another personal namespace.

---

## Development Principle

Build vertical slices.

Do not implement large systems all at once.

Preferred approach:

```text
One block
↓
Registration
↓
Texture
↓
Model
↓
Localization
↓
Recipe
↓
Creative tab
↓
Commit
```

First implementation milestone should be a simple decorative block, likely the Resonance Frame.

---

## Suggested Initial Milestones

### Milestone 1 - Project Cleanup

- Rename example mod to dimensional_refining
- Rename packages
- Confirm client launches
- Commit clean baseline

### Milestone 2 - Resonance Frame

- Register block
- Register block item
- Add creative tab entry
- Add block model
- Add item model
- Add texture
- Add localization
- Add crafting recipe

### Milestone 3 - Primitive Resonance Conduit

- Register conduit block
- Add simple model
- No network behavior yet

### Milestone 4 - Matter Containment Vessel

- Decorative block first
- No storage behavior yet
- Establish visual style

### Milestone 5 - Clock Spring Generator Prototype

- Block entity
- Right-click winding
- Stored winding counter
- Tiny energy output later

Do not start with:

- Dimensional Miner
- Dimensional Stabilizer
- Full Resonance Network
- Multiblocks
- Custom renderers

Those are later systems.

---

## Package Structure

Suggested Java structure:

```text
com.zilenora.dimensional_refining
├── DimensionalRefining.java
├── registration
│   ├── ModBlocks.java
│   ├── ModItems.java
│   ├── ModCreativeTabs.java
│   ├── ModBlockEntities.java
│   ├── ModFluids.java
│   ├── ModMenus.java
│   ├── ModRecipes.java
│   └── ModDataComponents.java
├── block
├── item
├── machine
├── fluid
├── recipe
├── network
├── multiblock
├── client
├── data
└── util
```

Start small. Empty packages are acceptable, but avoid building abstractions before they are needed.

---

## Resource Structure

Suggested resource structure:

```text
src/main/resources
├── META-INF
│   └── neoforge.mods.toml
├── assets
│   └── dimensional_refining
│       ├── blockstates
│       ├── models
│       │   ├── block
│       │   └── item
│       ├── textures
│       │   ├── block
│       │   ├── item
│       │   └── fluid
│       └── lang
│           └── en_us.json
└── data
    └── dimensional_refining
        ├── recipe
        ├── loot_table
        └── tags
```

Use data generation later once the manual structure is understood.

---

## Data-Driven Design

Most gameplay values should be datapack-driven where practical.

Modpack makers should be able to adjust:

- Chemical Plant recipes
- Solidifier recipes
- Fuel recipes
- Infuser recipes
- Reclaimer conversions
- Stabilizer unlock costs
- Matter-to-resource outputs

without Java changes.

---

## Custom Recipe Types

Likely recipe types:

```text
dimensional_refining:fuel_processing
dimensional_refining:chemical_plant
dimensional_refining:solidifier
dimensional_refining:infusion
dimensional_refining:reclaiming
dimensional_refining:stabilization
```

---

## Example Chemical Plant Recipe

```json
{
  "type": "dimensional_refining:chemical_plant",
  "input_fluid": {
    "fluid": "dimensional_refining:nether_matter",
    "amount": 1000
  },
  "output_fluid": {
    "fluid": "dimensional_refining:gold_concentrate",
    "amount": 250
  },
  "energy_cost": 1200,
  "process_time": 80,
  "color": "#ffb347"
}
```

---

## Example Solidifier Recipe

```json
{
  "type": "dimensional_refining:solidifier",
  "input_fluid": {
    "fluid": "dimensional_refining:gold_concentrate",
    "amount": 1000
  },
  "output": {
    "item": "minecraft:gold_ingot",
    "count": 1
  },
  "energy_cost": 800,
  "process_time": 60
}
```

---

## Example Infusion Recipe

```json
{
  "type": "dimensional_refining:infusion",
  "input": {
    "item": "dimensional_refining:primitive_resonance_conduit"
  },
  "input_fluid": {
    "fluid": "dimensional_refining:end_matter",
    "amount": 1000
  },
  "output": {
    "item": "dimensional_refining:end_resonance_conduit",
    "count": 1
  },
  "process_time": 100
}
```

---

## Tags

Use tags for broad compatibility.

Examples:

```text
c:ingots/iron
c:ingots/copper
c:glass_blocks
c:dusts/redstone
dimensional_refining:fuel_feedstock
dimensional_refining:overworld_reclaimables
dimensional_refining:nether_reclaimables
dimensional_refining:end_reclaimables
```

Tags should be used wherever compatibility matters.

---

## Config Files

Use config files for global balance options.

Examples:

```text
enable_instability=true
enable_conduit_damage=true
base_fuel_multiplier=1.0
matter_output_multiplier=1.0
reclaimer_external_items=true
allow_block_displacement=true
```

Do not use config files for recipe-like content if datapacks are more appropriate.

---

## Data Maps / Registry-Attached Data

Use NeoForge data maps or equivalent registry-attached data for behavior that is not exactly a recipe.

Potential uses:

- Item-to-Matter value mapping
- Fluid color / visual metadata
- Matter category metadata
- Reclaimer conversion values
- Default dimensional signatures

Example conceptual mapping:

```text
minecraft:iron_ingot
→ Overworld Matter value: 144 mB

minecraft:gold_ingot
→ Nether Matter value: 144 mB

minecraft:ender_pearl
→ End-related signature value: 250 mB
```

Be careful not to allow early progression skips through reclaiming.

---

## Core Technical Systems

### Block Registration

Needed for:

- Resonance Frame
- Resonance Conduit
- Matter Containment Vessel
- Machines

### Item Registration

Needed for:

- Block items
- Components
- Buckets / containers
- Upgrade items if any

### Fluid Registration

Needed for:

- Fuel fluids
- Matter fluids
- Concentrates
- Processing fluids

### Block Entities

Needed for:

- Machines
- Storage
- Infusers
- Generators
- Stabilizer
- Miner

### Menus / Screens

Keep limited.

Expected GUI machines:

- Chemical Plant
- Possibly Dimensional Miner
- Possibly advanced Infuser

Avoid GUIs for:

- Dimensional Stabilizer
- Matter Containment Vessel
- Clock Spring Generator if possible

---

## Energy System

External compatibility should use NeoForge-compatible FE/RF-style energy.

Internally, the mod uses Resonance as its visual and gameplay energy layer.

### Powered Dimensional Fluctuator

Technical role:

- Accept external FE/RF
- Insert equivalent energy into Resonance Network

### Dimensional Drain

Technical role:

- Extract energy from Resonance Network
- Expose FE/RF capability to external machines

### Clock Spring Generator

Technical role:

- Primitive FE/RF source
- Very small internal buffer
- Manual winding
- Not a battery

---

## Resonance Network

The Resonance Network is the mod's internal network system.

It should track:

- Connected conduits
- Connected machines
- Available Resonance Vessels
- Energy stored / transmitted
- Utilization
- Instability

Initial implementation should be simple.

Do not implement a complex optimized graph system until needed.

Recommended development path:

1. Single conduit line
2. Simple connected component detection
3. Energy transfer
4. Machine connection
5. Stabilizer access
6. Instability effects
7. Performance optimization

---

## Fluids

The mod needs custom fluids for:

- Crude Fuel
- Refined Fuel
- Dense Fuel
- Resonant Fuel
- Overworld Matter
- Nether Matter
- End Matter
- Concentrates

Fluid rendering should eventually support:

- Color-based visuals
- Pipes showing fluid color
- Tanks showing fluid color
- Machine animation colors

Start with simple fluids first.

---

## Multiblocks

Multiblocks should be implemented carefully and late.

Initial goal should be normal blocks and block entities.

Multiblocks likely needed for:

- Dimensional Stabilizer
- Dimensional Miner
- Matter Containment Vessel
- Chemical Plant, possibly
- Large storage structures

Design preference:

- Avoid overly rigid puzzle structures
- Avoid excessive special-purpose block positions
- Prefer readable, forgiving structures

The Stabilizer may use a socketed multiblock approach.

---

## Client Rendering

Custom rendering is likely needed for:

- Clock Spring Generator weights / pendulum
- Matter Containment Vessel orb
- Dimensional Miner portal
- Stabilizer miniature portals
- Infuser fluid reservoir
- Conduit pulse effects

Do not start with custom renderers.

Use simple block models first.

---

## Machine IO

Avoid internal item logistics complexity.

Machines should expose standard item/fluid/energy capabilities where appropriate.

Preferred design:

- One item input
- One fluid input
- One energy / resonance input
- One output

Let external logistics mods handle routing.

---

## Compatibility Goals

Default outputs should target vanilla resources first.

Modpack makers should be able to add support for other mods via datapacks.

Examples:

- ProjectRed materials
- Create materials
- Mekanism materials
- Thermal materials
- Immersive Engineering materials

Do not hardcode optional mod support unless necessary.

---

## Scope Boundaries

Not part of initial technical scope:

- Player teleportation
- Dimension travel
- Full addon API
- Complex transport system for items
- Advanced renderer-heavy machines
- Final balancing
- World generation

Potential future addon:

```text
Dimensional Refining: Transit
```

or similar, using the core Resonance system for player transport.

---

## First Recommended Commit Sequence

```text
1. Initial NeoForge project
2. Rename example mod to dimensional_refining
3. Add Resonance Frame
4. Add Matter Containment Vessel decorative block
5. Add Primitive Resonance Conduit decorative block
6. Add Clock Spring Generator block shell
7. Add first block entity
8. Add simple energy storage/output
9. Add first custom fluid
10. Add first simple machine recipe
```

Each step should compile, launch, and be committed separately.
