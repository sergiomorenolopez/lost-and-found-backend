package com.fruche.lostandfoundbackend.services;

import com.fruche.lostandfoundbackend.payload.ItemDTO;
import com.fruche.lostandfoundbackend.payload.ItemResponse;

import java.util.List;

public interface ItemService {
    public List<ItemResponse> findAllItems();
    public ItemResponse findItemById(Long id);
    public ItemResponse createItem(ItemDTO itemDTO);
}
