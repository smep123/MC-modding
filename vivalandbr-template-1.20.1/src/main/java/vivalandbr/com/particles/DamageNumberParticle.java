package vivalandbr.com.particles;

import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.math.MathHelper;

public class DamageNumberParticle extends SpriteBillboardParticle {
    private final SpriteProvider spriteProvider;
    private final int number;

    public DamageNumberParticle(ClientWorld world, double x, double y, double z,
                                int number, SpriteProvider spriteProvider) {
        super(world, x, y + 1.2, z);
        this.spriteProvider = spriteProvider;
        this.number = MathHelper.clamp(number, 0, 9);
        this.maxAge = 20;
        this.scale = 0.7f;

        // Устанавливаем правильный спрайт
        this.setSprite(this.spriteProvider.getSprite(this.number, 10)); // 10 - общее количество спрайтов
    }

    @Override
    public void tick() {
        super.tick();
        this.setSpriteForAge(this.spriteProvider);
        this.prevPosY = this.y;
        this.y += 0.03;
        this.alpha = 1.0f - (float)this.age / (float)this.maxAge;
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world,
                                       double x, double y, double z,
                                       double velocityX, double velocityY, double velocityZ) {
            return new DamageNumberParticle(world, x, y, z, (int)velocityX, this.spriteProvider);
        }
    }
}