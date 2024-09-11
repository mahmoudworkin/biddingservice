package com.example.service;

import com.example.domain.Item;
import com.example.repository.ItemRepository;
import jakarta.inject.Singleton;

import java.util.Optional;

@Singleton
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item findById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    public Item getItemByUserId(Long userId){
        return itemRepository.findBySeller_Id(userId).orElse(null);
    }
}
