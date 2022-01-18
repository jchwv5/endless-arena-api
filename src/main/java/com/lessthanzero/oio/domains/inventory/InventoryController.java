package com.lessthanzero.oio.domains.inventory;

import com.lessthanzero.oio.domains.player.Player;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public ResponseEntity<List<Inventory>> getAllInventory()
            throws Exception {
        logger.info("Request received for Get Inventory");
        return new ResponseEntity<>(inventoryService.getAllInventory(), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Inventory> updatePlayer(
            @PathVariable Long id,
            @RequestBody Inventory inventory
    ) {
        logger.info("Request received for Update User");
        return new ResponseEntity<>(inventoryService.updateInventory(id, inventory), HttpStatus.OK);
    }

}
