package com.jaisoft.dda.domain.factory;



import com.jaisoft.dda.domain.aggregate.AccountAggregate;
import com.jaisoft.dda.domain.entity.ProfileEntity;
import com.jaisoft.dda.domain.entity.UserEntity;
import com.jaisoft.dda.domain.factory.validations.AccountAggregateValidations;


public final class AccountAggregateFactory {

    public static AccountAggregate getInstance(
            UserEntity userEntity, ProfileEntity profileEntity){

        return AccountAggregateValidations.validate(new AccountAggregate(userEntity, profileEntity));
    }
}
