package com.lessthanzero.oio.data;

import com.lessthanzero.oio.domains.monster.Monster;

import java.util.ArrayList;
import java.util.List;

public class MonsterFactory {

    public List<Monster> generateMonsters() {
        List<Monster> monsterList = new ArrayList<>();

        Monster slime = new Monster();
        slime.setName("Slime");
        slime.setHealth(25);
        slime.setAtk(10);
        slime.setDef(2);
        slime.setExp(15);
        slime.setImgSrc("../assets/Slime.png");
        monsterList.add(slime);

        Monster bat = new Monster();
        bat.setName("Bat");
        bat.setHealth(20);
        bat.setAtk(12);
        bat.setDef(1);
        bat.setExp(10);
        bat.setImgSrc("../assets/Bat.png");
        monsterList.add(bat);

        Monster wolf = new Monster();
        wolf.setName("Wolf");
        wolf.setHealth(30);
        wolf.setAtk(15);
        wolf.setDef(2);
        wolf.setExp(20);
        wolf.setImgSrc("../assets/Wolf.png");
        monsterList.add(wolf);

        Monster skeleton = new Monster();
        skeleton.setName("Skeleton");
        skeleton.setHealth(35);
        skeleton.setAtk(14);
        skeleton.setDef(1);
        skeleton.setExp(25);
        skeleton.setImgSrc("../assets/Skeleton.png");
        monsterList.add(skeleton);

        Monster goblin = new Monster();
        goblin.setName("Goblin");
        goblin.setHealth(50);
        goblin.setAtk(20);
        goblin.setDef(3);
        goblin.setExp(30);
        goblin.setImgSrc("../assets/Goblin.png");
        monsterList.add(goblin);

        return monsterList;
    }
}
