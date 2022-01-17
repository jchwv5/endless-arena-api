package com.lessthanzero.oio.domains.loot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonLootTableRepository extends JpaRepository<CommonLootTable, Long> {
    List<CommonLootTable> getCommonLootTableByMonsterId(Long Id);
}
