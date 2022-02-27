package de.xxcleanxx.pvpskylib.spigot.listener;

import de.xxcleanxx.pvpskylib.spigot.listener.abstractions.CancelledListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerDropItemEvent;

public class BlockPlayerDropItemListener extends CancelledListener {
    public BlockPlayerDropItemListener() {
        super();
    }

    public BlockPlayerDropItemListener(boolean cancelled) {
        super(cancelled);
    }

    @EventHandler
    public void onBlockDropItem(PlayerDropItemEvent e) {
        e.setCancelled(super.isCancelled());
    }
}