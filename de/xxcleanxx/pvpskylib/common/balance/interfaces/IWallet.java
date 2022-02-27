package de.xxcleanxx.pvpskylib.common.balance.interfaces;

import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnegative;

public interface IWallet {
    @Nonnegative
    long balance();

    void add(@Nonnegative long amount);

    void remove(@Nonnegative long amount);

    void reset();

    void pay(@NotNull IWallet wallet, @Nonnegative long amount);
}