
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.talir.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.talir.block.RopaBlock;
import net.mcreator.talir.block.RoclocBlock;
import net.mcreator.talir.block.PlastBlock;
import net.mcreator.talir.TalirMod;

public class TalirModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TalirMod.MODID);
	public static final RegistryObject<Block> PLAST = REGISTRY.register("plast", () -> new PlastBlock());
	public static final RegistryObject<Block> ROCLOC = REGISTRY.register("rocloc", () -> new RoclocBlock());
	public static final RegistryObject<Block> ROPA = REGISTRY.register("ropa", () -> new RopaBlock());
}
