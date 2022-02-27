<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.permission.abstractions;

import de.xxcleanxx.pvpskylib.common.identifiable.Nameable;
import de.xxcleanxx.pvpskylib.common.identifiable.abstractions.IdentifiableBase;
import de.xxcleanxx.pvpskylib.common.identifiable.abstractions.NameableBase;
import de.xxcleanxx.pvpskylib.common.permission.PermissionValidator;
import de.xxcleanxx.pvpskylib.common.permission.exceptions.InvalidPermissionException;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermission;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnegative;
import java.util.ArrayList;
import java.util.List;

public abstract class PermissionBase extends IdentifiableBase implements IPermission {
    protected NameableBase _nameableBase;
    protected String _description;
    protected boolean _value;
    protected List<IPermission> _children;

    // Constructors
    public PermissionBase(int id, @NotNull String name, @Nullable String description, boolean value) {
        super(id);
        this.setName(name);
        this.setDescription(description);
        this.setValue(value);
    }

    public PermissionBase(int id, @NotNull String name, @Nullable String description) {
        this(id, name, description, true);
    }

    public PermissionBase(int id, @NotNull String name) {
        this(id, name, null);
    }

    public PermissionBase(@NotNull String name, @Nullable String description, boolean value) {
        this(-1, name, description, value);
    }

    public PermissionBase(@NotNull String name, @Nullable String description) {
        this(name, description, true);
    }

    public PermissionBase(@NotNull String name) {
        this(name, null);
    }
    // # ### #

    // Base Properties
    protected NameableBase getNameableBase() {
        if (this._nameableBase == null) this._nameableBase = new Nameable();

        return this._nameableBase;
    }
    // # ### #

    // Properties
    public @NotNull List<IPermission> getChildPermissions() {
        if (this._children == null) this._children = new ArrayList<>();

        return this._children;
    }

    public void addChildPermission(IPermission permission) {
        if (!PermissionValidator.isValid(permission)) throw PermissionValidator.Exception;

        if (!this.hasChildPermission(permission.getId())) this.getChildPermissions().add(permission);
    }

    public @Nullable IPermission getChildPermission(@Nonnegative int id) {
        for (IPermission item : this.getChildPermissions()) {
            if (item.getId() == id) return item;
        }

        return null;
    }

    public @Nullable IPermission getChildPermission(@NotNull String name) {
        for (IPermission item : this.getChildPermissions()) {
            if (item.getName().equalsIgnoreCase(name.trim())) return item;
        }

        return null;
    }

    public boolean hasChildPermission(@Nonnegative int id) {
        for (IPermission item : this.getChildPermissions()) {
            if (item.getId() == id) return true;
        }

        return false;
    }

    public boolean hasChildPermission(@NotNull IPermission permission) {
        return this.hasChildPermission(permission.getId());
    }

    public @NotNull String getName() {
        return this.getNameableBase().getName();
    }

    public void setName(@NotNull String name) {
        if (name.trim().isEmpty()) throw new IllegalArgumentException("Permission name cannot empty or consists of white-spaces!");

        this.getNameableBase().setName(name);
    }

    public @Nullable String getDescription() {
        return this._description;
    }

    public void setDescription(@Nullable String description) {
        this._description = description;
    }

    public boolean getValue() {
        return this._value;
    }

    public void setValue(boolean value) {
        this._value = value;
    }
    // # ### #

    // Protected Methods
    // # ### #
=======
package de.xxcleanxx.pvpskylib.common.permission.abstractions;

import de.xxcleanxx.pvpskylib.common.identifiable.Nameable;
import de.xxcleanxx.pvpskylib.common.identifiable.abstractions.IdentifiableBase;
import de.xxcleanxx.pvpskylib.common.identifiable.abstractions.NameableBase;
import de.xxcleanxx.pvpskylib.common.permission.PermissionValidator;
import de.xxcleanxx.pvpskylib.common.permission.exceptions.InvalidPermissionException;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermission;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnegative;
import java.util.ArrayList;
import java.util.List;

public abstract class PermissionBase extends IdentifiableBase implements IPermission {
    protected NameableBase _nameableBase;
    protected String _description;
    protected boolean _value;
    protected List<IPermission> _children;

    // Constructors
    public PermissionBase(int id, @NotNull String name, @Nullable String description, boolean value) {
        super(id);
        this.setName(name);
        this.setDescription(description);
        this.setValue(value);
    }

    public PermissionBase(int id, @NotNull String name, @Nullable String description) {
        this(id, name, description, true);
    }

    public PermissionBase(int id, @NotNull String name) {
        this(id, name, null);
    }

    public PermissionBase(@NotNull String name, @Nullable String description, boolean value) {
        this(-1, name, description, value);
    }

    public PermissionBase(@NotNull String name, @Nullable String description) {
        this(name, description, true);
    }

    public PermissionBase(@NotNull String name) {
        this(name, null);
    }
    // # ### #

    // Base Properties
    protected NameableBase getNameableBase() {
        if (this._nameableBase == null) this._nameableBase = new Nameable();

        return this._nameableBase;
    }
    // # ### #

    // Properties
    public @NotNull List<IPermission> getChildPermissions() {
        if (this._children == null) this._children = new ArrayList<>();

        return this._children;
    }

    public void addChildPermission(IPermission permission) {
        if (!PermissionValidator.isValid(permission)) throw PermissionValidator.Exception;

        if (!this.hasChildPermission(permission.getId())) this.getChildPermissions().add(permission);
    }

    public @Nullable IPermission getChildPermission(@Nonnegative int id) {
        for (IPermission item : this.getChildPermissions()) {
            if (item.getId() == id) return item;
        }

        return null;
    }

    public @Nullable IPermission getChildPermission(@NotNull String name) {
        for (IPermission item : this.getChildPermissions()) {
            if (item.getName().equalsIgnoreCase(name.trim())) return item;
        }

        return null;
    }

    public boolean hasChildPermission(@Nonnegative int id) {
        for (IPermission item : this.getChildPermissions()) {
            if (item.getId() == id) return true;
        }

        return false;
    }

    public boolean hasChildPermission(@NotNull IPermission permission) {
        return this.hasChildPermission(permission.getId());
    }

    public @NotNull String getName() {
        return this.getNameableBase().getName();
    }

    public void setName(@NotNull String name) {
        if (name.trim().isEmpty()) throw new IllegalArgumentException("Permission name cannot empty or consists of white-spaces!");

        this.getNameableBase().setName(name);
    }

    public @Nullable String getDescription() {
        return this._description;
    }

    public void setDescription(@Nullable String description) {
        this._description = description;
    }

    public boolean getValue() {
        return this._value;
    }

    public void setValue(boolean value) {
        this._value = value;
    }
    // # ### #

    // Protected Methods
    // # ### #
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}