package de.xxcleanxx.pvpskylib.spigot.common;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class ItemBuilder {
    private Material _material;
    private ItemMeta _itemMeta;
    private String _name;
    private int _amount;
    private short _subId;

    @Deprecated
    public ItemBuilder(@NotNull Material material, int amount, short subId, String name, ItemMeta itemMeta) {
        this.setMaterial(material);
        this.setAmount(amount);
        this.setSubId(subId);
        this.setName(name);
        this.setItemMeta(itemMeta);
    }

    @Deprecated
    public ItemBuilder(@NotNull Material material, int amount, short subId, String name) {
        this(material, amount, subId, name, null);
    }

    @Deprecated
    public ItemBuilder(@NotNull Material material, int amount, short subId, ItemMeta itemMeta) {
        this(material, amount, subId, null, itemMeta);
    }

    @Deprecated
    public ItemBuilder(@NotNull Material material, int amount, short subId) {
        this(material, amount, subId, null, null);
    }

    public ItemBuilder(@NotNull Material material, int amount, String name, ItemMeta itemMeta) {
        this(material, amount, (short)0, name, itemMeta);
    }

    public ItemBuilder(@NotNull Material material, int amount, String name) {
        this(material, amount, name, null);
    }

    public ItemBuilder(@NotNull Material material, int amount, ItemMeta itemMeta) {
        this(material, amount, null, itemMeta);
    }

    public ItemBuilder(@NotNull Material material, int amount) {
        this(material, amount, null, null);
    }

    public ItemBuilder(@NotNull Material material, short subId, String name, ItemMeta itemMeta) {
        this(material, 0, subId, name, itemMeta);
    }

    public ItemBuilder(@NotNull Material material, short subId, String name) {
        this(material, subId, name, null);
    }

    public ItemBuilder(@NotNull Material material, short subId, ItemMeta itemMeta) {
        this(material, subId, null, itemMeta);
    }

    public ItemBuilder(@NotNull Material material, short subId) {
        this(material, subId, null, null);
    }

    public ItemBuilder(@NotNull Material material, String name, ItemMeta itemMeta) {
        this(material, 0, name, itemMeta);
    }

    public ItemBuilder(@NotNull Material material, String name) {
        this(material, name, null);
    }

    public ItemBuilder(@NotNull Material material, ItemMeta itemMeta) {
        this(material, null, itemMeta);
    }

    public ItemBuilder( @NotNull Material material) {
        this(material, null, null);
    }

    public @NotNull Material getMaterial() {
        return this._material;
    }

    public @NotNull ItemBuilder setMaterial(Material material) {
        if (material == null) throw new IllegalArgumentException("Material cannot be null!");

        this._material = material;

        return this;
    }

    public ItemMeta getItemMeta() {
        return this._itemMeta;
    }

    public @NotNull ItemBuilder setItemMeta(ItemMeta itemMeta) {
        this._itemMeta = itemMeta;

        return this;
    }

    public String getName() {
        return this._name;
    }

    public @NotNull ItemBuilder setName(String name) {
        this._name = name;

        return this;
    }

    public int getAmount() {
        return this._amount;
    }

    /**
     * Sets the amount of this item;
     * @param amount
     * @return itself.
     */
    public @NotNull ItemBuilder setAmount(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be less than 0!");

        this._amount = amount;

        return this;
    }

    /**
     * Returns the sub id of this item.
     * @return set sub id of this item.
     */
    public short getSubId() {
        return this._subId;
    }

    /**
     * Sets the sub id of this item.
     * @param subId
     * @return itself.
     */
    @Deprecated
    public ItemBuilder setSubId(short subId) {
        this._subId = subId;

        return this;
    }

    /**
     * Assembles the item by the specified values.
     * @return assembled item.
     */
    public ItemStack build() {
        ItemStack itemStack = new ItemStack(this.getMaterial(), this.getAmount(), this.getSubId());
        ItemMeta itemMeta = this.getItemMeta() != null ? this.getItemMeta() : itemStack.getItemMeta();

        if (this.getName() != null) {
            itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.getName()));
        }

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
}