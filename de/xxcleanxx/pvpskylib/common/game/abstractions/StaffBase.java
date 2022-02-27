package de.xxcleanxx.pvpskylib.common.game.abstractions;

import de.xxcleanxx.pvpskylib.common.game.interfaces.IStaff;

public abstract class StaffBase implements IStaff {
    protected boolean _isStaff;

    public StaffBase() { }

    public StaffBase(boolean flag) { }

    public boolean isStaff() {
        return this._isStaff;
    }

    public void setStaff(boolean flag) {
        this._isStaff = flag;
    }
}