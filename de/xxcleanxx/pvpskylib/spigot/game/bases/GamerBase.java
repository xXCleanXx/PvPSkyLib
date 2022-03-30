package de.xxcleanxx.pvpskylib.spigot.game.bases;

import de.xxcleanxx.pvpskylib.common.enums.Language;
import de.xxcleanxx.pvpskylib.spigot.game.interfaces.IGamer;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnegative;
import java.util.Objects;
import java.util.UUID;

@SuppressWarnings("unused")
public abstract class GamerBase extends OfflineGamerBase implements IGamer<Player> {
    protected Player _player;
    protected boolean _sendAsCommand;

    public GamerBase(@NotNull Player player, @Nullable String prefix, @Nullable String suffix, @Nonnegative long balance, @Nonnegative long bankBalance, boolean staff, @NotNull Language language) {
        super(player.getUniqueId());
        this.setPlayer(player);
        super.setPrefix(prefix);
        super.setSuffix(suffix);
        super.getWallet().add(balance);
        super.getBankAccount().deposit(bankBalance);
        super.setStaff(staff);
        super.setLanguage(language);
    }

    public GamerBase(@NotNull Player player, @NotNull Language language) {
        this(player, null, null, 0, 0, false, language);
    }

    public GamerBase(@NotNull Player player) {
        this(player, Language.ENGLISH);
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