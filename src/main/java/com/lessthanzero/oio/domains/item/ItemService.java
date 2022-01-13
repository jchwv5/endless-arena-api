package com.lessthanzero.oio.domains.item;

import java.util.List;

public interface ItemService {

    Item getItemById(Long id);

    List<Item> getItems();
}
