package vivalandbr.com.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import vivalandbr.com.VivaLandBR;
import vivalandbr.com.entity.custom.ManekenEntity;


public class ModEntities {
    public static final EntityType<ManekenEntity> MANEKEN = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(VivaLandBR.MOD_ID, "maneken"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ManekenEntity::new) // Исправлено на MONSTER
                    .dimensions(EntityDimensions.fixed(1f, 1f))
                    .build()
    );

    public static void registerModEntities() {
        // Пустое тело метода, но критически важно для инициализации
        VivaLandBR.LOGGER.info("Entities registered for {}", VivaLandBR.MOD_ID);
    }
}