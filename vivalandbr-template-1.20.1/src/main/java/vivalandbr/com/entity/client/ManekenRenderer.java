package vivalandbr.com.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import vivalandbr.com.VivaLandBR;
import vivalandbr.com.entity.custom.ManekenEntity;

public class ManekenRenderer extends MobEntityRenderer<ManekenEntity, ManekenModel<ManekenEntity>> {
    private static final Identifier TEXTURE = new Identifier(VivaLandBR.MOD_ID, "textures/entity/maneken.png");

    public ManekenRenderer(EntityRendererFactory.Context context) {
        super(context, new ManekenModel<>(context.getPart(ModModelLayers.MANEKEN)), 0.6f);
    }

    @Override
    public void render(ManekenEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    protected void setupTransforms(ManekenEntity entity, MatrixStack matrices, float animationProgress,
                                   float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

        // Для кастомных вращений, если нужно
        float headPitch = MathHelper.lerp(tickDelta, entity.prevPitch, entity.getPitch());
        this.model.setAngles(entity, 0, 0, animationProgress, bodyYaw, headPitch);
    }

    @Override
    public Identifier getTexture(ManekenEntity entity) {
        return TEXTURE;
    }
}
