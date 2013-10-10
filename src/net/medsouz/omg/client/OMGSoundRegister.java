package net.medsouz.omg.client;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class OMGSoundRegister {
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event) {
		event.manager.addSound("omg:msixteen1.ogg");
		event.manager.addSound("omg:msixteen2.ogg");
		event.manager.addSound("omg:msixteen3.ogg");
		event.manager.addSound("omg:msixteen4.ogg");
		event.manager.addSound("omg:msixteen5.ogg");
	}
}
