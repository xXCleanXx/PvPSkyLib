package de.xxcleanxx.pvpskylib.common.clan.interfaces;

import de.xxcleanxx.pvpskylib.common.clan.enums.ClanRank;
import de.xxcleanxx.pvpskylib.common.game.interfaces.IOfflineGamer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("unused")
public interface IClan {
    int getId();

    void setId(int id);

    String getPrefix();

    void setPrefix(@Nullable String prefix);

    @Nullable String getName();

    @NotNull List<IOfflineGamer> getMembers();

    @NotNull IOfflineGamer getLeader();

    void setLeader(@NotNull IOfflineGamer player);

    void addMember(@NotNull IOfflineGamer player, @NotNull ClanRank clanRank);

    void addMember(@NotNull IOfflineGamer player);

    void removeMember(@NotNull IOfflineGamer member);

    void promote(@NotNull IOfflineGamer member);

    void demote(@NotNull IOfflineGamer member);

    boolean isMember(@NotNull IOfflineGamer player);
}