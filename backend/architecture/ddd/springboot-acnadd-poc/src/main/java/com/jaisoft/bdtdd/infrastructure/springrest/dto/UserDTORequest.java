package com.jaisoft.bdtdd.infrastructure.springrest.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

//@Data
@Getter
@Setter
@Builder
public class UserDTORequest {
    @NotEmpty(message = "Not empty")
    private Integer userAge;
    @NotBlank(message = "Not blank")
    private String userEmail;
    @NotNull(message = "Not null")
    private String userName;
}
