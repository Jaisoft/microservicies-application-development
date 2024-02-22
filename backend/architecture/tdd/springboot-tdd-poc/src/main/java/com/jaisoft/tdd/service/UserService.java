package com.jaisoft.tdd.service;

import com.jaisoft.tdd.model.User;
import com.jaisoft.tdd.repository.UserRepository;




import org.springframework.stereotype.Service;

@Service
public class UserService {

    
    UserRepository userRepository;

    public UserService(UserRepository userRepository){
            this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

}
