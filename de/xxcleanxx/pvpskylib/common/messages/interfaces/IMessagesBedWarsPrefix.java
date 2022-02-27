package de.xxcleanxx.pvpskylib.common.messages.interfaces;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface IMessagesBedWarsPrefix<DerivedSender> {
    void sendMessageWithBedWarsPrefix(@NotNull DerivedSender sender, @NotNull String message, boolean config, @Nullable String... placeholders);

    void sendMessageWithBedWarsPrefix(@NotNull DerivedSender sender, @NotNull String message, boolean config);

    void sendMessageWithBedWarsPrefix(@NotNull DerivedSender sender, @NotNull String message, @Nullable String... placeholders);

    void sendMessageWithBedWarsPrefix(@NotNull DerivedSender sender, @NotNull String message);
}