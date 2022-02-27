<<<<<<< HEAD
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
=======
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
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}