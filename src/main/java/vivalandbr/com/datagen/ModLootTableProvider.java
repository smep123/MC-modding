package vivalandbr.com.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;


public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        /*
        addDrop(ModBlocks.SOME_BLOCK);
        addDrop(ModBlocks.SOME_ORE, copperLikeOreDrops(ModBlocks.SOME_ORE, ModItems.RAW_SOMETHING));
        */

    }
}