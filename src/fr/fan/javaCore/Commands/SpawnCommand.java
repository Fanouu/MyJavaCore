package fr.fan.javaCore.Commands;

import fr.fan.javaCore.Core;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {

    private final Core plugin;

    public SpawnCommand(Core plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            sender.sendMessage("§eTéléportation...");
            ((Player) sender).teleport(new Location(((Player) sender).getWorld(), 0, 0, 0));
        }else{
            sender.sendMessage("Vous n'êtes pas un joueurs");
        }
        return true;
    }

    //public World
}
