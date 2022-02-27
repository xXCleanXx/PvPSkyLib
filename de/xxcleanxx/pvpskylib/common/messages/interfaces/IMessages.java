package de.xxcleanxx.pvpskylib.common.messages.interfaces;

public interface IMessages<DerivedPlayer> {
    void sendMessage(DerivedPlayer receiver, String message, boolean config, String... placeholders);

    void sendMessage(DerivedPlayer receiver, String message, boolean config);

    void sendMessage(DerivedPlayer receiver, String message, String... placeholders);

    void sendMessage(DerivedPlayer receiver, String message);

    void sendMessages(DerivedPlayer receiver, String messages[], String... placeholders);

    void sendMessages(DerivedPlayer receiver, String messages[]);

    void sendMessages(DerivedPlayer receiver, String path, String... placeholders);

    void sendMessages(DerivedPlayer receiver, String path);
}