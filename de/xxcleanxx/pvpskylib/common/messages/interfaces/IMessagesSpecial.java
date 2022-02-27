package de.xxcleanxx.pvpskylib.common.messages.interfaces;

public interface IMessagesSpecial<DerivedSender> {
    void sendPlayerOfflineMessage(DerivedSender sender, String playerName);

    void sendPlayerOfflineMessage(DerivedSender sender);

    void sendPlayerNotFoundMessage(DerivedSender sender, String playerName);

    void sendPlayerNotFoundMessage(DerivedSender sender);

    void sendNoPermissionMessage(DerivedSender sender, String permissionName);

    void sendNoPermissionMessage(DerivedSender sender);

    void sendAlreadyHasItemInHandMessage(DerivedSender sender, String playerName, String itemName);

    void sendAlreadyHasItemInHandMessage(DerivedSender sender, String playerName);

    void sendAlreadyHaveItemInHandMessage(DerivedSender sender, String itemName);

    void sendAlreadyHaveItemInHandMessage(DerivedSender sender);
}