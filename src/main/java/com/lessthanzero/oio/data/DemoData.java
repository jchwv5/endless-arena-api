package com.lessthanzero.oio.data;

import com.lessthanzero.oio.domains.monster.Monster;
import com.lessthanzero.oio.domains.monster.MonsterRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DemoData implements CommandLineRunner {
    private final Logger logger = LogManager.getLogger(DemoData.class);
    MonsterFactory monsterFactory = new MonsterFactory();
    @Autowired
    private MonsterRepository monsterRepository;

    @Autowired
    private Environment env;

    @Override
    public void run(String... strings) {
        // Retrieve the value of custom property in application.yml
        boolean loadData = Boolean.parseBoolean(env.getProperty("monsters.load"));
        if (loadData) {
            seedDatabase();
        }
    }
    private void seedDatabase() {

        // Generate products
        List<Monster> monsterList = monsterFactory.generateMonsters();

        // Persist them to the database
        logger.info("Loading monsters");
        monsterRepository.saveAll(monsterList);

        logger.info("Data load completed.You can make requests now.");

}

}
