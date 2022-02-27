<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.spigot.listener.abstractions;

import org.bukkit.event.Listener;

public abstract class CancelledListener implements Listener {
    protected boolean _cancelled;

    public CancelledListener() { }

    public CancelledListener(boolean cancelled) {
        this.setCancelled(cancelled);
    }

    public boolean isCancelled() {
        return this._cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this._cancelled = cancelled;
    }
=======
package de.xxcleanxx.pvpskylib.spigot.listener.abstractions;

import org.bukkit.event.Listener;

public abstract class CancelledListener implements Listener {
    protected boolean _cancelled;

    public CancelledListener() { }

    public CancelledListener(boolean cancelled) {
        this.setCancelled(cancelled);
    }

    public boolean isCancelled() {
        return this._cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this._cancelled = cancelled;
    }
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}