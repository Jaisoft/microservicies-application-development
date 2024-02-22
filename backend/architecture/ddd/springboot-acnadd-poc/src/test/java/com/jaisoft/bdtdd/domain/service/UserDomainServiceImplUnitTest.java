package com.jaisoft.bdtdd.domain.service;

import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.domain.repository.UserDomainRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.assertj.core.api.Assertions.assertThat;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserDomainServiceImplUnitTest {

    @InjectMocks
    UserDomainServiceImpl userDomainServiceImpl;

    @Mock
    UserDomainRepository userDomainRepository;

    @Test
    public void create_user() {
        // Given
        UserDomain userDomain = UserDomain.builder().userId("userId").userAge(20).userEmail("userEmail").userName("userName").build();
        when(userDomainRepository.createUser(any(UserDomain.class))).thenReturn(userDomain);
        UserDomain created = userDomainServiceImpl.createUser(userDomain);
        assertThat(created.getUserName()).isSameAs(userDomain.getUserName());
        verify(userDomainRepository).createUser(userDomain);
    }

    @Test
    public void update_user() {
        create_user();
        UserDomain userDomain = UserDomain.builder().userId("userId").userAge(20).userEmail("userEmail").userName("userName").build();
        userDomainServiceImpl.updateUser(userDomain);
        verify(userDomainRepository).updateUser(userDomain);

    }

    @Test
    public void delete_user(){
        create_user();
        UserDomain userDomain = UserDomain.builder().userId("userId").userAge(20).userEmail("userEmail").userName("userName").build();
        userDomainServiceImpl.deleteUser(userDomain.getUserId());
        verify(userDomainRepository).deleteUser(userDomain.getUserId());
    }

    @Test
    public void read_users() {
        UserDomain userDomain = UserDomain.builder().userId("userId").userAge(20).userEmail("userEmail").userName("userName").build();
        List<UserDomain> users = new ArrayList();
        users.add(userDomain);
        given(userDomainRepository.readUsers()).willReturn(users);
        List<UserDomain> expected = userDomainServiceImpl.readUsers();
        assertEquals(expected, users);
        verify(userDomainRepository).readUsers();
    }



}
