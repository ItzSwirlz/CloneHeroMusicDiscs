package com.github.ItzSwirlz.CloneHeroMusicDiscs.soundevents;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CHMDSoundEvents {
	private static final DeferredRegister<SoundEvent> SOUNDEVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "cloneheromusicdiscs");

    public static final RegistryObject<SoundEvent> CELESTIAL_GROOVE = SOUNDEVENTS.register("music_disc.celestialgroove", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.celestialgroove")));
    public static final RegistryObject<SoundEvent> COALESCENCE_AND_SEGMENTATION = SOUNDEVENTS.register("music_disc.coalescenceandsegmentation", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.coalescenceandsegmentation")));
    public static final RegistryObject<SoundEvent> CONSTELLATION = SOUNDEVENTS.register("music_disc.constellation", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.constellation")));
    public static final RegistryObject<SoundEvent> EPIDOX = SOUNDEVENTS.register("music_disc.epidox", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.epidox")));
    public static final RegistryObject<SoundEvent> MINDS_OF_THE_MAD = SOUNDEVENTS.register("music_disc.mindsofthemad", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.mindsofthemad")));
    public static final RegistryObject<SoundEvent> OBSIDIAN = SOUNDEVENTS.register("music_disc.obsidian", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.obsidian")));
    public static final RegistryObject<SoundEvent> REMINISCE = SOUNDEVENTS.register("music_disc.reminisce", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.reminisce")));
    public static final RegistryObject<SoundEvent> SOLAR_STORM = SOUNDEVENTS.register("music_disc.solarstorm", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.solarstorm")));

    // Soulless series
    public static final RegistryObject<SoundEvent> SOULLESS = SOUNDEVENTS.register("music_disc.soulless", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.soulless")));
    public static final RegistryObject<SoundEvent> SOULLESS2 = SOUNDEVENTS.register("music_disc.soullesstwo", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.soullesstwo")));
    public static final RegistryObject<SoundEvent> SOULLESS3 = SOUNDEVENTS.register("music_disc.soullessthree", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.soullessthree")));
    public static final RegistryObject<SoundEvent> SOULLESS4 = SOUNDEVENTS.register("music_disc.soullessfour", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.soullessfour")));
    public static final RegistryObject<SoundEvent> SOULLESS5 = SOUNDEVENTS.register("music_disc.soullessfive", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.soullessfive")));
    public static final RegistryObject<SoundEvent> SOULLESS6 = SOUNDEVENTS.register("music_disc.soullesssix", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.soullesssix")));

    public static void registerSoundEvents() {
		SOUNDEVENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

}
 