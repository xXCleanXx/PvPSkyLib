package de.xxcleanxx.pvpskylib.common.permissions;

import de.xxcleanxx.pvpskylib.common.game.interfaces.IOfflineGamer;
import de.xxcleanxx.pvpskylib.common.permissions.PvPSkyPermission;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Group {
    private int _id = -1;
    private String _name;
    private String _prefix;
    private final List<PvPSkyPermission> _permissions = new ArrayList<>();
    private final List<IOfflineGamer> _members = new ArrayList<>();

    public Group(int id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public Group(String name) {
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

    public @Nullable String getPrefix() {
        return this._prefix;
    }

    public void setPrefix(@Nullable String prefix) {
        this._prefix = prefix;
    }

    public @NotNull List<IOfflineGamer> getMembers() {
        return this._members;
    }

    public boolean  addMember(@NotNull IOfflineGamer player) {
        if (this.hasMember(player)) return false;

        return this.getMembers().add(player);
    }

    public boolean removeMember(@NotNull IOfflineGamer player) {
        IOfflineGamer remove = null;

        for (IOfflineGamer item : this.getMembers()) {
            if (item.getUniqueId() == player.getUniqueId()) {
                remove = item;

                break;
            }
        }

        return remove != null && this.getMembers().remove(remove);
    }

    public boolean hasMember(@NotNull IOfflineGamer player) {
        for (IOfflineGamer item : this.getMembers()) {
            if (item.getUniqueId() == player.getUniqueId()) return true;
        }

        return false;
    }

    public List<PvPSkyPermission> getPermissions() {
        return this._permissions;
    }

    public boolean addPermission(@NotNull PvPSkyPermission permission) {
        if (this.hasPermission(permission)) return false;

        return this.getPermissions().add(permission);
    }

    public boolean removePermission(@NotNull String permission) {
        if (permission.trim().isEmpty()) throw new IllegalArgumentException("Permission cannot be empty or consists of white-spaces!");

        PvPSkyPermission remove = null;

        for (PvPSkyPermission item : this.getPermissions()) {
            if (item.getName().equalsIgnoreCase(permission.trim())) {
                remove = item;

                break;
            }
        }

        return remove != null && this.getPermissions().remove(remove);
    }

    public boolean removePermission(@NotNull PvPSkyPermission permission) {
        return this.removePermission(permission.getName());
    }

    public boolean hasPermission(@NotNull String permission) {
        if (permission.trim().isEmpty()) throw new IllegalArgumentException("Permission cannot be empty or consists of white-spaces!");

        for (PvPSkyPermission item : this.getPermissions()) {
            if (item.getName().equalsIgnoreCase(permission.trim())) return true;
        }

        return false;
    }

    public boolean hasPermission(@NotNull PvPSkyPermission permission) {
        return this.hasPermission(permission.getName());
    }
}