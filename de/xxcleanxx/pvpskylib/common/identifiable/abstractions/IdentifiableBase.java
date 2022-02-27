<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.identifiable.abstractions;

import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IIdentifiable;

public abstract class IdentifiableBase implements IIdentifiable {
    protected int _id;

    public IdentifiableBase(int id) {
        this.setId(id);
    }

    public IdentifiableBase() { }

    public int getId() {
        return this._id;
    }

    public void setId(int id) {
        this._id = id;
    }
=======
package de.xxcleanxx.pvpskylib.common.identifiable.abstractions;

import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IIdentifiable;

public abstract class IdentifiableBase implements IIdentifiable {
    protected int _id;

    public IdentifiableBase(int id) {
        this.setId(id);
    }

    public IdentifiableBase() { }

    public int getId() {
        return this._id;
    }

    public void setId(int id) {
        this._id = id;
    }
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}