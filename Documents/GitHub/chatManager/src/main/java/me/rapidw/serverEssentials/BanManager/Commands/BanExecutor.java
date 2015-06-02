package me.rapidw.serverEssentials.BanManager.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BanExecutor implements CommandExecutor {
  
    public boolean onCommand(CommandSender sender, Command cmd, String label, args[]) {
          Player p = Bukkit.getServer().getPlayer();
            if (p.hasPermission("serverEssentials.banplayers");
        if(cmd.getName().equalsIgnoreCase("banp");
            
          else {
            p.sendMessage(ChatColor.RED + "I do not understand that command.")
          }
    }
}
