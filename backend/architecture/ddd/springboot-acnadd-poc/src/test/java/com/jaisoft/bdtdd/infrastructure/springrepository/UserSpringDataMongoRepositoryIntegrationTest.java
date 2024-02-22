package com.jaisoft.bdtdd.infrastructure.springrepository;

import com.jaisoft.bdtdd.domain.model.UserDomain;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
@RunWith(SpringRunner.class)
public class UserSpringDataMongoRepositoryIntegrationTest {

    @Autowired
    private UserSpringDataMongoRepositoryImpl userSpringDataMongoRepositoryImpl;

    @BeforeEach
    public void dataSetup() {}

    @Test
    public void givenUser_whenCreateUser_thenFindUserNotNull() {
        UserDomain userDomain = UserDomain.builder()
        .userAge(30)
        .userEmail("jaime.gomez.moraleda@gmail.com")
        .userName("Jaime").build();
        UserDomain userDomainCreated = userSpringDataMongoRepositoryImpl.createUser(userDomain);
        assertThat(userDomainCreated).isNotNull();
        assertThat(userDomainCreated.getUserId()).isNotBlank();
        assertThat(userDomainCreated.getUserId()).isNotEmpty();
        assertThat(userDomainCreated.getUserId()).isNotNull();
        assertThat(userDomainCreated.getUserEmail()).isNotBlank();
        assertThat(userDomainCreated.getUserEmail()).isNotEmpty();
        assertThat(userDomainCreated.getUserEmail()).isNotNull();
    }

    @Test
    public void givenUserId_whenGetUser_thenFindUserNotNull() {
        UserDomain userDomain = UserDomain.builder()
                .userAge(30)
                .userEmail("jaime.gomez.moraleda@gmail.com")
                .userName("Jaime").build();
        UserDomain userDomainCreated = userSpringDataMongoRepositoryImpl.createUser(userDomain);
        UserDomain userDomainFinded = userSpringDataMongoRepositoryImpl.readUser(userDomainCreated.getUserId());
        assertThat(userDomainFinded).isNotNull();
    }
}
