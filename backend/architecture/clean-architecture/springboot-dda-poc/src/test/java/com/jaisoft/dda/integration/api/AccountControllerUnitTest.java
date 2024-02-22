package com.jaisoft.dda.integration.api;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.jaisoft.dda.domain.aggregate.AccountAggregate;
import com.jaisoft.dda.domain.entity.ProfileEntity;
import com.jaisoft.dda.domain.entity.UserEntity;
import com.jaisoft.dda.domain.factory.AccountAggregateFactory;
import com.jaisoft.dda.domain.repository.AccountRepository;
import com.jaisoft.dda.integration.api.dto.request.CreateAccountRequest;
import com.jaisoft.dda.integration.api.dto.request.ProfileRequest;
import com.jaisoft.dda.integration.api.dto.request.UserRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AccountController.class)
class AccountControllerUnitTest {

    @MockBean
    AccountRepository accountRepository;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void account_create() throws Exception {

        AccountAggregate accountAggregate = AccountAggregateFactory.getInstance(new UserEntity(), new ProfileEntity() );

        when(accountRepository.save(any(AccountAggregate.class))).thenReturn(accountAggregate);


        this.mockMvc.perform(post("http://localhost:8080/api/v1/accounts")
                            .content(objectMapper.writeValueAsString(new CreateAccountRequest(new UserRequest("Jaime"),new ProfileRequest("Jaisoft"))))
                            .contentType(MediaType.APPLICATION_JSON))
                            .andExpect(status().isCreated());

    }
}
