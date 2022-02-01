package com.lessthanzero.oio.domains.player;

import java.util.List;
import java.util.UUID;

public interface PlayerService {
    Player getPlayerById(Long id);

    List<Player> getPlayers();

    Player updatePlayer(Long id, Player player);

    Player getPlayerByEmail(String email);
}
