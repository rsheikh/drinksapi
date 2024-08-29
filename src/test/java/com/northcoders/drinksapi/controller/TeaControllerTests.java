package com.northcoders.drinksapi.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class TeaControllerTests {

    @Autowired
    private MockMvc mockMvcController;

    @Test
    public void testGetTeaLover() throws Exception{
        String expectedContent = "I love tea!";

        this.mockMvcController.perform(
                MockMvcRequestBuilders.get("/tea/tealovers"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedContent));
    }

    @Test
    @DisplayName("Test tea to return default values when none are specified in the request")
    public void testGetTeaDefault() throws Exception {
        String type = "black";
        String name = "Assam";

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/tea"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(name))
                .andExpect(MockMvcResultMatchers.jsonPath("$.type").value(type))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1));
    }

    @Test
    @DisplayName("Test tea to return values as specified in the request")
    public void testGetTea() throws Exception {
        String type = "green";
        String name = "Mint";

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/tea?name=Mint&type=green"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(name))
                .andExpect(MockMvcResultMatchers.jsonPath("$.type").value(type))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(2));
    }
}
