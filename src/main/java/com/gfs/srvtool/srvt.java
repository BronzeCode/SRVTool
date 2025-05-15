package com.gfs.srvtool.Main.Main;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @override
    public void onEnable() {
        getLogger().info("Thanks for using srvtool from GFS! Our tg channel: @GlowingFoxStudios ; our discord: ");
        getCommand("help").setExecutor(helpExecutor());
    }
    @override
    public void onDisable {
        getLogger().info("Thanks for using srvtool from GFS! Our tg channel: @GlowingFoxStudios ; our discord:") ;
    }
}