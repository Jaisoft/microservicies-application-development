package com.jaisoft.bdtdd.domain.service;

import com.jaisoft.bdtdd.domain.model.UserDomain;

import java.util.List;

public interface UserDomainService {

    UserDomain createUser(UserDomain user);
    UserDomain updateUser(UserDomain user);
    UserDomain readUser(String userId);
    List<UserDomain> readUsers();
    boolean deleteUser(String userId);

    
}
