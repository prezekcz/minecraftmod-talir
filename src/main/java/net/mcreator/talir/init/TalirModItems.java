
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.talir.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.talir.item.RopaItem;
import net.mcreator.talir.item.NicSwordItem;
import net.mcreator.talir.item.NicShovelItem;
import net.mcreator.talir.item.NicPickaxeItem;
import net.mcreator.talir.item.NicHoeItem;
import net.mcreator.talir.item.NicAxeItem;
import net.mcreator.talir.item.MujArmorArmorItem;
import net.mcreator.talir.item.DruhyArmorArmorItem;
import net.mcreator.talir.TalirMod;

public class TalirModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TalirMod.MODID);
	public static final RegistryObject<Item> NIC_PICKAXE = REGISTRY.register("nic_pickaxe", () -> new NicPickaxeItem());
	public static final RegistryObject<Item> NIC_AXE = REGISTRY.register("nic_axe", () -> new NicAxeItem());
	public static final RegistryObject<Item> NIC_SWORD = REGISTRY.register("nic_sword", () -> new NicSwordItem());
	public static final RegistryObject<Item> NIC_SHOVEL = REGISTRY.register("nic_shovel", () -> new NicShovelItem());
	public static final RegistryObject<Item> NIC_HOE = REGISTRY.register("nic_hoe", () -> new NicHoeItem());
	public static final RegistryObject<Item> PLAST = block(TalirModBlocks.PLAST, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ROCLOC = block(TalirModBlocks.ROCLOC, CreativeModeTab.TAB_COMBAT);
	public static final RegistryObject<Item> ROPA_BUCKET = REGISTRY.register("ropa_bucket", () -> new RopaItem());
	public static final RegistryObject<Item> MUJ_ARMOR_ARMOR_HELMET = REGISTRY.register("muj_armor_armor_helmet",
			() -> new MujArmorArmorItem.Helmet());
	public static final RegistryObject<Item> MUJ_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("muj_armor_armor_chestplate",
			() -> new MujArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> MUJ_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("muj_armor_armor_leggings",
			() -> new MujArmorArmorItem.Leggings());
	public static final RegistryObject<Item> MUJ_ARMOR_ARMOR_BOOTS = REGISTRY.register("muj_armor_armor_boots", () -> new MujArmorArmorItem.Boots());
	public static final RegistryObject<Item> DRUHY_ARMOR_ARMOR_HELMET = REGISTRY.register("druhy_armor_armor_helmet",
			() -> new DruhyArmorArmorItem.Helmet());
	public static final RegistryObject<Item> DRUHY_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("druhy_armor_armor_chestplate",
			() -> new DruhyArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> DRUHY_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("druhy_armor_armor_leggings",
			() -> new DruhyArmorArmorItem.Leggings());
	public static final RegistryObject<Item> DRUHY_ARMOR_ARMOR_BOOTS = REGISTRY.register("druhy_armor_armor_boots",
			() -> new DruhyArmorArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
