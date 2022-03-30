package de.xxcleanxx.pvpskylib.spigot.common;

import org.bukkit.ChatColor;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class Coloring {
    public static String translate(@NotNull String text) {
        if (text.trim().isEmpty()) return text;

        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public static String[] translate(@NotNull String[] texts) {
        if (texts.length == 0) throw new IllegalArgumentException("Texts cannot be empty!");

        for(int i = 0; i < texts.length; i++) {
            texts[i] = translate(texts[i]);
        }

        return texts;
    }
}