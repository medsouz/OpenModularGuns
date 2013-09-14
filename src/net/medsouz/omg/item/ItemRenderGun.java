package net.medsouz.omg.item;

import org.lwjgl.opengl.GL11;

import net.medsouz.omg.api.Gun;
import net.medsouz.omg.gun.ammo.AmmoSTANAG;
import net.medsouz.omg.util.Vector3;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderGun implements IItemRenderer {

	AmmoSTANAG s = new AmmoSTANAG();//TODO: dont hardcode this

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		// only render if equipped
		switch (type) {
			case EQUIPPED_FIRST_PERSON:
				return true;
			case EQUIPPED:
				return true;
			case ENTITY:
				return true;
			default:
				return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return false;
	}
	
	public void drawGun(Entity e, ItemGun ig, boolean firstPerson, boolean inUse){
		ig.gun.drawGun(e , firstPerson, inUse);
		GL11.glPushMatrix();
			Vector3 attachPoint = ig.gun.getMagPosition(firstPerson, inUse);
			GL11.glTranslatef(attachPoint.x, attachPoint.y, attachPoint.z);
			ig.gun.setMagRotation(firstPerson, inUse);
			s.drawMagazine(Minecraft.getMinecraft().renderViewEntity);
		GL11.glPopMatrix();
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		ItemGun ig = (ItemGun)item.getItem();
		boolean inUse = false;
		if(data[1] instanceof EntityPlayer){
			inUse = (((EntityPlayer)data[1]).getItemInUse() == item);
		}
		switch(type){
			case EQUIPPED_FIRST_PERSON:
				drawGun(Minecraft.getMinecraft().renderViewEntity, ig, true, inUse);
				break;
			case EQUIPPED:
				drawGun((Entity)data[1], ig, false, inUse);
				break;
			case ENTITY:
				ig.gun.drawDroppedGun((Entity)data[1]);
				break;
			default:
				break;
		}
		
	}

}
