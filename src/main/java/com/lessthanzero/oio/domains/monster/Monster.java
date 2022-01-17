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
    private Integer atk;
    @Required
    private Integer def;
    @Required
    private Integer exp;
    @Required
    private Integer commonLootTableRolls;
    @Required
    private Integer uncommonLootTableRolls;
    @Required
    private Integer rareLootTableRolls;
    @Required
    private Integer epicLootTableRolls;
    @Required
    private Integer legendaryLootTableRolls;
    @Required
    private String imgSrc;

    public Monster() {
    }

    public Monster(Long id, String name, Integer health, Integer atk, Integer def, Integer exp, Integer commonLootTableRolls, Integer uncommonLootTableRolls, Integer rareLootTableRolls, Integer epicLootTableRolls, Integer legendaryLootTableRolls, String imgSrc) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.atk = atk;
        this.def = def;
        this.exp = exp;
        this.commonLootTableRolls = commonLootTableRolls;
        this.uncommonLootTableRolls = uncommonLootTableRolls;
        this.rareLootTableRolls = rareLootTableRolls;
        this.epicLootTableRolls = epicLootTableRolls;
        this.legendaryLootTableRolls = legendaryLootTableRolls;
        this.imgSrc = imgSrc;
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

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getCommonLootTableRolls() {
        return commonLootTableRolls;
    }

    public void setCommonLootTableRolls(Integer commonLootTableRolls) {
        this.commonLootTableRolls = commonLootTableRolls;
    }

    public Integer getUncommonLootTableRolls() {
        return uncommonLootTableRolls;
    }

    public void setUncommonLootTableRolls(Integer uncommonLootTableRolls) {
        this.uncommonLootTableRolls = uncommonLootTableRolls;
    }

    public Integer getRareLootTableRolls() {
        return rareLootTableRolls;
    }

    public void setRareLootTableRolls(Integer rareLootTableRolls) {
        this.rareLootTableRolls = rareLootTableRolls;
    }

    public Integer getEpicLootTableRolls() {
        return epicLootTableRolls;
    }

    public void setEpicLootTableRolls(Integer epicLootTableRolls) {
        this.epicLootTableRolls = epicLootTableRolls;
    }

    public Integer getLegendaryLootTableRolls() {
        return legendaryLootTableRolls;
    }

    public void setLegendaryLootTableRolls(Integer legendaryLootTableRolls) {
        this.legendaryLootTableRolls = legendaryLootTableRolls;
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
        return Objects.equals(getId(), monster.getId()) && Objects.equals(getName(), monster.getName()) && Objects.equals(getHealth(), monster.getHealth()) && Objects.equals(getAtk(), monster.getAtk()) && Objects.equals(getDef(), monster.getDef()) && Objects.equals(getExp(), monster.getExp()) && Objects.equals(getCommonLootTableRolls(), monster.getCommonLootTableRolls()) && Objects.equals(getUncommonLootTableRolls(), monster.getUncommonLootTableRolls()) && Objects.equals(getRareLootTableRolls(), monster.getRareLootTableRolls()) && Objects.equals(getEpicLootTableRolls(), monster.getEpicLootTableRolls()) && Objects.equals(getLegendaryLootTableRolls(), monster.getLegendaryLootTableRolls()) && Objects.equals(getImgSrc(), monster.getImgSrc());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getHealth(), getAtk(), getDef(), getExp(), getCommonLootTableRolls(), getUncommonLootTableRolls(), getRareLootTableRolls(), getEpicLootTableRolls(), getLegendaryLootTableRolls(), getImgSrc());
    }

    @Override
    public String toString() {
        return "Monster{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", atk=" + atk +
                ", def=" + def +
                ", exp=" + exp +
                ", commonLootTableRolls=" + commonLootTableRolls +
                ", uncommonLootTableRolls=" + uncommonLootTableRolls +
                ", rareLootTableRolls=" + rareLootTableRolls +
                ", epicLootTableRolls=" + epicLootTableRolls +
                ", legendaryLootTableRolls=" + legendaryLootTableRolls +
                ", imgSrc='" + imgSrc + '\'' +
                '}';
    }
}
