<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.spigot.labymod;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.EncoderException;
import net.minecraft.server.v1_16_R3.MinecraftKey;
import net.minecraft.server.v1_16_R3.PacketDataSerializer;
import net.minecraft.server.v1_16_R3.PacketPlayOutCustomPayload;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.nio.charset.Charset;
import java.util.List;

public class LabyModProtocol {
    /**
     * Send a message to LabyMod
     *
     * @param player         Minecraft Client
     * @param key            LabyMod message key
     * @param messageContent json object content
     */
    public static void sendLabyModMessage(Player player, String key, JsonElement messageContent) {
        byte[] bytes = getBytesToSend(key, messageContent.toString());

        PacketDataSerializer pds = new PacketDataSerializer(Unpooled.wrappedBuffer(bytes));
        PacketPlayOutCustomPayload payloadPacket = new PacketPlayOutCustomPayload(new MinecraftKey("labymod3:main"), pds);
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(payloadPacket);
    }

    public static void sendServerBanner(Player player, String imageUrl) {
        JsonObject object = new JsonObject();
        object.addProperty("url", imageUrl);

        sendLabyModMessage(player, "server_banner", object);
    }

    /**
     * Gets the bytes that are required to send the given message
     *
     * @param messageKey      the message's key
     * @param messageContents the message's contents
     * @return the byte array that should be the payload
     */
    public static byte[] getBytesToSend(String messageKey, String messageContents) {
        // Getting an empty buffer
        ByteBuf byteBuf = Unpooled.buffer();

        try {
            // Writing the message-key to the buffer
            writeString(byteBuf, messageKey);

            // Writing the contents to the buffer
            writeString(byteBuf, messageContents);
        } catch (EncoderException e) {
            e.printStackTrace();
        }

        // Copying the buffer's bytes to the byte array
        byte[] bytes = new byte[byteBuf.readableBytes()];
        byteBuf.readBytes(bytes);

        // Release the buffer
        byteBuf.release();

        // Returning the byte array
        return bytes;
    }

    /**
     * Writes a varint to the given byte buffer
     *
     * @param buf   the byte buffer the int should be written to
     * @param input the int that should be written to the buffer
     */
    private static void writeVarIntToBuffer(ByteBuf buf, int input) {
        while ((input & -128) != 0) {
            buf.writeByte(input & 127 | 128);
            input >>>= 7;
        }

        buf.writeByte(input);
    }

    /**
     * Writes a string to the given byte buffer
     *
     * @param buf    the byte buffer the string should be written to
     * @param string the string that should be written to the buffer
     * @throws EncoderException
     */
    private static void writeString(ByteBuf buf, String string) throws EncoderException {
        byte[] abyte = string.getBytes(Charset.forName("UTF-8"));

        if (abyte.length > Short.MAX_VALUE) {
            throw new EncoderException("String too big (was " + string.length() + " bytes encoded, max " + Short.MAX_VALUE + ")");
        } else {
            writeVarIntToBuffer(buf, abyte.length);
            buf.writeBytes(abyte);
        }
    }


    /**
     * Just send this packet to set the cinescope coverage
     * 0% - Disabled
     * 50% - Fully blind
     */
    public void sendCineScope(Player player, int coveragePercent, long duration) {
        JsonObject object = new JsonObject();

        // Cinescope height (0% - 50%)
        object.addProperty("coverage", coveragePercent);

        // Duration
        object.addProperty("duration", duration);

        // Send to LabyMod using the API
        sendLabyModMessage(player, "cinescopes", object);
    }

    public void playCinematic(Player player, List<Location> points, long duration) {
        JsonObject cinematic = new JsonObject();

        // Add points
        JsonArray pts = new JsonArray();
        for (Location location : points) {
            // Add points
            JsonObject point = new JsonObject();
            point.addProperty("x", location.getX());
            point.addProperty("y", location.getY());
            point.addProperty("z", location.getZ());
            point.addProperty("yaw", location.getYaw());
            point.addProperty("pitch", location.getPitch());
            point.addProperty("tilt", 0);
            pts.add(point);
        }
        cinematic.add("points", pts);

        // Clear the Minecraft Chat
        cinematic.addProperty("clear_chat", true);

        // Cinematic duration in ms
        cinematic.addProperty("duration", duration);

        // Always teleport the player to the start point
        player.teleport(points.get(0));

        // The player needs to fly for the cinematic
        player.setAllowFlight(true);

        // Play cinematic
        LabyModProtocol.sendLabyModMessage(player, "cinematic", cinematic);
    }

    public void cancelCinematic(Player player) {
        // Cancel currently playing cinematic
        LabyModProtocol.sendLabyModMessage(player, "cinematic", new JsonObject()); // Empty object
    }
=======
package de.xxcleanxx.pvpskylib.spigot.labymod;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.EncoderException;
import net.minecraft.server.v1_16_R3.MinecraftKey;
import net.minecraft.server.v1_16_R3.PacketDataSerializer;
import net.minecraft.server.v1_16_R3.PacketPlayOutCustomPayload;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.nio.charset.Charset;
import java.util.List;

public class LabyModProtocol {
    /**
     * Send a message to LabyMod
     *
     * @param player         Minecraft Client
     * @param key            LabyMod message key
     * @param messageContent json object content
     */
    public static void sendLabyModMessage(Player player, String key, JsonElement messageContent) {
        byte[] bytes = getBytesToSend(key, messageContent.toString());

        PacketDataSerializer pds = new PacketDataSerializer(Unpooled.wrappedBuffer(bytes));
        PacketPlayOutCustomPayload payloadPacket = new PacketPlayOutCustomPayload(new MinecraftKey("labymod3:main"), pds);
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(payloadPacket);
    }

    public static void sendServerBanner(Player player, String imageUrl) {
        JsonObject object = new JsonObject();
        object.addProperty("url", imageUrl);

        sendLabyModMessage(player, "server_banner", object);
    }

    /**
     * Gets the bytes that are required to send the given message
     *
     * @param messageKey      the message's key
     * @param messageContents the message's contents
     * @return the byte array that should be the payload
     */
    public static byte[] getBytesToSend(String messageKey, String messageContents) {
        // Getting an empty buffer
        ByteBuf byteBuf = Unpooled.buffer();

        try {
            // Writing the message-key to the buffer
            writeString(byteBuf, messageKey);

            // Writing the contents to the buffer
            writeString(byteBuf, messageContents);
        } catch (EncoderException e) {
            e.printStackTrace();
        }

        // Copying the buffer's bytes to the byte array
        byte[] bytes = new byte[byteBuf.readableBytes()];
        byteBuf.readBytes(bytes);

        // Release the buffer
        byteBuf.release();

        // Returning the byte array
        return bytes;
    }

    /**
     * Writes a varint to the given byte buffer
     *
     * @param buf   the byte buffer the int should be written to
     * @param input the int that should be written to the buffer
     */
    private static void writeVarIntToBuffer(ByteBuf buf, int input) {
        while ((input & -128) != 0) {
            buf.writeByte(input & 127 | 128);
            input >>>= 7;
        }

        buf.writeByte(input);
    }

    /**
     * Writes a string to the given byte buffer
     *
     * @param buf    the byte buffer the string should be written to
     * @param string the string that should be written to the buffer
     * @throws EncoderException
     */
    private static void writeString(ByteBuf buf, String string) throws EncoderException {
        byte[] abyte = string.getBytes(Charset.forName("UTF-8"));

        if (abyte.length > Short.MAX_VALUE) {
            throw new EncoderException("String too big (was " + string.length() + " bytes encoded, max " + Short.MAX_VALUE + ")");
        } else {
            writeVarIntToBuffer(buf, abyte.length);
            buf.writeBytes(abyte);
        }
    }


    /**
     * Just send this packet to set the cinescope coverage
     * 0% - Disabled
     * 50% - Fully blind
     */
    public void sendCineScope(Player player, int coveragePercent, long duration) {
        JsonObject object = new JsonObject();

        // Cinescope height (0% - 50%)
        object.addProperty("coverage", coveragePercent);

        // Duration
        object.addProperty("duration", duration);

        // Send to LabyMod using the API
        sendLabyModMessage(player, "cinescopes", object);
    }

    public void playCinematic(Player player, List<Location> points, long duration) {
        JsonObject cinematic = new JsonObject();

        // Add points
        JsonArray pts = new JsonArray();
        for (Location location : points) {
            // Add points
            JsonObject point = new JsonObject();
            point.addProperty("x", location.getX());
            point.addProperty("y", location.getY());
            point.addProperty("z", location.getZ());
            point.addProperty("yaw", location.getYaw());
            point.addProperty("pitch", location.getPitch());
            point.addProperty("tilt", 0);
            pts.add(point);
        }
        cinematic.add("points", pts);

        // Clear the Minecraft Chat
        cinematic.addProperty("clear_chat", true);

        // Cinematic duration in ms
        cinematic.addProperty("duration", duration);

        // Always teleport the player to the start point
        player.teleport(points.get(0));

        // The player needs to fly for the cinematic
        player.setAllowFlight(true);

        // Play cinematic
        LabyModProtocol.sendLabyModMessage(player, "cinematic", cinematic);
    }

    public void cancelCinematic(Player player) {
        // Cancel currently playing cinematic
        LabyModProtocol.sendLabyModMessage(player, "cinematic", new JsonObject()); // Empty object
    }
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}