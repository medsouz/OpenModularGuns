package net.medsouz.omg.api;

import net.medsouz.omg.model.ModelM16;
import net.medsouz.omg.util.Vector3;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public abstract class Gun {

	public abstract void drawGun(Entity e, boolean isFirstPerson, boolean aimedDownSight);
	
	public abstract void drawDroppedGun(Entity e);
	
	public abstract boolean isTwoHanded();
	
	public abstract Vector3 rightHandRot(Vector3 origRot, boolean aimedDownSight);
	public abstract Vector3 rightHandPos(Vector3 origPos, boolean aimedDownSight);
	public abstract Vector3 leftHandRot(Vector3 origRot, boolean aimedDownSight);
	public abstract Vector3 leftHandPos(Vector3 origPos, boolean aimedDownSight);

}
