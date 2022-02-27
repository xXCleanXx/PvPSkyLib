<<<<<<< HEAD
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
=======
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
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}