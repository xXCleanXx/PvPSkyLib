package de.xxcleanxx.pvpskylib.common.messages.interfaces;

public interface IMessagesPrefix<DerivedPlayer> {
    void sendMessageWithPrefix(DerivedPlayer receiver, String message, boolean config, String... placeholders);

    void sendMessageWithPrefix(DerivedPlayer receiver, String message, boolean config);

    void sendMessageWithPrefix(DerivedPlayer receiver, String message, String... placeholders);

    void sendMessageWithPrefix(DerivedPlayer receiver, String message);

    void sendMessageWithPrefix(DerivedPlayer receiver, String prefix, String message, boolean config, String... placeholders);

    void sendMessageWithPrefix(DerivedPlayer receiver, String prefix, String message, boolean config);

    void sendMessageWithPrefix(DerivedPlayer receiver, String prefix, String message, String... placeholders);

    void sendMessageWithPrefix(DerivedPlayer receiver, String prefix, String message);
}