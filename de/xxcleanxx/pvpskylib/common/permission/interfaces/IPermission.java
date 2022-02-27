package de.xxcleanxx.pvpskylib.common.permission.interfaces;

import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IIdentifiable;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.INameable;
import org.jetbrains.annotations.Nullable;

public interface IPermission extends IIdentifiable, INameable {
    @Nullable String getDescription();

    void setDescription(@Nullable String description);

    boolean getValue();

    void setValue(boolean value);
}