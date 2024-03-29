package com.lessthanzero.oio.domains.inventory;

import java.util.List;
import java.util.UUID;

public interface InventoryService {
    List<Inventory> getInventoryByPlayerId (Long id);

    Inventory updateInventory(UUID id, Inventory inventory);

    List<Inventory> getAllInventory();
}
