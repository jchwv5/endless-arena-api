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
        slime.setAttack(5);
        slime.setDefense(2);
        slime.setImgSrc("../assets/Slime.png");
        monsterList.add(slime);

        Monster bat = new Monster();
        bat.setName("Bat");
        bat.setHealth(20);
        bat.setAttack(6);
        bat.setDefense(1);
        bat.setImgSrc("../assets/Bat.png");
        monsterList.add(bat);

        Monster wolf = new Monster();
        wolf.setName("Wolf");
        wolf.setHealth(30);
        wolf.setAttack(6);
        wolf.setDefense(2);
        wolf.setImgSrc("../assets/Wolf.png");
        monsterList.add(wolf);

        Monster skeleton = new Monster();
        skeleton.setName("Skeleton");
        skeleton.setHealth(35);
        skeleton.setAttack(8);
        skeleton.setDefense(1);
        skeleton.setImgSrc("../assets/Skeleton.png");
        monsterList.add(skeleton);

        Monster goblin = new Monster();
        goblin.setName("Goblin");
        goblin.setHealth(50);
        goblin.setAttack(10);
        goblin.setDefense(3);
        goblin.setImgSrc("../assets/Goblin.png");
        monsterList.add(goblin);

        return monsterList;
    }
}
