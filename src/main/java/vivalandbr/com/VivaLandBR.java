package vivalandbr.com;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vivalandbr.com.entity.ModEntities;
import vivalandbr.com.entity.custom.ManekenEntity;
import vivalandbr.com.particles.ModEvents;
import vivalandbr.com.particles.ModParticles;

public class VivaLandBR implements ModInitializer {

	public static final String MOD_ID = "vivalandbr";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModParticles.register();
		ModEvents.register();

		ModEntities.registerModEntities();
		FabricDefaultAttributeRegistry.register(ModEntities.MANEKEN, ManekenEntity.createManekenAttributes());

	}
}


