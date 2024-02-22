package com.jaisoft.bdtdd.domain.repository;
import com.jaisoft.bdtdd.domain.model.UserDomain;

import java.util.List;

public interface UserDomainRepository {
    UserDomain createUser(UserDomain user);
    UserDomain updateUser(UserDomain user);
    UserDomain readUser(String userId);
    List<UserDomain> readUsers();
    boolean deleteUser(String userId);
}
