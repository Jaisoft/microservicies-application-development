package com.jaisoft.dda.domain.repository;


import com.jaisoft.dda.domain.entity.ProfileEntity;
import com.jaisoft.dda.domain.entity.UserEntity;
import com.jaisoft.dda.domain.factory.AccountAggregateFactory;
import com.jaisoft.dda.domain.factory.ProfileEntityFactory;
import com.jaisoft.dda.domain.factory.UserEntityFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
public class AccountRepositoryIntegrationTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void accoun_create() {

        assertThat(AccountAggregateFactory.getInstance(UserEntityFactory.getInstance("Jaimes384590"), ProfileEntityFactory.getInstance("Jaisoft"))).isNotNull();

    }


}
