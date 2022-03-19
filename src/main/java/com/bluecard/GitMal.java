package com.bluecard;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GitMal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 2) {
            return false;
        }
        Player targetPlayer = Bukkit.getPlayer(args[0]);
        targetPlayer.sendMessage(BadWordFilter.FilterBadWords("[" + sender.getName() + " -> me] " + args[1]));
        return true;
    }
}