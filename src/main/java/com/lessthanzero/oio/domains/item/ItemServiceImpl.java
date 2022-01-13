package com.lessthanzero.oio.domains.item;

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
public class ItemServiceImpl implements ItemService {


    private final Logger logger = LogManager.getLogger(com.lessthanzero.oio.domains.item.ItemServiceImpl.class);

    @Autowired
    ItemRepository itemRepository;

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Finds an encounter in the database by ID
     *
     * @param id - ID to search the database for
     * @return - encounter with associated EncounterId
     */
    @Override
    public Item getItemById(Long id) {
        try {
            return itemRepository.getItemById(id);
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            throw new ServerError(e.getMessage());
        }
    }

    /**
     * Retrieves all patients from the database
     *
     * @return List of all patients present in the database
     */
    @Override
    public List<Item> getItems() {
        try {
            return itemRepository.findAll();
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            throw new ServerError(e.getMessage());
        }
    }
}