package ru.furpuro.testplugin.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class message implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args[0].equalsIgnoreCase("hello")) {
            sender.sendMessage("Привет!");
            return true;
        } else if (args[0].equalsIgnoreCase("goodbye")) {
            sender.sendMessage("Пока!");
            return true;
        } else if (args[0].equalsIgnoreCase("whatsup")) {
            sender.sendMessage("Как дела?");
            return true;
        }
        return false;
    }
}
