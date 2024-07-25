package ru.furpuro.testplugin.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.List;

public class TabCompleter implements org.bukkit.command.TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        if(command.getName().equals("message")){
            if(strings.length==1){
                return List.of(
                        "hello",
                        "goodbye",
                        "whatsup"
                );
            }
        } else if (command.getName().equals("calculator")) {
            if(strings.length==2){
                return List.of(
                        "+",
                        "-",
                        "/",
                        "*"
                );
            }else if(strings.length==1){
                return List.of(
                        "num"
                );
            }else if(strings.length==3){
                return List.of(
                        "num"
                );
            }
        }

        return null;
    }
}
