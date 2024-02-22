package com.jaisoft.bdtdd.infrastructure.springrest;

import java.net.URI;
import java.net.URISyntaxException;
import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTORequest;
import com.jaisoft.bdtdd.infrastructure.springrest.dto.UserDTOResponse;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@CucumberContextConfiguration
public class UserAcceptationTest {

    @Autowired
    private RestTemplate restTemplate;

    public void givenUser_whenCreateUser_thenResponseOk() throws URISyntaxException
    {
        final String baseUrl = "http://localhost:8080/v1/user";
        URI uri = new URI(baseUrl);
        HttpEntity<UserDTORequest> request = new HttpEntity<>(UserDTOBuilder.buildUserDTO());
        ResponseEntity<UserDTOResponse> result = this.restTemplate.postForEntity(uri, request, UserDTOResponse.class);
        assertThat(result.getStatusCode(), equalTo(HttpStatus.OK));
        givenUserId_whenGetUser_thenResponseOk(result.getBody().getUserId());
    }

    public void givenUserId_whenGetUser_thenResponseOk(String userId) throws URISyntaxException
    {
        final String baseUrl = "http://localhost:8080/v1/user";
        URI uri = new URI(baseUrl + "/"+ userId);
        ResponseEntity<UserDTOResponse> response = this.restTemplate.getForEntity(uri, UserDTOResponse.class);
        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }
}
