package com.bluecard;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
import net.md_5.bungee.chat.ComponentSerializer;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ChatFormat implements Listener {
    @EventHandler
    public void FormatChat(AsyncChatEvent event) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> clazz = Class.forName("net.kyori.adventure.text.TextComponentImpl");
        Method m = clazz.getDeclaredMethod("content");
        m.setAccessible(true);
        Bukkit.broadcast(Component.text(BadWordFilter.FilterBadWords(event.getPlayer().getName() + ": " + m.invoke(event.message(), new Object[0]))));
        event.setCancelled(true);
    }
}
