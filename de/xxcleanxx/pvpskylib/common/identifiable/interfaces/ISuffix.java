package de.xxcleanxx.pvpskylib.common.identifiable.interfaces;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ISuffix {
    @NotNull String getSuffix();

    void setSuffix(@Nullable String suffix);
}