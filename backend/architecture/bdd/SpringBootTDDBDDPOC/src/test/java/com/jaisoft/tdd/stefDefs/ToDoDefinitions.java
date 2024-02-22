package com.jaisoft.tdd.stefDefs;




import com.jaisoft.tdd.domain.ToDo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.rsocket.context.LocalRSocketServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
@Log4j2
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ToDoDefinitions {

    @LocalRSocketServerPort
    private int port;
    private RestTemplate restTemplate = new RestTemplate();
    private String postUrl = "http://localhost";
    private long toDoId;

    @Given("I can creat a new ToDo")
    public void i_can_creat_a_new_ToDo() {
        // Write code here that turns the phrase above into concrete actions
        String url = postUrl + ":" + port + "/todo";
        List<ToDo> allTodos = restTemplate.getForObject(url, List.class);
        log.info(allTodos);
        assertTrue(!allTodos.isEmpty());
        throw new io.cucumber.java.PendingException();
    }

    @Given("I sending ToDo to be created with ToDo with text (.*), and with completed {.*}&")
    public void i_sending_ToDo_to_be_create_with_ToDo_with_text_Todo_Sex_and_with_completed_False(String task, boolean completed) {
        // Write code here that turns the phrase above into concrete actions
        String url = postUrl + ":" + port + "/post";
        ToDo newTodo = new ToDo();
        newTodo.setCompleted(completed);
        newTodo.setText(task);
        ToDo toDo = restTemplate.postForObject(url, newTodo, ToDo.class);
        toDoId = toDo.getId();
        log.info(toDo);
        assertNotNull(toDo);
        throw new io.cucumber.java.PendingException();}



    @Then("I should be able to see my newly created ToDo")
    public void i_should_be_see_my_newly_created_ToDo () {
        // Write code here that turns the phrase above into concrete actions
        String url = postUrl + ":" + port + "/post/" + toDoId;
        ToDo myToDo = restTemplate.getForObject(url, ToDo.class);
        log.info(myToDo);
        assertNotNull(myToDo);
        throw new io.cucumber.java.PendingException();
    }


}
