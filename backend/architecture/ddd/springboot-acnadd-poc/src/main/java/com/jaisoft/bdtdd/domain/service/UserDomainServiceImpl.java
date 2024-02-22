package com.jaisoft.bdtdd.domain.service;

import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.domain.repository.UserDomainRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserDomainServiceImpl implements UserDomainService {

    private UserDomainRepository userDomainRepository;

    @Override
    public UserDomain createUser(UserDomain user) { return userDomainRepository.createUser(user); }

    @Override
    public UserDomain updateUser(UserDomain user) { return userDomainRepository.updateUser(user); }

    @Override
    public UserDomain readUser(String userId) {
        return userDomainRepository.readUser(userId);
    }

    @Override
    public List<UserDomain> readUsers() { return userDomainRepository.readUsers(); }

    @Override
    public boolean deleteUser(String userId) { return userDomainRepository.deleteUser(userId); }


}
