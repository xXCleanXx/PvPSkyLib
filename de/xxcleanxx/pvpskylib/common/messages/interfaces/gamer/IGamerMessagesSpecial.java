package de.xxcleanxx.pvpskylib.common.messages.interfaces.gamer;

public interface IGamerMessagesSpecial {
    void sendPlayerOfflineMessage(String playerName);

    void sendPlayerOfflineMessage();

    void sendPlayerNotFoundMessage(String playerName);

    void sendPlayerNotFoundMessage();

    void sendNoPermissionMessage(String permissionName);

    void sendNoPermissionMessage();

    void sendAlreadyHasItemInHand(String playerName, String itemName);

    void sendAlreadyHasItemInHand(String playerName);

    void sendAlreadyHaveItemInHand(String itemName);

    void sendAlreadyHaveItemInHand();
}