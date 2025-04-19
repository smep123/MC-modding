package vivalandbr.com.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import vivalandbr.com.VivaLandBR;

public class ModItemGroups {
    public static final ItemGroup VIVA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VivaLandBR.MOD_ID, "some"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.viva_group"))
                    .icon(() -> new ItemStack(ModItems.SOME)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SOME);
//                        entries.add(ModBlocks.RUBY_BLOCK);


                    }).build());


    public static void registerItemGroups() {
        VivaLandBR.LOGGER.info("Registering Item Groups for " + VivaLandBR.MOD_ID);
    }
}

