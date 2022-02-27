package de.xxcleanxx.pvpskylib.spigot.game.bases;

import de.xxcleanxx.pvpskylib.common.balance.BankAccount;
import de.xxcleanxx.pvpskylib.common.balance.Wallet;
import de.xxcleanxx.pvpskylib.common.balance.interfaces.IBankAccount;
import de.xxcleanxx.pvpskylib.common.balance.interfaces.IWallet;
import de.xxcleanxx.pvpskylib.common.enums.Language;
import de.xxcleanxx.pvpskylib.common.game.Staff;
import de.xxcleanxx.pvpskylib.spigot.game.interfaces.IGamer;
import de.xxcleanxx.pvpskylib.common.game.interfaces.IStaff;
import de.xxcleanxx.pvpskylib.common.identifiable.Identifiable;
import de.xxcleanxx.pvpskylib.common.identifiable.PrefixAndSuffix;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IPrefixAndSuffix;
import de.xxcleanxx.pvpskylib.common.permission.PermissionHolder;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermission;
import de.xxcleanxx.pvpskylib.common.permission.interfaces.IPermissionHolder;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Attr;

import javax.annotation.Nonnegative;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public abstract class GamerBase extends OfflineGamerBase implements IGamer<Player> {
    protected Player _player;
    protected boolean _sendAsCommand;

    public GamerBase(int id, @NotNull Player player, @Nullable String prefix, @Nullable String suffix, @Nonnegative long balance, @Nonnegative long bankBalance, boolean staff, @NotNull Language language, @Nullable List<IPermission> permissions) {
        super(player.getUniqueId(), permissions);
        this.setPlayer(player);
        super.setPrefix(prefix);
        super.setSuffix(suffix);
        super.getWallet().add(balance);
        super.getBankAccount().deposit(bankBalance);
        super.setStaff(staff);
        super.setLanguage(language);
    }

    public GamerBase(int id, @NotNull Player player, @NotNull Language language, @Nullable List<IPermission> permissions) {
        this(id, player, null, null, 0, 0, false, language, permissions);
    }

    public GamerBase(int id, @NotNull Player player) {
        this(id, player, Language.ENGLISH, null);
    }

    public GamerBase(@NotNull Player player, @Nullable String prefix, @Nullable String suffix, @Nonnegative long balance, @Nonnegative long bankBalance, boolean staff, @NotNull Language language, @Nullable List<IPermission> permissions) {
        this(-1, player, prefix, suffix, balance, bankBalance, staff, language, permissions);
    }

    public GamerBase(@NotNull Player player, @NotNull Language language, @Nullable List<IPermission> permissions) {
        this(player, null, null, 0, 0, false, language, permissions);
    }

    public GamerBase(@NotNull Player player) {
        this(player, Language.ENGLISH, null);
    }

    // Properties
    @Override
    public @NotNull UUID getUniqueId() {
        return this.getPlayer().getUniqueId();
    }

    public @NotNull Player getPlayer() {
        return this._player;
    }

    protected void setPlayer(@NotNull Player player) {
        this._player = player;
    }

    public boolean getSendAsCommand() {
        return this._sendAsCommand;
    }

    public void setSendAsCommand(boolean flag) {
        this._sendAsCommand = flag;
    }
    // # ### #

    // Public Methods
    public void setItemInMainHand(@NotNull ItemStack itemStack) {
        this.getPlayer().getInventory().setItemInMainHand(itemStack);
    }

    public void enableFlying(boolean flag) {
        this.getPlayer().setAllowFlight(flag);
        this.getPlayer().setFlying(flag);
    }

    public boolean hasItemInMainHand() {
        return this.getItemTypeInMainHand() != Material.AIR;
    }

    public void setHealthToMaximum() {
        this.getPlayer().setHealth(Objects.requireNonNull(this.getPlayer().getAttribute(Attribute.GENERIC_MAX_HEALTH)).getValue());
    }

    public void setFoodLevelToMaximum() {
        this.getPlayer().setFoodLevel(20);
    }

    public void setHealthAndFoodLevelToMaximum() {
        this.setHealthToMaximum();
        this.setFoodLevelToMaximum();
    }
    // # ### #
}