package vivalandbr.com.particles;


import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModParticles {
    public static final DefaultParticleType DAMAGE_NUMBER = FabricParticleTypes.simple();

    public static void register() {
        // Серверная регистрация
        Registry.register(Registries.PARTICLE_TYPE,
                new Identifier("vivalandbr", "damage_number"), DAMAGE_NUMBER);
    }

    public static void registerClient() {
        // Клиентская регистрация
        ParticleFactoryRegistry.getInstance().register(DAMAGE_NUMBER,
                DamageNumberParticle.Factory::new);
    }
}