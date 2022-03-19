package com.bluecard;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ChatFormat implements Listener {
    @EventHandler
    public void FormatChat(AsyncChatEvent event) {
        Bukkit.broadcast(Component.text(BadWordFilter.FilterBadWords(event.getPlayer().getName() + ": " + event.message())));
        event.setCancelled(true);
    }
}
