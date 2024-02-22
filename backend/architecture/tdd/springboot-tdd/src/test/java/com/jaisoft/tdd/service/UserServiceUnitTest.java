package com.jaisoft.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.jaisoft.tdd.model.User;
import com.jaisoft.tdd.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceUnitTest {


    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;


    @Test
    public void create_user(){
        User user = new User();
        user.setUserName("Jaime");
   
        when(userRepository.save(any(User.class))).thenReturn(user);

        User userCreated = userService.save(user);

        assertEquals("Jaime", userCreated.getUserName());

    }





}