package com.lessthanzero.oio.domains.monster;

import com.lessthanzero.oio.exceptions.ServerError;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class MonsterServiceImpl implements MonsterService{

    private final Logger logger = LogManager.getLogger(MonsterServiceImpl.class);

    @Autowired
    MonsterRepository monsterRepository;

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Finds an encounter in the database by ID
     * @param id - ID to search the database for
     * @return - encounter with associated EncounterId
     */
    public Monster getMonsterById (Long id) {
        try {
            return monsterRepository.getMonsterById(id);
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            throw new ServerError(e.getMessage());
        }
    }
}
