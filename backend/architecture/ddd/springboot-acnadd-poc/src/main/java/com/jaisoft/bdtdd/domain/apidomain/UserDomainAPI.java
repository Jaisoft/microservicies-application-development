package com.jaisoft.bdtdd.domain.apidomain;
import com.jaisoft.bdtdd.domain.model.UserDomain;

import java.util.List;

public interface UserDomainAPI {

    UserDomain createUser(UserDomain user);
    UserDomain updateUser(UserDomain user);
    UserDomain readUser(String userId);
    List<UserDomain> readUsers ();
    void deleteUser(String userId);
}
