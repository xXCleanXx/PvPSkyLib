package de.xxcleanxx.pvpskylib.common.identifiable.interfaces;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface IPrefix extends IAffix {
    @NotNull String getPrefix();

    void setPrefix(@Nullable String prefix);
}