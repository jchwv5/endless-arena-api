package com.lessthanzero.oio.domains.item;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String type;

    private String subtype;

    private Integer def;

    private String resistance;

    private String vulnerability;

    private Integer blockChance;

    private Integer minAttack;

    private Integer maxAttack;

    private Integer critChance;

    private Integer value;

    private String imgSrc;

    public Item() {
    }

    public Item(Long id, String name, String type, String subtype, Integer def, String resistance, String vulnerability, Integer blockChance, Integer minAttack, Integer maxAttack, Integer critChance, Integer value, String imgSrc) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.subtype = subtype;
        this.def = def;
        this.resistance = resistance;
        this.vulnerability = vulnerability;
        this.blockChance = blockChance;
        this.minAttack = minAttack;
        this.maxAttack = maxAttack;
        this.critChance = critChance;
        this.value = value;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public String getResistance() {
        return resistance;
    }

    public void setResistance(String resistance) {
        this.resistance = resistance;
    }

    public String getVulnerability() {
        return vulnerability;
    }

    public void setVulnerability(String vulnerability) {
        this.vulnerability = vulnerability;
    }

    public Integer getBlockChance() {
        return blockChance;
    }

    public void setBlockChance(Integer blockChance) {
        this.blockChance = blockChance;
    }

    public Integer getMinAttack() {
        return minAttack;
    }

    public void setMinAttack(Integer minAttack) {
        this.minAttack = minAttack;
    }

    public Integer getMaxAttack() {
        return maxAttack;
    }

    public void setMaxAttack(Integer maxAttack) {
        this.maxAttack = maxAttack;
    }

    public Integer getCritChance() {
        return critChance;
    }

    public void setCritChance(Integer critChance) {
        this.critChance = critChance;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
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
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Objects.equals(getId(), item.getId()) && Objects.equals(getName(), item.getName()) && Objects.equals(getType(), item.getType()) && Objects.equals(getSubtype(), item.getSubtype()) && Objects.equals(getDef(), item.getDef()) && Objects.equals(getResistance(), item.getResistance()) && Objects.equals(getVulnerability(), item.getVulnerability()) && Objects.equals(getBlockChance(), item.getBlockChance()) && Objects.equals(getMinAttack(), item.getMinAttack()) && Objects.equals(getMaxAttack(), item.getMaxAttack()) && Objects.equals(getCritChance(), item.getCritChance()) && Objects.equals(getValue(), item.getValue()) && Objects.equals(getImgSrc(), item.getImgSrc());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getType(), getSubtype(), getDef(), getResistance(), getVulnerability(), getBlockChance(), getMinAttack(), getMaxAttack(), getCritChance(), getValue(), getImgSrc());
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", subtype='" + subtype + '\'' +
                ", def=" + def +
                ", resistance='" + resistance + '\'' +
                ", vulnerability='" + vulnerability + '\'' +
                ", blockChance=" + blockChance +
                ", minAttack=" + minAttack +
                ", maxAttack=" + maxAttack +
                ", critChance=" + critChance +
                ", value=" + value +
                ", imgSrc='" + imgSrc + '\'' +
                '}';
    }
}
