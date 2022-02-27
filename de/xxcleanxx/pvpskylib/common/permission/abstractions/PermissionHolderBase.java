<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.permission.abstractions;

import de.xxcleanxx.pvpskylib.common.identifiable.Identifiable;
import de.xxcleanxx.pvpskylib.common.permission.Permission;
import de.xxcleanxx.pvpskylib.common.permission.PermissionValidator;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermission;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermissionHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnegative;
import java.util.ArrayList;
import java.util.List;

public class PermissionHolderBase extends Identifiable implements IPermissionHolder {
    protected List<IPermission> _permissions;

    public PermissionHolderBase(int id, @Nullable List<IPermission> permissions) {
        super(id);
        this.setPermissions(permissions);
    }

    public PermissionHolderBase(int id) {
        super(id);
    }

    public PermissionHolderBase(@Nullable List<IPermission> permissions) {
        this(-1, permissions);
    }

    public PermissionHolderBase() {
        this(-1);
    }

    public @NotNull List<IPermission> getEffectivePermissions() {
        List<IPermission> list = new ArrayList<>();

        for (IPermission item : this.getPermissions()) {
            if (item.getValue()) {
                list.add(item);
            }
        }

        return list;
    }

    public @NotNull List<IPermission> getPermissions() {
        return this._permissions;
    }

    public void setPermissions(@Nullable List<IPermission> permissions) {
        if (permissions == null) permissions = new ArrayList<>();

        this._permissions = permissions;
    }

    public IPermission getPermission(@NotNull String name) {
        if (!PermissionValidator.isNameValid(name)) throw PermissionValidator.Exception;

        for (IPermission item : this.getPermissions()) {
            if (item.getName().equalsIgnoreCase(name.trim())) {
                return item;
            }
        }

        return null;
    }

    public void addPermission(@NotNull IPermission permission) {
        if (!PermissionValidator.isValid(permission)) throw PermissionValidator.Exception;
        if (!this.hasPermission(permission)) this.getPermissions().add(permission);
    }

    public void addPermission(@NotNull String name, @Nullable String description, boolean value) {
        this.addPermission(new Permission(name, description, value));
    }

    public void addPermission(@NotNull String name, @Nullable String description) {
        this.addPermission(name, description, true);
    }

    public void addPermission(@NotNull String name, boolean value) {
        this.addPermission(name, null, value);
    }

    public void addPermission(@NotNull String name) {
        this.addPermission(name, null, true);
    }

    public void removePermission(@NotNull String name) {
        IPermission permission = this.getPermission(name.trim());

        if (permission != null) this.getPermissions().remove(permission);
    }

    public void removePermission(@NotNull IPermission permission) {
        if (!PermissionValidator.isValid(permission)) throw PermissionValidator.Exception;

        this.removePermission(permission.getName());
    }

    public boolean hasPermission(@Nonnegative int id) {
        for (IPermission item : this.getPermissions()) {
            if (item.getId() == id) return true;
        }

        return false;
    }

    public boolean hasPermission(@NotNull String name) {
        for (IPermission item : this.getPermissions()) {
            if (item.getName().equalsIgnoreCase(name.trim())) return true;
        }

        return false;
    }

    public boolean hasPermission(@NotNull IPermission permission) {
        return this.hasPermission(permission.getId());
    }
=======
package de.xxcleanxx.pvpskylib.common.permission.abstractions;

import de.xxcleanxx.pvpskylib.common.identifiable.Identifiable;
import de.xxcleanxx.pvpskylib.common.permission.Permission;
import de.xxcleanxx.pvpskylib.common.permission.PermissionValidator;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermission;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermissionHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnegative;
import java.util.ArrayList;
import java.util.List;

public class PermissionHolderBase extends Identifiable implements IPermissionHolder {
    protected List<IPermission> _permissions;

    public PermissionHolderBase(int id, @Nullable List<IPermission> permissions) {
        super(id);
        this.setPermissions(permissions);
    }

    public PermissionHolderBase(int id) {
        super(id);
    }

    public PermissionHolderBase(@Nullable List<IPermission> permissions) {
        this(-1, permissions);
    }

    public PermissionHolderBase() {
        this(-1);
    }

    public @NotNull List<IPermission> getEffectivePermissions() {
        List<IPermission> list = new ArrayList<>();

        for (IPermission item : this.getPermissions()) {
            if (item.getValue()) {
                list.add(item);
            }
        }

        return list;
    }

    public @NotNull List<IPermission> getPermissions() {
        return this._permissions;
    }

    public void setPermissions(@Nullable List<IPermission> permissions) {
        if (permissions == null) permissions = new ArrayList<>();

        this._permissions = permissions;
    }

    public IPermission getPermission(@NotNull String name) {
        if (!PermissionValidator.isNameValid(name)) throw PermissionValidator.Exception;

        for (IPermission item : this.getPermissions()) {
            if (item.getName().equalsIgnoreCase(name.trim())) {
                return item;
            }
        }

        return null;
    }

    public void addPermission(@NotNull IPermission permission) {
        if (!PermissionValidator.isValid(permission)) throw PermissionValidator.Exception;
        if (!this.hasPermission(permission)) this.getPermissions().add(permission);
    }

    public void addPermission(@NotNull String name, @Nullable String description, boolean value) {
        this.addPermission(new Permission(name, description, value));
    }

    public void addPermission(@NotNull String name, @Nullable String description) {
        this.addPermission(name, description, true);
    }

    public void addPermission(@NotNull String name, boolean value) {
        this.addPermission(name, null, value);
    }

    public void addPermission(@NotNull String name) {
        this.addPermission(name, null, true);
    }

    public void removePermission(@NotNull String name) {
        IPermission permission = this.getPermission(name.trim());

        if (permission != null) this.getPermissions().remove(permission);
    }

    public void removePermission(@NotNull IPermission permission) {
        if (!PermissionValidator.isValid(permission)) throw PermissionValidator.Exception;

        this.removePermission(permission.getName());
    }

    public boolean hasPermission(@Nonnegative int id) {
        for (IPermission item : this.getPermissions()) {
            if (item.getId() == id) return true;
        }

        return false;
    }

    public boolean hasPermission(@NotNull String name) {
        for (IPermission item : this.getPermissions()) {
            if (item.getName().equalsIgnoreCase(name.trim())) return true;
        }

        return false;
    }

    public boolean hasPermission(@NotNull IPermission permission) {
        return this.hasPermission(permission.getId());
    }
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}