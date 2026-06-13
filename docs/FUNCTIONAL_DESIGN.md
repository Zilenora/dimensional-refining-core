# Functional Design - Dimensional Refining

## Vision

Dimensional Refining is a factory-oriented Minecraft mod about turning low-value overflow resources into useful materials through fuel production, dimensional matter extraction, refinement, and infrastructure upgrades.

The mod focuses on:

- Automation
- Optimization
- Visible factory state
- Minimal required GUI usage
- Factory-scale progression
- Closed-loop resource use

The mod does not focus on:

- Player teleportation
- Combat progression
- Mandatory exploration
- Random quarry-style ore generation

Player teleportation or dimensional travel may be considered later as an optional addon, not part of the core mod.

---

## Core Gameplay Loop

```text
Waste Resources
↓
Fuel
↓
Dimensional Matter
↓
Matter Processing
↓
Useful Resources
↓
Factory Expansion
↓
More Matter
```

The player converts abundant resources such as cobblestone, stone, dirt, and gravel into fuel. Fuel powers dimensional extraction. Dimensional extraction produces Matter. Matter is refined into resources, machine components, upgrades, and infrastructure.

---

## Design Principles

### Factory Complexity, Not Machine Complexity

The mod should be complex at the factory level, not at the individual machine configuration level.

Avoid:

- Per-side machine configuration
- Color channels
- Complex input/output settings
- Complicated machine setup

Prefer:

- Simple machine interfaces
- Clear inputs and outputs
- Visible infrastructure
- Factory-wide optimization

Existing logistics mods should handle advanced item routing.

---

### Show, Don't Tell

The factory should explain itself visually.

Players should be able to identify:

- Machine activity
- Fluid type
- Fill level
- Conduit tier
- Conduit stress
- Dimension unlock state
- Current Matter extraction target

without opening GUIs whenever possible.

A GUI should configure a machine, not explain a machine.

---

### Progression Unlocks Convenience

Progression should mostly unlock:

- Automation
- Throughput
- Efficiency
- Stability
- Convenience

Primitive machinery should remain functional even late game.

Example:

A primitive Dimensional Infuser can technically infuse End Matter into conduits, but it is slow, manual, and unsafe-looking. Later tiers make the same work easier, faster, and more automatable.

---

### No Destructive Random Failure

Instability should be interesting, not punishing.

Allowed:

- Nausea
- Blindness
- Mining fatigue
- Sparks
- Minor damage
- Visual distortions
- Decorative block displacement

Not allowed:

- Destroying machines
- Destroying inventories
- Destroying expensive blocks
- Deleting player progress

---

## Aesthetic Direction

The machines should look like they were built by highly competent engineers who prioritize functionality, throughput, and practicality over safety, beauty, or common sense.

Guiding phrase:

```text
If it works, it's finished.
```

### Early Game

Improvised engineering.

Examples:

- Modified grandfather clock generator
- Water cooler infuser
- Primitive conduits

Theme:

```text
It works. Next problem.
```

### Mid Game

Industrial engineering.

Examples:

- Industrial Infuser
- Chemical Plant
- Better conduits
- Better frames

Theme:

```text
We almost know what we are doing.
```

### Late Game

Dimensional engineering.

Examples:

- Dimensional Stabilizer
- Dimensional Miner
- Matter Containment Vessel
- Resonance Infuser
- Dimensional Reclaimer

Theme:

```text
Reality is now considered a usable engineering material.
```

---

## Progression Tiers

### Primitive Tier

Crafted from vanilla materials.

No Matter required.

Uses:

- Cobblestone / stone
- Iron
- Redstone
- Glass
- Wood / planks

Primitive components solve the bootstrap problem. The player must be able to start the mod without already having Matter.

Examples:

- Clock Spring Generator
- Primitive Resonance Frame
- Primitive Resonance Conduit
- Primitive Dimensional Infuser

---

### Overworld Infused Tier

Created by infusing primitive components with Overworld Matter.

Represents the first proper dimensional technology tier.

Improves:

- Stability
- Throughput
- Machine capability

---

### Nether Infused Tier

Created by infusing base or existing components with Nether Matter.

Improves:

- Throughput
- Stability
- Processing speed

---

### End Infused Tier

Created by infusing base or existing components with End Matter.

Represents top-tier infrastructure.

Used for:

- Highest throughput conduits
- Advanced machines
- End-game recovery systems

---

## Direct Infusion Rule

Progression is sequential, but manufacturing should not be repetitive.

Once a Matter type is available, a primitive component may be infused directly into that tier.

Example:

```text
Primitive Resonance Conduit + End Matter
→ End Resonance Conduit
```

Existing infused components may also be upgraded.

Example:

```text
Nether Resonance Conduit + End Matter
→ End Resonance Conduit
```

Upgrading an existing infused component should cost less Matter than creating the same tier directly from a primitive component.

---

## Core Resources

### Fuel

Fuel is the primary consumable resource of the mod.

Created from low-value resources such as:

- Cobblestone
- Stone
- Dirt
- Gravel

Fuel is used for:

- Dimensional Miner operation
- Dimensional Generator power production
- Some advanced processes

Fuel determines:

- Matter extraction rate
- Efficiency
- Throughput

Fuel does not determine:

- Dimension selection
- Matter type

Fuel tiers:

- Crude Fuel
- Refined Fuel
- Dense Fuel
- Resonant Fuel

---

### Matter

Matter is the primary output of dimensional extraction.

Types:

- Overworld Matter
- Nether Matter
- End Matter

Matter is used for:

- Resource refinement
- Infrastructure upgrades
- Machine upgrades
- Resonance unlocks
- Reclaiming / recycling loops

---

### Concentrates

Concentrates are refined intermediate products.

Examples:

- Iron Concentrate
- Gold Concentrate
- Quartz Concentrate

Concentrates are produced by the Chemical Plant and converted into final resources by the Liquid Solidifier.

---

## Resonance System

Resonance represents stabilized dimensional energy and synchronization.

The Resonance Network is the mod's internal infrastructure layer.

It carries:

- Resonance Energy
- Network synchronization
- Access to stabilized dimensional signatures

RF/FE is still used as the external power standard, but the mod's machines primarily operate through Resonance infrastructure.

---

## RF / Resonance Conversion

### Powered Dimensional Fluctuator

Converts external RF/FE into Resonance.

```text
RF/FE
↓
Powered Dimensional Fluctuator
↓
Resonance Network
```

Used to connect external power systems to Dimensional Refining infrastructure.

---

### Dimensional Drain

Converts Resonance back into RF/FE.

```text
Resonance Network
↓
Dimensional Drain
↓
RF/FE
```

Used to power external machines from the Resonance Network.

---

## Resonance Conduits

Resonance Conduits carry Resonance Energy and network synchronization.

Conduits should visually communicate:

- Tier
- Throughput
- Instability
- Stress

Tiers:

- Primitive Resonance Conduit
- Overworld Resonance Conduit
- Nether Resonance Conduit
- End Resonance Conduit

Higher tiers improve throughput and stability.

---

## Resonance Instability

Conduits may technically allow high throughput, but pushing them too hard causes instability.

### Low Utilization

No effects.

### Medium Utilization

Visual warnings:

- Faster pulses
- Flickering
- Strange sounds

### High Utilization

Minor dimensional exposure:

- Nausea
- Mining fatigue
- Temporary blindness

### Extreme Utilization

Reality distortion:

- Decorative block displacement
- Visual anomalies
- Dimensional echoes

Machines, inventories, and multiblock components must not be affected.

### Critical Utilization

Rare danger:

- Resonance arcs
- Minor damage
- Small dimensional tears

No irreversible damage.

---

## Construction Components

### Resonance Frame

The primary machine construction block.

Equivalent design role to:

- Immersive Engineering Engineering Blocks
- Create Andesite Alloy
- Mekanism Atomic Alloy

Used in:

- Machines
- Multiblocks
- Infrastructure

Primitive Resonance Frames are crafted from vanilla resources. Higher tiers are created through Matter infusion.

---

### Matter Containment Vessel

The primary dimensional component.

Used in:

- Matter storage
- Dimensional Stabilizer
- Dimensional Miner
- Advanced Infuser
- Resonance unlock storage

Matter Containment Vessels visually contain dimensional matter or miniature dimensional portals.

---

## Machines

### Clock Spring Generator

Starter generator.

Visual theme:

A modified grandfather clock crudely converted into a generator.

Properties:

- Primitive / Overworld-era only
- No progression variants
- Manual winding
- Very small internal RF buffer
- Low output
- Cheap recipe

Purpose:

- Bootstrap the first machines
- Restart a dead factory
- Serve as an iconic early-game machine

Stored energy should be shown through clock weights rather than a large hidden RF buffer.

---

### Dimensional Generator

Converts fuel into energy.

Purpose:

Allow the mod to run standalone without other power mods.

Design:

- Useful but not overpowered
- Weaker than dedicated reactor mods
- Consumes mod fuel
- Fuel tier improves efficiency and runtime

---

### Dimensional Infuser

General-purpose infusion and filling machine.

Used for:

- Infusing conduits
- Infusing frames
- Filling buckets
- Filling containers
- Preparing dimensional components

#### Tier 1 - Water Cooler Infuser

Visual theme:

Repurposed office water cooler.

Properties:

- One fluid connection
- Manual item handling
- No item automation
- No inventory
- Can fill buckets and infuse items manually

It should look improvised and unsafe.

#### Tier 2 - Industrial Infuser

Visual theme:

A stripped-down industrial filling or paint machine that someone tried to make professional.

Properties:

- Fluid automation
- Item automation
- Small inventory
- Hopper / pipe compatibility

#### Tier 3 - Resonance Infuser

Visual theme:

A miniature Matter Containment Vessel leaking into a funnel.

Design concept:

Engineers discovered that full containment vessels leak, then decided to use the leak as a feature.

Properties:

- Controlled dimensional leak
- Queue processing
- High throughput
- Small internal tank, around 10,000 to 30,000 mB
- Not intended as storage

---

### Dimensional Stabilizer

Central progression structure.

Purpose:

- Unlock dimensions
- Maintain stabilized dimensional resonances
- Act as the core of the Resonance Network

The Stabilizer should have little or no GUI.

Progress should be visible through socketed Resonance Containment Vessels.

#### Resonance Vessels

Dimension unlocks are stored physically in vessels.

Examples:

- Overworld Resonance Vessel
- Nether Resonance Vessel
- End Resonance Vessel

Each vessel contains a miniature stabilized portal.

If a vessel is broken, it drops as a filled vessel and keeps its stored resonance.

This allows:

- Factory relocation
- Multiplayer sharing
- Safe rebuilding

#### Unlock Path

Overworld Resonance:

```text
250 mB Crude Fuel
```

Nether Resonance:

```text
250,000 mB Overworld Matter
```

End Resonance:

```text
500,000 mB Nether Matter
```

Numbers are placeholders for balancing.

---

### Dimensional Miner

The visual centerpiece of the mod.

Purpose:

Convert fuel and Resonance Energy into Matter.

Inputs:

- Fuel
- Resonance Energy
- Resonance Network access

Outputs:

- Overworld Matter
- Nether Matter
- End Matter

Matter type is determined by the connected Stabilizer Network, not by fuel.

Fuel determines throughput and efficiency.

Visual design:

- Four pillars
- Central portal
- Fuel visibly fed into the portal
- Matter condenses from the portal
- Matter drips or flows through channels into storage

Portal appearance reflects selected Matter type:

- Overworld: blue / green
- Nether: red / orange
- End: purple / black

---

### Chemical Plant

Primary processing machine.

Purpose:

- Fuel refinement
- Matter refinement
- Concentrate production

This is one of the few machines that should have a GUI because the player must select recipes.

Example:

```text
Nether Matter
+
Gold Extraction Recipe
→ Gold Concentrate
```

Example:

```text
Nether Matter
+
Quartz Extraction Recipe
→ Quartz Concentrate
```

The Chemical Plant is the gameplay centerpiece of the mod.

Visuals:

- Swirling fluid
- Recipe-colored processing chamber
- Bubbles / steam / movement

---

### Liquid Solidifier

Final production machine.

Purpose:

Convert concentrates or processed fluids into usable resources.

Examples:

```text
Gold Concentrate
→ Gold Ingot
```

```text
Iron Concentrate
→ Iron Ingot
```

---

### Matter Containment Vessel

Large-scale dimensional fluid storage.

Visual design:

- Glass containment structure
- Floating orb
- Fluid-colored glow
- Matter droplets at high fill levels

Concept:

Internal volume exceeds external dimensions.

Can optionally use power to increase storage capacity.

At high fill:

- Brighter orb
- More distortion
- Occasional drips

---

### Dimensional Reclaimer

End-tier recycling machine.

Purpose:

- Recover Matter from old mod infrastructure
- Convert unwanted items into Matter
- Close the factory resource loop

It should not be available early, to prevent progression skipping.

Mod components:

- Return 60-80% of infused Matter

External items:

- Converted into Matter, not raw resources
- Standard materials return around 40-60% equivalent Matter

Visual theme:

Items are suspended and dissolved into dimensional signatures, not crushed.

---

## Machine IO Philosophy

Machines should have simple, obvious IO.

Preferred maximums:

- One item input
- One fluid input
- One energy / resonance input
- One output

Avoid sided configuration.

Item transport should be handled by other mods or vanilla mechanics where possible.

The mod should not attempt to replace:

- AE2
- LaserIO
- XNet
- Pipez
- Mekanism logistical systems
- Integrated Dynamics

---

## Scope Boundaries

The core mod does not include:

- Player teleportation
- Dimension travel
- Combat progression
- Boss requirements
- Mandatory exploration
- Dedicated item transport systems
- Large reactor-style power systems

Possible addons may include dimensional travel later, but the core mod extracts matter from dimensions. It does not transport players to them.

---

## Current Core Feature Set

Core systems:

- Fuel system
- Matter system
- Resonance Network
- Matter refinement
- Resource solidification
- Visible progression
- Infrastructure upgrades
- Recycling loop

Core machines:

- Clock Spring Generator
- Dimensional Generator
- Powered Dimensional Fluctuator
- Dimensional Drain
- Dimensional Infuser
- Dimensional Stabilizer
- Dimensional Miner
- Chemical Plant
- Liquid Solidifier
- Matter Containment Vessel
- Dimensional Reclaimer

Core components:

- Resonance Frame
- Resonance Conduit
- Matter Containment Vessel
