package com.jaisoft.bdtdd.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserDomain {
    private String userId;
    private Integer userAge;
    private String userEmail;
    private String userName;
    private boolean isCreate;
}
