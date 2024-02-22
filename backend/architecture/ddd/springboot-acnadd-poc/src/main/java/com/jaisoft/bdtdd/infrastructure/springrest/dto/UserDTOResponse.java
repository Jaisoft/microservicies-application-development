package com.jaisoft.bdtdd.infrastructure.springrest.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTOResponse {
    private String userId;
    @NotEmpty(message = "Not empty")
    private Integer userAge;
    @NotBlank(message = "Not blank")
    private String userEmail;
    @NotNull(message = "Not null")
    private String userName;
}
