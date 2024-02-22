package com.jaisoft.dda.domain.entity;

import lombok.NoArgsConstructor;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@Document
public class UserEntity {

    @Id
    private String userId;


    @Min(5)
    @NotNull
    @NotEmpty
    @NotBlank
    private String userName;

    public UserEntity(String userName) {
        this.userName = userName;
    }


}
