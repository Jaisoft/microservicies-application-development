package com.jaisoft.tdd.controller;

import javax.validation.Valid;

import com.jaisoft.tdd.model.User;
import com.jaisoft.tdd.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;


@RestController
@RequestMapping("/api/v1")
@Tag(name = "User API", description = "Accions on User")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping(path = "/users", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)@ResponseStatus(code = HttpStatus.CREATED)
    @Operation(summary = "Upload a Document", description = "Create a User", responses = {
            @ApiResponse(responseCode = "201", description = "Create"),
            @ApiResponse(responseCode = "404", description = "Not found"),
            @ApiResponse(responseCode = "409", description = "Conflict") })
    ResponseEntity<User> createUser(@Valid @RequestBody User user) throws Exception{

       return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
 
    }

}
