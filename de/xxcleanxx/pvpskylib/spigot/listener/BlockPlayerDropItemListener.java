<<<<<<< HEAD
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
=======
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
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}