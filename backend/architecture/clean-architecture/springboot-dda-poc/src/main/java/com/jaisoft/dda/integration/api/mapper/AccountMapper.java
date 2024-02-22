package com.jaisoft.dda.integration.api.mapper;


import com.jaisoft.dda.domain.aggregate.AccountAggregate;
import com.jaisoft.dda.integration.api.dto.request.CreateAccountRequest;
import com.jaisoft.dda.integration.api.dto.response.CreateAccountResponse;
import org.dozer.DozerBeanMapper;

public class AccountMapper {

    public static AccountAggregate createAccountRequestToAccountAggregate(CreateAccountRequest createAccountRequest){
        DozerBeanMapper mapper= new DozerBeanMapper();
         return mapper.map(createAccountRequest, AccountAggregate.class);
    }

    public static CreateAccountResponse accountAggregateToCreateAccountResponse (AccountAggregate accountAggregate){
        DozerBeanMapper mapper= new DozerBeanMapper();
        return mapper.map(accountAggregate, CreateAccountResponse.class);
    }
}
