package fr.fan.javaCore.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        String pname = event.getPlayer().getName();
        event.setJoinMessage("");

        event.getPlayer().getServer().broadcastMessage("§f[§e+§f] §e" + pname);
    }
}
