package com.lessthanzero.oio.domains.monster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MonsterRepository extends JpaRepository<Monster, Long>,
        JpaSpecificationExecutor<Monster> {

    Monster getMonsterById(Long id);

}