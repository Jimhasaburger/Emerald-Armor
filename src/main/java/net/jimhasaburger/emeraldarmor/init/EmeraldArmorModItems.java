/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.jimhasaburger.emeraldarmor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.jimhasaburger.emeraldarmor.item.*;
import net.jimhasaburger.emeraldarmor.EmeraldArmorMod;

public class EmeraldArmorModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EmeraldArmorMod.MODID);
	public static final RegistryObject<Item> EMERALD_ARMOR_HELMET;
	public static final RegistryObject<Item> EMERALD_ARMOR_CHESTPLATE;
	public static final RegistryObject<Item> EMERALD_ARMOR_LEGGINGS;
	public static final RegistryObject<Item> EMERALD_ARMOR_BOOTS;
	public static final RegistryObject<Item> EMERALD_PICKAXE;
	public static final RegistryObject<Item> EMERALD_AXE;
	public static final RegistryObject<Item> EMERALD_SWORD;
	public static final RegistryObject<Item> EMERALD_SHOVEL;
	public static final RegistryObject<Item> EMERALD_HOE;
	static {
		EMERALD_ARMOR_HELMET = REGISTRY.register("emerald_armor_helmet", EmeraldArmorItem.Helmet::new);
		EMERALD_ARMOR_CHESTPLATE = REGISTRY.register("emerald_armor_chestplate", EmeraldArmorItem.Chestplate::new);
		EMERALD_ARMOR_LEGGINGS = REGISTRY.register("emerald_armor_leggings", EmeraldArmorItem.Leggings::new);
		EMERALD_ARMOR_BOOTS = REGISTRY.register("emerald_armor_boots", EmeraldArmorItem.Boots::new);
		EMERALD_PICKAXE = REGISTRY.register("emerald_pickaxe", EmeraldpickaxeItem::new);
		EMERALD_AXE = REGISTRY.register("emerald_axe", EmeraldaxeItem::new);
		EMERALD_SWORD = REGISTRY.register("emerald_sword", EmeraldswordItem::new);
		EMERALD_SHOVEL = REGISTRY.register("emerald_shovel", EmeraldshovelItem::new);
		EMERALD_HOE = REGISTRY.register("emerald_hoe", EmeraldHoeItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}