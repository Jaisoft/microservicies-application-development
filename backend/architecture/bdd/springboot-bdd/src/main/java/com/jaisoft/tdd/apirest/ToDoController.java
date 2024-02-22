package com.jaisoft.tdd.apirest;

import com.jaisoft.tdd.domain.ToDo;
import com.jaisoft.tdd.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/todo")
@RestController
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService){
        this.toDoService = toDoService;
    }

    @PostMapping
    public ToDo savePost(@RequestBody ToDo toDo) {
        return toDoService.save(toDo);
    }

    @GetMapping("/{id}")
    public ToDo getToDoById(@PathVariable(value = "id")long id) {
        return toDoService.findById(id).get();
    }

    @GetMapping
    ResponseEntity<List<ToDo>> getAllToDos() {
        return new ResponseEntity<>(toDoService.findAll(), HttpStatus.OK);
    }


}
