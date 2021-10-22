package com.lessthanzero.oio.domains.monster;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.lessthanzero.oio.constants.Paths.MONSTERS_PATH;

@RestController
@RequestMapping(value = MONSTERS_PATH)
public class MonsterController {
    Logger logger = LogManager.getLogger(MonsterController.class);

    @Autowired
    private MonsterService monsterService;

    /**
     * Retrieves a monster from the database with associated ID
     *
     * @param id - ID to search the database for
     * @return Monster with matching ID
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<Monster> getMonsterById(@PathVariable Long id)
            throws Exception {
        logger.info("Request received for Get Monster by ID: " + id);
        return new ResponseEntity<>(monsterService.getMonsterById(id), HttpStatus.OK);
    }

    /**
     * retrieves all patients from the database
     * @return list of patients currently present in the database
     */
    @GetMapping
    public ResponseEntity<List<Monster>> getMonsters() {
        logger.info("Request received for getMonsters");

        return new ResponseEntity<>(monsterService.getMonsters(), HttpStatus.OK);
    }

}