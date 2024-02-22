package com.jaisoft.dda.domain.factory;

import com.jaisoft.dda.domain.entity.ProfileEntity;

import com.jaisoft.dda.domain.factory.validations.ProfileEntityValidations;

public class ProfileEntityFactory {

    public static ProfileEntity getInstance(String profileName){

        return ProfileEntityValidations.validate(new ProfileEntity(profileName));
    }
}
