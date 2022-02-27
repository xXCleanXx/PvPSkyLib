package de.xxcleanxx.pvpskylib.spigot.game.bases;

import de.xxcleanxx.pvpskylib.common.balance.BankAccount;
import de.xxcleanxx.pvpskylib.common.balance.Wallet;
import de.xxcleanxx.pvpskylib.common.balance.interfaces.IBankAccount;
import de.xxcleanxx.pvpskylib.common.balance.interfaces.IWallet;
import de.xxcleanxx.pvpskylib.common.enums.Language;
import de.xxcleanxx.pvpskylib.common.game.Staff;
import de.xxcleanxx.pvpskylib.common.game.interfaces.IOfflineGamer;
import de.xxcleanxx.pvpskylib.common.game.interfaces.IStaff;
import de.xxcleanxx.pvpskylib.common.identifiable.PrefixAndSuffix;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IPrefixAndSuffix;
import de.xxcleanxx.pvpskylib.common.permission.abstractions.PermissionHolderBase;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermission;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public abstract class OfflineGamerBase extends PermissionHolderBase implements IOfflineGamer {
    protected IWallet _wallet;
    protected IBankAccount _bankAccount;
    protected IStaff _staffBase;
    protected IPrefixAndSuffix _prefixAndSuffixBase;
    protected Language _language;
    protected UUID _uuid;

    public OfflineGamerBase(int id, @NotNull UUID uuid, List<IPermission> permissions) {
        super(id, permissions);
        this.setUniqueId(uuid);
    }

    public OfflineGamerBase(int id, @NotNull UUID uuid) {
        this(id, uuid, null);
    }

    public OfflineGamerBase(@NotNull UUID uuid, List<IPermission> permissions) {
        this(-1, uuid, permissions);
    }

    public OfflineGamerBase(@NotNull UUID uuid) {
        this(uuid, null);
    }

    // Base Properties
    protected @NotNull IStaff getStaffBase() {
        if (this._staffBase == null) this._staffBase = new Staff();

        return this._staffBase;
    }

    protected @NotNull IPrefixAndSuffix getPrefixAndSuffixBase() {
        if (this._prefixAndSuffixBase == null) this._prefixAndSuffixBase = new PrefixAndSuffix();

        return this._prefixAndSuffixBase;
    }
    // # ### #

    // Properties
    public UUID getUniqueI() {
        return this._uuid;
    }

    protected void setUniqueId(UUID uuid) {
        this._uuid = uuid;
    }

    public @NotNull IWallet getWallet() {
        if (this._wallet == null) this._wallet = new Wallet();

        return this._wallet;
    }

    public @NotNull IBankAccount getBankAccount() {
        if (this._bankAccount == null) this._bankAccount = new BankAccount();

        return this._bankAccount;
    }

    public @NotNull Language getLanguage() {
        return this._language;
    }

    public void setLanguage(@NotNull Language language) {
        if (language == Language.CONSOLE)
            throw new IllegalArgumentException("Language.Console is not supported for Gamer!");

        this._language = language;
    }

    public boolean isStaff() {
        return this.getStaffBase().isStaff();
    }

    public void setStaff(boolean flag) {
        this.getStaffBase().setStaff(flag);
    }

    public @Nullable String getPrefix() {
        return this.getPrefixAndSuffixBase().getPrefix();
    }

    public void setPrefix(@Nullable String prefix) {
        this.getPrefixAndSuffixBase().setPrefix(prefix);
    }

    public @NotNull String getSuffix() {
        return this.getPrefixAndSuffixBase().getSuffix();
    }

    public void setSuffix(@Nullable String suffix) {
        this.getPrefixAndSuffixBase().setSuffix(suffix);
    }
    // # ### #
}