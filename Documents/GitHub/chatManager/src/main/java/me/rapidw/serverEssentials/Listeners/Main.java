package me.rapidw.serverEssentials.Listeners;

import me.rapidw.serverEssentials.Commands.chat.caster;
import me.rapidw.serverEssentials.Commands.chat.clearChat;
import me.rapidw.serverEssentials.Commands.chat.muteChat;
import me.rapidw.serverEssentials.Commands.players.mutePlayers;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getCommand("clearchat").setExecutor(new clearChat());
        getCommand("mutechat").setExecutor(new muteChat());
        getCommand("mutep").setExecutor(new mutePlayers());
        getCommand("cast").setExecutor(new caster());
    }
}
