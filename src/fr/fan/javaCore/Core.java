package fr.fan.javaCore;

import fr.fan.javaCore.Commands.SpawnCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;


public class Core extends JavaPlugin {

    public void onEnable(){
        
        Logger.getLogger("Core Java Loading...");
        loadCommand();
    }

    public void onDisable() {
        Logger.getLogger("Core Java is disable");
    }

    private void loadCommand(){
        getCommand("spawn").setExecutor(new SpawnCommand(this));
    }
}
