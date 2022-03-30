package de.xxcleanxx.pvpskylib.spigot.common;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import de.xxcleanxx.pvpskylib.spigot.nms.NMSHelper;
import de.xxcleanxx.pvpskylib.spigot.nms.PlayerData;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;

@SuppressWarnings("unused")
public class Disguise {
    private Player _player;
    private GameProfile _gameProfile;
    private PlayerData _oldPlayerData;
    private PlayerData _newPlayerData;
    private boolean _disguised;

    public Disguise(Player player, PlayerData playerData) {
        this.setPlayer(player);
        this.setOldPlayerData(PlayerData.convertFromProperty(NMSHelper.getTexturesProperty(this.getGameProfile())));
    }

    public Disguise(Player player, String name, String texture, String signature) {
        this(player, new PlayerData(name, texture, signature));
    }

    public Player getPlayer() {
        return this._player;
    }

    private void setPlayer(Player player) {
        if (player == null) throw new IllegalArgumentException("Player cannot be null!");

        this._player = player;
    }

    private GameProfile getGameProfile() {
        if (this._gameProfile == null) this._gameProfile = NMSHelper.getGameProfile(this.getPlayer());

        return this._gameProfile;
    }

    public boolean isDisguised() {
        return this._disguised;
    }

    private void setDisguised(boolean flag) {
        this._disguised = flag;
    }

    public void disguise() {
        this.setDisguised(!this.isDisguised());

        PlayerData playerData = this.isDisguised() ? this.getNewPlayerData() : this.getOldPlayerData();
        String name = playerData.getName();
        String texture = playerData.getTexture();
        String signature = playerData.getSignature();

        this.getGameProfile().getProperties().clear();
        this.getGameProfile().getProperties().put("textures", new Property("textures", texture, signature));

        try {
            Field field = this.getGameProfile().getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(this.getGameProfile(), name);
            field.setAccessible(false);

            this.getPlayer().setDisplayName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PlayerData getNewPlayerData() {
        return this._newPlayerData;
    }

    public void setNewPlayerData(PlayerData playerData) {
        if (playerData == null) throw new IllegalArgumentException("Player data cannot be null!");

        this._newPlayerData = playerData;
    }


    public PlayerData getOldPlayerData() {
        return this._oldPlayerData;
    }

    private void setOldPlayerData(PlayerData playerData) {
        if (playerData == null) throw new IllegalArgumentException("Player data cannot be null!");

        this._oldPlayerData = playerData;
    }
}