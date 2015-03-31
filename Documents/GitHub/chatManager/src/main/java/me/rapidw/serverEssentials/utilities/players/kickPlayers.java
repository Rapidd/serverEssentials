package me.rapidw.serverEssentials.utilities.players;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by George on 30/03/2015.
 */
public class kickPlayers implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            Player p = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("kickp")) {
            if (p.hasPermission("serverEssentials.kick")) {
                if (args.length == 0) {
                    p.sendMessage(ChatColor.RED + "Incorrect usage, try /kickp");
                }
                if (args.length == 1) {
                    if (Bukkit.getPlayer(args[0]).isOnline()) {
                        Player kp = Bukkit.getServer().getPlayer(args[0]);
                        kp.kickPlayer(ChatColor.RED + "You were banned by" + " " + p.getName());
                    } else {
                        p.sendMessage(ChatColor.RED + "Player offline");

                    }
                }
            }
        }
        return false;
    }
}
