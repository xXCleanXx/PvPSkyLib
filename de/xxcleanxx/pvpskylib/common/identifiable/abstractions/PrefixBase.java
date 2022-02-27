package de.xxcleanxx.pvpskylib.common.identifiable.abstractions;

import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IPrefix;

public abstract class PrefixBase implements IPrefix {
    protected String _prefix;

    public PrefixBase(String prefix) {
        this.setPrefix(prefix);
    }

    public PrefixBase() { }

    public String getPrefix() {
        return this._prefix;
    }

    public void setPrefix(String prefix) {
        this._prefix = prefix;
    }
}