package com.jaisoft.bdtdd.infrastructure.springrest;

import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTORequest;
import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTOResponse;
import com.jaisoft.bdtdd.infrastructure.springrest.openapi.UserOpenApi;
import com.jaisoft.bdtdd.infrastructure.springservice.UserSpringService;
import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.infrastructure.mapper.UserMapper;
import com.jaisoft.bdtdd.domain.apidomain.UserDomainAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserSpringController implements UserDomainAPI, UserOpenApi {

    @Autowired
    private UserSpringService userSpringService;

    @Override
    @PostMapping(path = "/users", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> createUserRest(@Valid @RequestBody UserDTORequest userDTORequest){
        UserDomain userDomain = UserMapper.userDTOtoUserDomain(userDTORequest);
        UserDTOResponse userDTOResponse = UserMapper.userDomaintoUserDTO(createUser(userDomain));
        URI location = URI.create(String.format("/users/%s", userDTOResponse.getUserId()));
        if (userDTOResponse == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.created(location).build();
        }
    }

    @Override
    public UserDomain createUser(UserDomain user) { return  userSpringService.createUser(user); }

    @Override
    @PutMapping(path = "/users", consumes = "application/json", produces = "application/json")
    public ResponseEntity<UserDTOResponse> updateUserRest(@Valid @RequestBody UserDTORequest userDTORequest) {
        UserDomain userDomain = UserMapper.userDTOtoUserDomain(userDTORequest);
        UserDTOResponse userDTOResponse = UserMapper.userDomaintoUserDTO(updateUser(userDomain));
        if (userDTOResponse == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(userDTOResponse);
        }
    }



    @Override
    public UserDomain updateUser(UserDomain userDomain) {
        return userSpringService.updateUser(userDomain);
    }


    @GetMapping(path = "/users/{userId}" , produces = "application/json" )
    public ResponseEntity<UserDTOResponse> readUserRest(@PathVariable("userId") String userId){
        UserDTOResponse userDTOResponse = UserMapper.userDomaintoUserDTO(readUser(userId));
        if (userDTOResponse == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(userDTOResponse);
        }
    }

    @Override
    public UserDomain readUser(String userId) {
        return  userSpringService.readUser(userId);
    }

    @GetMapping(path = "/users" , produces = "application/json" )
    public ResponseEntity<List<UserDTOResponse>> readUsersRest(){
        List<UserDTOResponse> userDTOResponseList = UserMapper.userDomainListToUserDTOList(readUsers());
        if (userDTOResponseList == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(userDTOResponseList);
        }
    }

    @Override
    public List<UserDomain> readUsers() {
        return userSpringService.readUsers();
    }

    @Override
    @DeleteMapping(path = "/users/{userId}" , produces = "application/json" )
    public ResponseEntity<String> deleteUserRest(@PathVariable("userId") String userId) {


       boolean deleted = userSpringService.deleteUser(userId);

        if (!deleted) {
            return new ResponseEntity<>(userId,HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(userId, HttpStatus.OK);

    }

    @Override
    public void deleteUser(String userId) {
        userSpringService.deleteUser(userId);
    }

}
