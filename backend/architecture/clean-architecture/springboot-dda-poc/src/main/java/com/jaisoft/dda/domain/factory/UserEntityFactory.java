package com.jaisoft.dda.domain.factory;


import com.jaisoft.dda.domain.entity.UserEntity;

import com.jaisoft.dda.domain.factory.validations.UserEntityValidations;

public class UserEntityFactory {

    public static UserEntity getInstance(String userName){

        return UserEntityValidations.validate(new UserEntity(userName));
    }
}
