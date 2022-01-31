package com.lessthanzero.oio.domains.player;

import java.util.List;
import java.util.UUID;

public interface PlayerService {
    Player getPlayerById(UUID id);

    List<Player> getPlayers();

    Player updatePlayer(UUID id, Player player);

    Player getPlayerByEmail(String email);
}
