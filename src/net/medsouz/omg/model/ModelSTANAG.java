package net.medsouz.omg.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSTANAG extends ModelBase
{
  //fields
    ModelRenderer Top;
    ModelRenderer Bottom;
    ModelRenderer[] parts;
  
  public ModelSTANAG()
  {
    textureWidth = 10;
    textureHeight = 6;
    
      Top = new ModelRenderer(this, 0, 0);
      Top.addBox(0F, 2.3F, 0.5F, 2, 3, 3);
      Top.setRotationPoint(0F, 0F, 0F);
      Top.setTextureSize(10, 6);
      Top.mirror = true;
      setRotation(Top, -0.3839724F, 0F, 0F);
      Bottom = new ModelRenderer(this, 0, 0);
      Bottom.addBox(0F, 0F, 0F, 2, 3, 3);
      Bottom.setRotationPoint(0F, 0F, 0F);
      Bottom.setTextureSize(10, 6);
      Bottom.mirror = true;
      setRotation(Bottom, -0.1919862F, 0F, 0F);
      parts = new ModelRenderer[]{Top, Bottom};
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
    Top.render(f5);
    Bottom.render(f5);
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
