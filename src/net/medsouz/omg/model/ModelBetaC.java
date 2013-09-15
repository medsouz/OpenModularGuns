package net.medsouz.omg.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBetaC extends ModelBase
{
  //fields
    ModelRenderer Bottom;
    ModelRenderer DrumConnector;
    ModelRenderer DrumB;
    ModelRenderer DrumA;
    ModelRenderer[] parts;
  
  public ModelBetaC()
  {
    textureWidth = 16;
    textureHeight = 16;
    
      Bottom = new ModelRenderer(this, 0, 0);
      Bottom.addBox(0F, 0F, 0F, 2, 3, 3);
      Bottom.setRotationPoint(0F, 0F, 0F);
      Bottom.setTextureSize(16, 16);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      DrumConnector = new ModelRenderer(this, 4, 4);
      DrumConnector.addBox(-0.5F, 3F, 0F, 3, 2, 3);
      DrumConnector.setRotationPoint(0F, 0F, 0F);
      DrumConnector.setTextureSize(16, 16);
      DrumConnector.mirror = true;
      setRotation(DrumConnector, 0F, 0F, 0F);
      DrumB = new ModelRenderer(this, 2, 9);
      DrumB.addBox(0F, 0F, 0F, 4, 4, 3);
      DrumB.setRotationPoint(2.5F, 1F, 0F);
      DrumB.setTextureSize(16, 16);
      DrumB.mirror = true;
      setRotation(DrumB, 0F, 0F, 0F);
      DrumA = new ModelRenderer(this, 2, 9);
      DrumA.addBox(-4.5F, 1F, 0F, 4, 4, 3);
      DrumA.setRotationPoint(0F, 0F, 0F);
      DrumA.setTextureSize(16, 16);
      DrumA.mirror = true;
      setRotation(DrumA, 0F, 0F, 0F);
      parts = new ModelRenderer[]{Bottom, DrumConnector, DrumA, DrumB};
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
    Bottom.render(f5);
    DrumConnector.render(f5);
    DrumB.render(f5);
    DrumA.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
