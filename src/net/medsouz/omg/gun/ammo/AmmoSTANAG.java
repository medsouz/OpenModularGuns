package net.medsouz.omg.gun.ammo;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.medsouz.omg.api.Ammunition;
import net.medsouz.omg.model.ModelBetaC;
import net.medsouz.omg.model.ModelSTANAG;
import net.medsouz.omg.util.Vector3;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

//A generic 30 round STANAG magazine
public class AmmoSTANAG extends Ammunition{

	ModelSTANAG model;
	ResourceLocation stanagtex = new ResourceLocation("omg", "textures/model/STANAG.png");
	
	public AmmoSTANAG(){
		Side side = FMLCommonHandler.instance().getEffectiveSide();
		if(side == Side.CLIENT){
			model = new ModelSTANAG();
		}
	}
	
	@Override
	public String getAmmoType() {
		return "5.56x45mm_NATO";
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
		Minecraft.getMinecraft().renderEngine.bindTexture(stanagtex);
		model.render(e, 0.03f);
	}

}
