package de.xxcleanxx.pvpskylib.spigot.nms;

import com.mojang.authlib.properties.Property;

public class PlayerData {
    private String _name;
    private String _texture;
    private String _signature;

    public PlayerData(String name, String texture, String signature) {
        this.setName(name);
        this.setTexture(texture);
        this.setSignature(signature);
    }

    public PlayerData(String texture, String signature) {
        this(null, texture, signature);
    }

    public String getName() {
        return this._name;
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Name cannot be null!");
        if (name.trim().isEmpty()) throw new IllegalArgumentException("Name is empty or consists of white-spaces!");

        this._name = name;
    }

    public String getTexture() {
        return this._texture;
    }

    public void setTexture(String texture) {
        if (texture == null) throw new IllegalArgumentException("Texture cannot be null!");
        if (texture.trim().isEmpty())
            throw new IllegalArgumentException("Texture is empty or consists of white-spaces!");

        this._texture = texture;
    }

    public String getSignature() {
        return this._signature;
    }

    public void setSignature(String signature) {
        if (signature == null) throw new IllegalArgumentException("Signature cannot be null!");
        if (signature.trim().isEmpty())
            throw new IllegalArgumentException("Signature is empty or consists of white-spaces!");

        this._signature = signature;
    }

    public static PlayerData convertFromProperty(Property property) {
        if (property == null) {
            throw new IllegalArgumentException("Property cannot be null!");
        }

        return new PlayerData(property.getValue(), property.getSignature());
    }
}