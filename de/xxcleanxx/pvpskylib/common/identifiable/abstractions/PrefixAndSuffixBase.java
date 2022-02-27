package de.xxcleanxx.pvpskylib.common.identifiable.abstractions;

import de.xxcleanxx.pvpskylib.common.identifiable.Suffix;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IPrefixAndSuffix;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class PrefixAndSuffixBase implements IPrefixAndSuffix {
    protected String _prefix;
    protected String _suffix;

    public PrefixAndSuffixBase(@Nullable String prefix, @Nullable String suffix) {
        this.setPrefix(prefix);
        this.setSuffix(suffix);
    }

    public PrefixAndSuffixBase(@Nullable String prefix) {
        this.setPrefix(prefix);
    }

    public PrefixAndSuffixBase() { }

    public @NotNull String getPrefix() {
        if (this._prefix == null) this.setPrefix("");

        return this._prefix;
    }

    public void setPrefix(@Nullable String prefix) {
        this._prefix = prefix;
    }

    public @NotNull String getSuffix() {
        if (this._suffix == null) this.setSuffix("");

        return this._suffix;
    }

    public void setSuffix(@Nullable String suffix) {
        this._suffix = suffix;
    }
}