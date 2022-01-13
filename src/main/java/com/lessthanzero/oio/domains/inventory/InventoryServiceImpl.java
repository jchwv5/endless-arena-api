package com.lessthanzero.oio.domains.inventory;

import com.lessthanzero.oio.exceptions.ServerError;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService{

    private final Logger logger = LogManager.getLogger(com.lessthanzero.oio.domains.inventory.InventoryServiceImpl.class);

    @Autowired
    InventoryRepository inventoryRepository;

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Inventory> getInventoryByPlayerId(Long id) {
        try {
            return inventoryRepository.getInventoryByPlayerId(id);
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            throw new ServerError(e.getMessage());
        }
    }
}
