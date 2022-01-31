package com.lessthanzero.oio.domains.inventory;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lessthanzero.oio.domains.item.Item;
import com.lessthanzero.oio.domains.player.Player;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Inventory {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "VARCHAR(255)")
    private UUID id;

    @ManyToOne
    private Player player;

    @ManyToOne
    private Item item;

    private int quantity;

    public Inventory() {
    }

    public Inventory(UUID id, Player player, Item item, int quantity) {
        this.id = id;
        this.player = player;
        this.item = item;
        this.quantity = quantity;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Inventory)) return false;
        Inventory inventory = (Inventory) o;
        return getQuantity() == inventory.getQuantity() && Objects.equals(getId(), inventory.getId()) && Objects.equals(getPlayer(), inventory.getPlayer()) && Objects.equals(getItem(), inventory.getItem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPlayer(), getItem(), getQuantity());
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", player=" + player +
                ", item=" + item +
                ", quantity=" + quantity +
                '}';
    }
}