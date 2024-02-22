package com.jaisoft.dda.domain.factory.validations;

import com.jaisoft.dda.domain.entity.ProfileEntity;
import com.jaisoft.dda.domain.entity.UserEntity;

import javax.validation.*;
import java.util.Set;

public class UserEntityValidations {

    static public UserEntity validate(UserEntity userEntity){

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<UserEntity>> violations = validator.validate(userEntity);

        if(!violations.isEmpty()){
            throw new ConstraintViolationException(violations);
        }
        return userEntity;
    }
}
