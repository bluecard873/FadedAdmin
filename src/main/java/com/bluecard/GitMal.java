package com.bluecard;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class GitMal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length < 2) {
            return false;
        }
        String msg = "";
        java.util.List<String> args2 = new ArrayList<>();
        for (String s : args) {
            args2.add(s);
        }
        args2.remove(0);
        for (String arg : args2) {
            msg += arg + " ";
        }
        Player targetPlayer = Bukkit.getPlayer(args[0]);
        targetPlayer.sendMessage(BadWordFilter.FilterBadWords("[" + sender.getName() + " -> me] " + msg));
        return true;
    }
}
