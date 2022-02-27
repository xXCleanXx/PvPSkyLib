package de.xxcleanxx.pvpskylib.common.balance.interfaces;

import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnegative;

public interface IBankAccount {
    long balance();

    void deposit(@Nonnegative long amount);

    void withdraw(@Nonnegative long amount);

    void transfer(@NotNull IBankAccount bankAccount,@Nonnegative long amount);
}