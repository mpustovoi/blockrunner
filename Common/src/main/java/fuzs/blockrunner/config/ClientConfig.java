package fuzs.blockrunner.config;

import fuzs.puzzleslib.config.AbstractConfig;
import fuzs.puzzleslib.config.annotation.Config;

public class ClientConfig extends AbstractConfig {
    @Config(description = "Add a tooltip to blocks that have an altered block speed with the multiplier.")
    public boolean blockSpeedMultiplierTooltip = true;
    @Config(description = "Prevent running on blocks with higher speeds from changing the field of view.")
    public boolean disableFieldOfViewChanges = true;
}