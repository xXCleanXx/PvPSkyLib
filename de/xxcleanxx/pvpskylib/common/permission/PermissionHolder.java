package de.xxcleanxx.pvpskylib.common.permission;

import de.xxcleanxx.pvpskylib.common.permission.abstractions.PermissionHolderBase;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermission;

import java.util.List;

public class PermissionHolder extends PermissionHolderBase {
    public PermissionHolder(List<IPermission> permissions) {
        super(permissions);
    }

    public PermissionHolder() {
        super();
    }
}