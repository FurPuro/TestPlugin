package ru.furpuro.testplugin.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class calculator implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        double a,b;

        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[2]);
        }
        catch (NumberFormatException e) {
            return false;
        }

        if (args[1].equals("+")){
            sender.sendMessage("Result = "+(a+b));
            return true;
        } else if (args[1].equals("-")) {
            sender.sendMessage("Result = "+(a-b));
            return true;
        } else if (args[1].equals("*")) {
            sender.sendMessage("Result = "+(a*b));
            return true;
        } else if (args[1].equals("/")) {
            sender.sendMessage("Result = " + (a / b));
            return true;
        }
        return false;
    }
}
