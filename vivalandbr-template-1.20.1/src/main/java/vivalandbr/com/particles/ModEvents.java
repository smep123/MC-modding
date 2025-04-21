package vivalandbr.com.particles;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.network.packet.s2c.play.ParticleS2CPacket;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;

public class ModEvents {
    public static void register() {
        ServerLivingEntityEvents.ALLOW_DAMAGE.register((entity, source, amount) -> {
            if (!entity.getWorld().isClient()) {
                ServerWorld world = (ServerWorld) entity.getWorld();
                Vec3d pos = entity.getPos();
                int damage = (int) Math.round(amount);

                world.getServer().execute(() -> {
                    world.getPlayers().forEach(player -> {
                        player.networkHandler.sendPacket(
                                new ParticleS2CPacket(
                                        ModParticles.DAMAGE_NUMBER,
                                        true,
                                        pos.x,
                                        pos.y + entity.getHeight(),
                                        pos.z,
                                        (float) damage, 0, 0,
                                        0, 1
                                )
                        );
                    });
                });
            }
            return true;
        });
    }
}

