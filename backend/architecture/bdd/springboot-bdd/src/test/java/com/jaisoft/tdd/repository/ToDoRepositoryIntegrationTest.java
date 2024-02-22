package com.jaisoft.tdd.repository;

import com.jaisoft.tdd.domain.ToDo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class ToDoRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private ToDoRepository toDoRespository;

    @BeforeEach
    public void setUp(){
        // given
        ToDo toDo = new ToDo("Eat thrice",true);
        testEntityManager.persist(toDo);
    }

    @Test
    public void whenFindByName_thenReturnProduct() {
        // when
        ToDo toDo = toDoRespository.findById(1L).get();

        // then
        assertThat(toDo.getText()).isEqualTo("Eat thrice");

        assertNotNull(toDo.getId());
    }
}
