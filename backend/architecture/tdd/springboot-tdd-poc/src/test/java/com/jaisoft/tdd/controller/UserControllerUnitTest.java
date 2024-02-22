package com.jaisoft.tdd.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.jaisoft.tdd.model.User;
import com.jaisoft.tdd.service.UserService;

import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(value = UserController.class)
class UserControllerUnitTest {

    @Autowired
	MockMvc mockMvc;

    @MockBean
	UserService userService;

    @Test
    void create_user() throws Exception{

        User createUserRequest = new User();
		createUserRequest.setUserName("Jaime");

        this.mockMvc.perform(MockMvcRequestBuilders.post("http://localhost:8080/api/v1/users")
						.contentType(MediaType.APPLICATION_JSON_VALUE)
						.content(asJsonString(createUserRequest))
						.accept(MediaType.APPLICATION_JSON_VALUE))

				.andExpect(status().isCreated());

    }

    private String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}