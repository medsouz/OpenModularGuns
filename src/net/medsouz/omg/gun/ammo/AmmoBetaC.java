package net.medsouz.omg.gun.ammo;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.medsouz.omg.api.Ammunition;
import net.medsouz.omg.client.model.ModelBetaC;
import net.medsouz.omg.client.model.ModelM16;
import net.medsouz.omg.client.model.ModelSTANAG;
import net.medsouz.omg.util.Vector3;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class AmmoBetaC extends Ammunition{

	ModelBetaC model;
	ResourceLocation betactex = new ResourceLocation("omg", "textures/model/BetaC.png");
	
	public AmmoBetaC(){
		Side side = FMLCommonHandler.instance().getEffectiveSide();
		if(side == Side.CLIENT){
			model = new ModelBetaC();
		}
	}
	
	@Override
	public String getAmmoType() {
		return "5.56x45mm_NATO";
	}

	@Override
	public int getClipSize() {
		return 100;
	}

	@Override
	public boolean keepIfEmpty() {
		return true;
	}

	@Override
	public void drawMagazine(Entity e) {
		Minecraft.getMinecraft().renderEngine.bindTexture(betactex);
		model.render(e, 0.03f);
	}

}
