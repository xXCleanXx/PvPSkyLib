package de.xxcleanxx.pvpskylib.common.clan.abstractions;

import de.xxcleanxx.pvpskylib.common.clan.enums.ClanRank;
import de.xxcleanxx.pvpskylib.common.clan.interfaces.IClan;
import de.xxcleanxx.pvpskylib.common.game.interfaces.IOfflineGamer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public abstract class ClanBase implements IClan {
    protected int _id;
    protected String _name;
    protected String _prefix;
    protected List<IOfflineGamer> _members = new ArrayList<>();

    public ClanBase(int id, String name, String prefix, List<IOfflineGamer> members) {
        this.setId(id);
        this.setName(name);
        this.setPrefix(prefix);
        this.setMembers(members);
    }

    public ClanBase(int id, @NotNull String name, @Nullable String prefix) {
        this(id, name, prefix, null);
    }

    public ClanBase(int id, @NotNull String name, @Nullable List<IOfflineGamer> members) {
        this(id, name, null, members);
    }

    public ClanBase(int id, @NotNull String name) {
        this(id, name, null, null);
    }

    public ClanBase(@NotNull String name, @Nullable String prefix, @Nullable List<IOfflineGamer> members) {
        this(-1, name, prefix, members);
    }

    public ClanBase(@NotNull String name, @Nullable String prefix) {
        this(name, prefix, null);
    }

    public ClanBase(@NotNull String name, @Nullable List<IOfflineGamer> members) {
        this(name, null, members);
    }

    public ClanBase(@NotNull String name) {
        this(name, null, null);
    }

    // Properties
    public int getId() {
        return this._id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public @NotNull String getName() {
        return this._name;
    }

    public void setName(@NotNull String name) {
        this._name = name;
    }

    public @Nullable String getPrefix() {
        return this._prefix;
    }

    public void setPrefix(@Nullable String prefix) {
        this._prefix = prefix;
    }

    public @NotNull List<IOfflineGamer> getMembers() {
        if (this._members == null) this.setMembers(new ArrayList<>());
        return this._members;
    }

    protected void setMembers(@Nullable List<IOfflineGamer> members) {
        this._members = members;
    }
    // # ### #

    // Public Methods
    public void addMember(@NotNull IOfflineGamer player) {
        this.addMember(player, ClanRank.MEMBER);
    }
    // # ### #
}