package com.jaisoft.dda.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Document
public class ProfileEntity {

    @Id
    private String profileId;

    @Min(5)
    @NotNull
    @NotEmpty
    @NotBlank
    private String profileName;

    public ProfileEntity(String profileName) {
        this.profileName = profileName;
    }



}
