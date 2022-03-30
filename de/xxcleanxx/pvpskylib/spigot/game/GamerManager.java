package de.xxcleanxx.pvpskylib.spigot.game;

import de.xxcleanxx.pvpskylib.common.enums.Language;
import de.xxcleanxx.pvpskylib.common.game.interfaces.IOfflineGamer;
import de.xxcleanxx.pvpskylib.spigot.game.bases.GamerBase;
import de.xxcleanxx.pvpskylib.spigot.game.bases.OfflineGamerBase;
import de.xxcleanxx.pvpskylib.spigot.game.interfaces.IGamer;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class GamerManager {
    private static List<GamerBase> _gamers;
    private static List<OfflineGamerBase> _offlineGamers;

    private GamerManager() { }

    @NotNull
    public static List<GamerBase> getGamers() {
        if (_gamers == null) _gamers = new ArrayList<>();

        return _gamers;
    }

    @NotNull
    public static List<OfflineGamerBase> getOfflineGamers() {
        if (_offlineGamers == null) _offlineGamers = new ArrayList<>();

        return _offlineGamers;
    }

    @NotNull
    public static List<GamerBase> getVanishedGamers() {
        List<GamerBase> gamers = new ArrayList<>();

        for (GamerBase item : getGamers()) {
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
    public static IGamer<Player> getGamer(@NotNull String name) {
        if (name.trim().isEmpty()) throw new IllegalArgumentException("Name is empty or consists of white-spaces!");

        for (IGamer<Player> item : getGamers()) {
            if (item.getPlayer().getName().equalsIgnoreCase(name.trim())) {
                return item;
            }
        }

        return null;
    }

    @Nullable
    public static IGamer<Player> getGamer(@NotNull Player player) {
        return getGamer(player.getName());
    }

    @Nullable
    public static IGamer<Player> getGamer(@NotNull CommandSender sender) {
        if (!(sender instanceof Player))
            throw new IllegalArgumentException("Command sender is not an instance of player!");

        return getGamer(sender.getName());
    }

    @Nullable
    public static IOfflineGamer getOfflineGamer(@NotNull String name) {
        if (name.trim().isEmpty()) throw new IllegalArgumentException("Name is empty or consists of white-spaces");

        for (OfflineGamerBase item : getOfflineGamers()) {
            if (item.getName().equalsIgnoreCase(name.trim()))
                return item;
        }

        return null;
    }

    @Nullable
    @SuppressWarnings("mightBeNull")
    public static IOfflineGamer getOfflineGamer(@NotNull OfflinePlayer offlinePlayer) {
        if (offlinePlayer.getName() == null) throw new IllegalArgumentException();

        return getOfflineGamer(offlinePlayer.getName());
    }

    public static void addGamer(@NotNull GamerBase gamer) {
        if (existsGamer(gamer)) return;

        getGamers().add(gamer);
    }

    public static void removeGamer(@NotNull GamerBase gamer) {
        if (!existsGamer(gamer)) return;

        getGamers().remove(gamer);
    }

    @NotNull
    public static Language getLanguage(@NotNull Player player) {
        IGamer<Player> gamer = getGamer(player);

        return gamer != null ? gamer.getLanguage() : Language.ENGLISH;
    }

    @NotNull
    public static Language getLanguage(@NotNull CommandSender sender) {
        return (sender instanceof Player) ? getLanguage((Player) sender) : Language.ENGLISH;
    }

    public static boolean existsGamer(@NotNull IGamer<Player> gamer) {
        for (IGamer<Player> item : getGamers()) {
            if (item.getPlayer().getUniqueId() == gamer.getPlayer().getUniqueId()) return true;
        }

        return false;
    }
}