package de.xxcleanxx.pvpskylib.common.messages.interfaces;

public interface IMessagesActionbar<DerivedPlayer> {
    void sendActionbarMessage(DerivedPlayer player, String message, boolean config, String... placeholders);

    void sendActionbarMessage(DerivedPlayer player, String message, boolean config);

    void sendActionbarMessage(DerivedPlayer player, String message, String... placeholders);

    void sendActionbarMessage(DerivedPlayer player, String message);

    void sendCommandMessage(DerivedPlayer player, String message, boolean config, String... placeholders);

    void sendCommandMessage(DerivedPlayer player, String message, boolean config);

    void sendCommandMessage(DerivedPlayer player, String message, String... placeholders);

    void sendCommandMessage(DerivedPlayer player, String message);
}