package com.example.Mappers;

import com.example.domain.User;
import com.example.dto.UserDTO;

public class UserMapper {
    public static UserDTO toDto(User user) {
        if(user == null) return null;
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setCity(user.getCity());
        userDTO.setStreet(user.getStreet());
        userDTO.setState(user.getState());
        userDTO.setPostalCode(user.getPostalCode());
        return userDTO;

    }
}
