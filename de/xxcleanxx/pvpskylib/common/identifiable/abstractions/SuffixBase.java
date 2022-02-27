<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.identifiable.abstractions;

import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.ISuffix;

public abstract class SuffixBase implements ISuffix {
    protected String _suffix;

    public SuffixBase(String suffix) {
        this.setSuffix(suffix);
    }

    public SuffixBase() { }

    public String getSuffix() {
        return this._suffix;
    }

    public void setSuffix(String suffix) {
        this._suffix = suffix;
    }
=======
package de.xxcleanxx.pvpskylib.common.identifiable.abstractions;

import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.ISuffix;

public abstract class SuffixBase implements ISuffix {
    protected String _suffix;

    public SuffixBase(String suffix) {
        this.setSuffix(suffix);
    }

    public SuffixBase() { }

    public String getSuffix() {
        return this._suffix;
    }

    public void setSuffix(String suffix) {
        this._suffix = suffix;
    }
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}