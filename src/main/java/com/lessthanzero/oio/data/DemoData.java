package com.lessthanzero.oio.data;

import com.lessthanzero.oio.domains.inventory.Inventory;
import com.lessthanzero.oio.domains.inventory.InventoryRepository;
import com.lessthanzero.oio.domains.item.Item;
import com.lessthanzero.oio.domains.item.ItemRepository;
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
        Item item1 = itemList.get(0);
        Item item2 = itemList.get(1);
        Item item3 = itemList.get(2);

        List<Inventory> inventoryList = new ArrayList<>();

        Inventory inventory1 = new Inventory();
        inventory1.setItem(item1);
        inventory1.setPlayer(player);
        inventory1.setQuantity(1);
        inventoryList.add(inventory1);

        Inventory inventory2 = new Inventory();
        inventory2.setItem(item2);
        inventory2.setPlayer(player);
        inventory2.setQuantity(1);
        inventoryList.add(inventory2);

        Inventory inventory3 = new Inventory();
        inventory3.setItem(item3);
        inventory3.setPlayer(player);
        inventory3.setQuantity(1);
        inventoryList.add(inventory3);

        // Persist them to the database
        logger.info("Loading monsters");
        monsterRepository.saveAll(monsterList);
        logger.info("Loading player");
        playerRepository.saveAll(playerList);
        logger.info("Loading items");
        itemRepository.saveAll(itemList);
        logger.info("Populating player inventory");
        inventoryRepository.saveAll(inventoryList);


        logger.info("Data load completed.You can make requests now.");

}

}
