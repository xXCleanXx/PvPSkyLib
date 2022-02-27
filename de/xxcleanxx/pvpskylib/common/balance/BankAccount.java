package de.xxcleanxx.pvpskylib.common.balance;

import de.xxcleanxx.pvpskylib.common.balance.interfaces.IBankAccount;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnegative;

public class BankAccount implements IBankAccount {
    private long _balance;

    public BankAccount(@Nonnegative long balance) {
        this._balance = balance;
    }

    public BankAccount() { }

    public long balance() {
        return this._balance;
    }

    public void deposit(@Nonnegative long amount) {
        this._balance += amount;
    }

    public void withdraw(@Nonnegative long amount) {
        if (amount > this._balance) throw new IndexOutOfBoundsException("Amount cannot be greater than balance!");

        this._balance -= amount;
    }

    public void transfer(@NotNull IBankAccount bankAccount, @Nonnegative long amount) {
        if (amount > this._balance) throw new IndexOutOfBoundsException("Amount cannot be greater than balance!");

        this.withdraw(amount);
        bankAccount.deposit(amount);
    }
}