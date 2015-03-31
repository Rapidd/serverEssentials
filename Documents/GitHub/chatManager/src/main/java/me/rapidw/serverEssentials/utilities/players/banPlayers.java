package me.rapidw.serverEssentials.utilities.players;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class banPlayers implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if(p.hasPermission("serverEssentials.ban"));
         if(cmd.getName().equalsIgnoreCase("banp"));
            if(args.length == 0) {
                p.sendMessage(ChatColor.RED + "Incorrect usage, try /banp");
            }
                if(args.length == 1) {
                    if(Bukkit.getPlayer(args[0]).isOnline()) {
                        Player bp = Bukkit.getServer().getPlayer(args[0]);
                        bp.setBanned(true);
                        bp.kickPlayer(ChatColor.RED + "You were banned by" + " " + p.getName());
                    }else{
                        OfflinePlayer oplayer = Bukkit.getServer().getOfflinePlayer(args[0]);
                        oplayer.setBanned(true);
                    }
                }

                if(p.hasPermission("serverEssentials.unban"));
                    if(cmd.getName().equalsIgnoreCase("unbanp"));
                        if(args.length == 0) {
                            p.sendMessage(ChatColor.RED + "Incorrect usage, try /unbanp");
                        }
                            if(args.length == 1) {

                            }


        return false;
        }

    }


