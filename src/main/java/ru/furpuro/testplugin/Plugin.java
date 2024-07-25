package ru.furpuro.testplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import ru.furpuro.testplugin.cmds.calculator;
import ru.furpuro.testplugin.cmds.message;
import ru.furpuro.testplugin.cmds.TabCompleter;

public final class Plugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PluginListener(), this);
        getCommand("calculator").setExecutor(new calculator());
        getCommand("message").setExecutor(new message());

        getCommand("message").setTabCompleter(new TabCompleter());
        getCommand("calculator").setTabCompleter(new TabCompleter());
    }

    @Override
    public void onDisable() {

    }

}
