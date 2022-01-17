package com.lessthanzero.oio.domains.loot;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lessthanzero.oio.domains.item.Item;
import com.lessthanzero.oio.domains.monster.Monster;
import com.lessthanzero.oio.domains.player.Player;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CommonLootTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnoreProperties({"atk", "def", "health", "exp", "imgSrc"})
    private Monster monster;

    @ManyToOne
    @JsonIgnoreProperties("items")
    private Item item;

    private int dropChanceLow;

    private int dropChanceHigh;

    public CommonLootTable() {
    }

    public CommonLootTable(Long id, Monster monster, Item item, int dropChanceLow, int dropChanceHigh) {
        this.id = id;
        this.monster = monster;
        this.item = item;
        this.dropChanceLow = dropChanceLow;
        this.dropChanceHigh = dropChanceHigh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getDropChanceLow() {
        return dropChanceLow;
    }

    public void setDropChanceLow(int dropChanceLow) {
        this.dropChanceLow = dropChanceLow;
    }

    public int getDropChanceHigh() {
        return dropChanceHigh;
    }

    public void setDropChanceHigh(int dropChanceHigh) {
        this.dropChanceHigh = dropChanceHigh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommonLootTable)) return false;
        CommonLootTable that = (CommonLootTable) o;
        return getDropChanceLow() == that.getDropChanceLow() && getDropChanceHigh() == that.getDropChanceHigh() && Objects.equals(getId(), that.getId()) && Objects.equals(getMonster(), that.getMonster()) && Objects.equals(getItem(), that.getItem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMonster(), getItem(), getDropChanceLow(), getDropChanceHigh());
    }

    @Override
    public String toString() {
        return "CommonLootTable{" +
                "id=" + id +
                ", monster=" + monster +
                ", item=" + item +
                ", dropChanceLow=" + dropChanceLow +
                ", dropChanceHigh=" + dropChanceHigh +
                '}';
    }
}