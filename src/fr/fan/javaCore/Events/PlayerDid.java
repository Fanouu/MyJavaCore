package fr.fan.javaCore.Events;

import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDid implements Listener {

    @EventHandler
    public void onPlayerDeathEvent(PlayerDeathEvent event){
        Player player = event.getEntity();
        String pname = player.getName();

        event.setDeathMessage("");
        Server server = player.getServer();

        Player killedby = player.getKiller();
        if(killedby != null) {
            String killerName = killedby.getName();

            server.broadcastMessage("§c" + pname + " §9tué par §1" + killerName);
        }else{
            server.broadcastMessage("§c" + pname + " est mort");
        }
    }
}
