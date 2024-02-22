package com.jaisoft.bdtdd.infrastructure.definitions;



import com.jaisoft.bdtdd.infrastructure.springrest.UserAcceptationTest;
import io.cucumber.java.en.Given;
import java.net.URISyntaxException;

public class UserDefinitios extends UserAcceptationTest {

    @Given("a unregistered user")
    public void a_unregistered_user() throws URISyntaxException {
        givenUser_whenCreateUser_thenResponseOk();
    }
}
