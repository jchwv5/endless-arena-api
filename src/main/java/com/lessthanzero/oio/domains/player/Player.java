package com.lessthanzero.oio.domains.player;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Player {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "VARCHAR(255)")
    private UUID id;
    @Required
    private String email;
    @Required
    private String name;
    @Required
    private Integer level;
    @Required
    private Integer health;
    @Required
    private Integer str;
    @Required
    private Integer agi;
    @Required
    private Integer intel;
    @Required
    private Integer will;
    @Required
    private Integer con;
    @Required
    private Integer exp;

    private Long weaponId;

    private Long shieldId;

    private Long armorId;

    public Player() {
    }

    public Player(UUID id, String email, String name, Integer level, Integer health, Integer str, Integer agi, Integer intel, Integer will, Integer con, Integer exp, Long weaponId, Long shieldId, Long armorId) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.level = level;
        this.health = health;
        this.str = str;
        this.agi = agi;
        this.intel = intel;
        this.will = will;
        this.con = con;
        this.exp = exp;
        this.weaponId = weaponId;
        this.shieldId = shieldId;
        this.armorId = armorId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getStr() {
        return str;
    }

    public void setStr(Integer str) {
        this.str = str;
    }

    public Integer getAgi() {
        return agi;
    }

    public void setAgi(Integer agi) {
        this.agi = agi;
    }

    public Integer getIntel() {
        return intel;
    }

    public void setIntel(Integer intel) {
        this.intel = intel;
    }

    public Integer getWill() {
        return will;
    }

    public void setWill(Integer will) {
        this.will = will;
    }

    public Integer getCon() {
        return con;
    }

    public void setCon(Integer con) {
        this.con = con;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Long getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(Long weaponId) {
        this.weaponId = weaponId;
    }

    public Long getShieldId() {
        return shieldId;
    }

    public void setShieldId(Long shieldId) {
        this.shieldId = shieldId;
    }

    public Long getArmorId() {
        return armorId;
    }

    public void setArmorId(Long armorId) {
        this.armorId = armorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return Objects.equals(getId(), player.getId()) && Objects.equals(getEmail(), player.getEmail()) && Objects.equals(getName(), player.getName()) && Objects.equals(getLevel(), player.getLevel()) && Objects.equals(getHealth(), player.getHealth()) && Objects.equals(getStr(), player.getStr()) && Objects.equals(getAgi(), player.getAgi()) && Objects.equals(getIntel(), player.getIntel()) && Objects.equals(getWill(), player.getWill()) && Objects.equals(getCon(), player.getCon()) && Objects.equals(getExp(), player.getExp()) && Objects.equals(getWeaponId(), player.getWeaponId()) && Objects.equals(getShieldId(), player.getShieldId()) && Objects.equals(getArmorId(), player.getArmorId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEmail(), getName(), getLevel(), getHealth(), getStr(), getAgi(), getIntel(), getWill(), getCon(), getExp(), getWeaponId(), getShieldId(), getArmorId());
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", str=" + str +
                ", agi=" + agi +
                ", intel=" + intel +
                ", will=" + will +
                ", con=" + con +
                ", exp=" + exp +
                ", weaponId=" + weaponId +
                ", shieldId=" + shieldId +
                ", armorId=" + armorId +
                '}';
    }
}