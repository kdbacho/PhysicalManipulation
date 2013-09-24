
package kdbacho.physical.manipulation.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBasicElectronIsolator extends ModelBase
{
	//fields
	public ModelRenderer Base;
	public ModelRenderer plate1;
	public ModelRenderer plate2;
	public ModelRenderer plate3;
	public ModelRenderer joint11;
	public ModelRenderer joint12;
	public ModelRenderer joint13;
	public ModelRenderer joint21;
	public ModelRenderer joint22;
	public ModelRenderer joint23;
	public ModelRenderer pannelRightfaceBack;
	public ModelRenderer pannelRightfaceFront;
	public ModelRenderer pannelLeftfaceFront;
	public ModelRenderer pannelLeftfaceBack;
	public ModelRenderer topPlate;
	public ModelRenderer highestPlate;

	public ModelBasicElectronIsolator()
	{
		textureWidth = 63;
		textureHeight = 64;

		Base = new ModelRenderer(this, 0, 16);
		Base.mirror = true;
		Base.addBox(0F, 0F, 0F, 10, 13, 11);
		Base.setRotationPoint(-5F, 11F, -5F);
		Base.setTextureSize(63, 64);
		Base.mirror = true;
		setRotation(Base, 0F, 0F, 0F);
		Base.mirror = false;
		plate1 = new ModelRenderer(this, 6, 54);
		plate1.addBox(0F, 0F, 0F, 2, 9, 1);
		plate1.setRotationPoint(-4F, 13F, -7F);
		plate1.setTextureSize(63, 64);
		plate1.mirror = true;
		setRotation(plate1, 0F, 0F, 0F);
		plate2 = new ModelRenderer(this, 0, 54);
		plate2.addBox(0F, 0F, 0F, 2, 9, 1);
		plate2.setRotationPoint(-1F, 13F, -7F);
		plate2.setTextureSize(63, 64);
		plate2.mirror = true;
		setRotation(plate2, 0F, 0F, 0F);
		plate3 = new ModelRenderer(this, 12, 54);
		plate3.addBox(0F, 0F, 0F, 2, 9, 1);
		plate3.setRotationPoint(2F, 13F, -7F);
		plate3.setTextureSize(63, 64);
		plate3.mirror = true;
		setRotation(plate3, 0F, 0F, 0F);
		joint11 = new ModelRenderer(this, 41, 50);
		joint11.addBox(0F, 0F, 0F, 2, 1, 1);
		joint11.setRotationPoint(-4F, 13F, -6F);
		joint11.setTextureSize(63, 64);
		joint11.mirror = true;
		setRotation(joint11, 0F, 0F, 0F);
		joint12 = new ModelRenderer(this, 41, 50);
		joint12.addBox(0F, 0F, 0F, 2, 1, 1);
		joint12.setRotationPoint(-1F, 13F, -6F);
		joint12.setTextureSize(63, 64);
		joint12.mirror = true;
		setRotation(joint12, 0F, 0F, 0F);
		joint13 = new ModelRenderer(this, 41, 50);
		joint13.addBox(0F, 0F, 0F, 2, 1, 1);
		joint13.setRotationPoint(2F, 13F, -6F);
		joint13.setTextureSize(63, 64);
		joint13.mirror = true;
		setRotation(joint13, 0F, 0F, 0F);
		joint21 = new ModelRenderer(this, 41, 50);
		joint21.addBox(0F, 0F, 0F, 2, 1, 1);
		joint21.setRotationPoint(-4F, 21F, -6F);
		joint21.setTextureSize(63, 64);
		joint21.mirror = true;
		setRotation(joint21, 0F, 0F, 0F);
		joint22 = new ModelRenderer(this, 41, 50);
		joint22.addBox(0F, 0F, 0F, 2, 1, 1);
		joint22.setRotationPoint(-1F, 21F, -6F);
		joint22.setTextureSize(63, 64);
		joint22.mirror = true;
		setRotation(joint22, 0F, 0F, 0F);
		joint23 = new ModelRenderer(this, 41, 50);
		joint23.addBox(0F, 0F, 0F, 2, 1, 1);
		joint23.setRotationPoint(2F, 21F, -6F);
		joint23.setTextureSize(63, 64);
		joint23.mirror = true;
		setRotation(joint23, 0F, 0F, 0F);
		pannelRightfaceBack = new ModelRenderer(this, 41, 45);
		pannelRightfaceBack.addBox(0F, 0F, 0F, 1, 13, 4);
		pannelRightfaceBack.setRotationPoint(-5F, 11F, -4F);
		pannelRightfaceBack.setTextureSize(63, 64);
		pannelRightfaceBack.mirror = true;
		setRotation(pannelRightfaceBack, 0F, -0.4461433F, 0F);
		pannelRightfaceFront = new ModelRenderer(this, 41, 45);
		pannelRightfaceFront.addBox(-0.5333334F, 0F, 0F, 1, 13, 6);
		pannelRightfaceFront.setRotationPoint(-6F, 11F, -1F);
		pannelRightfaceFront.setTextureSize(63, 64);
		pannelRightfaceFront.mirror = true;
		setRotation(pannelRightfaceFront, 0F, 0.2541548F, 0F);
		pannelLeftfaceFront = new ModelRenderer(this, 41, 45);
		pannelLeftfaceFront.addBox(-0.5F, 0F, 0F, 1, 13, 6);
		pannelLeftfaceFront.setRotationPoint(6F, 11F, -1F);
		pannelLeftfaceFront.setTextureSize(63, 64);
		pannelLeftfaceFront.mirror = true;
		setRotation(pannelLeftfaceFront, 0F, -0.2541548F, 0F);
		pannelLeftfaceBack = new ModelRenderer(this, 41, 45);
		pannelLeftfaceBack.addBox(0F, 0F, 0F, 1, 13, 4);
		pannelLeftfaceBack.setRotationPoint(4F, 11F, -4F);
		pannelLeftfaceBack.setTextureSize(63, 64);
		pannelLeftfaceBack.mirror = true;
		setRotation(pannelLeftfaceBack, 0F, 0.4461411F, 0F);
		topPlate = new ModelRenderer(this, 0, 0);
		topPlate.addBox(0F, 0F, 0F, 14, 1, 11);
		topPlate.setRotationPoint(-7F, 11F, -5.466667F);
		topPlate.setTextureSize(63, 64);
		topPlate.mirror = true;
		setRotation(topPlate, 0.0174533F, 0F, 0F);
		highestPlate = new ModelRenderer(this, 0, 44);
		highestPlate.addBox(0F, 0F, 0F, 8, 2, 8);
		highestPlate.setRotationPoint(-4F, 9F, -4F);
		highestPlate.setTextureSize(63, 64);
		highestPlate.mirror = true;
		setRotation(highestPlate, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Base.render(f5);
		plate1.render(f5);
		plate2.render(f5);
		plate3.render(f5);
		joint11.render(f5);
		joint12.render(f5);
		joint13.render(f5);
		joint21.render(f5);
		joint22.render(f5);
		joint23.render(f5);
		pannelRightfaceBack.render(f5);
		pannelRightfaceFront.render(f5);
		pannelLeftfaceFront.render(f5);
		pannelLeftfaceBack.render(f5);
		topPlate.render(f5);
		highestPlate.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
