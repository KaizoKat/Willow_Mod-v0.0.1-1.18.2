package net.willow.v001;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class mod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("willow-mod");

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
    }
}
