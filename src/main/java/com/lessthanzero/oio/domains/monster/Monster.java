package com.lessthanzero.oio.domains.monster;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Monster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Required
    private String name;
    @Required
    private Integer health;
    @Required
    private Integer attack;
    @Required
    private Integer defense;
    @Required
    private String imgSrc;

    public Monster(Long id, String name, Integer health, Integer attack, Integer defense, String imgSrc) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.imgSrc = imgSrc;
    }

    public Monster() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monster)) return false;
        Monster monster = (Monster) o;
        return Objects.equals(getId(), monster.getId()) && Objects.equals(getName(), monster.getName()) && Objects.equals(getHealth(), monster.getHealth()) && Objects.equals(getAttack(), monster.getAttack()) && Objects.equals(getDefense(), monster.getDefense()) && Objects.equals(getImgSrc(), monster.getImgSrc());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getHealth(), getAttack(), getDefense(), getImgSrc());
    }

    @Override
    public String toString() {
        return "Monster{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", defense=" + defense +
                ", imgSrc='" + imgSrc + '\'' +
                '}';
    }
}