<<<<<<< HEAD
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
=======
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
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}