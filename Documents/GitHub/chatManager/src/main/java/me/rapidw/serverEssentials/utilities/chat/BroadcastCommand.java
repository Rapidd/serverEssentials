package me.rapidw.serverEssentials.Utilities.Chat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BroadcastCommand implements CommandExecutor {

        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            if(!sender.hasPermission("serverEssentials.cast")) {
                sender.sendMessage(ChatColor.RED + "You dont have permission");
                if(cmd.getName().equalsIgnoreCase("cast"));
                return true;
            }
            if(args.length == 0) {
                sender.sendMessage(ChatColor.RED + "Incorrect usage, try /cast");
                return true;
            }
            StringBuilder message = new StringBuilder();
            for (String part : args) {
                message.append(" ").append(part);
            }
            Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "[CAST]" + " " + message.toString());
            return true;
        }

}
