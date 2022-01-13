package fr.fan.javaCore;

import fr.fan.javaCore.Commands.SpawnCommand;
import fr.fan.javaCore.Events.PlayerDid;
import fr.fan.javaCore.Events.PlayerJoin;
import fr.fan.javaCore.Events.PlayerLeft;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;


public class Core extends JavaPlugin {

    public void onEnable(){
        
        Logger.getLogger("Core Java Loading...");
        loadCommand();
        loadEvent();
    }

    public void onDisable() {
        Logger.getLogger("Core Java is disable");
    }

    private void loadCommand(){
        getCommand("spawn").setExecutor(new SpawnCommand(this));

    }

    private void loadEvent(){
        Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerLeft(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerDid(), this);
    }
}
