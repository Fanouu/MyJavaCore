package fr.fan.javaCore.Events;

import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeft implements Listener {


    @EventHandler
    public void onLeft(PlayerQuitEvent event){
        Player player = event.getPlayer();
        String pname = event.getPlayer().getName();
        event.setQuitMessage("");

        Server server = player.getServer();
        server.broadcastMessage("§f[§c-§f] §c" + pname);
    }
}
