package com.lessthanzero.oio.domains.inventory;

import com.lessthanzero.oio.exceptions.BadRequest;
import com.lessthanzero.oio.exceptions.ServerError;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.UUID;

@Service
public class InventoryServiceImpl implements InventoryService{

    private final Logger logger = LogManager.getLogger(com.lessthanzero.oio.domains.inventory.InventoryServiceImpl.class);

    @Autowired
    InventoryRepository inventoryRepository;

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Inventory> getInventoryByPlayerId(UUID id) {
        try {
            return inventoryRepository.getInventoryByPlayerId(id);
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            throw new ServerError(e.getMessage());
        }
    }

    @Override
    public Inventory updateInventory(UUID id, Inventory inventory) {

        if (id != inventory.getId()) {
            throw new BadRequest("Invalid Patient ID provided for path");
        }

        // GIVE THE PATIENT ID IF NOT SPECIFIED IN BODY TO AVOID DUPLICATE USERS
        if (inventory.getId() == null) {
            inventory.setId(id);
        }

        try {
            logger.info("Updated Inventory ID: " + inventory.getId());
            return inventoryRepository.save(inventory);
        } catch (DataAccessException dae) {
            logger.error(dae.getMessage());
            throw new ServerError(dae.getMessage());
        }
    }

    @Override
    public List<Inventory> getAllInventory() {
        try {
            return inventoryRepository.findAll();
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            throw new ServerError(e.getMessage());
        }
    }
}
