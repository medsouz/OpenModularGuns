package net.medsouz.omg.api;

import net.medsouz.omg.util.Vector3;
import net.minecraft.entity.Entity;

public abstract class Ammunition {
	
	public abstract String getAmmoType();
	
	public abstract int getClipSize();
	
	public abstract boolean keepIfEmpty();
	
	public abstract void drawMagazine(Entity e);
}
