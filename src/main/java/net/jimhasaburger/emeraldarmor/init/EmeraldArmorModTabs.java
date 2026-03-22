/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.jimhasaburger.emeraldarmor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.jimhasaburger.emeraldarmor.EmeraldArmorMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EmeraldArmorModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EmeraldArmorMod.MODID);
	public static final RegistryObject<CreativeModeTab> EMERALDARMORTAB = REGISTRY.register("emeraldarmortab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.emerald_armor.emeraldarmortab")).icon(() -> new ItemStack(EmeraldArmorModItems.EMERALD_ARMOR_CHESTPLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EmeraldArmorModItems.EMERALD_ARMOR_HELMET.get());
				tabData.accept(EmeraldArmorModItems.EMERALD_ARMOR_CHESTPLATE.get());
				tabData.accept(EmeraldArmorModItems.EMERALD_ARMOR_LEGGINGS.get());
				tabData.accept(EmeraldArmorModItems.EMERALD_ARMOR_BOOTS.get());
				tabData.accept(EmeraldArmorModItems.EMERALD_PICKAXE.get());
				tabData.accept(EmeraldArmorModItems.EMERALD_AXE.get());
				tabData.accept(EmeraldArmorModItems.EMERALD_SWORD.get());
				tabData.accept(EmeraldArmorModItems.EMERALD_SHOVEL.get());
				tabData.accept(EmeraldArmorModItems.EMERALD_HOE.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(EmeraldArmorModItems.EMERALD_ARMOR_HELMET.get());
			tabData.accept(EmeraldArmorModItems.EMERALD_ARMOR_CHESTPLATE.get());
			tabData.accept(EmeraldArmorModItems.EMERALD_ARMOR_LEGGINGS.get());
			tabData.accept(EmeraldArmorModItems.EMERALD_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(EmeraldArmorModItems.EMERALD_PICKAXE.get());
			tabData.accept(EmeraldArmorModItems.EMERALD_AXE.get());
			tabData.accept(EmeraldArmorModItems.EMERALD_SWORD.get());
			tabData.accept(EmeraldArmorModItems.EMERALD_SHOVEL.get());
			tabData.accept(EmeraldArmorModItems.EMERALD_HOE.get());
		}
	}
}