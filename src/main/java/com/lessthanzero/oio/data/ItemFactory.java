package com.lessthanzero.oio.data;

import com.lessthanzero.oio.domains.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemFactory {

        public List<Item> generateItems() {
            List<Item> itemList = new ArrayList<>();

            Item armor1 = new Item();
            armor1.setName("Rusted Armor");
            armor1.setType("Armor");
            armor1.setSubtype("Armor");
            armor1.setDef(5);
            armor1.setResistance("none");
            armor1.setVulnerability("none");
            armor1.setValue(1);
            itemList.add(armor1);

            Item shield1 = new Item();
            shield1.setName("Rusted Shield");
            shield1.setType("Shield");
            shield1.setDef(2);
            shield1.setBlockChance(10);
            shield1.setValue(1);
            itemList.add(shield1);

            Item weapon1 = new Item();
            weapon1.setName("Broken Sword");
            weapon1.setType("Weapon");
            weapon1.setSubtype("Sword");
            weapon1.setMinAttack(2);
            weapon1.setMaxAttack(4);
            weapon1.setCritChance(2);
            weapon1.setValue(1);
            itemList.add(weapon1);

            return itemList;
        }
    }
