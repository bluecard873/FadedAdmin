package com.bluecard;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GitMal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length < 2) {
            return false;
        }
        String msg = "";
        for (int i = 1; i >= args.length; i++) {
            msg += args[i] + " ";
        }
        Player targetPlayer = Bukkit.getPlayer(args[0]);
        targetPlayer.sendMessage(BadWordFilter.FilterBadWords("[" + sender.getName() + " -> me] " + msg));
        return true;
    }
}
