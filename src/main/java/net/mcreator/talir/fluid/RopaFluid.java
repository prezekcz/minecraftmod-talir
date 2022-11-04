
package net.mcreator.talir.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.talir.init.TalirModItems;
import net.mcreator.talir.init.TalirModFluids;
import net.mcreator.talir.init.TalirModBlocks;

public abstract class RopaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(TalirModFluids.ROPA, TalirModFluids.FLOWING_ROPA,
			FluidAttributes.builder(new ResourceLocation("talir:blocks/oo"), new ResourceLocation("talir:blocks/oo"))

					.gaseous()

	).explosionResistance(100f)

			.bucket(TalirModItems.ROPA_BUCKET).block(() -> (LiquidBlock) TalirModBlocks.ROPA.get());

	private RopaFluid() {
		super(PROPERTIES);
	}

	public static class Source extends RopaFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends RopaFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
