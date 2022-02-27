<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.spigot.game.interfaces;

import de.xxcleanxx.pvpskylib.common.game.interfaces.IOfflineGamer;
import de.xxcleanxx.pvpskylib.common.messages.interfaces.gamer.*;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface IGamer<DerivedPlayer> extends IOfflineGamer, IGamerMessenger {
    @NotNull DerivedPlayer getPlayer();

    void enableFlying(boolean flag);

    void enableFlying();

    boolean hasItemInMainHand();

    void setHealthToMaximum();

    void setFoodLevelToMaximum();

    void setHealthAndFoodLevelToMaximum();

    @NotNull Material getItemTypeInMainHand();

    boolean isItemInMainHand(@NotNull Material material);

    @Nullable ItemStack getItemInMainHand();

    void setItemInMainHand(@NotNull ItemStack itemStack);
=======
package de.xxcleanxx.pvpskylib.spigot.game.interfaces;

import de.xxcleanxx.pvpskylib.common.game.interfaces.IOfflineGamer;
import de.xxcleanxx.pvpskylib.common.messages.interfaces.gamer.*;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface IGamer<DerivedPlayer> extends IOfflineGamer, IGamerMessenger {
    @NotNull DerivedPlayer getPlayer();

    void enableFlying(boolean flag);

    void enableFlying();

    boolean hasItemInMainHand();

    void setHealthToMaximum();

    void setFoodLevelToMaximum();

    void setHealthAndFoodLevelToMaximum();

    @NotNull Material getItemTypeInMainHand();

    boolean isItemInMainHand(@NotNull Material material);

    @Nullable ItemStack getItemInMainHand();

    void setItemInMainHand(@NotNull ItemStack itemStack);
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}