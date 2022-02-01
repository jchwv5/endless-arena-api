package com.lessthanzero.oio.domains.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface PlayerRepository extends JpaRepository<Player, Long>,
        JpaSpecificationExecutor<Player> {

    Player getPlayerById(Long id);

    Player getPlayerByEmail(String email);
}