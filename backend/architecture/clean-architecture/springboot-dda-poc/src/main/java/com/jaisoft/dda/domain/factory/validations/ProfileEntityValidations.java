package com.jaisoft.dda.domain.factory.validations;

import com.jaisoft.dda.domain.aggregate.AccountAggregate;
import com.jaisoft.dda.domain.entity.ProfileEntity;

import javax.validation.*;
import java.util.Set;

public class ProfileEntityValidations {

    static public ProfileEntity validate(ProfileEntity profileEntity){

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<ProfileEntity>> violations = validator.validate(profileEntity);

        if(!violations.isEmpty()){
            throw new ConstraintViolationException(violations);
        }
        return profileEntity;
    }
}
