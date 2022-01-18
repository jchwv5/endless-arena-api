package com.lessthanzero.oio.domains.inventory;

import java.util.List;

public interface InventoryService {
    List<Inventory> getInventoryByPlayerId (Long id);

    Inventory updateInventory(Long id, Inventory inventory);

    List<Inventory> getAllInventory();
}
