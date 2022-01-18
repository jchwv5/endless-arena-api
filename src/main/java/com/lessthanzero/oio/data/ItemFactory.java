package com.lessthanzero.oio.data;

import com.lessthanzero.oio.domains.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemFactory {

        public List<Item> generateItems() {
            List<Item> itemList = new ArrayList<>();

            //index0
            Item rustedArmor = new Item();
            rustedArmor.setName("Rusted Armor");
            rustedArmor.setType("Armor");
            rustedArmor.setSubtype("Armor");
            rustedArmor.setDef(5);
            rustedArmor.setResistance("none");
            rustedArmor.setVulnerability("none");
            rustedArmor.setValue(1);
            rustedArmor.setImgSrc("../assets/RustedArmor.png");
            itemList.add(rustedArmor);

            //index1
            Item rustedShield = new Item();
            rustedShield.setName("Rusted Shield");
            rustedShield.setType("Shield");
            rustedShield.setDef(2);
            rustedShield.setBlockChance(10);
            rustedShield.setValue(1);
            rustedShield.setImgSrc("../assets/RustedShield.png");
            itemList.add(rustedShield);

            //index2
            Item brokenSword = new Item();
            brokenSword.setName("Broken Sword");
            brokenSword.setType("Weapon");
            brokenSword.setSubtype("Sword");
            brokenSword.setMinAttack(2);
            brokenSword.setMaxAttack(4);
            brokenSword.setCritChance(2);
            brokenSword.setValue(1);
            brokenSword.setImgSrc("../assets/BrokenSword.png");
            itemList.add(brokenSword);

            //index3
            Item healingPotion = new Item();
            healingPotion.setName("Healing Potion");
            healingPotion.setType("Consumable");
            healingPotion.setSubtype("Healing");
            itemList.add(healingPotion);

            //index4
            Item manaPotion = new Item();
            manaPotion.setName("Mana Potion");
            manaPotion.setType("Consumable");
            manaPotion.setSubtype("Healing");
            itemList.add(manaPotion);

            //index5
            Item greenGoo = new Item();
            greenGoo.setName("Green Goo");
            greenGoo.setType("Crafting");
            itemList.add(greenGoo);

            //index6
            Item copperOre = new Item();
            copperOre.setName("Copper Ore");
            copperOre.setType("Crafting");
            itemList.add(copperOre);

            //index7
            Item ironOre = new Item();
            ironOre.setName("Iron Ore");
            ironOre.setType("Crafting");
            itemList.add(ironOre);

            //index8
            Item skull = new Item();
            skull.setName("Skull");
            skull.setType("Crafting");
            itemList.add(skull);

            //index9
            Item bone = new Item();
            bone.setName("Bone");
            bone.setType("Crafting");
            itemList.add(bone);

            //index10
            Item wolfFang = new Item();
            wolfFang.setName("Wolf Fang");
            wolfFang.setType("Crafting");
            itemList.add(wolfFang);

            //index11
            Item wolfPelt = new Item();
            wolfPelt.setName("Wolf Pelt");
            wolfPelt.setType("Crafting");
            itemList.add(wolfPelt);

            return itemList;
        }
    }
