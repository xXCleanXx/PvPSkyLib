package de.xxcleanxx.pvpskylib.common.identifiable.abstractions;

import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.INameable;

public abstract class NameableBase implements INameable {
    protected String _name;

    public NameableBase(String name) {
        this.setName(name);
    }

    public NameableBase() { }

    public String getName() {
        if (this._name == null) this.setName("");

        return this._name;
    }

    public void setName(String name) {
        this._name = name;
    }
}