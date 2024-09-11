package com.example;


import com.example.domain.Item;
import com.example.domain.User;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationTest {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Item item = new Item(); // initialize item with values
        String jsonString = mapper.writeValueAsString(item);
        System.out.println(jsonString);

        User user = new User();
        String jsonString2 = mapper.writeValueAsString(user);
        System.out.println(jsonString2);

    }
}
