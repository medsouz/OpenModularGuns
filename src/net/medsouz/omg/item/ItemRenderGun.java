package net.medsouz.omg.item;

import net.medsouz.omg.api.Gun;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderGun implements IItemRenderer {

	public ItemRenderGun() {

	}

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

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		ItemGun ig = (ItemGun)item.getItem();
		boolean inUse = false;
		if(data[1] instanceof EntityPlayer){
			inUse = (((EntityPlayer)data[1]).getItemInUse() == item);
		}
		switch(type){
			case EQUIPPED_FIRST_PERSON:
				ig.gun.drawGun(Minecraft.getMinecraft().renderViewEntity, true, inUse);
				break;
			case EQUIPPED:
				ig.gun.drawGun((Entity)data[1], false, inUse);
				break;
			case ENTITY:
				ig.gun.drawDroppedGun((Entity)data[1]);
				break;
			default:
				break;
		}
		
	}

}
