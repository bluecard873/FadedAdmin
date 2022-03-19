package com.bluecard;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class FlightCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player)sender;
            p.setAllowFlight(!p.getAllowFlight());
            p.sendMessage(p.getAllowFlight() ? "flight enabled." : "flight disabled.");
        }
        else {
            sender.sendMessage("this command is only for players!");
        }
        return true;
    }
}
