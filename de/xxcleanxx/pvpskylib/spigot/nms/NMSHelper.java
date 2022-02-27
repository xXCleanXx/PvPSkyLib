<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.spigot.nms;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import net.minecraft.server.v1_16_R3.EntityPlayer;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

public class NMSHelper {
    private NMSHelper() { }

    // Public Methods
    public static EntityPlayer getHandle(Player player) {
        if (player == null) throw new IllegalArgumentException("Player cannot be null!");

        return ((CraftPlayer) player).getHandle();
    }

    public static GameProfile getGameProfile(Player player) {
        if (player == null) throw new IllegalArgumentException("Player cannot be null!");

        return getHandle(player).getProfile();
    }

    public static Property getTexturesProperty(GameProfile gameProfile) {
        if (gameProfile == null) throw new IllegalArgumentException("Game profile cannot be null!");

        return gameProfile.getProperties().get("textures").iterator().next();
    }

    public static Property getTexturesProperty(Player player) {
        if (player == null) throw new IllegalArgumentException("Player cannot be null!");

        return getTexturesProperty(getGameProfile(player));
    }

    public static UUID getUUIDForPlayerName(String playerName) {
        if (playerName == null) {
            throw new IllegalArgumentException("Player name cannot be null!");
        }

        return UUID.fromString(getJsonObject("https://api.mojang.com/users/profiles/minecraft/" + playerName).get("id").getAsString());
    }

    public static PlayerData getTextureAndSignature(UUID uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("UUID cannot be null!");
        }

        JsonObject obj = getJsonObject("https://sessionserver.mojang.com/session/minecraft.profile" + uuid.toString() + "?unsigned=false");

        if (obj == null) {
            return null;
        }

        JsonObject textureProperty = obj.get("properties").getAsJsonArray().get(0).getAsJsonObject();
        String texture = textureProperty.get("value").getAsString();
        String signature = textureProperty.get("signature").getAsString();
        new Property("textures", "signature", "value");
        return new PlayerData(texture, signature);
    }
    // # ### #

    // Private Methods
    private static JsonObject getJsonObject(URL url) {
        if (url == null) {
            throw new IllegalArgumentException("URL cannot be null!");
        }

        try {
            InputStreamReader reader = new InputStreamReader(url.openStream());
            JsonObject obj = new JsonParser().parse(reader).getAsJsonObject();

            reader.close();

            return obj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    private static JsonObject getJsonObject(String url) {
        if (url == null) {
            throw new IllegalArgumentException("URL cannot be null!");
        }

        try {
            return getJsonObject(new URL(url));
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
    // # ### #
=======
package de.xxcleanxx.pvpskylib.spigot.nms;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import net.minecraft.server.v1_16_R3.EntityPlayer;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

public class NMSHelper {
    private NMSHelper() { }

    // Public Methods
    public static EntityPlayer getHandle(Player player) {
        if (player == null) throw new IllegalArgumentException("Player cannot be null!");

        return ((CraftPlayer) player).getHandle();
    }

    public static GameProfile getGameProfile(Player player) {
        if (player == null) throw new IllegalArgumentException("Player cannot be null!");

        return getHandle(player).getProfile();
    }

    public static Property getTexturesProperty(GameProfile gameProfile) {
        if (gameProfile == null) throw new IllegalArgumentException("Game profile cannot be null!");

        return gameProfile.getProperties().get("textures").iterator().next();
    }

    public static Property getTexturesProperty(Player player) {
        if (player == null) throw new IllegalArgumentException("Player cannot be null!");

        return getTexturesProperty(getGameProfile(player));
    }

    public static UUID getUUIDForPlayerName(String playerName) {
        if (playerName == null) {
            throw new IllegalArgumentException("Player name cannot be null!");
        }

        return UUID.fromString(getJsonObject("https://api.mojang.com/users/profiles/minecraft/" + playerName).get("id").getAsString());
    }

    public static PlayerData getTextureAndSignature(UUID uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("UUID cannot be null!");
        }

        JsonObject obj = getJsonObject("https://sessionserver.mojang.com/session/minecraft.profile" + uuid.toString() + "?unsigned=false");

        if (obj == null) {
            return null;
        }

        JsonObject textureProperty = obj.get("properties").getAsJsonArray().get(0).getAsJsonObject();
        String texture = textureProperty.get("value").getAsString();
        String signature = textureProperty.get("signature").getAsString();
        new Property("textures", "signature", "value");
        return new PlayerData(texture, signature);
    }
    // # ### #

    // Private Methods
    private static JsonObject getJsonObject(URL url) {
        if (url == null) {
            throw new IllegalArgumentException("URL cannot be null!");
        }

        try {
            InputStreamReader reader = new InputStreamReader(url.openStream());
            JsonObject obj = new JsonParser().parse(reader).getAsJsonObject();

            reader.close();

            return obj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    private static JsonObject getJsonObject(String url) {
        if (url == null) {
            throw new IllegalArgumentException("URL cannot be null!");
        }

        try {
            return getJsonObject(new URL(url));
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
    // # ### #
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}