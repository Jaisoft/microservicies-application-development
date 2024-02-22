package com.jaisoft.tdd;

import com.jaisoft.tdd.domain.ToDo;
import com.jaisoft.tdd.service.ToDoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringBootTddpocApplicationTests {

	@Autowired
	ToDoService toDoService;

	@Test
	void contextLoads() {
		List<ToDo> toDoListSend = new ArrayList<ToDo>();
		toDoListSend.add(new ToDo(1L,"see TV",true));
		toDoListSend.add(new ToDo(2L,"eat meat",true));
		Iterable<ToDo> persistedToDo =  toDoService.adList(toDoListSend);

		List<ToDo> toDoListReturn = toDoService.findAll();

		System.out.println(toDoListReturn);

		toDoListReturn.forEach(System.out::println);

		toDoListReturn.forEach((final ToDo toDo)-> System.out.println(toDo.getText()));


	}

}
