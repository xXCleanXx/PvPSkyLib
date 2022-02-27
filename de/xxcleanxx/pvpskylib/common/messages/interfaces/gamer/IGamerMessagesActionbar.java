package de.xxcleanxx.pvpskylib.common.messages.interfaces.gamer;

public interface IGamerMessagesActionbar {
    void sendActionbarMessage(String message);

    void sendActionbarMessage(String message, boolean config);

    void sendActionbarMessage(String message, String... placeholders);

    void sendActionbarMessage(String message, boolean config, String... placeholders);

    void sendCommandMessage(String message);

    void sendCommandMessage(String message, boolean config);

    void sendCommandMessage(String message, String... placeholders);

    void sendCommandMessage(String message, boolean config, String... placeholders);
}