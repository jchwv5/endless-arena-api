package com.lessthanzero.oio.domains.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PlayerRepository extends JpaRepository<Player, Long>,
        JpaSpecificationExecutor<Player> {

    Player getPlayerById(Long id);

}