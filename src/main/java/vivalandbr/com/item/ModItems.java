package vivalandbr.com.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import vivalandbr.com.VivaLandBR;

public class ModItems {
    public static final Item SOME = registerItem("some", new Item(new FabricItemSettings()));

//    public static final Item METAL_DETECTOR = registerItem("metal_detector",
//            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));
//
//    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
//    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette",
//            new Item(new FabricItemSettings()));
//
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SOME);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VivaLandBR.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VivaLandBR.LOGGER.info("Registering Mod Items for " + VivaLandBR.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
