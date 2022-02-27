<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.permission.interfaces;

import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IIdentifiable;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.INameable;
import org.jetbrains.annotations.Nullable;

public interface IPermission extends IIdentifiable, INameable {
    @Nullable String getDescription();

    void setDescription(@Nullable String description);

    boolean getValue();

    void setValue(boolean value);
=======
package de.xxcleanxx.pvpskylib.common.permission.interfaces;

import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IIdentifiable;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.INameable;
import org.jetbrains.annotations.Nullable;

public interface IPermission extends IIdentifiable, INameable {
    @Nullable String getDescription();

    void setDescription(@Nullable String description);

    boolean getValue();

    void setValue(boolean value);
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}