package vivalandbr.com;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import vivalandbr.com.entity.ModEntities;
import vivalandbr.com.entity.client.ManekenModel;
import vivalandbr.com.entity.client.ManekenRenderer;
import vivalandbr.com.entity.client.ModModelLayers;
import vivalandbr.com.particles.ModParticles;

@Environment(EnvType.CLIENT)
public class VivaLandBRClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModParticles.registerClient();

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MANEKEN, ManekenModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.MANEKEN, ManekenRenderer::new);
    }
}
