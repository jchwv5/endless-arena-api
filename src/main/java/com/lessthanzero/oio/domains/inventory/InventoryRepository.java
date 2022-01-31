package com.lessthanzero.oio.domains.inventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> getInventoryByPlayerId(UUID Id);
}
