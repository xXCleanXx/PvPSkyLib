package de.xxcleanxx.pvpskylib.spigot.game;

import de.xxcleanxx.pvpskylib.common.enums.Language;
import de.xxcleanxx.pvpskylib.common.game.interfaces.IOfflineGamer;
import de.xxcleanxx.pvpskylib.spigot.game.interfaces.IGamer;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class GamerManager {
    private static List<ISpigotGamer> _gamers;
    private static List<ISpigotOfflineGamer> _offlineGamers;

    private GamerManager() { }

    @NotNull
    public static List<ISpigotGamer> getGamers() {
        if (_gamers == null) _gamers = new ArrayList<>();

        return _gamers;
    }

    @NotNull
    public static List<ISpigotOfflineGamer> getOfflineGamers() {
        if (_offlineGamers == null) _offlineGamers = new ArrayList<>();

        return _offlineGamers;
    }

    @NotNull
    public static List<ISpigotGamer> getVanishedGamers() {
        List<ISpigotGamer> gamers = new ArrayList<>();

        for (ISpigotGamer item : getGamers()) {
            if (item.getPlayer().isInvisible()) {
                gamers.add(item);
            }
        }

        return gamers;
    }

    @NotNull
    public static List<IOfflineGamer> getStaffs() {
        List<IOfflineGamer> gamers = new ArrayList<>();

        for (IOfflineGamer item : getGamers()) {
            if (item.isStaff()) {
                gamers.add(item);
            }
        }

        return gamers;
    }

    @Nullable
    public static IGamer getGamer(@NotNull String name) {
        if (name.trim().isEmpty()) throw new IllegalArgumentException("Name is empty or consists of white-spaces!");

        for (IGamer<Player> item : getGamers()) {
            if (item.getPlayer().getName().equalsIgnoreCase(name.trim())) {
                return item;
            }
        }

        return null;
    }

    @Nullable
    public static ISpigotGamer getGamer(@NotNull Player player) {
        return getGamer(player.getName());
    }

    @Nullable
    public static ISpigotGamer getGamer(@NotNull CommandSender sender) {
        if (!(sender instanceof Player))
            throw new IllegalArgumentException("Command sender is not an instance of player!");

        return getGamer(sender.getName());
    }

    @Nullable
    public static IOfflineGamer<OfflinePlayer> getOfflineGamer(@NotNull String name) {
        if (name.trim().isEmpty()) throw new IllegalArgumentException("Name is empty or consists of white-spaces");

        for (ISpigotOfflineGamer item : getOfflineGamers()) {
            if (item.getName().equalsIgnoreCase(name.trim()))
                return item;
        }

        return null;
    }

    @Nullable
    public static IOfflineGamer<OfflinePlayer> getOfflineGamer(@NotNull OfflinePlayer offlinePlayer) {
        return getOfflineGamer(offlinePlayer.getName());
    }

    public static void addGamer(@NotNull ISpigotGamer gamer) {
        if (existsGamer(gamer)) return;

        getGamers().add(gamer);
    }

    public static void removeGamer(@NotNull ISpigotGamer gamer) {
        if (!existsGamer(gamer)) return;

        getGamers().remove(gamer);
    }

    @NotNull
    public static Language getLanguage(@NotNull Player player) {
        ISpigotGamer gamer = getGamer(player);

        return gamer != null ? gamer.getLanguage() : Language.ENGLISH;
    }

    @NotNull
    public static Language getLanguage(@NotNull CommandSender sender) {
        return (sender instanceof Player) ? getLanguage((Player) sender) : Language.ENGLISH;
    }

    public static boolean existsGamer(@NotNull IGamer gamer) {
        for (ISpigotGamer item : getGamers()) {
            if (item.getPlayer() == gamer.getPlayer()) {
                return true;
            }
        }

        return false;
    }
}