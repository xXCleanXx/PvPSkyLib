package de.xxcleanxx.pvpskylib.common.permission;

import de.xxcleanxx.pvpskylib.common.permission.abstractions.PermissionBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Permission extends PermissionBase {
    public Permission(int id, @NotNull String name, @Nullable String description, boolean value) {
        super(id, name, description, value);
    }

    public Permission(int id, @NotNull String name, @Nullable String description) {
        super(id, name, description);
    }

    public Permission(int id, @NotNull String name) {
        super(id, name);
    }

    public Permission(@NotNull String name, @Nullable String description, boolean value) {
        super(name, description, value);
    }

    public Permission(@NotNull String name, @Nullable String description) {
        super(name, description);
    }

    public Permission(@NotNull String name) {
        super(name);
    }
}