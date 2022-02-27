package de.xxcleanxx.pvpskylib.spigot.common;

import de.xxcleanxx.pvpskylib.common.enums.VerbosityLevel;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.TabCompleter;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.logging.Logger;

public class Register {
    private JavaPlugin _javaPlugin;
    private VerbosityLevel _verbosityLevel = VerbosityLevel.NONE;

    public Register(@NotNull JavaPlugin javaPlugin) {
        this.setJavaPlugin(javaPlugin);
    }

    public void registerCommand(@NotNull String commandName, @NotNull CommandExecutor commandExecutor, @Nullable TabCompleter tabCompleter) {
        if (commandName.trim().isEmpty())
            throw new IllegalArgumentException("Command name is empty or consists of white-spaces!");

        PluginCommand command = this.getJavaPlugin().getCommand(commandName);
        Logger logger = this.getJavaPlugin().getLogger();

        if (command == null) {
            final String msg = "Command " + commandName + " could not be loaded!";

            if (this.getVerbosityLevel() == VerbosityLevel.INFO) {
                logger.info(msg);
            } else if (this.getVerbosityLevel() == VerbosityLevel.WARNING) {
                logger.warning(msg);
            }

            return;
        }

        command.setExecutor(commandExecutor);

        if (tabCompleter != null) command.setTabCompleter(tabCompleter);
        if (this.getVerbosityLevel() == VerbosityLevel.INFO || this.getVerbosityLevel() == VerbosityLevel.WARNING)
            logger.info("Command " + commandName + " registered!");
    }

    public void registerEvent(@NotNull Listener listener) {
        PluginManager pluginManager = this.getJavaPlugin().getServer().getPluginManager();
        pluginManager.registerEvents(listener, this.getJavaPlugin());
    }

    public void registerEvents(@NotNull Listener... listeners) {
        PluginManager pluginManager = this.getJavaPlugin().getServer().getPluginManager();

        for (Listener item : listeners) {
            pluginManager.registerEvents(item, this.getJavaPlugin());
            if (this.getVerbosityLevel() == VerbosityLevel.INFO || this.getVerbosityLevel() == VerbosityLevel.WARNING)
                this.getJavaPlugin().getLogger().info("Event " + item.getClass().getName() + " registered!");
        }
    }

    @NotNull
    public VerbosityLevel getVerbosityLevel() {
        return this._verbosityLevel;
    }

    public void setVerbosityLevel(@NotNull VerbosityLevel verbosityLevel) {
        this._verbosityLevel = verbosityLevel;
    }

    @NotNull
    private JavaPlugin getJavaPlugin() {
        return this._javaPlugin;
    }

    private void setJavaPlugin(@NotNull JavaPlugin javaPlugin) {
        this._javaPlugin = javaPlugin;
    }
}