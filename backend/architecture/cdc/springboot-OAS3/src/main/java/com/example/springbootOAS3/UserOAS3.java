package com.example.springbootOAS3;

import org.springframework.http.ResponseEntity;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "User API", description = "Actions on Users")
public interface UserOAS3 {

    
    @Operation(summary = "Create a user")
    ResponseEntity<CreateUserResponse> createUser(CreateUserRequest createUserRequest);
    
}
