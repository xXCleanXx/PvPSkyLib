package de.xxcleanxx.pvpskylib.spigot.common;

import org.bukkit.configuration.file.YamlConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;

@SuppressWarnings("unused")
public class ConfigFile {
    private String _name;
    private File _file;
    private YamlConfiguration _config;

    public ConfigFile(@NotNull String name, @Nullable File file, @Nullable YamlConfiguration config) {
        this.setName(name);
        this.setFile(file);
        this.setConfig(config);
    }

    public ConfigFile(@NotNull String name, @Nullable File file) {
        this(name, file, null);
    }

    public ConfigFile(@NotNull String name, @Nullable YamlConfiguration config) {
        this.setName(name);
        this.setConfig(config);
    }

    @NotNull
    public String getName() {
        return this._name;
    }

    public void setName(@NotNull String name) {
        if (name.trim().isEmpty()) throw new IllegalArgumentException("Name is empty or consists of white-spaces!");

        this._name = name;
    }

    @Nullable
    public File getFile() {
        return this._file;
    }

    public void setFile(@Nullable File file) {
        this._file = file;
    }

    @NotNull
    public YamlConfiguration getConfig() {
        if (this._config == null) this.setConfig(new YamlConfiguration());

        return this._config;
    }

    public void setConfig(@Nullable YamlConfiguration config) {
        this._config = config;
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public boolean loadConfig() {
        try {
            if (this.getFile() != null) {
                this.getConfig().load(this.getFile());

                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return false;
    }
}