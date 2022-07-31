package com.github.ItzSwirlz.CloneHeroMusicDiscs;

import com.github.ItzSwirlz.CloneHeroMusicDiscs.items.CHMDItems;
import com.github.ItzSwirlz.CloneHeroMusicDiscs.soundevents.CHMDSoundEvents;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CloneHeroMusicDiscs.MODID)
public class CloneHeroMusicDiscs
{
    public static final String MODID = "cloneheromusicdiscs";

    public CloneHeroMusicDiscs()
    {
        MinecraftForge.EVENT_BUS.register(this);
        CHMDSoundEvents.registerSoundEvents();
        CHMDItems.registerItems();
    }
}
