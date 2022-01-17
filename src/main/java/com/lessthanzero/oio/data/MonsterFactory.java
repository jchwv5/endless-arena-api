package com.lessthanzero.oio.data;

import com.lessthanzero.oio.domains.monster.Monster;

import java.util.ArrayList;
import java.util.List;

public class MonsterFactory {

    public List<Monster> generateMonsters() {
        List<Monster> monsterList = new ArrayList<>();

        //index0
        Monster slime = new Monster();
        slime.setName("Slime");
        slime.setHealth(25);
        slime.setAtk(10);
        slime.setDef(2);
        slime.setExp(15);
        slime.setCommonLootTableRolls(3);
        slime.setUncommonLootTableRolls(0);
        slime.setRareLootTableRolls(0);
        slime.setEpicLootTableRolls(0);
        slime.setLegendaryLootTableRolls(0);
        slime.setImgSrc("../assets/Slime.png");
        monsterList.add(slime);

        //index1
        Monster bat = new Monster();
        bat.setName("Bat");
        bat.setHealth(20);
        bat.setAtk(12);
        bat.setDef(1);
        bat.setExp(10);
        bat.setCommonLootTableRolls(0);
        bat.setUncommonLootTableRolls(0);
        bat.setRareLootTableRolls(0);
        bat.setEpicLootTableRolls(0);
        bat.setLegendaryLootTableRolls(0);
        bat.setImgSrc("../assets/Bat.png");
        monsterList.add(bat);

        //index2
        Monster wolf = new Monster();
        wolf.setName("Wolf");
        wolf.setHealth(30);
        wolf.setAtk(15);
        wolf.setDef(2);
        wolf.setExp(20);
        wolf.setCommonLootTableRolls(2);
        wolf.setUncommonLootTableRolls(0);
        wolf.setRareLootTableRolls(0);
        wolf.setEpicLootTableRolls(0);
        wolf.setLegendaryLootTableRolls(0);
        wolf.setImgSrc("../assets/Wolf.png");
        monsterList.add(wolf);

        //index3
        Monster skeleton = new Monster();
        skeleton.setName("Skeleton");
        skeleton.setHealth(35);
        skeleton.setAtk(14);
        skeleton.setDef(1);
        skeleton.setExp(25);
        skeleton.setCommonLootTableRolls(2);
        skeleton.setUncommonLootTableRolls(0);
        skeleton.setRareLootTableRolls(0);
        skeleton.setEpicLootTableRolls(0);
        skeleton.setLegendaryLootTableRolls(0);
        skeleton.setImgSrc("../assets/Skeleton.png");
        monsterList.add(skeleton);

        //index4
        Monster goblin = new Monster();
        goblin.setName("Goblin");
        goblin.setHealth(50);
        goblin.setAtk(20);
        goblin.setDef(3);
        goblin.setExp(30);
        goblin.setCommonLootTableRolls(0);
        goblin.setUncommonLootTableRolls(0);
        goblin.setRareLootTableRolls(0);
        goblin.setEpicLootTableRolls(0);
        goblin.setLegendaryLootTableRolls(0);
        goblin.setImgSrc("../assets/Goblin.png");
        monsterList.add(goblin);

        return monsterList;
    }
}
