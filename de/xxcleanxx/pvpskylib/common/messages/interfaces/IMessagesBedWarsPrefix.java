<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.messages.interfaces;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface IMessagesBedWarsPrefix<DerivedSender> {
    void sendMessageWithBedWarsPrefix(@NotNull DerivedSender sender, @NotNull String message, boolean config, @Nullable String... placeholders);

    void sendMessageWithBedWarsPrefix(@NotNull DerivedSender sender, @NotNull String message, boolean config);

    void sendMessageWithBedWarsPrefix(@NotNull DerivedSender sender, @NotNull String message, @Nullable String... placeholders);

    void sendMessageWithBedWarsPrefix(@NotNull DerivedSender sender, @NotNull String message);
=======
package de.xxcleanxx.pvpskylib.common.messages.interfaces;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface IMessagesBedWarsPrefix<DerivedSender> {
    void sendMessageWithBedWarsPrefix(@NotNull DerivedSender sender, @NotNull String message, boolean config, @Nullable String... placeholders);

    void sendMessageWithBedWarsPrefix(@NotNull DerivedSender sender, @NotNull String message, boolean config);

    void sendMessageWithBedWarsPrefix(@NotNull DerivedSender sender, @NotNull String message, @Nullable String... placeholders);

    void sendMessageWithBedWarsPrefix(@NotNull DerivedSender sender, @NotNull String message);
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}