package com.example.springbootOAS3;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UserController /*implements UserOAS3*/ {

   // @Override
    @PostMapping(path = "/users", consumes = "application/json", produces = "application/json")
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody CreateUserRequest createUserRequest) {
        
        CreateUserRequest createUserRequest2 = createUserRequest;
        
        CreateUserResponse createUserResponse = new CreateUserResponse();
        
        createUserResponse.setName(createUserRequest.getName()/*"Jaime"*/);
        createUserResponse.setLastName(createUserRequest.getLastName()/*"Gomez"*/);
        
        return new ResponseEntity<>(createUserResponse, HttpStatus.CREATED);
    }
    
}
