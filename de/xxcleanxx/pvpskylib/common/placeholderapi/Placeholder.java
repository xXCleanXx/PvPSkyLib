package de.xxcleanxx.pvpskylib.common.placeholderapi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Placeholder {
    private Placeholder() { }

    public static char PLACEHOLDERCHAR = '%';

    public static String replace(@NotNull String text, @Nullable String placeholder, @Nullable String replacement) {
        if (placeholder == null || replacement == null || placeholder.equals("")) return text;

        return text.replaceAll(placeholder.startsWith(String.valueOf(PLACEHOLDERCHAR)) && placeholder.endsWith(String.valueOf(PLACEHOLDERCHAR)) ? placeholder : PLACEHOLDERCHAR + placeholder + PLACEHOLDERCHAR, replacement);
    }

    public static String replace(@NotNull String text, String... placeholders) {
        if (placeholders == null || placeholders.length == 0) return text;

        String placeholder = "";

        for (int i = 0; i < placeholders.length; i++) {
            if (i % 2 == 0) {
                placeholder = placeholders[i];

                continue;
            }

            text = replace(text, placeholder, placeholders[i]);
        }

        return text;
    }

    public static String[] replace(String[] texts, String... placeholders) {
        if (texts == null) throw new IllegalArgumentException("Texts cannot be null!");
        if (placeholders == null || placeholders.length == 0) return texts;

        for (int i = 0; i < texts.length; i++) {
            texts[i] = replace(texts[i], placeholders);
        }

        return texts;
    }
}