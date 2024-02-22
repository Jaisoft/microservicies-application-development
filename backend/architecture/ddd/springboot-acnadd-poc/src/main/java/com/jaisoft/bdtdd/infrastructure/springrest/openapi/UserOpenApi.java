package com.jaisoft.bdtdd.infrastructure.springrest.openapi;

import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTORequest;
import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTOResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Tag(name = "User", description = "The User API with documentation")
public interface UserOpenApi {
    @Operation(summary = "Create a user")
    ResponseEntity<Object> createUserRest(@RequestBody UserDTORequest userDTORequest);
    @Operation(summary = "Update a user")
    ResponseEntity<UserDTOResponse> updateUserRest(@RequestBody UserDTORequest userDTORequest);
    @Operation(summary = "Read a user")
    ResponseEntity<UserDTOResponse> readUserRest(@PathVariable String userId);
    @Operation(summary = "Read a users list")
    ResponseEntity<List<UserDTOResponse>> readUsersRest();
    @Operation(summary = "Delete a user")
    ResponseEntity<String> deleteUserRest(@PathVariable String userId);
}
