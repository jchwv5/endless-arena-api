package com.lessthanzero.oio.domains.loot;

import java.util.List;

public interface CommonLootTableService {
    List<CommonLootTable> getCommonLootTableByMonsterId(Long id);
}
