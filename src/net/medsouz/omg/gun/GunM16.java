package net.medsouz.omg.gun;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.medsouz.omg.api.Gun;
import net.medsouz.omg.client.model.ModelM16;
import net.medsouz.omg.util.Vector3;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class GunM16 extends Gun{
	
	ModelM16 model;
	ResourceLocation m16tex = new ResourceLocation("omg", "textures/model/m16.png");

	public GunM16(){
		Side side = FMLCommonHandler.instance().getEffectiveSide();
		if(side == Side.CLIENT){
			model = new ModelM16();
		}
	}
	
	@Override
	public void drawGun(Entity e, boolean isFirstPerson, boolean aimedDownSight) {
		EntityPlayer ep = (EntityPlayer) e;
		RenderPlayer er = (RenderPlayer) RenderManager.instance.getEntityRenderObject(ep);
		if(isFirstPerson){
			//Minecraft.getMinecraft().renderEngine.func_110577_a(er.func_110817_a((AbstractClientPlayer) ep));
			Minecraft.getMinecraft().renderEngine.bindTexture(Minecraft.getMinecraft().thePlayer.getLocationSkin());
			if(aimedDownSight){
				GL11.glPushMatrix();
					GL11.glTranslatef(0.3f, 0.1f, -1.6f);
					GL11.glRotatef(-40f, 0, 0, 1);
					GL11.glRotatef(60f, 1, 0, 0);
					er.renderFirstPersonArm(ep);
				GL11.glPopMatrix();
				GL11.glPushMatrix();
					GL11.glTranslatef(-0.12f, 0.68f, -0.997f);
					GL11.glRotatef(-156f, 0, 0, 1);
					GL11.glRotatef(95f, 0, 1, 0);
					Minecraft.getMinecraft().renderEngine.bindTexture(m16tex);
					model.render(e, 0.03f);
				GL11.glPopMatrix();
			}else{
				GL11.glPushMatrix();
					GL11.glTranslatef(0.45f, 0f, -1.1f);
					GL11.glRotatef(-60f, 0, 0, 1);
					GL11.glRotatef(60f, 1, 0, 0);
					er.renderFirstPersonArm(ep);
				GL11.glPopMatrix();
				GL11.glPushMatrix();
					GL11.glTranslatef(0.3f, 0.6f, -0.4f);
					GL11.glRotatef(-156f, 0, 0, 1);
					GL11.glRotatef(90f, 0, 1, 0);
					Minecraft.getMinecraft().renderEngine.bindTexture(m16tex);
					model.render(e, 0.03f);
				GL11.glPopMatrix();
			}
		}else{
			GL11.glPushMatrix();
				if(aimedDownSight){
					GL11.glTranslatef(0.8f, 0.55f, 0.1f);
					GL11.glRotatef(-145f, 0, 0, 1);
					GL11.glRotatef(90f, 0, 1, 0);
				}else{
					GL11.glTranslatef(0.5f, 0.5f, 0.2f);
					GL11.glRotatef(-115f, 0, 0, 1);
					GL11.glRotatef(90f, 0, 1, 0);
				}
				Minecraft.getMinecraft().renderEngine.bindTexture(m16tex);
				model.render(e, 0.03f);
			GL11.glPopMatrix();
		}
	}

	@Override
	public void drawDroppedGun(Entity e) {
		GL11.glPushMatrix();
			GL11.glTranslatef(0f, -0.2f, 0f);
			GL11.glRotatef(90f, 0, 0, 1);
			GL11.glRotatef(e.rotationYaw, 1, 0, 0);
			GL11.glScalef(1.5f, 1.5f, 1.5f);
			Minecraft.getMinecraft().renderEngine.bindTexture(m16tex);
			model.render(e, 0.03f);
		GL11.glPopMatrix();
	}

	@Override
	public boolean isTwoHanded() {
		return true;
	}

	@Override
	public Vector3 rightHandRot(Vector3 origRot, boolean aimedDownSight) {
		if(aimedDownSight){
			origRot.x = -1.6F;
			origRot.y = -0.4F;
		}else{
			origRot.x = -1.1F;
			origRot.y = -0.2F;
		}
		return origRot;
	}
	
	@Override
	public Vector3 rightHandPos(Vector3 origPos, boolean aimedDownSight) {
		if(aimedDownSight){
			origPos.z = 0.2F;
		}else{
			origPos.x = 0.1F;
			origPos.z = 0.2F;
		}
		return origPos;
	}

	@Override
	public Vector3 leftHandRot(Vector3 origRot, boolean aimedDownSight) {
		if(aimedDownSight){
			origRot.x = -1.8F;
			origRot.y = 0.3F;
		}else{
			origRot.x = -1.7F;
			origRot.y = 0.5F;
		}
		return origRot;
	}
	
	@Override
	public Vector3 leftHandPos(Vector3 origPos, boolean aimedDownSight) {
		if(aimedDownSight){
			origPos.x = -0.05F;
			origPos.z = -0.2F;
		}else{
			origPos.y = 0.05F;
			origPos.z = -0.1F;
		}
		return origPos;
	}
	
	@Override
	public Vector3 getMagPosition(boolean isFirstPerson, boolean aimedDownSight){
		if(isFirstPerson){
			if(aimedDownSight){
				return new Vector3(-0.05f, 0.51f, -0.97f);
			}else{
				return new Vector3(0.37f, 0.42f, -0.38f);
			}
		}else{
			if(aimedDownSight){
				return new Vector3(0.9f,0.39f,0.13f);
			}else{
				return new Vector3(0.65f,0.41f,0.23f);
			}
		}
	}
	
	@Override
	public void setMagRotation(boolean isFirstPerson, boolean aimedDownSight){
		if(isFirstPerson){
			if(aimedDownSight){
				GL11.glRotatef(90f, 0, 1, 0);
				GL11.glRotatef(160f, 1, 0, 0);
			}else{
				GL11.glRotatef(90f, 0, 1, 0);
				GL11.glRotatef(150f, 1, 0, 0);
			}
		}else{
			if(aimedDownSight){
				GL11.glRotatef(90f, 0, 1, 0);
				GL11.glRotatef(130f, 1, 0, 0);
			}else{
				GL11.glRotatef(90f, 0, 1, 0);
				GL11.glRotatef(97f, 1, 0, 0);
			}
		}
	}
}
