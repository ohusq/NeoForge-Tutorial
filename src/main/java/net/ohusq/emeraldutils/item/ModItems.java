package net.ohusq.emeraldutils.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ohusq.emeraldutils.EmeraldUtils;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(EmeraldUtils.MOD_ID);

    public static final DeferredItem<Item> BISMUTH = ITEMS.registerSimpleItem(
            "bismuth",
            new Item.Properties()
    );

    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.registerSimpleItem(
            "raw_bismuth",
            new Item.Properties()
    );


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
