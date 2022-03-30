package de.xxcleanxx.pvpskylib.spigot.common;

import de.xxcleanxx.pvpskylib.common.enums.Language;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Config {
    private static List<ConfigFile> _configFiles;

    private Config() { }

    @NotNull
    public static List<ConfigFile> getConfigFiles() {
        if (_configFiles == null) _configFiles = new ArrayList<>();

        return _configFiles;
    }

    @Nullable
    public static FileConfiguration getConfig(@NotNull Language language) {
        String fileName;

        switch (language) {
            case GERMAN:
                fileName = "german.yml";

                break;
            case ENGLISH:
                fileName = "english.yml";

                break;
            case CONSOLE:
                fileName = "config.yml";

                break;
            default:
                throw new IllegalArgumentException("Language cannot be null!");
        }

        ConfigFile configFile = getConfig(fileName);

        return configFile != null ? configFile.getConfig() : null;
    }

    public static ConfigFile createConfig(@NotNull Plugin plugin, @NotNull String fileName) {
        if (fileName.trim().isEmpty())
            throw new IllegalArgumentException("File name is empty or consists of white-spaces!");

        File file = new File(plugin.getDataFolder(), fileName);
        ConfigFile configFile = new ConfigFile(fileName, file);

        if (!file.exists() && file.getParentFile().mkdir()) {
            plugin.saveResource(fileName, false);
        }

        if (!configFile.loadConfig()) {
            throw new RuntimeException("Config could not be loaded!");
        }

        return configFile;
    }

    public static void reloadConfig(@NotNull ConfigFile configFile) {
        if (configFile.getFile() == null) throw new IllegalArgumentException("File cannot be null!");

        if (!configFile.loadConfig()) {
            throw new RuntimeException("Config could not be loaded!");
        }
    }

    @Nullable
    public static ConfigFile getConfig(@NotNull String fileName) {
        if (fileName.trim().isEmpty())
            throw new IllegalArgumentException("File name is empty or consists of white-spaces!");

        for (ConfigFile item : getConfigFiles()) {
            if (item.getName().equalsIgnoreCase(fileName.trim())) {
                return item;
            }
        }

        return null;
    }

    public static void addConfig(@NotNull ConfigFile configFile) {
        if (configFile.getName().trim().isEmpty())
            throw new IllegalArgumentException("File name is empty or consists of white-spaces!");
        if (existsConfig(configFile)) return;

        getConfigFiles().add(configFile);
    }

    public static void removeConfig(@NotNull String fileName) {
        if (fileName.trim().isEmpty())
            throw new IllegalArgumentException("File name is empty or consists of white-spaces!");

        ConfigFile file = null;

        for (ConfigFile item : getConfigFiles()) {
            if (item.getName().equalsIgnoreCase(fileName.trim())) {
                file = item;

                break;
            }
        }

        if (file != null) getConfigFiles().remove(file);
    }

    public static void removeConfig(@NotNull ConfigFile configFile) {
        removeConfig(configFile.getName());
    }

    @Nullable
    public static String getString(@NotNull String path, @NotNull Language language) {
        if (path.trim().isEmpty()) throw new IllegalArgumentException("Path is empty or consists of white-spaces!");

        try {
            FileConfiguration config = getConfig(language);

            if (config != null)
                return config.getString(path);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return "";
    }

    @Nullable
    public static String getString(@NotNull String path) {
        return getString(path, Language.CONSOLE);
    }

    public static List<String> getStringList(@NotNull String path, @NotNull Language language) {
        if (path.trim().isEmpty()) throw new IllegalArgumentException("Path is empty or consists of white-spaces!");

        FileConfiguration config = getConfig(language);

        if (config == null)
            throw new NullPointerException("Config cannot be null for language: " + language.name() + "!");

        return config.getStringList(path);
    }

    @Nullable
    public static List<?> getList(@NotNull String path, @NotNull Language language) {
        if (path.trim().isEmpty()) throw new IllegalArgumentException("Path is empty or consists of white-spaces!");

        FileConfiguration config = getConfig(language);

        if (config == null)
            throw new NullPointerException("Config cannot be null for language: " + language.name() + "!");

        return config.getList(path);
    }

    public static int getInt(@NotNull String path, @NotNull Language language) {
        if (path.trim().isEmpty()) throw new IllegalArgumentException("Path is empty or consists of white-spaces!");

        FileConfiguration config = getConfig(language);

        if (config == null)
            throw new NullPointerException("Config cannot be null for language: " + language.name() + "!");

        return config.getInt(path);
    }

    public static int getInt(@NotNull String path) {
        return getInt(path, Language.CONSOLE);
    }

    public static boolean getBoolean(@NotNull String path, @NotNull Language language) {
        if (path.trim().isEmpty()) throw new IllegalArgumentException("Path is empty or consists of white-spaces!");

        FileConfiguration config = getConfig(language);

        if (config == null)
            throw new NullPointerException("Config cannot be null for language: " + language.name() + "!");

        return config.getBoolean(path);
    }

    public static boolean getBoolean(@NotNull String path) {
        return getBoolean(path, Language.CONSOLE);
    }

    // Private Methods
    private static boolean existsConfig(@NotNull String fileName) {
        for (ConfigFile item : getConfigFiles()) {
            if (item.getName().equalsIgnoreCase(fileName.trim())) {
                return true;
            }
        }

        return false;
    }

    private static boolean existsConfig(@NotNull ConfigFile configFile) {
        return existsConfig(configFile.getName());
    }
    // # ### #
}