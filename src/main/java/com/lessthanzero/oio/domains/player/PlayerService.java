package com.lessthanzero.oio.domains.player;

import java.util.List;

public interface PlayerService {
    Player getPlayerById(Long id);

    List<Player> getPlayers();

    Player updatePlayer(Long id, Player player);
}
