package vivalandbr.com.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import vivalandbr.com.VivaLandBR;

public class ModModelLayers {
    public static final EntityModelLayer MANEKEN =
            new EntityModelLayer(new Identifier(VivaLandBR.MOD_ID, "maneken"), "main");
}
