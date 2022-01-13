package com.lessthanzero.oio.data;
import com.lessthanzero.oio.domains.player.Player;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

public class PlayerFactory {

    public List<Player> generatePlayer() throws JSONException {
        List<Player> playerList = new ArrayList<>();

        Player player1;
        player1 = new Player();
        player1.setName("Dusk");
        player1.setLevel(1);
        player1.setHealth(50);
        player1.setStr(5);
        player1.setAgi(5);
        player1.setIntel(5);
        player1.setCon(5);
        player1.setWill(5);
        player1.setExp(0);
        player1.setWeaponId(3L);
        player1.setShieldId(2L);
        player1.setArmorId(1L);
        playerList.add(player1);

        return playerList;
    }
}