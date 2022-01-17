package com.lessthanzero.oio.domains.loot;

import com.lessthanzero.oio.domains.inventory.Inventory;
import com.lessthanzero.oio.domains.inventory.InventoryRepository;
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
public class CommonLootTableServiceImpl implements CommonLootTableService{

    private final Logger logger = LogManager.getLogger(com.lessthanzero.oio.domains.loot.CommonLootTableServiceImpl.class);

    @Autowired
    CommonLootTableRepository commonLootTableRepository;

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<CommonLootTable> getCommonLootTableByMonsterId(Long id) {
        try {
            return commonLootTableRepository.getCommonLootTableByMonsterId(id);
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            throw new ServerError(e.getMessage());
        }
    }
}
