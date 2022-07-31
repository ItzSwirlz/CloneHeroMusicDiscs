package com.github.ItzSwirlz.CloneHeroMusicDiscs.items;

import com.github.ItzSwirlz.CloneHeroMusicDiscs.soundevents.CHMDSoundEvents;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CHMDItems {
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "cloneheromusicdiscs");

	public static final RegistryObject<Item> MUSIC_DISC_COALESCENCE_AND_SEGMENTATION = ITEMS.register("music_disc.coalescenceandsegmentation", () -> new RecordItem(16, CHMDSoundEvents.COALESCENCE_AND_SEGMENTATION, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE), 25160));
    public static final RegistryObject<Item> MUSIC_DISC_CONSTELLATION = ITEMS.register("music_disc.constellation", () -> new RecordItem(17, CHMDSoundEvents.CONSTELLATION, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE), 18280));
    public static final RegistryObject<Item> MUSIC_DISC_REMINISCE = ITEMS.register("music_disc.reminisce", () -> new RecordItem(18, CHMDSoundEvents.REMINISCE, (new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE)), 2280));
    public static final RegistryObject<Item> MUSIC_DISC_SOLAR_STORM = ITEMS.register("music_disc.solarstorm", () -> new RecordItem(19, CHMDSoundEvents.SOLAR_STORM, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE), 4080));

    public static void registerItems() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
    
}
