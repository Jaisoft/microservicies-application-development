package com.jaisoft.dda.cucumber.definitions;

import com.jaisoft.dda.cucumber.acceptation.CreateAccountAcceptationTest;
import io.cucumber.java.en.When;

import java.net.URISyntaxException;

public class CreateAccountDefinitions extends CreateAccountAcceptationTest {


    @When("Create an Account")
    public void create_an_account() throws URISyntaxException {

        whenCreateUser_thenResponseCreated();

    }



}
