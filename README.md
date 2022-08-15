# Clone Hero Music Discs

This mod takes famous songs in [Clone Hero](https://clonehero.net/) and creates music discs for them!

There are no added creative mode tabs or extra features - just the music discs,
and they are made to blend exactly with the game (other than a /give command because
of the modid the items are registered with). That includes creepers dropping these
custom music discs!

These songs were all added with consent of the original composer.

## Installation
At the moment, this mod only supports Minecraft Forge and only on version 1.19.1. If you don't like the chat moderation system, too bad. Speak nicer on the internet. If there is demand in the future, I will port this mod to older versions (I most likely will make one for 1.8.9, 1.12.2 and/or 1.16.5 as they are the usual favorites)

Take a copy of the jar from the [CI builds](https://github.com/ItzSwirlz/CloneHeroMusicDiscs/actions) and then extract them into your mods folder in your Minecraft folder.

## Can you add (foo) song by (bar)?
In respect for the composers, so I'm not throwing their music everywhere, music is only published here with permission from the original artists. As for the end user, I would recommend not uploading content of the mod with the entire song playing, as getting money off that audio is pretty unfair to the song creators. (Showcase videos are fine, but no matter what do not make many off of ANY of the songs.)

If you have a song that is either a Guitar Hero/Rock Band/Rock Band Network custom that you would like to see implemented into the mod, please let me know! [Create an issue](https://github.com/ItzSwirlz/CloneHeroMusicDiscs/issues) asking for it and I will get in touch with the composer. If the composer lets us use the song in the mod, it will be added! (Remember, it does not have to be from a famous person. The goal of this project is to add great music from community members into another game, and hopefully introduce players to new artists).

## Why? We really don't need this.
If you don't want it, just don't use it. I know you can listen to music in the background, but this is kind of an experiment, and a for-fun project. I think that for SMP servers, esepcially for mini CH communities this will be great. Jamming to a song while building something could be fun. Speaking of SMP servers,

## Is there server support?
I'll admit, I've basically **never** touched server modding. I've always been a client-sider modder, however I can confirm that by testing, a forge server with this plugin does indeed work. However, this means sacrificing plugins unless you have a mod that lets you combine Forge mods and plugins, examples being [Magma](https://magmafoundation.org), [the Sponge API](https://spongepowered.org) or any other hybrid-server client. This can come with trade-offs; devs should discuss with admins and the playerbase before switching and adding this mod in.

As for 1.19x, the only project I see in active development for a hybrid Forge + plugin server is [Mohist](https://mohistmc.com), which is still under development. Once it gets finish, I am all in for supporting it.

## I spotted a bug/I have an idea!
[File an issue!](https://github.com/ItzSwirlz/CloneHeroMusicDiscs/issues) . I'm open to any ideas and am a critic of myself.

## How can I contribute?
[Open a PR!](https://github.com/ItzSwirlz/CloneHeroMusicDiscs/pulls) The mod is simple - initialize a Minecraft SoundEvent for the song, which is an .ogg file stored in the src/main/resources folder and is linked with the "sounds.json" file. Then the same regular deal with adding items, just with having to keep the RecordItem ID consistently increasing and not skipping, and starting at 15, and also having to specify how long the song takes in terms of ticks (Because Minecraft). Then it is all texturing, of course if you have any ideas please let me know.

## Donations
Keep your money. But if you insist on donating for a simple block-game mod, consister donating to my main project, the [Ubuntu Cinnamon Remix](ubuntucinnamon.org).

## License
This mod is licensed under the GNU General Public License version 3.0 or later. If you haven't read the preamble it basically boils down to this: Do not sell my code/product, and do not use any of my code directly it without crediting me.
