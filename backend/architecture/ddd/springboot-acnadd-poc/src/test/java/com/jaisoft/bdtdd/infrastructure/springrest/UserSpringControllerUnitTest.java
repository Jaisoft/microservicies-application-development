package com.jaisoft.bdtdd.infrastructure.springrest;

import com.jaisoft.bdtdd.domain.model.UserDomain;
import com.jaisoft.bdtdd.infrastructure.springservice.UserSpringService;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
@WebMvcTest(UserSpringController.class)
class UserSpringControllerUnitTest {

    @MockBean
    UserSpringService userSpringService;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testfindAll() throws Exception {
        UserDomain userDomain = UserDomainBuilder.buildUserDomain();
        List<UserDomain> users = Arrays.asList(userDomain);

        when(userSpringService.readUsers()).thenReturn(users);

        mockMvc.perform(get("http://localhost:8080/v1/users"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].userName", Matchers.is("Jaime")));
    }
}