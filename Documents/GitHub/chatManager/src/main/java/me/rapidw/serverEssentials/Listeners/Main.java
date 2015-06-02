package me.rapidw.serverEssentials.Listeners;

import me.rapidw.serverEssentials.BanManager.Managers.ControlLogger;
import me.rapidw.serverEssentials.Utilities.Chat.BroadcastCommand;
import me.rapidw.serverEssentials.Utilities.Chat.ClearChat;
import me.rapidw.serverEssentials.Utilities.Chat.MuteChat;
import me.rapidw.serverEssentials.Utilities.Players.MutePlayers;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    protected ControlLogger log;


    @Override
    public void onEnable() {
        //Command executors
        getCommand("clearchat").setExecutor(new ClearChat());
        getCommand("mutechat").setExecutor(new MuteChat());
        getCommand("mutep").setExecutor(new MutePlayers());
        getCommand("cast").setExecutor(new BroadcastCommand());
        getCommand("banp").setExecutor(new BanExecutor());
        
        //Loggers
        
        Bukkit.getServer().getLogger().info("---[SERVER ESSENTIALS]---");
        Bukkit.getServer().getLogger().info("STATUS: ENABLED");
        Bukkit.getServer().getLogger().info("PLUGIN STATUS: STABLE");
        Bukkit.getServer().getLogger().info("---[SERVER ESSENTIALS]---");
    }
    
    public void onDisable() {
    

        Bukkit.getServer().getLogger().info("---[SERVER ESSENTIALS]---");
        Bukkit.getServer().getLogger().info("STATUS: DISABLED");
        Bukkit.getServer().getLogger().info("PLUGIN STATUS: OFFLINE");
        Bukkit.getServer().getLogger().info("---[SERVER ESSENTIALS]---");

}

    public void onWarn() {
        
        Bukkit.getServer().getLogger().info("---[SERVER ESSENTIALS]---");
        Bukkit.getServer().getLogger().info("WARNING: An error has occured");
        Bukkit.getServer().getLogger().info("Restart your server to fix!")
        Bukkit.getServer().getLogger().info("If this continues to happen contact the plugin developer(s)");
        Bukkit.getServer().getLogger().info("---[SERVER ESSENTIALS]---");
    }
}
