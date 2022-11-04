package net.mcreator.talir.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class NicPickaxeRightClickedInAirProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.IN_FIRE, 100);
	}
}
