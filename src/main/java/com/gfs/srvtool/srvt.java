package com.gfs.srvtool.Main.Main;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @override
    public void onEnable() {
        getLogger().info("Thanks for using srvtool from GFS! Our tg channel: @GlowingFoxStudios ; our discord: ");

saveDefaultConfig();
getConfig().options().copyDefaults(true);
saveConfig();
       
getConfig().set("npcs.id.1.name", "Biba");
saveConfig():
 getCommand("help").setExecutor(helpExecutor());
    }
    @override
    public void onDisable {
        getLogger().info("Thanks for using srvtool from GFS! Our tg channel: @GlowingFoxStudios ; our discord:") ;
    }
}