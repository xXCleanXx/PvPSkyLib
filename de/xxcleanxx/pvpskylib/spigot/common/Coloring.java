package de.xxcleanxx.pvpskylib.spigot.common;

import org.bukkit.ChatColor;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Coloring {
    public static String translate(@NotNull String text) {
        if (text.trim().isEmpty()) return text;

        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public static String[] translate(@NotNull String[] texts) {
        if (texts.length == 0) throw new IllegalArgumentException("Texts cannot be empty!");

        List<String> list = new ArrayList<>();

        for (String item : texts) {
            list.add(translate(item));
        }

        return list.toArray(new String[0]);
    }
}