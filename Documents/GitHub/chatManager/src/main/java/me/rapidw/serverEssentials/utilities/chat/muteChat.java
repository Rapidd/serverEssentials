package me.rapidw.serverEssentials.Utilities.Chat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class MuteChat implements CommandExecutor {

    public static boolean mutechat = false;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("mutechat")) {
            if (player.hasPermission("serverEssentials.muteChat")) {
                return true;
            }
                if (mutechat) {
                    mutechat = false;
                    Bukkit.broadcastMessage(ChatColor.GREEN + "[CHAT MANAGER]" + " " + ChatColor.RED + "Chat has been unmuted");
                } else {
                    mutechat = true;
                    Bukkit.broadcastMessage(ChatColor.GREEN + "[CHAT MANAGER]" + " " + ChatColor.RED + "Chat has been muted");
                }
            }

            return true;

        }
                @EventHandler
                public void onChat(AsyncPlayerChatEvent e) {
            Player p = e.getPlayer();
            if((mutechat) && (!p.hasPermission("serverEssentials.mute"))) {
                e.setCancelled(true);
                p.sendMessage(ChatColor.RED + "Chat is muted");
            }
        }


    }

