package com.jaisoft.dda.integration.api;


import com.jaisoft.dda.domain.repository.AccountRepository;
import com.jaisoft.dda.integration.api.dto.request.CreateAccountRequest;
import com.jaisoft.dda.integration.api.dto.response.CreateAccountResponse;
import com.jaisoft.dda.integration.api.oas3.AccountOAS3;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.jaisoft.dda.integration.api.mapper.AccountMapper.accountAggregateToCreateAccountResponse;
import static com.jaisoft.dda.integration.api.mapper.AccountMapper.createAccountRequestToAccountAggregate;


@RestController
@AllArgsConstructor
public class AccountController implements AccountOAS3 {

    private AccountRepository accountRepository;

    @Override
    public ResponseEntity<CreateAccountResponse> createAccount(CreateAccountRequest createAccountRequest) {
        return new ResponseEntity<>(
                accountAggregateToCreateAccountResponse(accountRepository.save(
                        createAccountRequestToAccountAggregate(createAccountRequest))), HttpStatus.CREATED);
    }
}
