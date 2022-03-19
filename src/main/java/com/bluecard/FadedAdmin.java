package com.bluecard;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class FadedAdmin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("w").setExecutor(new GitMal());
        getCommand("msg").setExecutor(new GitMal());
        getCommand("fly").setExecutor(new FlightCommand());
        getServer().getPluginManager().registerEvents(new ChatFormat(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }
}
