<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.spigot.main;

import de.xxcleanxx.pvpskylib.spigot.common.Coloring;
import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main _plugin;

    @Override
    public void onEnable() {
        _plugin = this;
        this.getLogger().info(Coloring.translate(de.xxcleanxx.pvpskylib.common.main.Main.NAME + " &aaktiviert!"));
    }

    @Override
    public void onDisable() {
        this.getLogger().info(Coloring.translate(de.xxcleanxx.pvpskylib.common.main.Main.NAME + " &cdeaktiviert!"));
    }

    public static Main getPlugin() {
        return _plugin;
    }
=======
package de.xxcleanxx.pvpskylib.spigot.main;

import de.xxcleanxx.pvpskylib.spigot.common.Coloring;
import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main _plugin;

    @Override
    public void onEnable() {
        _plugin = this;
        this.getLogger().info(Coloring.translate(de.xxcleanxx.pvpskylib.common.main.Main.NAME + " &aaktiviert!"));
    }

    @Override
    public void onDisable() {
        this.getLogger().info(Coloring.translate(de.xxcleanxx.pvpskylib.common.main.Main.NAME + " &cdeaktiviert!"));
    }

    public static Main getPlugin() {
        return _plugin;
    }
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}