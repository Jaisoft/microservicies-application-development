package com.jaisoft.tdd.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.jaisoft.tdd.model.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;



@DataJpaTest
class UserRepositoryIntegrationTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void user_create(){
       User user = new User();
       user.setUserId(1L);
       user.setUserName("Jaime");
       User userCreated = userRepository.save(user);

       assertEquals(userCreated.getUserName(),"Jaime");

    }






}