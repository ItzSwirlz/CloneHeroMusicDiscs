package com.github.ItzSwirlz.CloneHeroMusicDiscs.soundevents;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class CHMDSoundEvents {
	private static final DeferredRegister<SoundEvent> SOUNDEVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "cloneheromusicdiscs");

	public static final RegistryObject<SoundEvent> COALESCENCE_AND_SEGMENTATION = SOUNDEVENTS.register("music_disc.coalescenceandsegmentation", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.coalescenceandsegmentation")));
    public static final RegistryObject<SoundEvent> CONSTELLATION = SOUNDEVENTS.register("music_disc.constellation", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.constellation")));
    public static final RegistryObject<SoundEvent> EPIDOX = SOUNDEVENTS.register("music_disc.epidox", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.epidox")));
    public static final RegistryObject<SoundEvent> MINDS_OF_THE_MAD = SOUNDEVENTS.register("music_disc.mindsofthemad", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.mindsofthemad")));
    public static final RegistryObject<SoundEvent> OBSIDIAN = SOUNDEVENTS.register("music_disc.obsidian", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.obsidian")));
    public static final RegistryObject<SoundEvent> REMINISCE = SOUNDEVENTS.register("music_disc.reminisce", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.reminisce")));
    public static final RegistryObject<SoundEvent> SOLAR_STORM = SOUNDEVENTS.register("music_disc.solarstorm", () -> new SoundEvent(new ResourceLocation("cloneheromusicdiscs", "music_disc.solarstorm")));

    public static void registerSoundEvents() {
		SOUNDEVENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
    
}
 