<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.balance.interfaces;

import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnegative;

public interface IBankAccount {
    long balance();

    void deposit(@Nonnegative long amount);

    void withdraw(@Nonnegative long amount);

    void transfer(@NotNull IBankAccount bankAccount,@Nonnegative long amount);
=======
package de.xxcleanxx.pvpskylib.common.balance.interfaces;

import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnegative;

public interface IBankAccount {
    long balance();

    void deposit(@Nonnegative long amount);

    void withdraw(@Nonnegative long amount);

    void transfer(@NotNull IBankAccount bankAccount,@Nonnegative long amount);
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}