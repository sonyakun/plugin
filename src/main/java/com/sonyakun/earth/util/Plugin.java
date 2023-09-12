package com.sonyakun.earth.util;

import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;

import com.sonyakun.earth.util.Initializers.CommandInit;
import com.sonyakun.earth.util.Initializers.EventInit;


public class Plugin extends JavaPlugin {
    public static JavaPlugin plugin;
    
    @Override
    public void onEnable() {
        Plugin.plugin = this;
        getLogger().info("sonyaUtil v" + getDescription().getVersion());
        getLogger().info("MIT License");
        this.saveDefaultConfig();
        getLogger().info("Config Loaded!");
        CommandInit.init();
        getLogger().info("Registered commands!");
        EventInit.init();
        getLogger().info("Registered Events!");

    }
    @Override
    public void onDisable() {
        getLogger().info("Plugin is Disabling!");
    }
}
