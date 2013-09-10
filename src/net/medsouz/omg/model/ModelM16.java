package net.medsouz.omg.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
 
public class ModelM16 extends ModelBase
{
  
  //fields
    ModelRenderer grip2;
    ModelRenderer clipEnd;
    ModelRenderer grip1;
    ModelRenderer ironSight5;
    ModelRenderer ironSight1;
    ModelRenderer ironSight2;
    ModelRenderer ammoSlot;
    ModelRenderer clipBase;
    ModelRenderer stock3;
    ModelRenderer ironSight4;
    ModelRenderer torchBody;
    ModelRenderer handle2;
    ModelRenderer stock1;
    ModelRenderer stock2;
    ModelRenderer barrel;
    ModelRenderer handle1;
    ModelRenderer ironSight3;
    ModelRenderer handle3;
    ModelRenderer body;
    ModelRenderer torchHead;
    public ModelRenderer muzzleFlash1;
    public ModelRenderer muzzleFlash2;
    public ModelRenderer muzzleFlash3;
    ModelRenderer[] parts;
  
  public ModelM16()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      grip2 = new ModelRenderer(this, 44, 21);
      grip2.addBox(-2F, -4F, -1.5F, 5, 8, 3);
      grip2.setRotationPoint(0F, 0F, 0F);
      grip2.setTextureSize(64, 32);
      grip2.mirror = true;
      setRotation(grip2, 0F, 0F, -0.1745329F);
      clipEnd = new ModelRenderer(this, 52, 0);
      clipEnd.addBox(-10.05333F, 7.32F, -1F, 4, 4, 2);
      clipEnd.setRotationPoint(0F, 0F, 0F);
      clipEnd.setTextureSize(64, 32);
      clipEnd.mirror = true;
      setRotation(clipEnd, 0F, 0F, 0.3665191F);
      grip1 = new ModelRenderer(this, 0, 15);
      grip1.addBox(-28F, -9.06F, -2F, 16, 4, 4);
      grip1.setRotationPoint(0F, 0F, 0F);
      grip1.setTextureSize(64, 32);
      grip1.mirror = true;
      setRotation(grip1, 0F, 0F, 0F);
      ironSight5 = new ModelRenderer(this, 60, 26);
      ironSight5.addBox(-29F, -9F, -0.5F, 1, 1, 1);
      ironSight5.setRotationPoint(0F, 0F, 0F);
      ironSight5.setTextureSize(64, 32);
      ironSight5.mirror = true;
      setRotation(ironSight5, 0F, 0F, 0F);
      muzzleFlash3 = new ModelRenderer(this, 56, 9);
      muzzleFlash3.addBox(-49F, -7.5F, -0.5F, 2, 1, 1);
      muzzleFlash3.setRotationPoint(0F, 0F, 0F);
      muzzleFlash3.setTextureSize(64, 32);
      muzzleFlash3.mirror = true;
      setRotation(muzzleFlash3, 0F, 0F, 0F);
      ironSight1 = new ModelRenderer(this, 60, 26);
      ironSight1.addBox(-33F, -12.50667F, -0.5F, 1, 5, 1);
      ironSight1.setRotationPoint(0F, 0F, 0F);
      ironSight1.setTextureSize(64, 32);
      ironSight1.mirror = true;
      setRotation(ironSight1, 0F, 0F, 0F);
      ironSight2 = new ModelRenderer(this, 60, 26);
      ironSight2.addBox(-32F, -12F, -0.5F, 1, 1, 1);
      ironSight2.setRotationPoint(0F, 0F, 0F);
      ironSight2.setTextureSize(64, 32);
      ironSight2.mirror = true;
      setRotation(ironSight2, 0F, 0F, 0F);
      ammoSlot = new ModelRenderer(this, 36, 0);
      ammoSlot.addBox(-11.5F, -2F, -1.5F, 5, 4, 3);
      ammoSlot.setRotationPoint(0F, 0F, 0F);
      ammoSlot.setTextureSize(64, 32);
      ammoSlot.mirror = true;
      setRotation(ammoSlot, 0F, 0F, 0.1908227F);
      clipBase = new ModelRenderer(this, 52, 0);
      clipBase.addBox(-10.5F, 2F, -1F, 4, 5, 2);
      clipBase.setRotationPoint(0F, 0F, 0F);
      clipBase.setTextureSize(64, 32);
      clipBase.mirror = true;
      setRotation(clipBase, 0F, 0F, 0.296706F);
      stock3 = new ModelRenderer(this, 0, 23);
      stock3.addBox(10F, -9F, -1F, 6, 7, 2);
      stock3.setRotationPoint(0F, 0F, 0F);
      stock3.setTextureSize(64, 32);
      stock3.mirror = true;
      setRotation(stock3, 0F, 0F, 0F);
      ironSight4 = new ModelRenderer(this, 60, 26);
      ironSight4.addBox(-30F, -10F, -0.5F, 1, 1, 1);
      ironSight4.setRotationPoint(0F, 0F, 0F);
      ironSight4.setTextureSize(64, 32);
      ironSight4.mirror = true;
      setRotation(ironSight4, 0F, 0F, 0F);
      torchBody = new ModelRenderer(this, 36, 7);
      torchBody.addBox(-31F, -5F, -1F, 7, 2, 2);
      torchBody.setRotationPoint(0F, 0F, 0F);
      torchBody.setTextureSize(64, 32);
      torchBody.mirror = true;
      setRotation(torchBody, 0F, 0F, 0F);
      handle2 = new ModelRenderer(this, 44, 15);
      handle2.addBox(0.6933333F, -12.14667F, -1F, 2, 4, 2);
      handle2.setRotationPoint(0F, 0F, 0F);
      handle2.setTextureSize(64, 32);
      handle2.mirror = true;
      setRotation(handle2, 0F, 0F, -0.122173F);
      stock1 = new ModelRenderer(this, 2, 25);
      stock1.addBox(2F, -9F, -1F, 4, 5, 2);
      stock1.setRotationPoint(0F, 0F, 0F);
      stock1.setTextureSize(64, 32);
      stock1.mirror = true;
      setRotation(stock1, 0F, 0F, 0F);
      stock2 = new ModelRenderer(this, 2, 24);
      stock2.addBox(6F, -9F, -1F, 4, 6, 2);
      stock2.setRotationPoint(0F, 0F, 0F);
      stock2.setTextureSize(64, 32);
      stock2.mirror = true;
      setRotation(stock2, 0F, 0F, 0F);
      barrel = new ModelRenderer(this, 26, 11);
      barrel.addBox(-41F, -8F, -1F, 13, 2, 2);
      barrel.setRotationPoint(0F, 0F, 0F);
      barrel.setTextureSize(64, 32);
      barrel.mirror = true;
      setRotation(barrel, 0F, 0F, 0F);
      handle1 = new ModelRenderer(this, 0, 11);
      handle1.addBox(-10F, -15F, -1F, 11, 2, 2);
      handle1.setRotationPoint(0F, 2F, 0F);
      handle1.setTextureSize(64, 32);
      handle1.mirror = true;
      setRotation(handle1, 0F, 0F, 0F);
      ironSight3 = new ModelRenderer(this, 60, 26);
      ironSight3.addBox(-31F, -11F, -0.5F, 1, 1, 1);
      ironSight3.setRotationPoint(0F, 0F, 0F);
      ironSight3.setTextureSize(64, 32);
      ironSight3.mirror = true;
      setRotation(ironSight3, 0F, 0F, 0F);
      handle3 = new ModelRenderer(this, 52, 15);
      handle3.addBox(-13F, -9.52F, -1F, 1, 4, 2);
      handle3.setRotationPoint(0F, 0F, 0F);
      handle3.setTextureSize(64, 32);
      handle3.mirror = true;
      setRotation(handle3, 0F, 0F, 0.2617994F);
      body = new ModelRenderer(this, 0, 0);
      body.addBox(-12F, -9F, -2F, 14, 6, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      torchHead = new ModelRenderer(this, 16, 26);
      torchHead.addBox(-34F, -5.5F, -1.5F, 3, 3, 3);
      torchHead.setRotationPoint(0F, 0F, 0F);
      torchHead.setTextureSize(64, 32);
      torchHead.mirror = true;
      setRotation(torchHead, 0F, 0F, 0F);
      muzzleFlash1 = new ModelRenderer(this, 28, 26);
      muzzleFlash1.addBox(-44F, -8.5F, -1.5F, 3, 3, 3);
      muzzleFlash1.setRotationPoint(0F, 0F, 0F);
      muzzleFlash1.setTextureSize(64, 32);
      muzzleFlash1.mirror = true;
      setRotation(muzzleFlash1, 0F, 0F, 0F);
      muzzleFlash2 = new ModelRenderer(this, 54, 7);
      muzzleFlash2.addBox(-47F, -8F, -1F, 3, 2, 2);
      muzzleFlash2.setRotationPoint(0F, 0F, 0F);
      muzzleFlash2.setTextureSize(64, 32);
      muzzleFlash2.mirror = true;
      setRotation(muzzleFlash2, 0F, 0F, 0F);
      parts = new ModelRenderer[]{this.ammoSlot, this.barrel, this.body, this.clipBase, this.clipEnd, this.grip1, this.grip2,
    		  this.handle1, this.handle2, this.handle3, this.ironSight1, this.ironSight2, this.ironSight3, this.ironSight4, 
    		  this.ironSight5, this.muzzleFlash1, this.muzzleFlash2, this.muzzleFlash3, this.stock1, this.stock2, this.stock3,
    		  this.torchBody, this.torchHead};
  }
  
  public void render(Entity entity, float f5)
	{
		for(ModelRenderer model : parts)
		{
			model.renderWithRotation(f5);
		}
 
	}
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    grip2.render(f5);
    clipEnd.render(f5);
    grip1.render(f5);
    ironSight5.render(f5);
    muzzleFlash3.render(f5);
    ironSight1.render(f5);
    ironSight2.render(f5);
    ammoSlot.render(f5);
    clipBase.render(f5);
    stock3.render(f5);
    ironSight4.render(f5);
    torchBody.render(f5);
    handle2.render(f5);
    stock1.render(f5);
    stock2.render(f5);
    barrel.render(f5);
    handle1.render(f5);
    ironSight3.render(f5);
    handle3.render(f5);
    body.render(f5);
    torchHead.render(f5);
    muzzleFlash1.render(f5);
    muzzleFlash2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5,null);
  }
 
}