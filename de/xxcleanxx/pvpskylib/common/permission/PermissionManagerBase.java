package de.xxcleanxx.pvpskylib.common.permission;

import de.xxcleanxx.pvpskylib.common.permission.interfaces.IGroup;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermissionHolder;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnegative;
import java.util.ArrayList;
import java.util.List;

public abstract class PermissionManagerBase {
    protected List<IGroup> _groups;
    protected List<IPermissionHolder> _permissionHolders;

    public PermissionManagerBase() {
        this._groups = new ArrayList<>();
        this._permissionHolders = new ArrayList<>();
    }

    public List<IGroup> getGroups() {
        return this._groups;
    }

    public List<IPermissionHolder> getPermissionHolders() {
        return this._permissionHolders;
    }

    public IGroup getGroup(@Nonnegative int id) {
        for (IGroup item : this.getGroups()) {
            if (item.getId() == id) return item;
        }

        return null;
    }

    public void addGroup(@NotNull IGroup group) {
        if (this.existsGroup(group)) throw new IllegalArgumentException("Group already added!");

        this.getGroups().add(group);
    }

    public void removeGroup(@NotNull IGroup group) {
        IGroup remove = this.getGroup(group.getId());

        if (remove != null) this.getGroups().remove(remove);
    }

    public IPermissionHolder getPermissionHolder(@Nonnegative int id) {
        for (IPermissionHolder item : this.getPermissionHolders()) {
            if (item.getId() == id) return item;
        }

        return null;
    }

    public void addPermissionHolder(@NotNull IPermissionHolder permissionHolder) {
        if (this.existsPermissionHolder(permissionHolder))
            throw new IllegalArgumentException("Permission holder already added!");

        this.getPermissionHolders().add(permissionHolder);
    }

    public void removePermissionHolder(@NotNull IPermissionHolder permissionHolder) {
        IPermissionHolder remove = this.getPermissionHolder(permissionHolder.getId());

        if (remove != null) this.getPermissionHolders().remove(remove);
    }

    public boolean existsGroup(@Nonnegative int id) {
        for (IGroup item : this.getGroups()) {
            if (item.getId() == id) return true;
        }

        return false;
    }

    public boolean existsGroup(@NotNull IGroup group) {
        return this.existsGroup(group.getId());
    }

    public boolean existsPermissionHolder(@Nonnegative int id) {
        for (IPermissionHolder item : this.getPermissionHolders()) {
            if (item.getId() == id) return true;
        }

        return false;
    }

    public boolean existsPermissionHolder(@NotNull IPermissionHolder permissionHolder) {
        return this.existsPermissionHolder(permissionHolder.getId());
    }
}