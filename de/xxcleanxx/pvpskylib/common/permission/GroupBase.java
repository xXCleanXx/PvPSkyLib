package de.xxcleanxx.pvpskylib.common.permission;

import de.xxcleanxx.pvpskylib.common.identifiable.Nameable;
import de.xxcleanxx.pvpskylib.common.identifiable.PrefixAndSuffix;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.INameable;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IPrefixAndSuffix;
import de.xxcleanxx.pvpskylib.common.permission.abstractions.PermissionHolderBase;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IGroup;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermission;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermissionHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnegative;
import java.util.ArrayList;
import java.util.List;

public class GroupBase extends PermissionHolderBase implements IGroup {
    protected IPrefixAndSuffix _prefixAndSuffixBase;
    protected INameable _nameableBase;
    protected List<IPermissionHolder> _members;
    protected List<IGroup> _children;

    // Constructors
    public GroupBase(int id, String name, String prefix, String suffix, List<IPermission> permissions) {
        super(permissions);
        this.setName(name);
        this.setPrefix(prefix);
        this.setSuffix(suffix);
    }

    public GroupBase(int id, String name, String prefix, String suffix) {
        this(id, name, prefix, suffix, null);
    }

    public GroupBase(int id, String name, String prefix, List<IPermission> permissions) {
        this(id, name, prefix, null, permissions);
    }

    public GroupBase(int id, String name, String prefix) {
        this(id, name, prefix, null, null);
    }

    public GroupBase(int id, String name, List<IPermission> permissions) {
        this(id, name, null, null, permissions);
    }

    public GroupBase(int id, String name) {
        this(id, name, null, null, null);
    }
    // # ### #

    // Base Properties
    protected @NotNull INameable getNameableBase() {
        if (this._nameableBase == null) this._nameableBase = new Nameable();

        return this._nameableBase;
    }

    protected @NotNull IPrefixAndSuffix getPrefixAndSuffixBase() {
        if (this._prefixAndSuffixBase == null) this._prefixAndSuffixBase = new PrefixAndSuffix();

        return this._prefixAndSuffixBase;
    }
    // # ### #

    // Properties
    public @NotNull String getName() {
        return this.getNameableBase().getName();
    }

    public void setName(@NotNull String name) {
        this.getNameableBase().setName(name);
    }

    public @NotNull String getPrefix() {
        return this.getPrefixAndSuffixBase().getPrefix();
    }

    public void setPrefix(@Nullable String prefix) {
        this.getPrefixAndSuffixBase().setPrefix(prefix);
    }

    public @NotNull String getSuffix() {
        return this.getPrefixAndSuffixBase().getSuffix();
    }

    public void setSuffix(@Nullable String suffix) {
        this.getPrefixAndSuffixBase().setSuffix(suffix);
    }

    public List<IPermissionHolder> getMembers() {
        return this._members;
    }

    public void setMembers(List<IPermissionHolder> members) {
        if (members == null) members = new ArrayList<>();

        this._members = members;
    }

    public List<IGroup> getChildGroups() {
        return this._children;
    }

    public void setChildGroups(List<IGroup> groups) {
        if (groups == null) groups = new ArrayList<>();

        this._children = groups;
    }
    // # ### #

    // Methods
    public IPermissionHolder getMember(@Nonnegative int id) {
        for (IPermissionHolder item : this.getMembers()) {
            if (item.getId() == id) return item;
        }

        return null;
    }

    public void addMember(@NotNull IPermissionHolder permissionHolder) {
        if (this.getMembers().contains(permissionHolder))
            throw new IllegalArgumentException("Member already added to this group!");

        this.getMembers().add(permissionHolder);
    }

    public void removeMember(@NotNull IPermissionHolder permissionHolder) {
        IPermissionHolder member = this.getMember(permissionHolder.getId());

        if (member != null) this.getMembers().remove(member);
    }

    public boolean hasMember(@NotNull IPermissionHolder permissionHolder) {
        return this.getMember(permissionHolder.getId()) != null;
    }

    public IGroup getChildGroup(@Nonnegative int id) {
        for (IGroup item : this.getChildGroups()) {
            if (item.getId() == id) return item;
        }

        return null;
    }

    public void addChildGroup(@NotNull IGroup group) {
        if (this.hasChildGroup(group)) throw new IllegalArgumentException("Child group already added to this group!");
        if (super.getId() == group.getId()) throw new IllegalArgumentException("Child group cannot be the same as parent group!");
        if (group.hasChildGroup(this)) throw new IllegalArgumentException("Parent group must not have a circular reference!");

        this.getChildGroups().add(group);
    }

    public void removeChildGroup(@NotNull IGroup group) {
        IGroup child = this.getChildGroup(group.getId());

        if (child != null) this.getChildGroups().remove(child);
    }

    public boolean hasChildGroup(@NotNull IGroup group) {
        if (group.getId() < 0) throw new IllegalArgumentException("Group id cannot be less than 0!");

        return this.getChildGroup(group.getId()) != null;
    }
    // # ### #
}