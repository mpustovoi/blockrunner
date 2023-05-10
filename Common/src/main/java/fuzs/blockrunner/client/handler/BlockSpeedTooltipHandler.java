package fuzs.blockrunner.client.handler;

import fuzs.blockrunner.BlockRunner;
import fuzs.blockrunner.config.ClientConfig;
import fuzs.blockrunner.data.BlockSpeedManager;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class BlockSpeedTooltipHandler {

    public static void onItemTooltip(ItemStack stack, TooltipFlag context, List<Component> lines) {
        if (!BlockRunner.CONFIG.getHolder(ClientConfig.class).isAvailable() || !BlockRunner.CONFIG.get(ClientConfig.class).blockSpeedMultiplierTooltip) {
            return;
        }
        if (stack.getItem() instanceof BlockItem item && BlockSpeedManager.INSTANCE.hasBlockSpeed(item.getBlock())) {
            lines.add(Component.translatable("block.blockrunner.speedMultiplier", BlockSpeedManager.INSTANCE.getSpeedFactor(item.getBlock())).withStyle(ChatFormatting.GRAY));
        }
    }
}