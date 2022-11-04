
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.talir.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.talir.fluid.RopaFluid;
import net.mcreator.talir.TalirMod;

public class TalirModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, TalirMod.MODID);
	public static final RegistryObject<Fluid> ROPA = REGISTRY.register("ropa", () -> new RopaFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_ROPA = REGISTRY.register("flowing_ropa", () -> new RopaFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ROPA.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ROPA.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
