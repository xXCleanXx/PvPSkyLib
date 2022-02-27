<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.clan;

import de.xxcleanxx.pvpskylib.common.clan.enums.ClanRank;
import org.jetbrains.annotations.NotNull;

public class ClanMember {
    private ClanRank _clanRank;

    public ClanMember(@NotNull ClanRank clanRank) {
        this.setRank(clanRank);
    }

    @NotNull
    public ClanRank getRank() {
        return this._clanRank;
    }

    public void setRank(@NotNull ClanRank clanRank) {
        this._clanRank = clanRank;
    }
=======
package de.xxcleanxx.pvpskylib.common.clan;

import de.xxcleanxx.pvpskylib.common.clan.enums.ClanRank;
import org.jetbrains.annotations.NotNull;

public class ClanMember {
    private ClanRank _clanRank;

    public ClanMember(@NotNull ClanRank clanRank) {
        this.setRank(clanRank);
    }

    @NotNull
    public ClanRank getRank() {
        return this._clanRank;
    }

    public void setRank(@NotNull ClanRank clanRank) {
        this._clanRank = clanRank;
    }
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}