package de.xxcleanxx.pvpskylib.common.permission.interfaces;

import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IIdentifiable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface IPermissionHolder extends IIdentifiable {
    @NotNull
    List<IPermission> getPermissions();

    void setPermissions(@Nullable List<IPermission> permissions);

    @NotNull
    List<IPermission> getEffectivePermissions();

    IPermission getPermission(@NotNull String name);

    void addPermission(@NotNull String name, String description, boolean value);

    void addPermission(@NotNull String name, String description);

    void addPermission(@NotNull String name, boolean value);

    void addPermission(@NotNull String name);

    void addPermission(@NotNull IPermission permission);

    void removePermission(@NotNull String name);

    void removePermission(@NotNull IPermission permission);

    boolean hasPermission(@NotNull String name);

    boolean hasPermission(@NotNull IPermission permission);
}
