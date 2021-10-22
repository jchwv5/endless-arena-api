package com.lessthanzero.oio.domains.monster;

import java.util.List;

public interface MonsterService {
    Monster getMonsterById(Long id);

    List<Monster> getMonsters();
}
