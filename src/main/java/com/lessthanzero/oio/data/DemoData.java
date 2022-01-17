package com.lessthanzero.oio.data;

import com.lessthanzero.oio.domains.inventory.Inventory;
import com.lessthanzero.oio.domains.inventory.InventoryRepository;
import com.lessthanzero.oio.domains.item.Item;
import com.lessthanzero.oio.domains.item.ItemRepository;
import com.lessthanzero.oio.domains.loot.CommonLootTable;
import com.lessthanzero.oio.domains.loot.CommonLootTableRepository;
import com.lessthanzero.oio.domains.monster.Monster;
import com.lessthanzero.oio.domains.monster.MonsterRepository;
import com.lessthanzero.oio.domains.player.Player;
import com.lessthanzero.oio.domains.player.PlayerRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DemoData implements CommandLineRunner {
    private final Logger logger = LogManager.getLogger(DemoData.class);
    MonsterFactory monsterFactory = new MonsterFactory();
    PlayerFactory playerFactory = new PlayerFactory();
    ItemFactory itemFactory = new ItemFactory();

    @Autowired
    private MonsterRepository monsterRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private CommonLootTableRepository commonLootTableRepository;

    @Autowired
    private Environment env;

    @Override
    public void run(String... strings) throws JSONException {
        // Retrieve the value of custom property in application.yml
        boolean loadData = Boolean.parseBoolean(env.getProperty("monsters.load"));
        if (loadData) {
            seedDatabase();
        }
    }
    private void seedDatabase() throws JSONException {

        // Generate products
        List<Monster> monsterList = monsterFactory.generateMonsters();

        List<Player> playerList = playerFactory.generatePlayer();
        Player player = playerList.get(0);

        List<Item> itemList = itemFactory.generateItems();

        List<Inventory> inventoryList = new ArrayList<>();

        Inventory inventory1 = new Inventory();
        inventory1.setItem(itemList.get(0));
        inventory1.setPlayer(player);
        inventory1.setQuantity(1);
        inventoryList.add(inventory1);

        Inventory inventory2 = new Inventory();
        inventory2.setItem(itemList.get(1));
        inventory2.setPlayer(player);
        inventory2.setQuantity(1);
        inventoryList.add(inventory2);

        Inventory inventory3 = new Inventory();
        inventory3.setItem(itemList.get(2));
        inventory3.setPlayer(player);
        inventory3.setQuantity(1);
        inventoryList.add(inventory3);

        Inventory inventory4 = new Inventory();
        inventory4.setItem(itemList.get(3));
        inventory4.setPlayer(player);
        inventory4.setQuantity(1);
        inventoryList.add(inventory4);

        Inventory inventory5 = new Inventory();
        inventory5.setItem(itemList.get(4));
        inventory5.setPlayer(player);
        inventory5.setQuantity(1);
        inventoryList.add(inventory5);

        Inventory inventory6 = new Inventory();
        inventory6.setItem(itemList.get(5));
        inventory6.setPlayer(player);
        inventory6.setQuantity(1);
        inventoryList.add(inventory6);

        Inventory inventory7 = new Inventory();
        inventory7.setItem(itemList.get(6));
        inventory7.setPlayer(player);
        inventory7.setQuantity(1);
        inventoryList.add(inventory7);

        List<CommonLootTable> commonLootTableList = new ArrayList<>();

        CommonLootTable slimeCommonLootTable1 = new CommonLootTable();
        slimeCommonLootTable1.setMonster(monsterList.get(0));
        slimeCommonLootTable1.setItem(itemList.get(5));
        slimeCommonLootTable1.setDropChanceHigh(30);
        slimeCommonLootTable1.setDropChanceLow(6);
        commonLootTableList.add(slimeCommonLootTable1);

        CommonLootTable slimeCommonLootTable2 = new CommonLootTable();
        slimeCommonLootTable2.setMonster(monsterList.get(0));
        slimeCommonLootTable2.setItem(itemList.get(6));
        slimeCommonLootTable2.setDropChanceLow(31);
        slimeCommonLootTable2.setDropChanceHigh(40);
        commonLootTableList.add(slimeCommonLootTable2);

        CommonLootTable slimeCommonLootTable3 = new CommonLootTable();
        slimeCommonLootTable3.setMonster(monsterList.get(0));
        slimeCommonLootTable3.setItem(itemList.get(7));
        slimeCommonLootTable3.setDropChanceLow(41);
        slimeCommonLootTable3.setDropChanceHigh(50);
        commonLootTableList.add(slimeCommonLootTable3);

        CommonLootTable wolfCommonLootTable1 = new CommonLootTable();
        wolfCommonLootTable1.setMonster(monsterList.get(2));
        wolfCommonLootTable1.setItem(itemList.get(10));
        wolfCommonLootTable1.setDropChanceLow(1);
        wolfCommonLootTable1.setDropChanceHigh(10);
        commonLootTableList.add(wolfCommonLootTable1);


        CommonLootTable wolfCommonLootTable2 = new CommonLootTable();
        wolfCommonLootTable2.setMonster(monsterList.get(2));
        wolfCommonLootTable2.setItem(itemList.get(11));
        wolfCommonLootTable2.setDropChanceLow(11);
        wolfCommonLootTable2.setDropChanceHigh(20);
        commonLootTableList.add(wolfCommonLootTable2);

        CommonLootTable skeletonCommonLootTable1 = new CommonLootTable();
        skeletonCommonLootTable1.setMonster(monsterList.get(3));
        skeletonCommonLootTable1.setItem(itemList.get(8));
        skeletonCommonLootTable1.setDropChanceLow(1);
        skeletonCommonLootTable1.setDropChanceHigh(10);
        commonLootTableList.add(skeletonCommonLootTable1);

        CommonLootTable skeletonCommonLootTable2 = new CommonLootTable();
        skeletonCommonLootTable2.setMonster(monsterList.get(3));
        skeletonCommonLootTable2.setItem(itemList.get(9));
        skeletonCommonLootTable2.setDropChanceLow(11);
        skeletonCommonLootTable2.setDropChanceHigh(15);
        commonLootTableList.add(skeletonCommonLootTable2);





        // Persist them to the database
        logger.info("Loading monsters");
        monsterRepository.saveAll(monsterList);
        logger.info("Loading player");
        playerRepository.saveAll(playerList);
        logger.info("Loading items");
        itemRepository.saveAll(itemList);
        logger.info("Populating player inventory");
        inventoryRepository.saveAll(inventoryList);
        logger.info("Populating common loot tables");
        commonLootTableRepository.saveAll(commonLootTableList);



        logger.info("Data load completed.You can make requests now.");

}

}
