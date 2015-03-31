package me.rapidw.serverEssentials.utilities.players;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerChatEvent;

import java.util.ArrayList;

public class mutePlayers implements CommandExecutor {

    private ArrayList<String> mutedPlayers =  new ArrayList<String>();

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if (p.hasPermission("serverEssentials.mutePlayers")) ;
        if(cmd.getName().equalsIgnoreCase("mutep"))
        if (args.length == 0) {
            p.sendMessage(ChatColor.RED + "Incorrect usage try /mutep <name>");
        } else {
            switch (args.length) {
                case 1:
                    Player p1 = Bukkit.getPlayer(args[0]);
                    if (p1 == null) {
                        p1.sendMessage(ChatColor.RED + "Player is not online");
                    } else {

                        if
                                (mutedPlayers.contains(p1.getName())) {
                            mutedPlayers.remove(p1.getName());
                            p1.sendMessage(ChatColor.RED + "You have been unmuted");

                        } else {
                            mutedPlayers.add(p.getName());
                            p1.sendMessage(ChatColor.DARK_RED + "You have been muted by" + " " + p.getName());

                        }
                    }
                    break;
            }
        }

        return false;
    }
    @EventHandler
    public void onPlayerChat(PlayerChatEvent e) {
        if(mutedPlayers.contains(e.getPlayer().getName())){
            e.setCancelled(true);
            e.getPlayer().sendMessage(ChatColor.RED + "You're muted");
        }
    }
}
