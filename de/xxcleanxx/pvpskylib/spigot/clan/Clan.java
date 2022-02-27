package de.xxcleanxx.pvpskylib.spigot.clan;

import de.xxcleanxx.pvpskylib.common.identifiable.Nameable;
import de.xxcleanxx.pvpskylib.common.identifiable.PrefixAndSuffix;
import de.xxcleanxx.pvpskylib.common.identifiable.abstractions.IdentifiableBase;
import de.xxcleanxx.pvpskylib.common.identifiable.abstractions.NameableBase;
import de.xxcleanxx.pvpskylib.common.identifiable.abstractions.PrefixAndSuffixBase;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.INameable;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IPrefixAndSuffix;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class Clan<DerivedPlayer> extends IdentifiableBase implements INameable, IPrefixAndSuffix {
    private NameableBase _nameable;
    private PrefixAndSuffixBase _prefixAndSuffix;

    public Clan(int id, String name) {
        super(id);
        this.setName(name);
    }

    @NotNull
    private NameableBase getNameable() {
        if (this._nameable == null) this._nameable = new Nameable();

        return this._nameable;
    }

    private PrefixAndSuffixBase getPrefixAndSuffix() {
        if (this._prefixAndSuffix == null) this._prefixAndSuffix = new PrefixAndSuffix();

        return this._prefixAndSuffix;
    }

    @NotNull
    public String getName() {
        return this.getNameable().getName();
    }

    public void setName(@NotNull String name) {
        this.getNameable().setName(name);
    }

    @Nullable
    public String getPrefix() {
        return this.getPrefixAndSuffix().getPrefix();
    }

    public void setPrefix(@Nullable String prefix) {
        this.getPrefixAndSuffix().setPrefix(prefix);
    }

    @Nullable
    public String getSuffix() {
        return this.getPrefixAndSuffix().getSuffix();
    }

    public void setSuffix(@Nullable String suffix) {
        this.getPrefixAndSuffix().setSuffix(suffix);
    }
}