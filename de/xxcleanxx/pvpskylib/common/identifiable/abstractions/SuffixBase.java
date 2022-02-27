package de.xxcleanxx.pvpskylib.common.identifiable.abstractions;

import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.ISuffix;
import org.jetbrains.annotations.NotNull;

public abstract class SuffixBase implements ISuffix {
    protected String _suffix;

    public SuffixBase(String suffix) {
        this.setSuffix(suffix);
    }

    public SuffixBase() { }

    public @NotNull String getSuffix() {
        return this._suffix;
    }

    public void setSuffix(String suffix) {
        this._suffix = suffix;
    }
}