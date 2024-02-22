package com.jaisoft.dda.domain.factory.validations;

import com.jaisoft.dda.domain.aggregate.AccountAggregate;


import javax.validation.*;
import java.util.Set;

public final class AccountAggregateValidations {

    static public AccountAggregate validate(AccountAggregate accountAggregate){

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<AccountAggregate>> violations = validator.validate(accountAggregate);

        if(!violations.isEmpty()){
            throw new ConstraintViolationException(violations);
        }
        return accountAggregate;
    }
}
