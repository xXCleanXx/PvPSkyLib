package de.xxcleanxx.pvpskylib.common.game.interfaces;

import de.xxcleanxx.pvpskylib.common.balance.interfaces.IBankAccount;
import de.xxcleanxx.pvpskylib.common.balance.interfaces.IWallet;
import de.xxcleanxx.pvpskylib.common.enums.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface IOfflineGamer extends IStaff {
    @Nullable String getPrefix();

    void setPrefix(@Nullable String prefix);

    @Nullable String getSuffix();

    void setSuffix(@Nullable String suffix);

    @NotNull UUID getUniqueId();

    @NotNull String getDisplayName();

    @NotNull IBankAccount getBankAccount();

    @NotNull IWallet getWallet();

    @NotNull Language getLanguage();

    void setLanguage(@NotNull Language language);
}