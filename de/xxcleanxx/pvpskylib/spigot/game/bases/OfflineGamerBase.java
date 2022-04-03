package de.xxcleanxx.pvpskylib.spigot.game.bases;

import de.xxcleanxx.pvpskylib.common.balance.BankAccount;
import de.xxcleanxx.pvpskylib.common.balance.Wallet;
import de.xxcleanxx.pvpskylib.common.balance.interfaces.IBankAccount;
import de.xxcleanxx.pvpskylib.common.balance.interfaces.IWallet;
import de.xxcleanxx.pvpskylib.common.enums.Language;
import de.xxcleanxx.pvpskylib.common.game.Staff;
import de.xxcleanxx.pvpskylib.common.game.interfaces.IOfflineGamer;
import de.xxcleanxx.pvpskylib.common.game.interfaces.IStaff;
import de.xxcleanxx.pvpskylib.common.permissions.PvPSkyPermission;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
public abstract class OfflineGamerBase implements IOfflineGamer {
    protected IWallet _wallet;
    protected IBankAccount _bankAccount;
    protected IStaff _staffBase;
    protected String _name;
    protected String _prefix;
    protected String _suffix;
    protected Language _language;
    protected UUID _uuid;
    protected List<PvPSkyPermission> _permissions = new ArrayList<>();

    public OfflineGamerBase(@NotNull UUID uuid) {
        this.setUniqueId(uuid);
    }

    // Base Properties
    protected @NotNull IStaff getStaffBase() {
        if (this._staffBase == null) this._staffBase = new Staff();

        return this._staffBase;
    }
    // # ### #

    // Properties
    public @NotNull String getName() {
        return this._name;
    }

    public void setName(@NotNull String name) {
        this._name = name;
    }

    public @NotNull UUID getUniqueI() {
        return this._uuid;
    }

    protected void setUniqueId(@NotNull UUID uuid) {
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
        return this._prefix;
    }

    public void setPrefix(@Nullable String prefix) {
        this._prefix = prefix;
    }

    public @NotNull String getSuffix() {
        return this._suffix;
    }

    public void setSuffix(@Nullable String suffix) {
        this._suffix = suffix;
    }

    public @NotNull List<PvPSkyPermission> getPermissions() {
        return this._permissions;
    }

    public boolean addPermission(@NotNull PvPSkyPermission permission) {
        if (this.hasPermission(permission)) return false;

        return this.getPermissions().add(permission);
    }

    public boolean removePermission(@NotNull String permission) {
        if (permission.trim().isEmpty()) throw new IllegalArgumentException("Permission cannot be empty or consists of white-spaces!");

        PvPSkyPermission remove = null;

        for(PvPSkyPermission item : this.getPermissions()) {
            if (item.getName().equalsIgnoreCase(permission.trim())) {
                remove = item;

                break;
            }
        }

        return remove != null && this.getPermissions().remove(remove);
    }

    public boolean removePermission(@NotNull PvPSkyPermission permission) {
        return this.removePermission(permission.getName());
    }

    public boolean hasPermission(@NotNull String permission) {
        if (permission.trim().isEmpty()) throw new IllegalArgumentException("Permission cannot be empty or consists of white-spaces!");

        for (PvPSkyPermission item : getPermissions()) {
            if (item.getName().equalsIgnoreCase(permission.trim())) return true;
        }

        return false;
    }

    public boolean hasPermission(@NotNull PvPSkyPermission permission) {
        return this.hasPermission(permission.getName());
    }
    // # ### #
}