<<<<<<< HEAD
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
=======
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
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}