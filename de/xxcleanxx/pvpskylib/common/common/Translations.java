<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.common;

import de.xxcleanxx.pvpskylib.common.enums.Language;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnegative;
import java.util.Arrays;
import java.util.List;

public class Translations {
    private static final List<String> _gameModesEnglish = Arrays.asList("Survival", "Creative", "Adventure", "Spectator");
    private static final List<String> _gameModesGerman = Arrays.asList("Überleben", "Kreativ", "Abenteuer", "Zuschauer");
    private static final List<String> _gameModesFrench = Arrays.asList("Survie", "Créatif", "Aventure", "Spectateur");

    private Translations() { }

    @NotNull
    public static List<String> getGameModes(@NotNull Language language) {
        switch (language) {
            case GERMAN:
                return _gameModesGerman;
            case ENGLISH:
                return _gameModesEnglish;
            case CONSOLE:
                throw new IllegalArgumentException("Console is not a language!");
            default:
                throw new IllegalArgumentException("Language cannot be null!");
        }
    }

    @NotNull
    public static String getGameMode(@Nonnegative int gameMode, @NotNull Language language) {
        if (gameMode > 3) throw new IndexOutOfBoundsException("Game mode is greater than 3!");

        return getGameModes(language).get(gameMode);
    }
=======
package de.xxcleanxx.pvpskylib.common.common;

import de.xxcleanxx.pvpskylib.common.enums.Language;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnegative;
import java.util.Arrays;
import java.util.List;

public class Translations {
    private static final List<String> _gameModesEnglish = Arrays.asList("Survival", "Creative", "Adventure", "Spectator");
    private static final List<String> _gameModesGerman = Arrays.asList("Überleben", "Kreativ", "Abenteuer", "Zuschauer");
    private static final List<String> _gameModesFrench = Arrays.asList("Survie", "Créatif", "Aventure", "Spectateur");

    private Translations() { }

    @NotNull
    public static List<String> getGameModes(@NotNull Language language) {
        switch (language) {
            case GERMAN:
                return _gameModesGerman;
            case ENGLISH:
                return _gameModesEnglish;
            case CONSOLE:
                throw new IllegalArgumentException("Console is not a language!");
            default:
                throw new IllegalArgumentException("Language cannot be null!");
        }
    }

    @NotNull
    public static String getGameMode(@Nonnegative int gameMode, @NotNull Language language) {
        if (gameMode > 3) throw new IndexOutOfBoundsException("Game mode is greater than 3!");

        return getGameModes(language).get(gameMode);
    }
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}