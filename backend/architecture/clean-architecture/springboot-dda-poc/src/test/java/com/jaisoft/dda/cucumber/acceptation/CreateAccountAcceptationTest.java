package com.jaisoft.dda.cucumber.acceptation;


import com.jaisoft.dda.integration.api.dto.request.CreateAccountRequest;
import com.jaisoft.dda.integration.api.dto.response.CreateAccountResponse;
import com.jaisoft.dda.integration.api.dto.request.ProfileRequest;
import com.jaisoft.dda.integration.api.dto.request.UserRequest;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.net.URI;
import java.net.URISyntaxException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@CucumberContextConfiguration
public class CreateAccountAcceptationTest {

    public void whenCreateUser_thenResponseCreated() throws URISyntaxException
    {
        RestTemplate restTemplate = new RestTemplate();
        final String baseUrl = "http://localhost:8080/api/v1/accounts";
        URI uri = new URI(baseUrl);

        HttpEntity<CreateAccountRequest> request = new HttpEntity<>(new CreateAccountRequest(new UserRequest("Jaime"),new ProfileRequest("Jaisoft")));
        ResponseEntity<CreateAccountResponse> result = restTemplate.postForEntity(uri, request, CreateAccountResponse.class);

        assertThat(result.getStatusCode(), equalTo(HttpStatus.CREATED));

    }
}
