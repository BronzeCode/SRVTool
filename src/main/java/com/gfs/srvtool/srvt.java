package com.gfs.srvtool.Main.Main;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @override
    public void onEnable() {
        getLogger().info("Thanks for using srvtool from GFS! Our discord: ");
        getCommand("help").setExecutor(newMyCommandExecutor()); //
    }
    @override
    public void onDisable {
        getLogger().info("our tg channel:") ;
    }
}