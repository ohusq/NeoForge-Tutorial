package net.ohusq.emeraldutils.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ohusq.emeraldutils.EmeraldUtils;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(EmeraldUtils.MOD_ID);

    public static final DeferredBlock<Block> BISMUTH_BLOCK = BLOCKS.registerSimpleBlock(
            "bismuth_block",
            BlockBehaviour.Properties.of()
                    .destroyTime(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
    );

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
