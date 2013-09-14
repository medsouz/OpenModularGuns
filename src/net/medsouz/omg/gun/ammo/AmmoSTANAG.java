package net.medsouz.omg.gun.ammo;

import org.lwjgl.opengl.GL11;

import net.medsouz.omg.api.Ammunition;
import net.medsouz.omg.model.ModelSTANAG;
import net.medsouz.omg.util.Vector3;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

//A generic 30 round STANAG magazine
public class AmmoSTANAG extends Ammunition{

	ModelSTANAG model = new ModelSTANAG();
	ResourceLocation stanagtex = new ResourceLocation("omg", "textures/model/STANAG.png");
	
	@Override
	public String getAmmoType() {
		return "5.56×45mm_NATO";
	}

	@Override
	public int getClipSize() {
		return 30;
	}

	@Override
	public boolean keepIfEmpty() {
		return true;
	}

	@Override
	public void drawMagazine(Entity e) {
		Minecraft.getMinecraft().renderEngine.func_110577_a(stanagtex);
		model.render(e, 0.03f);
	}

}
