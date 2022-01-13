package com.lessthanzero.oio.domains.player;

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

@Service
public class PlayerServiceImpl implements PlayerService{


    private final Logger logger = LogManager.getLogger(PlayerServiceImpl.class);

    @Autowired
    PlayerRepository playerRepository;

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Finds an encounter in the database by ID
     * @param id - ID to search the database for
     * @return - encounter with associated EncounterId
     */
    @Override
    public Player getPlayerById (Long id) {
        try {
            return playerRepository.getPlayerById(id);
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            throw new ServerError(e.getMessage());
        }
    }

    /**
     * Retrieves all patients from the database
     * @return List of all patients present in the database
     */
    @Override
    public List<Player> getPlayers() {
        try {
            return playerRepository.findAll();
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            throw new ServerError(e.getMessage());
        }
    }

    @Override
    public Player updatePlayer(Long id, Player player) {

        if (id != player.getId()) {
            throw new BadRequest("Invalid Patient ID provided for path");
        }

        // GIVE THE PATIENT ID IF NOT SPECIFIED IN BODY TO AVOID DUPLICATE USERS
        if (player.getId() == null) {
            player.setId(id);
        }

        try {
            logger.info("Updated user ID: " + player.getId());
            return playerRepository.save(player);
        } catch (DataAccessException dae) {
            logger.error(dae.getMessage());
            throw new ServerError(dae.getMessage());
        }
    }
}
