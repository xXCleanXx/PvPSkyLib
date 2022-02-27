package de.xxcleanxx.pvpskylib.common.clan.interfaces;

import de.xxcleanxx.pvpskylib.common.clan.enums.ClanRank;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.INameable;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IPrefix;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IIdentifiable;

import java.util.List;

public interface IClan<DerivedPlayer> extends IIdentifiable, INameable, IPrefix {
    List<DerivedPlayer> getMembers();

    DerivedPlayer getLeader();

    void setLeader(DerivedPlayer player);

    void addMember(DerivedPlayer player, ClanRank clanRank);

    void addMember(DerivedPlayer player);

    void removeMember(DerivedPlayer player);

    void promote(DerivedPlayer member);

    void demote(DerivedPlayer member);

    boolean isMember(DerivedPlayer player);

    void broadcast(DerivedPlayer sender, String message, DerivedPlayer... exclude);

    void broadcast(DerivedPlayer sender, String message);

    void broadcast(String message, DerivedPlayer... exclude);

    void broadcast(String message);
}