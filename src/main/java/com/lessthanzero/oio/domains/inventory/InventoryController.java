package com.lessthanzero.oio.domains.inventory;

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

import static com.lessthanzero.oio.constants.Paths.INVENTORY_PATH;


@RestController
@RequestMapping(value = INVENTORY_PATH)
public class InventoryController {
    Logger logger = LogManager.getLogger(com.lessthanzero.oio.domains.inventory.InventoryController.class);

    @Autowired
    private InventoryService inventoryService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<List<Inventory>> getInventoryByPlayerId(@PathVariable Long id)
            throws Exception {
        logger.info("Request received for Get Inventory by Player ID: " + id);
        return new ResponseEntity<>(inventoryService.getInventoryByPlayerId(id), HttpStatus.OK);
    }

}
