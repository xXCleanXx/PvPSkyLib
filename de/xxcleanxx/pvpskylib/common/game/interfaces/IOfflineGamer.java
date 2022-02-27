<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.game.interfaces;

import de.xxcleanxx.pvpskylib.common.balance.interfaces.IBankAccount;
import de.xxcleanxx.pvpskylib.common.balance.interfaces.IWallet;
import de.xxcleanxx.pvpskylib.common.enums.Language;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IIdentifiable;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.INameable;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IPrefixAndSuffix;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermissionHolder;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface IOfflineGamer extends IIdentifiable, IPrefixAndSuffix, INameable, IStaff, IPermissionHolder {
    @NotNull UUID getUniqueId();

    @NotNull String getDisplayName();

    @NotNull IBankAccount getBankAccount();

    @NotNull IWallet getWallet();

    @NotNull Language getLanguage();

    void setLanguage(@NotNull Language language);
=======
package de.xxcleanxx.pvpskylib.common.game.interfaces;

import de.xxcleanxx.pvpskylib.common.balance.interfaces.IBankAccount;
import de.xxcleanxx.pvpskylib.common.balance.interfaces.IWallet;
import de.xxcleanxx.pvpskylib.common.enums.Language;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IIdentifiable;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.INameable;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IPrefixAndSuffix;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermissionHolder;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface IOfflineGamer extends IIdentifiable, IPrefixAndSuffix, INameable, IStaff, IPermissionHolder {
    @NotNull UUID getUniqueId();

    @NotNull String getDisplayName();

    @NotNull IBankAccount getBankAccount();

    @NotNull IWallet getWallet();

    @NotNull Language getLanguage();

    void setLanguage(@NotNull Language language);
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}