package de.xxcleanxx.pvpskylib.common.common.interfaces;

public interface ISubCommand<DerivedCommandSender> {
    void onCommand(DerivedCommandSender sender, String command, String[] args);
}