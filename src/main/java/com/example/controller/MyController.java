package com.example.controller;

import com.example.Mappers.ItemMapper;
import com.example.Mappers.UserMapper;
import com.example.domain.Item;
import com.example.domain.User;
import com.example.dto.ItemDTO;
import com.example.dto.UserDTO;
import com.example.service.BidService;
import com.example.service.ItemService;
import com.example.service.UserService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

import java.util.List;
import java.util.Optional;

@Controller("/")
public class MyController {
    private final BidService bidService;
    private final UserService userService;
    private final ItemService itemService;
    public MyController(BidService bidService, UserService userService, ItemService itemService) {
        this.bidService = bidService;
        this.userService = userService;
        this.itemService = itemService;
    }

    @Get("/dummy")
    public HttpResponse<String> dummy() {
        bidService.findByItemId(1L);
        userService.findById(1L);
        itemService.findById(1L);
        return HttpResponse.ok();
    }

    @Get("/item/byUser")
    public HttpResponse<ItemDTO> getItemByUserId(@QueryValue Long userId) {
        Item item = itemService.getItemByUserId(userId);
        ItemDTO itemDTO = ItemMapper.toDTO(item);
        return HttpResponse.ok(itemDTO);
    }

    @Get("/users")
    public HttpResponse<UserDTO> getAllUsers(@QueryValue Long userId){
        User user = userService.findById(userId);
        UserDTO userDTO = UserMapper.toDto(user);
        return HttpResponse.ok(userDTO);
    }
}
