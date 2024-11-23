package dev.flatkat.configurable_autosave.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {
    @Shadow
    private int ticksUntilAutosave = 200;
}
