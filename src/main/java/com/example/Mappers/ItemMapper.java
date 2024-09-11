package com.example.Mappers;

import com.example.domain.Item;
import com.example.dto.ItemDTO;

public class ItemMapper {
    public static ItemDTO toDTO(Item item) {
        if(item == null) return null;
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId(item.getId());
        itemDTO.setName(item.getName());
        itemDTO.setDescription(item.getDescription());
        itemDTO.setUserId(item.getSeller().getId());
        return itemDTO;
    }
}
