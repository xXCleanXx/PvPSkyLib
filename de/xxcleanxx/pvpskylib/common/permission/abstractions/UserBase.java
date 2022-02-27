<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.permission.abstractions;

import de.xxcleanxx.pvpskylib.spigot.game.interfaces.IGamer;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IGroup;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermission;

import java.util.List;
import java.util.UUID;

public abstract class UserBase<DerivedPlayer> extends PermissionHolderBase implements IUser<DerivedPlayer> {
    protected UUID _uuid;

    public UserBase(UUID uuid, List<IPermission> permissions) {
        super(permissions);
        this.setUniqueId(uuid);
    }

    public UserBase(UUID uuid) {
        this(uuid, null);
    }

    public UUID getUniqueId() {
        return this._uuid;
    }

    protected void setUniqueId(UUID uuid) {
        if (uuid == null) throw new IllegalArgumentException("UUID cannot be null!");

        this._uuid = uuid;
    }

    public abstract List<IGroup<IGamer<DerivedPlayer>>> getGroups();

    public abstract IGroup<IGamer<DerivedPlayer>> getGroup(String name);
=======
package de.xxcleanxx.pvpskylib.common.permission.abstractions;

import de.xxcleanxx.pvpskylib.spigot.game.interfaces.IGamer;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IGroup;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermission;

import java.util.List;
import java.util.UUID;

public abstract class UserBase<DerivedPlayer> extends PermissionHolderBase implements IUser<DerivedPlayer> {
    protected UUID _uuid;

    public UserBase(UUID uuid, List<IPermission> permissions) {
        super(permissions);
        this.setUniqueId(uuid);
    }

    public UserBase(UUID uuid) {
        this(uuid, null);
    }

    public UUID getUniqueId() {
        return this._uuid;
    }

    protected void setUniqueId(UUID uuid) {
        if (uuid == null) throw new IllegalArgumentException("UUID cannot be null!");

        this._uuid = uuid;
    }

    public abstract List<IGroup<IGamer<DerivedPlayer>>> getGroups();

    public abstract IGroup<IGamer<DerivedPlayer>> getGroup(String name);
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}