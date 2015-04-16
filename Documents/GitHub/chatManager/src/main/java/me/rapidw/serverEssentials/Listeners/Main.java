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
        getCommand("ban").setExecutor(new banCommand());
    }

}
