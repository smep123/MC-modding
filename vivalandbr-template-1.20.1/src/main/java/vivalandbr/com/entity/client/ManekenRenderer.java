package vivalandbr.com.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import vivalandbr.com.VivaLandBR;
import vivalandbr.com.entity.custom.ManekenEntity;

public class ManekenRenderer extends MobEntityRenderer<ManekenEntity, ManekenModel<ManekenEntity>> {

    private static final Identifier TEXTURE = new Identifier(VivaLandBR.MOD_ID, "textures/entity/maneken.png");

    public ManekenRenderer(EntityRendererFactory.Context context) {
        super(context, new ManekenModel<>(context.getPart(ModModelLayers.MANEKEN)), 0.6f);
    }

    @Override
    public Identifier getTexture(ManekenEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(ManekenEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.scale(1f, 1f, 1f);

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
