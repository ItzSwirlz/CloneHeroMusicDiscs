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

	// Songs added version 1.0.0
    public static final RegistryObject<Item> MUSIC_DISC_CELESTIAL_GROOVE = ITEMS.register("music_disc.celestialgroove", () -> new RecordItem(17, CHMDSoundEvents.CELESTIAL_GROOVE, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE), 7160));
    public static final RegistryObject<Item> MUSIC_DISC_COALESCENCE_AND_SEGMENTATION = ITEMS.register("music_disc.coalescenceandsegmentation", () -> new RecordItem(18, CHMDSoundEvents.COALESCENCE_AND_SEGMENTATION, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE), 25160));
    public static final RegistryObject<Item> MUSIC_DISC_CONSTELLATION = ITEMS.register("music_disc.constellation", () -> new RecordItem(19, CHMDSoundEvents.CONSTELLATION, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE), 18280));
    public static final RegistryObject<Item> MUSIC_DISC_EPIDOX = ITEMS.register("music_disc.epidox", () -> new RecordItem(20, CHMDSoundEvents.EPIDOX, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE), 6520));
    public static final RegistryObject<Item> MUSIC_DISC_MINDS_OF_THE_MAD = ITEMS.register("music_disc.mindsofthemad", () -> new RecordItem(21, CHMDSoundEvents.MINDS_OF_THE_MAD, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE), 5240));
    public static final RegistryObject<Item> MUSIC_DISC_OBSIDIAN = ITEMS.register("music_disc.obsidian", () -> new RecordItem(22, CHMDSoundEvents.OBSIDIAN, (new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE)), 4440));
    public static final RegistryObject<Item> MUSIC_DISC_REMINISCE = ITEMS.register("music_disc.reminisce", () -> new RecordItem(23, CHMDSoundEvents.REMINISCE, (new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE)), 2280));
    public static final RegistryObject<Item> MUSIC_DISC_SOLAR_STORM = ITEMS.register("music_disc.solarstorm", () -> new RecordItem(24, CHMDSoundEvents.SOLAR_STORM, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE), 4080));

    // Soulless series
    public static final RegistryObject<Item> MUSIC_DISC_SOULLESS = ITEMS.register("music_disc.soulless", () -> new RecordItem(25, CHMDSoundEvents.SOULLESS, (new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE)), 8280));
    public static final RegistryObject<Item> MUSIC_DISC_SOULLESS2 = ITEMS.register("music_disc.soullesstwo", () -> new RecordItem(26, CHMDSoundEvents.SOULLESS2, (new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE)), 6680));
    public static final RegistryObject<Item> MUSIC_DISC_SOULLESS3 = ITEMS.register("music_disc.soullessthree", () -> new RecordItem(27, CHMDSoundEvents.SOULLESS3, (new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE)), 8120));
    public static final RegistryObject<Item> MUSIC_DISC_SOULLESS4 = ITEMS.register("music_disc.soullessfour", () -> new RecordItem(28, CHMDSoundEvents.SOULLESS4, (new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE)), 15480));
    public static final RegistryObject<Item> MUSIC_DISC_SOULLESS5 = ITEMS.register("music_disc.soullessfive", () -> new RecordItem(29, CHMDSoundEvents.SOULLESS5, (new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE)), 20400));
    public static final RegistryObject<Item> MUSIC_DISC_SOULLESS6 = ITEMS.register("music_disc.soullesssix", () -> new RecordItem(30, CHMDSoundEvents.SOULLESS6, (new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE)), 1440));

    public static final RegistryObject<Item> MUSIC_DISC_CODES = ITEMS.register("music_disc.codes", () -> new RecordItem(31, CHMDSoundEvents.CODES, (new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC)).rarity(Rarity.RARE), 4560));
    public static final RegistryObject<Item> MUSIC_DISC_COSMIC_EMBASSY = ITEMS.register("music_disc.cosmicembassy", () -> new RecordItem(32, CHMDSoundEvents.COSMIC_EMBASSY, (new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE)), 4800));
    public static final RegistryObject<Item> MUSIC_DISC_PENGER = ITEMS.register("music_disc.penger", () -> new RecordItem(33, CHMDSoundEvents.PENGER, (new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE)), 6600));

    public static void registerItems() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

}
