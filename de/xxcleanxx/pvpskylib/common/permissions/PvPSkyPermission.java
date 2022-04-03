package de.xxcleanxx.pvpskylib.common.permissions;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public class PvPSkyPermission {
    private int _id = -1;
    private String _name;
    private String _description;
    private boolean _active;

    public PvPSkyPermission(int id, @NotNull String name) {
        this.setId(id);
        this.setName(name);
    }

    public PvPSkyPermission(@NotNull String name) {
        this.setName(name);
    }

    public int getId() {
        return this._id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public @NotNull String getName() {
        return this._name;
    }

    public void setName(@NotNull String name) {
        this._name = name;
    }

    public @Nullable String getDescription() {
        return this._description;
    }

    public void setDescription(@Nullable String description) {
        this._description = description;
    }

    public boolean isActive() {
        return this._active;
    }

    public void setActive(boolean active) {
        this._active = active;
    }
}