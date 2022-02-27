package de.xxcleanxx.pvpskylib.common.balance;

import de.xxcleanxx.pvpskylib.common.balance.interfaces.IWallet;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnegative;

public class Wallet implements IWallet {
    private long _balance;

    public Wallet(@Nonnegative long balance) {
        this._balance = balance;
    }

    public Wallet() { }

    @Nonnegative
    public long balance() {
        return this._balance;
    }

    public void add(@Nonnegative long amount) {
        this._balance += amount;
    }

    public void remove(@Nonnegative long amount) {
        if (amount > this.balance()) throw new IndexOutOfBoundsException("Amount cannot be greater than balance!");

        this._balance -= amount;
    }

    public void reset() {
        this._balance = 0;
    }

    public void pay(@NotNull IWallet wallet, @Nonnegative long amount) {
        if (amount > this.balance()) throw new IndexOutOfBoundsException("Amount cannot be greater than balance!");

        this.remove(amount);
        wallet.add(amount);
    }
}