<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.clan.abstractions;

import de.xxcleanxx.pvpskylib.common.clan.enums.ClanRank;
import de.xxcleanxx.pvpskylib.common.clan.interfaces.IClan;
import de.xxcleanxx.pvpskylib.common.identifiable.Nameable;
import de.xxcleanxx.pvpskylib.common.identifiable.Prefix;
import de.xxcleanxx.pvpskylib.common.identifiable.abstractions.IdentifiableBase;
import de.xxcleanxx.pvpskylib.common.identifiable.abstractions.NameableBase;
import de.xxcleanxx.pvpskylib.common.identifiable.abstractions.PrefixBase;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public abstract class ClanBase<DerivedPlayer> extends IdentifiableBase implements IClan<DerivedPlayer> {
    protected List<DerivedPlayer> _members = new ArrayList<>();
    protected NameableBase _nameableBase = new Nameable();
    protected PrefixBase _prefixBase = new Prefix();

    public ClanBase(int id, String name, String prefix, List<DerivedPlayer> members) {
        super(id);
        this.setName(name);
        this.setPrefix(prefix);
        this.setMembers(members);
    }

    public ClanBase(int id, String name, String prefix) {
        this(id, name, prefix, null);
    }

    public ClanBase(int id, String name, List<DerivedPlayer> members) {
        this(id, name, null, members);
    }

    public ClanBase(int id, String name) {
        this(id, name, null, null);
    }

    public ClanBase(String name, String prefix, List<DerivedPlayer> members) {
        this(-1, name, prefix, members);
    }

    public ClanBase(String name, String prefix) {
        this(name, prefix, null);
    }

    public ClanBase(String name, List<DerivedPlayer> members) {
        this(name, null, members);
    }

    public ClanBase(String name) {
        this(name, null, null);
    }

    // Base Properties
    @NotNull
    protected NameableBase getNameableBase() {
        return this._nameableBase;
    }

    @NotNull
    protected PrefixBase getPrefixBase() {
        return this._prefixBase;
    }
    // # ### #

    // Properties
    public String getName() {
        return this.getNameableBase().getName();
    }

    public void setName(String name) {
        this.getNameableBase().setName(name);
    }

    public String getPrefix() {
        return this.getPrefixBase().getPrefix();
    }

    public void setPrefix(String prefix) {
        this.getPrefixBase().setPrefix(prefix);
    }

    public List<DerivedPlayer> getMembers() {
        return this._members;
    }

    protected void setMembers(List<DerivedPlayer> members) {
        this._members = members;
    }
    // # ### #

    // Public Methods
    public abstract void addMember(DerivedPlayer player, ClanRank clanRank);

    public void addMember(DerivedPlayer player) {
        this.addMember(player, ClanRank.MEMBER);
    }

    public abstract void removeMember(DerivedPlayer member);

    public abstract boolean isMember(DerivedPlayer player);
    // # ### #

    // Private Methods
    // # ### #
=======
package de.xxcleanxx.pvpskylib.common.clan.abstractions;

import de.xxcleanxx.pvpskylib.common.clan.enums.ClanRank;
import de.xxcleanxx.pvpskylib.common.clan.interfaces.IClan;
import de.xxcleanxx.pvpskylib.common.identifiable.Nameable;
import de.xxcleanxx.pvpskylib.common.identifiable.Prefix;
import de.xxcleanxx.pvpskylib.common.identifiable.abstractions.IdentifiableBase;
import de.xxcleanxx.pvpskylib.common.identifiable.abstractions.NameableBase;
import de.xxcleanxx.pvpskylib.common.identifiable.abstractions.PrefixBase;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public abstract class ClanBase<DerivedPlayer> extends IdentifiableBase implements IClan<DerivedPlayer> {
    protected List<DerivedPlayer> _members = new ArrayList<>();
    protected NameableBase _nameableBase = new Nameable();
    protected PrefixBase _prefixBase = new Prefix();

    public ClanBase(int id, String name, String prefix, List<DerivedPlayer> members) {
        super(id);
        this.setName(name);
        this.setPrefix(prefix);
        this.setMembers(members);
    }

    public ClanBase(int id, String name, String prefix) {
        this(id, name, prefix, null);
    }

    public ClanBase(int id, String name, List<DerivedPlayer> members) {
        this(id, name, null, members);
    }

    public ClanBase(int id, String name) {
        this(id, name, null, null);
    }

    public ClanBase(String name, String prefix, List<DerivedPlayer> members) {
        this(-1, name, prefix, members);
    }

    public ClanBase(String name, String prefix) {
        this(name, prefix, null);
    }

    public ClanBase(String name, List<DerivedPlayer> members) {
        this(name, null, members);
    }

    public ClanBase(String name) {
        this(name, null, null);
    }

    // Base Properties
    @NotNull
    protected NameableBase getNameableBase() {
        return this._nameableBase;
    }

    @NotNull
    protected PrefixBase getPrefixBase() {
        return this._prefixBase;
    }
    // # ### #

    // Properties
    public String getName() {
        return this.getNameableBase().getName();
    }

    public void setName(String name) {
        this.getNameableBase().setName(name);
    }

    public String getPrefix() {
        return this.getPrefixBase().getPrefix();
    }

    public void setPrefix(String prefix) {
        this.getPrefixBase().setPrefix(prefix);
    }

    public List<DerivedPlayer> getMembers() {
        return this._members;
    }

    protected void setMembers(List<DerivedPlayer> members) {
        this._members = members;
    }
    // # ### #

    // Public Methods
    public abstract void addMember(DerivedPlayer player, ClanRank clanRank);

    public void addMember(DerivedPlayer player) {
        this.addMember(player, ClanRank.MEMBER);
    }

    public abstract void removeMember(DerivedPlayer member);

    public abstract boolean isMember(DerivedPlayer player);
    // # ### #

    // Private Methods
    // # ### #
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}