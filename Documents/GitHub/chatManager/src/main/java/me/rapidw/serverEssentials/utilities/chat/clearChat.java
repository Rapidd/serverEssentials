package me.rapidw.serverEssentials.utilities.chat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class clearChat implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if(!p.hasPermission("serverEssentials.clear") && args.length != 1);
            p.sendMessage(ChatColor.RED + "Incorrect usage, try /clearchat");
        if(cmd.getName().equalsIgnoreCase("clearchat"));
            for(int i = 0; i <90; i++) {
                Bukkit.broadcastMessage("");
            }
        p.sendMessage(ChatColor.GREEN + "[CHAT MANAGER]" + " " + ChatColor.BLUE + "Chat cleared by" + p.getName());
        return true;
    }


    }

