<<<<<<< HEAD
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
=======
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
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}