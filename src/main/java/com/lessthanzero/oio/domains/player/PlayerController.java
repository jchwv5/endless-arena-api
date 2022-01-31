package com.lessthanzero.oio.domains.player;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import static com.lessthanzero.oio.constants.Paths.PLAYERS_PATH;

@RestController
@RequestMapping(value = PLAYERS_PATH)
public class PlayerController {
    Logger logger = LogManager.getLogger(com.lessthanzero.oio.domains.player.PlayerController.class);

    @Autowired
    private PlayerService playerService;

    @GetMapping(path = "/{email}")
    public ResponseEntity<Player> getPlayerById(@PathVariable String email)
            throws Exception {
        logger.info("Request received for Get Monster by ID: " + email);
        return new ResponseEntity<>(playerService.getPlayerByEmail(email), HttpStatus.OK);
    }

    /**
     * retrieves all patients from the database
     * @return list of patients currently present in the database
     */
    @GetMapping
    public ResponseEntity<List<Player>> getPlayers() {
        logger.info("Request received for getMonsters");

        return new ResponseEntity<>(playerService.getPlayers(), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Player> updatePlayer(
            @PathVariable UUID id,
            @RequestBody Player player
    ) {
        logger.info("Request received for Update User");
        return new ResponseEntity<>(playerService.updatePlayer(id, player), HttpStatus.OK);
    }

}