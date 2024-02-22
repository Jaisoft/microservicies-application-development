package com.jaisoft.bdtdd.infrastructure.springrest;

import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTORequest;

public class UserDTOBuilder {
    public static UserDTORequest buildUserDTO(){
        return UserDTORequest.builder().userAge(20).userEmail("jaime.gomez.moraleda@gmail.com").userName("Jaime").build();
    }
}
