package com.lessthanzero.oio.domains.item;

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

import static com.lessthanzero.oio.constants.Paths.ITEM_PATH;

    @RestController
    @RequestMapping(value = ITEM_PATH)
    public class ItemController {
        Logger logger = LogManager.getLogger(com.lessthanzero.oio.domains.item.ItemController.class);

        @Autowired
        private ItemService itemService;

        /**
         * Retrieves a monster from the database with associated ID
         *
         * @param id - ID to search the database for
         * @return Monster with matching ID
         */
        @GetMapping(path = "/{id}")
        public ResponseEntity<Item> getItemById(@PathVariable Long id)
                throws Exception {
            logger.info("Request received for Get Item by ID: " + id);
            return new ResponseEntity<>(itemService.getItemById(id), HttpStatus.OK);
        }

        /**
         * retrieves all patients from the database
         *
         * @return list of patients currently present in the database
         */
        @GetMapping
        public ResponseEntity<List<Item>> getItems() {
            logger.info("Request received for getItems");

            return new ResponseEntity<>(itemService.getItems(), HttpStatus.OK);
        }
    }
