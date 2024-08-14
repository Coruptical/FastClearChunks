package com.coruptical.fastclearchunks;

import com.coruptical.fastclearchunks.utils.UpdateHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class FastClearChunks extends JavaPlugin {
    private static FastClearChunks instance;
    private UpdateHandler updateHandler;

    public static FastClearChunks getInstance() {
        return instance;
    }

    public UpdateHandler getUpdateHandler() {
        return updateHandler;
    }

    @Override
    public void onEnable() {
        instance = this;

        // Queue all block updates in tasks requested by players that get executed
        // by blocks per chunk depending on speed set inside config.yml
        updateHandler = UpdateHandler.getInstance();
        updateHandler.startRunnable();
    }

    // Setup work for this plugin
    // TODO: I will most likely need a way of not updating block lighting to speed up block updates


}
