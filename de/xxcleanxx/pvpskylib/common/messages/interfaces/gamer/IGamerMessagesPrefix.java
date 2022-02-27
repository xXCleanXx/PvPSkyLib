package de.xxcleanxx.pvpskylib.common.messages.interfaces.gamer;

public interface IGamerMessagesPrefix {
    void sendMessageWithPrefix(String message);

    void sendMessageWithPrefix(String message, boolean config);

    void sendMessageWithPrefix(String message, String... placeholders);

    void sendMessageWithPrefix(String message, boolean config, String... placeholders);

    void sendMessageWithPrefix(String message, String prefix);

    void sendMessageWithPrefix(String message, String prefix, boolean config);

    void sendMessageWithPrefix(String message, String prefix, String... placeholders);

    void sendMessageWithPrefix(String message, String prefix, boolean config, String... placeholders);
}