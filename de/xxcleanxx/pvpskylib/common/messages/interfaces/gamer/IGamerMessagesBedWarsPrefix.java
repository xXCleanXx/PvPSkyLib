package de.xxcleanxx.pvpskylib.common.messages.interfaces.gamer;

public interface IGamerMessagesBedWarsPrefix {
    void sendMessageWithBedWarsPrefix(String message, boolean config, String... placeholders);

    void sendMessageWithBedWarsPrefix(String message, String... placeholders);

    void sendMessageWithBedWarsPrefix(String message, boolean config);

    void sendMessageWithBedWarsPrefix(String message);
}