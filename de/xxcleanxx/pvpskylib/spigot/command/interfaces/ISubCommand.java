package de.xxcleanxx.pvpskylib.spigot.command.interfaces;

import org.bukkit.command.CommandSender;

public interface ISubCommand {
    void onCommand(CommandSender commandSender, String[] arguments);
}