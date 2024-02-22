package com.jaisoft.dda.integration.api.oas3;

import com.jaisoft.dda.integration.api.dto.request.CreateAccountRequest;
import com.jaisoft.dda.integration.api.dto.response.CreateAccountResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "User API", description = "Actions on Users")
@RequestMapping("api/v1")
public interface AccountOAS3 {

    @PostMapping(path = "/accounts", consumes = "application/json", produces = "application/json")
    @Operation(summary = "Create a user")
    ResponseEntity<CreateAccountResponse> createAccount(@RequestBody CreateAccountRequest createAccountRequest);


}
