package de.xxcleanxx.pvpskylib.common.permission;

import de.xxcleanxx.pvpskylib.common.permission.exceptions.InvalidPermissionException;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermission;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PermissionValidator {
    public static InvalidPermissionException Exception;

    private PermissionValidator() { }

    public static boolean isValid(@NotNull IPermission permission) {
        return isIdValid(permission.getId()) && isNameValid(permission.getName());
    }

    private static String isIdValidInternal(int id) {
        return id < 0 ? "Permission id cannot be less than 0!" : null;
    }

    public static boolean isIdValid(int id) {
        String msg = isIdValidInternal(id);

        if (msg != null) Exception = new InvalidPermissionException(msg);

        return msg == null;
    }

    public static boolean isIdValid(@NotNull IPermission permission) {
        return isIdValid(permission.getId());
    }

    private static String isNameValidInternal(@Nullable String name) {
        return name == null ? "Permission name cannot be null" : name.trim().isEmpty() ? "Permission name cannot be empty or consists of white-spaces!" : null;
    }

    public static boolean isNameValid(@Nullable String name) {
        String msg = isNameValidInternal(name);

        if (msg != null) Exception = new InvalidPermissionException(msg);

        return msg == null;
    }

    public static boolean isNameValid(@NotNull IPermission permission) {
        return isNameValid(permission.getName());
    }
}