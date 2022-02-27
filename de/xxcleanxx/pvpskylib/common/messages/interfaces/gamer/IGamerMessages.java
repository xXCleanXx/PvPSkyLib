package de.xxcleanxx.pvpskylib.common.messages.interfaces.gamer;

public interface IGamerMessages {
    void sendMessage(String message, boolean config, String... placeholders);

    void sendMessage(String message, boolean config);

    void sendMessage(String message, String... placeholders);

    void sendMessage(String message);

    void sendMessages(String[] messages, String... placeholders);

    void sendMessages(String[] messages);

    void sendMessages(String path, String... placeholders);

    void sendMessages(String path);
}