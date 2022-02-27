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
}