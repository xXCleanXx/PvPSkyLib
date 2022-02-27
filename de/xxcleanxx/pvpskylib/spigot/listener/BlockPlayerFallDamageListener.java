<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.spigot.listener;

import de.xxcleanxx.pvpskylib.spigot.listener.abstractions.CancelledListener;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;

public class BlockPlayerFallDamageListener extends CancelledListener {
    public BlockPlayerFallDamageListener() {
        super();
    }

    public BlockPlayerFallDamageListener(boolean cancelled) {
        super(cancelled);
    }

    @EventHandler
    public void onBlockPlayerFallDamage(EntityDamageEvent e) {
        if (e.getEntityType() == EntityType.PLAYER && e.getCause() == EntityDamageEvent.DamageCause.FALL) {
            e.setCancelled(super.isCancelled());
        }
    }
=======
package de.xxcleanxx.pvpskylib.spigot.listener;

import de.xxcleanxx.pvpskylib.spigot.listener.abstractions.CancelledListener;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;

public class BlockPlayerFallDamageListener extends CancelledListener {
    public BlockPlayerFallDamageListener() {
        super();
    }

    public BlockPlayerFallDamageListener(boolean cancelled) {
        super(cancelled);
    }

    @EventHandler
    public void onBlockPlayerFallDamage(EntityDamageEvent e) {
        if (e.getEntityType() == EntityType.PLAYER && e.getCause() == EntityDamageEvent.DamageCause.FALL) {
            e.setCancelled(super.isCancelled());
        }
    }
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}