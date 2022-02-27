package de.xxcleanxx.pvpskylib.common.permission;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.*;
import org.jetbrains.annotations.Nullable;

public class PvPSkyPermissible extends PermissibleBase {
    public PvPSkyPermissible(@Nullable ServerOperator opable) {
        super(opable);
    }
}