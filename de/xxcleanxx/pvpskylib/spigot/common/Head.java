<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.spigot.common;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import de.xxcleanxx.pvpskylib.common.game.interfaces.IOfflineGamer;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.craftbukkit.libs.org.apache.commons.codec.binary.Base64;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.Field;
import java.util.UUID;

public class Head {
    private Head() { }

    public static ItemStack getHead(String name, OfflinePlayer owner) {
        ItemStack is = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta skullMeta = (SkullMeta) is.getItemMeta();
        skullMeta.setOwningPlayer(owner);
        skullMeta.setDisplayName(name);

        is.setItemMeta(skullMeta);

        return is;
    }

    public static ItemStack getHead(String name, IOfflineGamer owner) {
        return getHead(name, Bukkit.getOfflinePlayer(owner.getUniqueId()));
    }

    public static ItemStack getHead(String name, String texture, boolean isURL) {
        ItemStack is = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta skullMeta = (SkullMeta) is.getItemMeta();
        skullMeta.setDisplayName(name);

        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
        profile.getProperties().put("textures", new Property("textures", new String(Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", isURL ? texture : "http://textures.minecraft.net/texture/" + texture).getBytes()))));

        try {
            Field field = profile.getClass().getDeclaredField("profile");
            field.setAccessible(true);
            field.set(skullMeta, profile);
            field.setAccessible(false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        is.setItemMeta(skullMeta);

        return is;
    }
=======
package de.xxcleanxx.pvpskylib.spigot.common;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import de.xxcleanxx.pvpskylib.common.game.interfaces.IOfflineGamer;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.craftbukkit.libs.org.apache.commons.codec.binary.Base64;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.Field;
import java.util.UUID;

public class Head {
    private Head() { }

    public static ItemStack getHead(String name, OfflinePlayer owner) {
        ItemStack is = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta skullMeta = (SkullMeta) is.getItemMeta();
        skullMeta.setOwningPlayer(owner);
        skullMeta.setDisplayName(name);

        is.setItemMeta(skullMeta);

        return is;
    }

    public static ItemStack getHead(String name, IOfflineGamer owner) {
        return getHead(name, Bukkit.getOfflinePlayer(owner.getUniqueId()));
    }

    public static ItemStack getHead(String name, String texture, boolean isURL) {
        ItemStack is = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta skullMeta = (SkullMeta) is.getItemMeta();
        skullMeta.setDisplayName(name);

        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
        profile.getProperties().put("textures", new Property("textures", new String(Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", isURL ? texture : "http://textures.minecraft.net/texture/" + texture).getBytes()))));

        try {
            Field field = profile.getClass().getDeclaredField("profile");
            field.setAccessible(true);
            field.set(skullMeta, profile);
            field.setAccessible(false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        is.setItemMeta(skullMeta);

        return is;
    }
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}