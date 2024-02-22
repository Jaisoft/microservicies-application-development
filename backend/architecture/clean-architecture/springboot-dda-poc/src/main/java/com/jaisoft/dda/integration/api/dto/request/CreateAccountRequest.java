package com.jaisoft.dda.integration.api.dto.request;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateAccountRequest {
    private UserRequest userRequest;
    private ProfileRequest profileRequest;

}
